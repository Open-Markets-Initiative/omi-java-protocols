package omi.zerocopy.iex.iexequities.tops.iextp.v1_66.messages.application;

import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.types.Codec;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.types.Flyweight;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.types.Message;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_66.types.TextView;

/**
 * Represents the QuoteUpdateMessage message from the Tops protocol.
 *
 * <p>
 * Tops broadcasts a real-time Quote Update Message each time IEX's best bid or offer quotation is updated during the trading day
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class QuoteUpdateMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Quote Update Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 41;

    /**
     * Where {@link #quoteUpdateFlags()} starts, from the message's start.
     */
    public static final int QUOTE_UPDATE_FLAGS_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

    /**
     * Where {@link #symbol()} starts, from the message's start.
     */
    public static final int SYMBOL_OFFSET = 9;

    /**
     * Where {@link #bidSize()} starts, from the message's start.
     */
    public static final int BID_SIZE_OFFSET = 17;

    /**
     * Where {@link #bidPrice()} starts, from the message's start.
     */
    public static final int BID_PRICE_OFFSET = 21;

    /**
     * The decimal places of {@link #bidPrice()}: its raw integer is the value times ten to this power.
     */
    public static final int BID_PRICE_DECIMALS = 4;

    /**
     * Where {@link #askPrice()} starts, from the message's start.
     */
    public static final int ASK_PRICE_OFFSET = 29;

    /**
     * The decimal places of {@link #askPrice()}: its raw integer is the value times ten to this power.
     */
    public static final int ASK_PRICE_DECIMALS = 4;

    /**
     * Where {@link #askSize()} starts, from the message's start.
     */
    public static final int ASK_SIZE_OFFSET = 37;

    private final TextView symbolView = new TextView(8, (byte) ' ', false, true);

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public QuoteUpdateMessage() {
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
     * Quote Update Flags
     *
     * @return the whole container; prefer the named bit accessors
     */
    public byte quoteUpdateFlags() {
        return buffer[offset + QUOTE_UPDATE_FLAGS_OFFSET];
    }

    /**
     * Unused
     *
     * @return bits 0 through 5 of {@link #quoteUpdateFlags()}
     */
    public int quoteUpdateFlagsUnused() {
        return (int) (quoteUpdateFlags() & 0x3FL);
    }

    /**
     * Market Session Flag
     *
     * @return bit 6 of {@link #quoteUpdateFlags()}
     */
    public boolean quoteUpdateFlagsMarketSession() {
        return ((quoteUpdateFlags() >>> 6) & 1L) != 0L;
    }

    /**
     * Symbol is halted, paused, or otherwise not available for trading on IEX
     *
     * @return bit 7 of {@link #quoteUpdateFlags()}
     */
    public boolean quoteUpdateFlagsSymbolAvailability() {
        return ((quoteUpdateFlags() >>> 7) & 1L) != 0L;
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
     * Aggregate quoted best bid size
     *
     * @return the value
     */
    public long bidSize() {
        return Codec.getIntLE(buffer, offset + BID_SIZE_OFFSET) & 0xFFFFFFFFL;
    }

    /**
     * Best quoted bid price
     *
     * @return the raw integer, the value times ten to the power of BID_PRICE_DECIMALS
     */
    public long bidPrice() {
        return Codec.getLongLE(buffer, offset + BID_PRICE_OFFSET);
    }

    /**
     * Best quoted ask price
     *
     * @return the raw integer, the value times ten to the power of ASK_PRICE_DECIMALS
     */
    public long askPrice() {
        return Codec.getLongLE(buffer, offset + ASK_PRICE_OFFSET);
    }

    /**
     * Aggregate quoted best ask size
     *
     * @return the value
     */
    public long askSize() {
        return Codec.getIntLE(buffer, offset + ASK_SIZE_OFFSET) & 0xFFFFFFFFL;
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("quoteUpdateFlags=").append(quoteUpdateFlags());
        builder.append(", timestamp=").append(timestamp());
        builder.append(", symbol=").append(symbol());
        builder.append(", bidSize=").append(bidSize());
        builder.append(", bidPrice=").append(bidPrice());
        builder.append(", askPrice=").append(askPrice());
        builder.append(", askSize=").append(askSize());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
