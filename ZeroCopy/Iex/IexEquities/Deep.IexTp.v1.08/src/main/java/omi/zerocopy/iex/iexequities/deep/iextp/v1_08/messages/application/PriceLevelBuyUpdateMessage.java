package omi.zerocopy.iex.iexequities.deep.iextp.v1_08.messages.application;

import omi.zerocopy.iex.iexequities.deep.iextp.v1_08.enums.EventFlags;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_08.types.Codec;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_08.types.Flyweight;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_08.types.Message;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_08.types.TextView;

/**
 * Represents the PriceLevelBuyUpdateMessage message from the Deep protocol.
 *
 * <p>
 * Deep broadcasts a real-time Price Level Update Message each time a displayed price level on IEX is updated during the trading day
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class PriceLevelBuyUpdateMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Price Level Buy Update Message";

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

    private final TextView symbolView = new TextView(8, (byte) ' ', false, true);

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public PriceLevelBuyUpdateMessage() {
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
        return (short) (buffer[offset + EVENT_FLAGS_OFFSET] & 0xFF);
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
     * Aggregate quoted size
     *
     * @return the value
     */
    public long size() {
        return Codec.getIntLE(buffer, offset + SIZE_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * Price level to add/update in the IEX Order Book
     *
     * @return the raw integer, the value times ten to the power of PRICE_DECIMALS
     */
    public long price() {
        return Codec.getLongLE(buffer, offset + PRICE_OFFSET);
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
