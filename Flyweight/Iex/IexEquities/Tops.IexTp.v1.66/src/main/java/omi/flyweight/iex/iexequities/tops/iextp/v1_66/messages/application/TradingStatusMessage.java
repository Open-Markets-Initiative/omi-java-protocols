package omi.flyweight.iex.iexequities.tops.iextp.v1_66.messages.application;

import omi.flyweight.iex.iexequities.tops.iextp.v1_66.enums.TradingStatus;
import omi.flyweight.iex.iexequities.tops.iextp.v1_66.types.Codec;
import omi.flyweight.iex.iexequities.tops.iextp.v1_66.types.Flyweight;
import omi.flyweight.iex.iexequities.tops.iextp.v1_66.types.Message;
import omi.flyweight.iex.iexequities.tops.iextp.v1_66.types.Text;

/**
 * Represents the TradingStatusMessage message from the Tops protocol.
 *
 * <p>
 * The Trading Status Message is used to indicate the current trading status of a security.
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
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

    private char tradingStatus;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    private final Text reason = new Text(4, (byte) ' ', false, true);

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
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

    @Override
    protected void read(byte[] buffer, int offset) {
        tradingStatus = (char) (buffer[offset + TRADING_STATUS_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
        reason.copy(buffer, offset + REASON_OFFSET);
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
        return tradingStatus;
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
     * Reason for the trading status change
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text reason() {
        return reason;
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
