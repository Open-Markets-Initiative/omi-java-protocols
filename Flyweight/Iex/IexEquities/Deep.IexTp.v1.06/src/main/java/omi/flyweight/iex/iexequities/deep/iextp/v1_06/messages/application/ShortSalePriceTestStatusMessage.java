package omi.flyweight.iex.iexequities.deep.iextp.v1_06.messages.application;

import omi.flyweight.iex.iexequities.deep.iextp.v1_06.enums.Detail;
import omi.flyweight.iex.iexequities.deep.iextp.v1_06.enums.ShortSalePriceTestStatus;
import omi.flyweight.iex.iexequities.deep.iextp.v1_06.types.Codec;
import omi.flyweight.iex.iexequities.deep.iextp.v1_06.types.Flyweight;
import omi.flyweight.iex.iexequities.deep.iextp.v1_06.types.Message;
import omi.flyweight.iex.iexequities.deep.iextp.v1_06.types.Text;

/**
 * Represents the ShortSalePriceTestStatusMessage message from the Deep protocol.
 *
 * <p>
 * The Short Sale Price Test Message is used to indicate when a short sale price test restriction is in effect for a security.
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
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

    private short shortSalePriceTestStatus;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private char detail;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
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

    @Override
    protected void read(byte[] buffer, int offset) {
        shortSalePriceTestStatus = (short) (buffer[offset + SHORT_SALE_PRICE_TEST_STATUS_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
        detail = (char) (buffer[offset + DETAIL_OFFSET] & 0xFF);
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
        return shortSalePriceTestStatus;
    }

    /**
     * Time stamp of the system event
     *
     * @return nanoseconds since the Unix epoch
     */
    public long timestamp() {
        return timestamp;
    }

    /**
     * Security identifier
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text symbol() {
        return symbol;
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
        return detail;
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
