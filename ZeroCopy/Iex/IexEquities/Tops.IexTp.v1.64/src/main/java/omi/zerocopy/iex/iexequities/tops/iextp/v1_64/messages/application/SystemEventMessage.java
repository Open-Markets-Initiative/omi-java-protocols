package omi.zerocopy.iex.iexequities.tops.iextp.v1_64.messages.application;

import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.enums.SystemEvent;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Codec;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.DecodeException;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.Message;
import omi.zerocopy.iex.iexequities.tops.iextp.v1_64.types.View;

/**
 * Represents the SystemEventMessage message from the Tops protocol.
 *
 * <p>
 * The System Event Message is used to indicate events that apply to the market or the data feed.
 * </p>
 *
 * <p>An immutable view: each getter reads its field from the bytes viewed, so the message is valid for as long as
 * those bytes are unchanged.</p>
 */
public final class SystemEventMessage extends View implements Message {

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
     * Views a message.
     *
     * @param buffer the bytes holding the message
     * @param offset where the message starts
     * @param end where the bytes the message may occupy end
     * @throws DecodeException when fewer than {@link #BYTE_LENGTH} bytes lie between offset and end
     */
    public SystemEventMessage(byte[] buffer, int offset, int end) {
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
