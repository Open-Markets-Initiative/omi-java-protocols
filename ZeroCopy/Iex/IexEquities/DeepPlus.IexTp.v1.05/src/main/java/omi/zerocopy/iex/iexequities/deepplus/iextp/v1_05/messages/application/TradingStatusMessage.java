package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application;

import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.enums.TradingStatus;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Codec;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Flyweight;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Message;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.TextView;

/**
 * Represents the TradingStatusMessage message from the DeepPlus protocol.
 *
 * <p>
 * The Trading Status Message is used to indicate the current trading status of a security.
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class TradingStatusMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Trading Status Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 21;

    /**
     * Where {@link #tradingStatus()} starts, from the message's start.
     */
    public static final int TRADING_STATUS_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Where {@link #reason()} starts, from the message's start.
     */
    public static final int REASON_OFFSET = 17;

    private final TextView symbolView = new TextView(8, (byte) ' ', false, true);

    private final TextView reasonView = new TextView(4, (byte) ' ', false, true);

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public TradingStatusMessage() {
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
     * Trading status identifier
     *
     * @return the value, or null when the protocol declares none for {@link #tradingStatusRaw()}
     */
    public TradingStatus tradingStatus() {
        return TradingStatus.get(tradingStatusRaw());
    }

    /**
     * Trading status identifier
     *
     * @return the value as it was sent
     */
    public char tradingStatusRaw() {
        return (char) (buffer[offset + TRADING_STATUS_OFFSET] & 0xFF);
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
     * Reason for the trading status change
     *
     * <p>The view is repointed at every read and is valid as long as this flyweight.</p>
     *
     * @return the text, its padding left out
     */
    public TextView reason() {
        return reasonView.wrap(buffer, offset + REASON_OFFSET);
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        TradingStatus tradingStatus = tradingStatus();
        if (tradingStatus == null) {
            builder.append("tradingStatus=").append(tradingStatusRaw());
        }
        else {
            builder.append("tradingStatus=").append(tradingStatus.name());
        }
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", reason=").append(reason());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
