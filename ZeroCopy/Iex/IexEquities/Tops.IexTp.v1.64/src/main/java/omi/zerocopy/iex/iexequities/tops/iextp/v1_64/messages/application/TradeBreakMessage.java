package omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application;

import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Codec;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Flyweight;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Message;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.TextView;

/**
 * Represents the TradeBreakMessage message from the Tops protocol.
 *
 * <p>
 * Trade Break Messages are sent when an execution on IEX is broken on that same trading day
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class TradeBreakMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Trade Break Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 37;

    /**
     * Where {@link #saleConditionFlags()} starts, from the message's start.
     */
    public static final int SALE_CONDITION_FLAGS_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Where {@link #size()} starts, from the message's start.
     */
    public static final int SIZE_OFFSET = 17;

    /**
     * Where {@link #price()} starts, from the message's start.
     */
    public static final int PRICE_OFFSET = 21;

    /**
     * The decimal places of {@link #price()}: its raw integer is the value times ten to this power.
     */
    public static final int PRICE_DECIMALS = 4;

    /**
     * Where {@link #tradeId()} starts, from the message's start.
     */
    public static final int TRADE_ID_OFFSET = 29;

    private final TextView symbolView = new TextView(8, (byte) ' ', false, true);

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public TradeBreakMessage() {
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
     * Sale Condition Flags
     *
     * @return the whole container; prefer the named bit accessors
     */
    public byte saleConditionFlags() {
        return buffer[offset + SALE_CONDITION_FLAGS_OFFSET];
    }

    /**
     * Unused
     *
     * @return bits 0 through 2 of {@link #saleConditionFlags()}
     */
    public int saleConditionFlagsUnused() {
        return (int) (saleConditionFlags() & 0x7L);
    }

    /**
     * Trade resulting from a single-price cross
     *
     * @return bit 3 of {@link #saleConditionFlags()}
     */
    public boolean saleConditionFlagsSinglePriceCrossTrade() {
        return ((saleConditionFlags() >>> 3) & 1L) != 0L;
    }

    /**
     * Trade is not subject to Rule 611
     *
     * @return bit 4 of {@link #saleConditionFlags()}
     */
    public boolean saleConditionFlagsTradeThroughExempt() {
        return ((saleConditionFlags() >>> 4) & 1L) != 0L;
    }

    /**
     * Odd Lot
     *
     * @return bit 5 of {@link #saleConditionFlags()}
     */
    public boolean saleConditionFlagsOddLot() {
        return ((saleConditionFlags() >>> 5) & 1L) != 0L;
    }

    /**
     * Extended Hours Trade
     *
     * @return bit 6 of {@link #saleConditionFlags()}
     */
    public boolean saleConditionFlagsExtendedHours() {
        return ((saleConditionFlags() >>> 6) & 1L) != 0L;
    }

    /**
     * Intermarket Sweep Order
     *
     * @return bit 7 of {@link #saleConditionFlags()}
     */
    public boolean saleConditionFlagsIntermarketSweep() {
        return ((saleConditionFlags() >>> 7) & 1L) != 0L;
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
     * Trade volume
     *
     * @return the value
     */
    public long size() {
        return Codec.getIntLE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * Trade price
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public long price() {
        return Codec.getLongLE(buffer, offset + PRICE_OFFSET);
    }

    /**
     * IEX Generated Identifier. Trade ID is also
     *
     * @return the unsigned value's bits, read through the {@code Long.*Unsigned} methods
     */
    public long tradeId() {
        return Codec.getLongLE(buffer, offset + TRADE_ID_OFFSET);
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("saleConditionFlags=").append(saleConditionFlags());
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", size=").append(size());
        builder.append(", price=").append(price());
        builder.append(", tradeId=").append(Long.toUnsignedString(tradeId()));
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
