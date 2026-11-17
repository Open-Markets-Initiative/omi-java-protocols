package omi.flyweight.iex.iexequities.deep.iextp.v1_08.messages.application;

import omi.flyweight.iex.iexequities.deep.iextp.v1_08.enums.EventFlags;
import omi.flyweight.iex.iexequities.deep.iextp.v1_08.types.Codec;
import omi.flyweight.iex.iexequities.deep.iextp.v1_08.types.Flyweight;
import omi.flyweight.iex.iexequities.deep.iextp.v1_08.types.Message;
import omi.flyweight.iex.iexequities.deep.iextp.v1_08.types.Text;

/**
 * Represents the PriceLevelSellUpdateMessage message from the Deep protocol.
 *
 * <p>
 * Deep broadcasts a real-time Price Level Update Message each time a displayed price level on IEX is updated during the trading day
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class PriceLevelSellUpdateMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Price Level Sell Update Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * Where {@link #eventFlags()} starts, from the message's start.
     */
    public static final int EVENT_FLAGS_OFFSET = 0;

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

    private short eventFlags;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private long size;

    private long price;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public PriceLevelSellUpdateMessage() {
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
        eventFlags = (short) (buffer[offset + EVENT_FLAGS_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
        size = Codec.getIntLE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
        price = Codec.getLongLE(buffer, offset + PRICE_OFFSET);
    }

    /**
     * Identifies event processing by the System
     *
     * @return the value, or null when the protocol declares none for {@link #eventFlagsRaw()}
     */
    public EventFlags eventFlags() {
        return EventFlags.get(eventFlagsRaw());
    }

    /**
     * Identifies event processing by the System
     *
     * @return the value as it was sent
     */
    public short eventFlagsRaw() {
        return eventFlags;
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
     * Aggregate quoted size
     *
     * @return the value
     */
    public long size() {
        return size;
    }

    /**
     * Price level to add/update in the IEX Order Book
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public long price() {
        return price;
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        EventFlags eventFlags = eventFlags();
        if (eventFlags == null) {
            builder.append("eventFlags=").append(eventFlagsRaw());
        }
        else {
            builder.append("eventFlags=").append(eventFlags.name());
        }
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", size=").append(size());
        builder.append(", price=").append(price());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
