package omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.messages.application;

import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.enums.SystemEvent;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Codec;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Flyweight;
import omi.flyweight.iex.iexequities.deepplus.iextp.v1_05.types.Message;

/**
 * Represents the SystemEventMessage message from the DeepPlus protocol.
 *
 * <p>
 * The System Event Message is used to indicate events that apply to the market or the data feed.
 * </p>
 *
 * <p>A flyweight its decoder decodes into again for each message of its type: decoding copies every field, so it
 * is valid after the bytes are reused, until the decoder decodes the next message of its type.</p>
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

    private char systemEvent;

    private long timestamp;

    /**
     * Creates a message holding nothing decoded; a decoder decodes into it.
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

    @Override
    protected void read(byte[] buffer, int offset) {
        systemEvent = (char) (buffer[offset + SYSTEM_EVENT_OFFSET] & 0xFF);
        timestamp = Codec.getLongLE(buffer, offset + TIMESTAMP_OFFSET);
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
        return systemEvent;
    }

    /**
     * Time stamp of the system event
     *
     * @return nanoseconds since the Unix epoch
     */
    public long timestamp() {
        return timestamp;
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
