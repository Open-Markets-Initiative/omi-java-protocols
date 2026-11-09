package omi.jnx.jnxequities.pts.ouch.v1_11.dispatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import omi.jnx.jnxequities.pts.ouch.v1_11.types.ByteOps;

/**
 * Reads one direction of a TCP connection carrying Client Packet: the bytes are appended as they arrive and cut into the records their Packet Length frames, each decoded by {@link ClientPacketDecoder}. A record split across appends is held until the rest arrives. A length counting fewer bytes than the field it is read from fails the stream for good, since nothing then tells where the next record begins.
 */
public final class ClientPacketStream {

    /**
     * The bytes a record's length is read from: a record's start up to the end of its length field.
     */
    public static final int LENGTH_END = 2;

    /**
     * One record of the stream, and what it decoded to.
     *
     * @param bytes the record's bytes
     * @param decoded what the record decoded to
     */
    public record Record(byte[] bytes, ClientPacketDecoder.Decoded decoded) {

        /**
         * Holds its own copy of the record's bytes.
         *
         * @param bytes the record's bytes
         * @param decoded what the record decoded to
         */
        public Record {
            bytes = bytes.clone();
        }

        /**
         * Gets a copy of the record's bytes.
         *
         * @return the record's bytes
         */
        @Override
        public byte[] bytes() {
            return bytes.clone();
        }
    }

    private byte[] pending = new byte[0];
    private int pendingLength;
    private boolean failed;

    /**
     * Creates a stream holding no bytes.
     */
    public ClientPacketStream() {
    }

    /**
     * Gets how many bytes are held toward a record not yet whole.
     *
     * @return the bytes held
     */
    public int pendingBytes() {
        return pendingLength;
    }

    /**
     * Gets whether a record stated a length that is not valid, after which the stream reads nothing more.
     *
     * @return whether the stream failed
     */
    public boolean isFailed() {
        return failed;
    }

    /**
     * Reads the length its Packet Length states for the record starting at an offset, which must hold {@link #LENGTH_END} bytes.
     *
     * @param data the bytes holding the record
     * @param offset where the record starts
     * @return the record's length in bytes
     */
    public static long frameLength(byte[] data, int offset) {
        return ByteOps.unsigned(data, offset + 0, 2, false) + 2;
    }

    /**
     * Appends bytes of the connection, in order, and decodes every record they complete.
     *
     * @param data the bytes holding what arrived
     * @param offset where what arrived starts
     * @param length how many bytes arrived
     * @return the records completed, in order
     * @throws IllegalStateException when the stream failed at an earlier record
     */
    public List<Record> append(byte[] data, int offset, int length) {
        if (failed) {
            throw new IllegalStateException("The stream failed at an earlier record whose length is not valid, and cannot be resynchronized.");
        }

        if (offset < 0 || length < 0 || offset + length > data.length) {
            throw new IndexOutOfBoundsException("The bytes appended lie outside the array holding them.");
        }

        byte[] buffer = data;
        int position = offset;
        int end = offset + length;
        if (pendingLength > 0) {
            hold(data, offset, length);
            buffer = pending;
            position = 0;
            end = pendingLength;
        }

        List<Record> records = new ArrayList<>();
        while (end - position >= LENGTH_END) {
            long size = frameLength(buffer, position);
            if (size < LENGTH_END || size > Integer.MAX_VALUE) {
                failed = true;
                break;
            }

            if (size > end - position) {
                break;
            }

            byte[] bytes = Arrays.copyOfRange(buffer, position, position + (int) size);
            records.add(new Record(bytes, ClientPacketDecoder.decode(bytes, 0, bytes.length)));
            position += (int) size;
        }

        if (buffer == pending) {
            System.arraycopy(pending, position, pending, 0, end - position);
            pendingLength = end - position;
        } else {
            pendingLength = 0;
            hold(buffer, position, end - position);
        }

        return records;
    }

    private void hold(byte[] data, int offset, int length) {
        if (pendingLength + length > pending.length) {
            pending = Arrays.copyOf(pending, Math.max(pendingLength + length, pending.length * 2));
        }

        System.arraycopy(data, offset, pending, pendingLength, length);
        pendingLength += length;
    }
}
