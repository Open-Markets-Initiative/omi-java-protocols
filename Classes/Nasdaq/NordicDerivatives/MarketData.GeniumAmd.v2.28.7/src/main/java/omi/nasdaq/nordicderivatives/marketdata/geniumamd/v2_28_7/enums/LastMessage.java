package omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.enums;

import java.util.Optional;

/**
 * Indicates if the message is the final message in a Market by Level update 0 = Not Last Message 1 = Last Message Where Last Message = 0, there will be more mes- sages to follow to complete the Market by Level update. When Last Message = 1, the full Market by Level update will have been received.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LastMessage {

    /**
     * Not Last Message
     */
    NOT_LAST_MESSAGE((short) 0, "Not Last Message"),

    /**
     * Last Message
     */
    LAST_MESSAGE((short) 1, "Last Message");

    private final short wire;

    private final String description;

    LastMessage(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<LastMessage> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_LAST_MESSAGE);
            case 1 -> Optional.of(LAST_MESSAGE);
            default -> Optional.empty();
        };
    }
}
