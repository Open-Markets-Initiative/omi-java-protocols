package omi.zerocopy.iex.iexequities.deep.iextp.v1_08.types;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

/**
 * Reads integers out of a byte array at an absolute index, in either byte order.
 *
 * <p>Every read is one {@link VarHandle} access, which the JIT compiles to a single load, so a getter costs what
 * reading the field from a struct would. Odd widths are assembled byte by byte. Nothing here allocates.</p>
 */
public final class Codec {

    private static final VarHandle SHORT_LE = MethodHandles.byteArrayViewVarHandle(short[].class, ByteOrder.LITTLE_ENDIAN);

    private static final VarHandle SHORT_BE = MethodHandles.byteArrayViewVarHandle(short[].class, ByteOrder.BIG_ENDIAN);

    private static final VarHandle INT_LE = MethodHandles.byteArrayViewVarHandle(int[].class, ByteOrder.LITTLE_ENDIAN);

    private static final VarHandle INT_BE = MethodHandles.byteArrayViewVarHandle(int[].class, ByteOrder.BIG_ENDIAN);

    private static final VarHandle LONG_LE = MethodHandles.byteArrayViewVarHandle(long[].class, ByteOrder.LITTLE_ENDIAN);

    private static final VarHandle LONG_BE = MethodHandles.byteArrayViewVarHandle(long[].class, ByteOrder.BIG_ENDIAN);

    private Codec() {
    }

    /**
     * Reads a two-byte integer, least significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @return the integer
     */
    public static short getShortLE(byte[] buffer, int index) {
        return (short) SHORT_LE.get(buffer, index);
    }

    /**
     * Reads a two-byte integer, most significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @return the integer
     */
    public static short getShortBE(byte[] buffer, int index) {
        return (short) SHORT_BE.get(buffer, index);
    }

    /**
     * Reads a four-byte integer, least significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @return the integer
     */
    public static int getIntLE(byte[] buffer, int index) {
        return (int) INT_LE.get(buffer, index);
    }

    /**
     * Reads a four-byte integer, most significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @return the integer
     */
    public static int getIntBE(byte[] buffer, int index) {
        return (int) INT_BE.get(buffer, index);
    }

    /**
     * Reads an eight-byte integer, least significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @return the integer
     */
    public static long getLongLE(byte[] buffer, int index) {
        return (long) LONG_LE.get(buffer, index);
    }

    /**
     * Reads an eight-byte integer, most significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @return the integer
     */
    public static long getLongBE(byte[] buffer, int index) {
        return (long) LONG_BE.get(buffer, index);
    }

    /**
     * Reads an unsigned integer of one to eight bytes, least significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @param width how many bytes it spans
     * @return the integer, its bits as they arrived when it spans eight bytes
     */
    public static long getUnsignedLE(byte[] buffer, int index, int width) {
        long value = 0L;
        for (int at = width - 1; at >= 0; at--) {
            value = (value << 8) | (buffer[index + at] & 0xFFL);
        }
        return value;
    }

    /**
     * Reads an unsigned integer of one to eight bytes, most significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @param width how many bytes it spans
     * @return the integer, its bits as they arrived when it spans eight bytes
     */
    public static long getUnsignedBE(byte[] buffer, int index, int width) {
        long value = 0L;
        for (int at = 0; at < width; at++) {
            value = (value << 8) | (buffer[index + at] & 0xFFL);
        }
        return value;
    }

    /**
     * Reads a two's complement integer of one to eight bytes, least significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @param width how many bytes it spans
     * @return the integer, sign extended
     */
    public static long getSignedLE(byte[] buffer, int index, int width) {
        int shift = 64 - 8 * width;
        return (getUnsignedLE(buffer, index, width) << shift) >> shift;
    }

    /**
     * Reads a two's complement integer of one to eight bytes, most significant byte first.
     *
     * @param buffer the bytes
     * @param index where the integer starts
     * @param width how many bytes it spans
     * @return the integer, sign extended
     */
    public static long getSignedBE(byte[] buffer, int index, int width) {
        int shift = 64 - 8 * width;
        return (getUnsignedBE(buffer, index, width) << shift) >> shift;
    }
}
