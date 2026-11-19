package omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.StrategyType;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.LegInformationEntry;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.LegInformationList;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.DecodeException;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.TextView;
import omi.zerocopy.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.View;

/**
 * Represents the ComplexStrategyDirectoryMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Strategy Message containing the strategy definition will be sent.
 * </p>
 *
 * <p>An immutable view: each getter reads its field from the bytes viewed, so the message is valid for as long as
 * those bytes are unchanged.</p>
 */
public final class ComplexStrategyDirectoryMessage extends View implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Complex Strategy Directory Message";

    /**
     * The least length of the message in bytes, with no Leg Information entries.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 0;

    /**
     * Where {@link #strategyId()} starts, from the message's start.
     */
    public static final int STRATEGY_ID_OFFSET = 6;

    /**
     * Where {@link #strategyType()} starts, from the message's start.
     */
    public static final int STRATEGY_TYPE_OFFSET = 10;

    /**
     * Where {@link #source()} starts, from the message's start.
     */
    public static final int SOURCE_OFFSET = 11;

    /**
     * Where {@link #underlyingSymbol()} starts, from the message's start.
     */
    public static final int UNDERLYING_SYMBOL_OFFSET = 12;

    /**
     * Where {@link #numberOfLegs()} starts, from the message's start.
     */
    public static final int NUMBER_OF_LEGS_OFFSET = 25;

    /**
     * Where {@link #legInformation()} starts, from the message's start.
     */
    public static final int LEG_INFORMATION_OFFSET = 26;

    /**
     * Views a message.
     *
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @throws DecodeException when the bytes between offset and end are fewer than the message's length
     */
    public ComplexStrategyDirectoryMessage(byte[] buffer, int offset, int end) {
        super(buffer, offset, end, MINIMUM_BYTE_LENGTH);
        requireLength(byteLength(), end);
    }

    @Override
    public String name() {
        return NAME;
    }

    /**
     * Gets the message's length: its fixed members and as many Leg Information entries as {@link #numberOfLegs()} counts.
     *
     * @return its length in bytes, or {@link Integer#MAX_VALUE} when the count reaches past what an array holds
     */
    @Override
    public int byteLength() {
        long length = LEG_INFORMATION_OFFSET + (long) numberOfLegs() * LegInformationEntry.BYTE_LENGTH;
        return length > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) length;
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
     * StrategyType value
     *
     * @return the value, or null when the protocol declares none for {@link #strategyTypeRaw()}
     */
    public StrategyType strategyType() {
        return StrategyType.get(strategyTypeRaw());
    }

    /**
     * StrategyType value
     *
     * @return the value as it was sent
     */
    public char strategyTypeRaw() {
        return (char) (buffer[offset + STRATEGY_TYPE_OFFSET] & 0xFF);
    }

    /**
     * Identifies the source of the Strategy, valid for the trading day
     *
     * @return the value
     */
    public short source() {
        return (short) (buffer[offset + SOURCE_OFFSET] & 0xFF);
    }

    /**
     * Underlying Symbol for the strategy. All legs in this strategy belong to this Underlying
     *
     * <p>Each call returns a new view, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the text, its padding left out
     */
    public TextView underlyingSymbol() {
        return new TextView(buffer, offset + UNDERLYING_SYMBOL_OFFSET, 13, (byte) ' ', false, true);
    }

    /**
     * Number of legs in the strategy NOTE: Leg field offsets below are an equation, where “n” is the zero based leg number (0, 1, …)
     *
     * @return the value
     */
    public short numberOfLegs() {
        return (short) (buffer[offset + NUMBER_OF_LEGS_OFFSET] & 0xFF);
    }

    /**
     * Leg information
     *
     * <p>Each call returns a new list, valid for as long as the bytes viewed are unchanged.</p>
     *
     * @return the entries, as many as {@link #numberOfLegs()} counts
     */
    public LegInformationList legInformation() {
        return new LegInformationList(buffer, offset + LEG_INFORMATION_OFFSET, (int) numberOfLegs());
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("timestamp=").append(timestamp());
        builder.append(", strategyId=").append(strategyId());
        StrategyType strategyType = strategyType();
        if (strategyType == null) {
            builder.append(", strategyType=").append(strategyTypeRaw());
        }
        else {
            builder.append(", strategyType=").append(strategyType.name());
        }
        builder.append(", source=").append(source());
        builder.append(", underlyingSymbol=").append(underlyingSymbol());
        builder.append(", numberOfLegs=").append(numberOfLegs());
        builder.append(", legInformation=[");
        LegInformationList entries = legInformation();
        for (int index = 0; index < entries.count(); index++) {
            if (index > 0) {
                builder.append(", ");
            }
            entries.get(index).dump(builder);
        }
        builder.append(']');
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
