package omi.zerocopy.iex.iexequities.deep.iextp.v1_06.messages.application;

import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.enums.PriceType;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Codec;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Flyweight;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Message;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.TextView;

/**
 * Represents the OfficialPriceMessage message from the Deep protocol.
 *
 * <p>
 * Official Price Messages are sent for each IEX-listed security to indicate the IEX Official Opening Price and IEX Official Closing Price.
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
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

    private final TextView symbolView = new TextView(8, (byte) ' ', false, true);

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
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
        return (char) (buffer[offset + PRICE_TYPE_OFFSET] & 0xFF);
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
     * Official opening or closing price, as specified
     *
     * @return the raw integer, the value times ten to the power of OFFICIAL_PRICE_DECIMALS
     */
    public long officialPrice() {
        return Codec.getLongLE(buffer, offset + OFFICIAL_PRICE_OFFSET);
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
