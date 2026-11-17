package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups;

import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.DecodeException;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.View;

/**
 * One entry of Auction Response.
 *
 * <p>
 * Auction Response information
 * </p>
 *
 * <p>An immutable view, valid for as long as the bytes viewed are unchanged.</p>
 */
public final class AuctionResponseEntry extends View {

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

    /**
     * Views an entry.
     *
     * @param buffer the bytes holding the entry
     * @param offset where the entry starts
     * @param end where the bytes the entry may occupy end
     * @throws DecodeException when fewer than {@link #BYTE_LENGTH} bytes lie between offset and end
     */
    public AuctionResponseEntry(byte[] buffer, int offset, int end) {
        super(buffer, offset, end, BYTE_LENGTH);
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Price of the auction response in fixed point format with 6 whole number places followed by 4 decimal digits. The response, if shown (zero if not shown) is the best response on the contra side.
     *
     * @return the raw integer, the value times ten to the power of RESPONSE_PRICE_DECIMALS
     */
    public int responsePrice() {
        return Codec.getIntBE(buffer, offset + RESPONSE_PRICE_OFFSET);
    }

    /**
     * Size of the auction response (zero if not shown).
     *
     * @return the value
     */
    public long responseSize() {
        return Codec.getIntBE(buffer, offset + RESPONSE_SIZE_OFFSET) & 0xFFFFFFFFL;
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
