package omi.cboe.gapdetection.pitch.v4.enums;

import java.util.Optional;

/**
 * Defines the MessageType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Time Reference Message
     */
    TIME_REFERENCE((short) 177, "Time Reference Message"),

    /**
     * Time Message
     */
    TIME_MESSAGE((short) 32, "Time Message"),

    /**
     * Pitch Unit Clear Message
     */
    UNIT_CLEAR_MESSAGE((short) 151, "Pitch Unit Clear Message"),

    /**
     * Pitch End of Session Message
     */
    END_OF_SESSION_MESSAGE((short) 45, "Pitch End of Session Message");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 177 -> Optional.of(TIME_REFERENCE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
