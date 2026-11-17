package omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.messages.application;

import omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.types.Codec;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.types.Flyweight;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.types.Message;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_01.types.Text;

/**
 * Represents the OrderExecutedMessage message from the DeepPlus protocol.
 *
 * <p>
 * A displayed order that was executed against
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class OrderExecutedMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Order Executed Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 45;

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
     * Where {@link #orderIdReference()} starts, from the message's start.
     */
    public static final int ORDER_ID_REFERENCE_OFFSET = 17;

    /**
     * Where {@link #size()} starts, from the message's start.
     */
    public static final int SIZE_OFFSET = 25;

    /**
     * Where {@link #price()} starts, from the message's start.
     */
    public static final int PRICE_OFFSET = 29;

    /**
     * The decimal places of {@link #price()}: its raw integer is the value times ten to this power.
     */
    public static final int PRICE_DECIMALS = 4;

    /**
     * Where {@link #tradeId()} starts, from the message's start.
     */
    public static final int TRADE_ID_OFFSET = 37;

    private byte saleConditionFlags;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private long orderIdReference;

    private long size;

    private long price;

    private long tradeId;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public OrderExecutedMessage() {
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
        orderIdReference = Codec.getLongLE(buffer, offset + ORDER_ID_REFERENCE_OFFSET);
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
     * Order ID of the referenced order
     *
     * @return the unsigned value's bits, read through the {@code Long.*Unsigned} methods
     */
    public long orderIdReference() {
        return orderIdReference;
    }

    /**
     * Quoted size
     *
     * @return the value
     */
    public long size() {
        return size;
    }

    /**
     * Booking price on the IEX Order Book
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public long price() {
        return price;
    }

    /**
     * IEX Generated Identifier
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
        builder.append(", orderIdReference=").append(Long.toUnsignedString(orderIdReference()));
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
