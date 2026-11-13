package omi.zerocopy.iex.iexequities.deep.iextp.v1_06.messages.application;

import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.enums.SecurityEvent;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Codec;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Flyweight;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.Message;
import omi.zerocopy.iex.iexequities.deep.iextp.v1_06.types.TextView;

/**
 * Represents the SecurityEventMessage message from the Deep protocol.
 *
 * <p>
 * The Security Event Message is used to indicate events that apply to a security
 * </p>
 *
 * <p>A flyweight: wrapping it points it at the message's bytes, and each getter reads its field from there. It is
 * valid only while those bytes are unchanged.</p>
 */
public final class SecurityEventMessage extends Flyweight implements Message {

    /**
     * The message's name in the specification.
     */
    public static final String NAME = "Security Event Message";

    /**
     * The fixed length of the message in bytes.
     */
    public static final int BYTE_LENGTH = 17;

    /**
     * Where {@link #securityEvent()} starts, from the message's start.
     */
    public static final int SECURITY_EVENT_OFFSET = 0;

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
    public SecurityEventMessage() {
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
     * Security event identifier
     *
     * @return the value, or null when the protocol declares none for {@link #securityEventRaw()}
     */
    public SecurityEvent securityEvent() {
        return SecurityEvent.get(securityEventRaw());
    }

    /**
     * Security event identifier
     *
     * @return the value as it was sent
     */
    public char securityEventRaw() {
        return (char) (buffer[offset + SECURITY_EVENT_OFFSET] & 0xFF);
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
        SecurityEvent securityEvent = securityEvent();
        if (securityEvent == null) {
            builder.append("securityEvent=").append(securityEventRaw());
        }
        else {
            builder.append("securityEvent=").append(securityEvent.name());
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
