package omi.flyweight.iex.iexequities.tops.iextp.v1_64.messages.application;

import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Codec;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Flyweight;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Message;
import omi.flyweight.iex.iexequities.tops.iextp.v1_64.types.Text;

/**
 * Represents the TradeReportMessage message from the Tops protocol.
 *
 * <p>
 * Trade Report Messages are sent when an order on the IEX Order Book is executed in whole or in part
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class TradeReportMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Trade Report Message";

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

    private byte saleConditionFlags;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private long size;

    private long price;

    private long tradeId;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public TradeReportMessage() {
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
        saleConditionFlags = buffer[offset + SALE_CONDITION_FLAGS_OFFSET];
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
        size = Codec.getIntLE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
        price = Codec.getLongLE(buffer, offset + PRICE_OFFSET);
        tradeId = Codec.getLongLE(buffer, offset + TRADE_ID_OFFSET);
    }

    /**
     * Sale Condition Flags
     *
     * @return the whole container; prefer the named bit accessors
     */
    public byte saleConditionFlags() {
        return saleConditionFlags;
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
     * Trade volume
     *
     * @return the value
     */
    public long size() {
        return size;
    }

    /**
     * Trade price
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public long price() {
        return price;
    }

    /**
     * IEX Generated Identifier. Trade ID is also
     *
     * @return the unsigned value's bits, read through the {@code Long.*Unsigned} methods
     */
    public long tradeId() {
        return tradeId;
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
