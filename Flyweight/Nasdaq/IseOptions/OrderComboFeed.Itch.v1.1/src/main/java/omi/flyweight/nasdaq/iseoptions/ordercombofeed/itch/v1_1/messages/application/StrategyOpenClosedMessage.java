package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.OpenState;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Flyweight;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

/**
 * Represents the StrategyOpenClosedMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * The options system uses this administrative message to indicate when an strategy has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution.
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class StrategyOpenClosedMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Strategy Open Closed Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 11;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 0;

    /**
     * Where {@link #strategyId()} starts, from the message's start.
     */
    public static final int STRATEGY_ID_OFFSET = 6;

    /**
     * Where {@link #openState()} starts, from the message's start.
     */
    public static final int OPEN_STATE_OFFSET = 10;

    private long timestamp;

    private long strategyId;

    private char openState;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public StrategyOpenClosedMessage() {
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
        timestamp = Codec.getUnsignedBE(buffer, offset + TIMESTAMP_OFFSET, 6);
        strategyId = Codec.getIntBE(buffer, offset + STRATEGY_ID_OFFSET) & 0xFFFFFFFFL;
        openState = (char) (buffer[offset + OPEN_STATE_OFFSET] & 0xFF);
    }

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the value
     */
    public long timestamp() {
        return timestamp;
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the value
     */
    public long strategyId() {
        return strategyId;
    }

    /**
     * Reflects the current eligibility for auto execution of the options security in the options market.
     *
     * @return the value, or null when the protocol declares none for {@link #openStateRaw()}
     */
    public OpenState openState() {
        return OpenState.get(openStateRaw());
    }

    /**
     * Reflects the current eligibility for auto execution of the options security in the options market.
     *
     * @return the value as it was sent
     */
    public char openStateRaw() {
        return openState;
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("timestamp=").append(timestamp());
        builder.append(", strategyId=").append(strategyId());
        OpenState openState = openState();
        if (openState == null) {
            builder.append(", openState=").append(openStateRaw());
        }
        else {
            builder.append(", openState=").append(openState.name());
        }
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
