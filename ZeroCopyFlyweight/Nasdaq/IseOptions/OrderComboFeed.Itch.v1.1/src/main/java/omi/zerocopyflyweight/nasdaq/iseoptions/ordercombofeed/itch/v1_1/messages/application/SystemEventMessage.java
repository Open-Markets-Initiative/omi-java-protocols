package omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.messages.application;

import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums.EventCode;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Codec;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Flyweight;
import omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.types.Message;

/**
 * Represents the SystemEventMessage message from the OrderComboFeed protocol.
 *
 * <p>
 * The system event message type is used to signal a market or data feed handler event.
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class SystemEventMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "System Event Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 13;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 0;

    /**
     * Where {@link #eventCode()} starts, from the message's start.
     */
    public static final int EVENT_CODE_OFFSET = 6;

    /**
     * Where {@link #currentYear()} starts, from the message's start.
     */
    public static final int CURRENT_YEAR_OFFSET = 7;

    /**
     * Where {@link #currentMonth()} starts, from the message's start.
     */
    public static final int CURRENT_MONTH_OFFSET = 9;

    /**
     * Where {@link #currentDay()} starts, from the message's start.
     */
    public static final int CURRENT_DAY_OFFSET = 10;

    /**
     * Where {@link #version()} starts, from the message's start.
     */
    public static final int VERSION_OFFSET = 11;

    /**
     * Where {@link #subVersion()} starts, from the message's start.
     */
    public static final int SUB_VERSION_OFFSET = 12;

    /**
     * Creates a flyweight wrapping nothing; a decoder wraps it.
     */
    public SystemEventMessage() {
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
     * Refer to System Event Codes below
     *
     * @return the value, or null when the protocol declares none for {@link #eventCodeRaw()}
     */
    public EventCode eventCode() {
        return EventCode.get(eventCodeRaw());
    }

    /**
     * Refer to System Event Codes below
     *
     * @return the value as it was sent
     */
    public char eventCodeRaw() {
        return (char) (buffer[offset + EVENT_CODE_OFFSET] & 0xFF);
    }

    /**
     * The current calendar year (example: 2016).
     *
     * @return the value
     */
    public int currentYear() {
        return Codec.getShortBE(buffer, offset + CURRENT_YEAR_OFFSET) & 0xFFFF;
    }

    /**
     * The current calendar month, with values 1 to 12 inclusive, January=1, etc.
     *
     * @return the value
     */
    public short currentMonth() {
        return (short) (buffer[offset + CURRENT_MONTH_OFFSET] & 0xFF);
    }

    /**
     * The current calendar day, with values 1 to 31 inclusive.
     *
     * @return the value
     */
    public short currentDay() {
        return (short) (buffer[offset + CURRENT_DAY_OFFSET] & 0xFF);
    }

    /**
     * Version of this interface. Currently set to 1.
     *
     * @return the value
     */
    public short version() {
        return (short) (buffer[offset + VERSION_OFFSET] & 0xFF);
    }

    /**
     * Sub-version of this interface. Currently set to 0.
     *
     * @return the value
     */
    public short subVersion() {
        return (short) (buffer[offset + SUB_VERSION_OFFSET] & 0xFF);
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        builder.append("timestamp=").append(timestamp());
        EventCode eventCode = eventCode();
        if (eventCode == null) {
            builder.append(", eventCode=").append(eventCodeRaw());
        }
        else {
            builder.append(", eventCode=").append(eventCode.name());
        }
        builder.append(", currentYear=").append(currentYear());
        builder.append(", currentMonth=").append(currentMonth());
        builder.append(", currentDay=").append(currentDay());
        builder.append(", version=").append(version());
        builder.append(", subVersion=").append(subVersion());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
