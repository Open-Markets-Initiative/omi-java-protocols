package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups;

import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Flyweight;

/**
 * One entry of Auction Response.
 *
 * <p>
 * Auction Response information
 * </p>
 *
 * <p>A flyweight its list decodes into again for each message, holding copies of its fields, so it is valid until
 * its message decodes the next one.</p>
 */
public final class AuctionResponseEntry extends Flyweight {

    /**
     * The fixed length of one entry in bytes.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * Where {@link #responsePrice()} starts, from the entry's start.
     */
    public static final int RESPONSE_PRICE_OFFSET = 0;

    /**
     * The decimal places of {@link #responsePrice()}: its raw integer is the value times ten to this power.
     */
    public static final int RESPONSE_PRICE_DECIMALS = 4;

    /**
     * Where {@link #responseSize()} starts, from the entry's start.
     */
    public static final int RESPONSE_SIZE_OFFSET = 4;

    private int responsePrice;

    private long responseSize;

    /**
     * Creates an entry holding nothing decoded; its list decodes into it.
     */
    public AuctionResponseEntry() {
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    @Override
    protected void read(byte[] buffer, int offset) {
        responsePrice = Codec.getIntBE(buffer, offset + RESPONSE_PRICE_OFFSET);
        responseSize = Codec.getIntBE(buffer, offset + RESPONSE_SIZE_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * Price of the auction response in fixed point format with 6 whole number places followed by 4 decimal digits. The response, if shown (zero if not shown) is the best response on the contra side.
     *
     * @return the raw integer, the value times ten to the power of RESPONSE_PRICE_DECIMALS
     */
    public int responsePrice() {
        return responsePrice;
    }

    /**
     * Size of the auction response (zero if not shown).
     *
     * @return the value
     */
    public long responseSize() {
        return responseSize;
    }

    /**
     * Appends the entry's fields, allocating nothing beyond what the builder grows by.
     *
     * @param builder where the fields are appended
     * @return the builder
     */
    public StringBuilder dump(StringBuilder builder) {
        builder.append('{');
        builder.append("responsePrice=").append(responsePrice());
        builder.append(", responseSize=").append(responseSize());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
