package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.CurrentTradingState;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.DecodeException;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.View;

/**
 * Represents the StrategyTradingActionMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * ISE uses this administrative message to indicate the current trading status of a strategy within the ISE Options Market.
 * </p>
 *
 * <p>An immutable view: each getter reads its field from the bytes viewed, so the message is valid for as long as
 * those bytes are unchanged.</p>
 */
public final class StrategyTradingActionMessage extends View implements Message {

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
     * Views a message.
     *
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @throws DecodeException when fewer than {@link #BYTE_LENGTH} bytes lie between offset and end
     */
    public StrategyTradingActionMessage(byte[] buffer, int offset, int end) {
        super(buffer, offset, end, BYTE_LENGTH);
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
