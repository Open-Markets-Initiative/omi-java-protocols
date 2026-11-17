package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application;

import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.enums.Detail;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.enums.ShortSalePriceTestStatus;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Codec;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.DecodeException;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Message;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.TextView;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.View;

/**
 * Represents the ShortSalePriceTestStatusMessage message from the DeepPlus protocol.
 *
 * <p>
 * The Short Sale Price Test Message is used to indicate when a short sale price test restriction is in effect for a security.
 * </p>
 *
 * <p>An immutable view: each getter reads its field from the bytes viewed, so the message is valid for as long as
 * those bytes are unchanged.</p>
 */
public final class ShortSalePriceTestStatusMessage extends View implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Short Sale Price Test Status Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 18;

    /**
     * Where {@link #shortSalePriceTestStatus()} starts, from the message's start.
     */
    public static final int SHORT_SALE_PRICE_TEST_STATUS_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Where {@link #detail()} starts, from the message's start.
     */
    public static final int DETAIL_OFFSET = 17;

    /**
     * Views a message.
     *
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @throws DecodeException when fewer than {@link #BYTE_LENGTH} bytes lie between offset and end
     */
    public ShortSalePriceTestStatusMessage(byte[] buffer, int offset, int end) {
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
     * Reg. SHO short sale price test restriction status
     *
     * @return the value, or null when the protocol declares none for {@link #shortSalePriceTestStatusRaw()}
     */
    public ShortSalePriceTestStatus shortSalePriceTestStatus() {
        return ShortSalePriceTestStatus.get(shortSalePriceTestStatusRaw());
    }

    /**
     * Reg. SHO short sale price test restriction status
     *
     * @return the value as it was sent
     */
    public short shortSalePriceTestStatusRaw() {
        return (short) (buffer[offset + SHORT_SALE_PRICE_TEST_STATUS_OFFSET] & 0xFF);
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

    /**
     * Detail of the Reg. SHO short sale price test restriction status
     *
     * @return the value, or null when the protocol declares none for {@link #detailRaw()}
     */
    public Detail detail() {
        return Detail.get(detailRaw());
    }

    /**
     * Detail of the Reg. SHO short sale price test restriction status
     *
     * @return the value as it was sent
     */
    public char detailRaw() {
        return (char) (buffer[offset + DETAIL_OFFSET] & 0xFF);
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        ShortSalePriceTestStatus shortSalePriceTestStatus = shortSalePriceTestStatus();
        if (shortSalePriceTestStatus == null) {
            builder.append("shortSalePriceTestStatus=").append(shortSalePriceTestStatusRaw());
        }
        else {
            builder.append("shortSalePriceTestStatus=").append(shortSalePriceTestStatus.name());
        }
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        Detail detail = detail();
        if (detail == null) {
            builder.append(", detail=").append(detailRaw());
        }
        else {
            builder.append(", detail=").append(detail.name());
        }
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
