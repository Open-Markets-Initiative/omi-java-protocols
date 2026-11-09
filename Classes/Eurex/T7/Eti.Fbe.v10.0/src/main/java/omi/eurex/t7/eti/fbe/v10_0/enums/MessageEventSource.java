package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the MessageEventSource values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageEventSource {

    /**
     * Broadcast to initiator
     */
    BROADCASTTO_INITIATOR('I', "Broadcast to initiator"),

    /**
     * Broadcast to approver
     */
    BROADCASTTO_APPROVER('A', "Broadcast to approver"),

    /**
     * Broadcast to requestor
     */
    BROADCASTTO_REQUESTER('R', "Broadcast to requestor"),

    /**
     * Broadcast to quote submitter
     */
    BROADCASTTO_QUOTE_SUBMITTER('Q', "Broadcast to quote submitter");

    private final char wire;

    private final String description;

    MessageEventSource(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<MessageEventSource> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(BROADCASTTO_INITIATOR);
            case 'A' -> Optional.of(BROADCASTTO_APPROVER);
            case 'R' -> Optional.of(BROADCASTTO_REQUESTER);
            case 'Q' -> Optional.of(BROADCASTTO_QUOTE_SUBMITTER);
            default -> Optional.empty();
        };
    }
}
