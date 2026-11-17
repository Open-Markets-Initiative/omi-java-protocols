package omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application;

import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.enums.RetailLiquidityIndicator;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Codec;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Flyweight;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Message;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Text;

/**
 * Represents the RetailLiquidityIndicatorMessage message from the DeepPlus protocol.
 *
 * <p>
 * broadcasts a real-time Retail Liquidity Indicator Message each time there is an update to IEX's eligible retail liquidity interest during the trading day
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
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

    private char retailLiquidityIndicator;

    private long timestamp;

    private final Text symbol = new Text(8, (byte) ' ', false, true);

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
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

    @Override
    protected void read(byte[] buffer, int offset) {
        retailLiquidityIndicator = (char) (buffer[offset + RETAIL_LIQUIDITY_INDICATOR_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
        symbol.copy(buffer, offset + SYMBOL_OFFSET);
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
        return retailLiquidityIndicator;
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
