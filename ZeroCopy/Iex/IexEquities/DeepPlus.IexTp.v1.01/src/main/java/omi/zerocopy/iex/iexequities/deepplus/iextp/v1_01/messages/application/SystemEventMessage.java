package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.messages.application;

import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.enums.SystemEvent;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Codec;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Flyweight;
import omi.zerocopy.iex.iexequities.deepplus.iextp.v1_01.types.Message;

/**
 * Represents the SystemEventMessage message from the DeepPlus protocol.
 *
 * <p>
 * The System Event Message is used to indicate events that apply to the market or the data feed.
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
    public static final int BYTE_LENGTH = 9;

    /**
     * Where {@link #systemEvent()} starts, from the message's start.
     */
    public static final int SYSTEM_EVENT_OFFSET = 0;

    /**
     * Where {@link #timestamp()} starts, from the message's start.
     */
    public static final int TIMESTAMP_OFFSET = 1;

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
     * System event identifier
     *
     * @return the value, or null when the protocol declares none for {@link #systemEventRaw()}
     */
    public SystemEvent systemEvent() {
        return SystemEvent.get(systemEventRaw());
    }

    /**
     * System event identifier
     *
     * @return the value as it was sent
     */
    public char systemEventRaw() {
        return (char) (buffer[offset + SYSTEM_EVENT_OFFSET] & 0xFF);
    }

    /**
     * Time stamp of the system event
     *
     * @return nanoseconds since the Unix epoch
     */
    public long timestamp() {
        return Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
    }

    @Override
    public StringBuilder dump(StringBuilder builder) {
        builder.append(NAME).append('{');
        SystemEvent systemEvent = systemEvent();
        if (systemEvent == null) {
            builder.append("systemEvent=").append(systemEventRaw());
        }
        else {
            builder.append("systemEvent=").append(systemEvent.name());
        }
        builder.append(", timestamp=").append(timestamp());
        return builder.append('}');
    }

    @Override
    public String toString() {
        return dump(new StringBuilder()).toString();
    }
}
