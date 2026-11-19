package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application;

import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Codec;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.DecodeException;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Message;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.TextView;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.View;

/**
 * Represents the ClearBookMessage message from the DeepPlus protocol.
 *
 * <p>
 * This message is used to indicate that the IEX Book for a symbol has been cleared of all orders
 * </p>
 *
 * <p>An immutable view: each getter reads its field from the bytes viewed, so the message is valid for as long as
 * those bytes are unchanged.</p>
 */
public final class ClearBookMessage extends View implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Clear Book Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 17;

    /**
     * Where {@link #reserved()} starts, from the message's start.
     */
    public static final int RESERVED_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Views a message.
     *
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @throws DecodeException when fewer than {@link #BYTE_LENGTH} bytes lie between offset and end
     */
    public ClearBookMessage(byte[] buffer, int offset, int end) {
        super(buffer, offset, end, BYTE_LENGTH);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Reserved for future use
     *
     * @return the character
     */
    public char reserved() {
        return (char) (buffer[offset + RESERVED_OFFSET] & 0xFF);
    }

    /**
     * Time stamp of the system event
     *
     * @return nanoseconds since the Unix epoch
     */
    public long timestamp() {
        return Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
    }

    /**
     * Security identifier
     *
     * <p>Each call returns a new view, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the text, its padding left out
     */
    public TextView symbol() {
        return new TextView(buffer, offset + SYMBOL_OFFSET, 8, (byte) ' ', false, true);
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("reserved=").append(reserved());
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
