package omi.zerocopy.iex.iexequities.deep.iextp.v1_06.messages.application;

import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.enums.TradingStatus;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Codec;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.DecodeException;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Message;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.TextView;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.View;

/**
 * Represents the TradingStatusMessage message from the Deep protocol.
 *
 * <p>
 * The Trading Status Message is used to indicate the current trading status of a security.
 * </p>
 *
 * <p>An immutable view: each getter reads its field from the bytes viewed, so the message is valid for as long as
 * those bytes are unchanged.</p>
 */
public final class TradingStatusMessage extends View implements Message {

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

    /**
     * Views a message.
     *
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @throws DecodeException when fewer than {@link #BYTE_LENGTH} bytes lie between offset and end
     */
    public TradingStatusMessage(byte[] buffer, int offset, int end) {
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
     * <p>Each call returns a new view, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the text, its padding left out
     */
    public TextView symbol() {
        return new TextView(buffer, offset + SYMBOL_OFFSET, 8, (byte) ' ', false, true);
    }

    /**
     * Reason for the trading status change
     *
     * <p>Each call returns a new view, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the text, its padding left out
     */
    public TextView reason() {
        return new TextView(buffer, offset + REASON_OFFSET, 4, (byte) ' ', false, true);
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
