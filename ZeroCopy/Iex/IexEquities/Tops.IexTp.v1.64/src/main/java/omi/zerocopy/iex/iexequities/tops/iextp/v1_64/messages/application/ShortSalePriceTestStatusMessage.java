package omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application;

import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.enums.Detail;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.enums.ShortSalePriceTestStatus;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Codec;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Flyweight;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Message;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.TextView;

/**
 * Represents the ShortSalePriceTestStatusMessage message from the Tops protocol.
 *
 * <p>
 * The Short Sale Price Test Message is used to indicate when a short sale price test restriction is in effect for a security.
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class ShortSalePriceTestStatusMessage extends Flyweight implements Message {

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

    private final TextView symbolView = new TextView(8, (byte) ' ', false, true);

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public ShortSalePriceTestStatusMessage() {
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
     * <p>The view is repointed at every read and is valid as long as this flyweight.</p>
     *
     * @return the text, its padding left out
     */
    public TextView symbol() {
        return symbolView.wrap(buffer, offset + SYMBOL_OFFSET);
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
