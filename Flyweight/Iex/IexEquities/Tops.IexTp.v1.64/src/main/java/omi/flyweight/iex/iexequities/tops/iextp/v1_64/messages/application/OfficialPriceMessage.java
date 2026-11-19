package omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application;

import omi.flyweight.iex.iexequities.tops.iextp.v1_64.enums.PriceType;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Codec;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Flyweight;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Message;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Text;

/**
 * Represents the OfficialPriceMessage message from the Tops protocol.
 *
 * <p>
 * Official Price Messages are sent for each IEX-listed security to indicate the IEX Official Opening Price and IEX Official Closing Price.
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class OfficialPriceMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Official Price Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * Where {@link #priceType()} starts, from the message's start.
     */
    public static final int PRICE_TYPE_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Where {@link #officialPrice()} starts, from the message's start.
     */
    public static final int OFFICIAL_PRICE_OFFSET = 17;

    /**
     * The decimal places of {@link #officialPrice()}: its raw integer is the value times ten to this power.
     */
    public static final int OFFICIAL_PRICE_DECIMALS = 4;

    private char priceType;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private long officialPrice;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public OfficialPriceMessage() {
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
        priceType = (char) (buffer[offset + PRICE_TYPE_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
        officialPrice = Codec.getLongLE(buffer, offset + OFFICIAL_PRICE_OFFSET);
    }

    /**
     * Price type identifier
     *
     * @return the value, or null when the protocol declares none for {@link #priceTypeRaw()}
     */
    public PriceType priceType() {
        return PriceType.get(priceTypeRaw());
    }

    /**
     * Price type identifier
     *
     * @return the value as it was sent
     */
    public char priceTypeRaw() {
        return priceType;
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
     * Official opening or closing price, as specified
     *
     * @return the raw integer, the value times ten to the power of OFFICIAL_PRICE_DECIMALS
     */
    public long officialPrice() {
        return officialPrice;
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        PriceType priceType = priceType();
        if (priceType == null) {
            builder.append("priceType=").append(priceTypeRaw());
        }
        else {
            builder.append("priceType=").append(priceType.name());
        }
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", officialPrice=").append(officialPrice());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
