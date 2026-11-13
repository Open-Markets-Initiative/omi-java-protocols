package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.messages.application;

import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.enums.RetailLiquidityIndicator;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Codec;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Flyweight;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.Message;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.types.TextView;

/**
 * Represents the RetailLiquidityIndicatorMessage message from the DeepPlus protocol.
 *
 * <p>
 * broadcasts a real-time Retail Liquidity Indicator Message each time there is an update to IEX's eligible retail liquidity interest during the trading day
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class RetailLiquidityIndicatorMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Retail Liquidity Indicator Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 17;

    /**
     * Where {@link #retailLiquidityIndicator()} starts, from the message's start.
     */
    public static final int RETAIL_LIQUIDITY_INDICATOR_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    private final TextView symbolView = new TextView(8, (byte) ' ', false, true);

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public RetailLiquidityIndicatorMessage() {
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
     * Retail Liquidity Indicator identifier
     *
     * @return the value, or null when the protocol declares none for {@link #retailLiquidityIndicatorRaw()}
     */
    public RetailLiquidityIndicator retailLiquidityIndicator() {
        return RetailLiquidityIndicator.get(retailLiquidityIndicatorRaw());
    }

    /**
     * Retail Liquidity Indicator identifier
     *
     * @return the value as it was sent
     */
    public char retailLiquidityIndicatorRaw() {
        return (char) (buffer[offset + RETAIL_LIQUIDITY_INDICATOR_OFFSET] & 0xFF);
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

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        RetailLiquidityIndicator retailLiquidityIndicator = retailLiquidityIndicator();
        if (retailLiquidityIndicator == null) {
            builder.append("retailLiquidityIndicator=").append(retailLiquidityIndicatorRaw());
        }
        else {
            builder.append("retailLiquidityIndicator=").append(retailLiquidityIndicator.name());
        }
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
