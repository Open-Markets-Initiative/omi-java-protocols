package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.StrategyType;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.LegInformationEntry;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.groups.LegInformationList;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Flyweight;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;
import omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Text;

/**
 * Represents the ComplexStrategyDirectoryMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Strategy Message containing the strategy definition will be sent.
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
 */
public final class ComplexStrategyDirectoryMessage extends Flyweight implements Message {

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

    private long timestamp;

    private long strategyId;

    private char strategyType;

    private short source;

    private final Text underlyingSymbol = new Text(13, (byte) ' ', false, true);

    private short numberOfLegs;

    private final LegInformationList legInformationList = new LegInformationList();

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
     */
    public ComplexStrategyDirectoryMessage() {
    }

    @Override
    public String name() {
        return NAME;
    }

    /**
     * Gets the message's length: its fixed members and the Leg Information entries it holds.
     *
     * @return its length in bytes
     */
    @Override
    public int byteLength() {
        return LEG_INFORMATION_OFFSET + legInformationList.count() * LegInformationEntry.BYTE_LENGTH;
    }

    @Override
    protected int minimumByteLength() {
        return MINIMUM_BYTE_LENGTH;
    }

    @Override
    protected int lengthAt(byte[] buffer, int offset) {
        long count = (short) (buffer[offset + NUMBER_OF_LEGS_OFFSET] & 0xFF);
        long length = LEG_INFORMATION_OFFSET + count * LegInformationEntry.BYTE_LENGTH;
        return length > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) length;
    }

    @Override
    protected void read(byte[] buffer, int offset) {
        timestamp = Codec.getUnsignedBE(buffer, offset + TIMESTAMP_OFFSET, 6);
        strategyId = Codec.getIntBE(buffer, offset + STRATEGY_ID_OFFSET) & 0xFFFFFFFFL;
        strategyType = (char) (buffer[offset + STRATEGY_TYPE_OFFSET] & 0xFF);
        source = (short) (buffer[offset + SOURCE_OFFSET] & 0xFF);
        underlyingSymbol.copy(buffer, offset + UNDERLYING_SYMBOL_OFFSET);
        numberOfLegs = (short) (buffer[offset + NUMBER_OF_LEGS_OFFSET] & 0xFF);
        legInformationList.read(buffer, offset + LEG_INFORMATION_OFFSET, (int) numberOfLegs);
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
        return strategyType;
    }

    /**
     * Identifies the source of the Strategy, valid for the trading day
     *
     * @return the value
     */
    public short source() {
        return source;
    }

    /**
     * Underlying Symbol for the strategy. All legs in this strategy belong to this Underlying
     *
     * <p>The text is copied at every decode and is valid until the next.</p>
     *
     * @return the text, its padding left out
     */
    public Text underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Number of legs in the strategy NOTE: Leg field offsets below are an equation, where “n” is the zero based leg number (0, 1, …)
     *
     * @return the value
     */
    public short numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Leg information
     *
     * <p>The list and its entries are the message's own, decoded into again at every decode.</p>
     *
     * @return the entries, as many as {@link #numberOfLegs()} counts
     */
    public LegInformationList legInformation() {
        return legInformationList;
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
