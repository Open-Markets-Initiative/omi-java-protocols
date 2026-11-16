package omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.CurrentTradingState;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Flyweight;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

/**
 * Represents the StrategyTradingActionMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * ISE uses this administrative message to indicate the current trading status of a strategy within the ISE Options Market.
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class StrategyTradingActionMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Strategy Trading Action Message";

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
     * Where {@link #currentTradingState()} starts, from the message's start.
     */
    public static final int CURRENT_TRADING_STATE_OFFSET = 10;

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public StrategyTradingActionMessage() {
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
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the value
     */
    public long timestamp() {
        return Codec.getUnsignedBE(buffer, offset + TIMESTAMP_OFFSET, 6);
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the value
     */
    public long strategyId() {
        return Codec.getIntBE(buffer, offset + STRATEGY_ID_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * Reflects the current trading state for the strategy on the ISE market.
     *
     * @return the value, or null when the protocol declares none for {@link #currentTradingStateRaw()}
     */
    public CurrentTradingState currentTradingState() {
        return CurrentTradingState.get(currentTradingStateRaw());
    }

    /**
     * Reflects the current trading state for the strategy on the ISE market.
     *
     * @return the value as it was sent
     */
    public char currentTradingStateRaw() {
        return (char) (buffer[offset + CURRENT_TRADING_STATE_OFFSET] & 0xFF);
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("timestamp=").append(timestamp());
        builder.append(", strategyId=").append(strategyId());
        CurrentTradingState currentTradingState = currentTradingState();
        if (currentTradingState == null) {
            builder.append(", currentTradingState=").append(currentTradingStateRaw());
        }
        else {
            builder.append(", currentTradingState=").append(currentTradingState.name());
        }
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
