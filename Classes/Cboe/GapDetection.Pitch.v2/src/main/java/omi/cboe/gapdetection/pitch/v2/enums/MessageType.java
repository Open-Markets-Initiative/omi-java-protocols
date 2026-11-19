package omi.cboe.gapdetection.pitch.v2.enums;

import java.util.Optional;

/**
 * Code identifying the Pitch message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Pitch Time Reference Message
     */
    TIME_REFERENCE_MESSAGE((short) 177, "Pitch Time Reference Message"),

    /**
     * Pitch Time Message — refreshes the per-second running seconds anchor
     */
    TIME_MESSAGE((short) 32, "Pitch Time Message \u2014 refreshes the per-second running seconds anchor"),

    /**
     * Pitch Unit Clear Message — sent at unit startup; downstream must clear book state
     */
    UNIT_CLEAR_MESSAGE((short) 151, "Pitch Unit Clear Message \u2014 sent at unit startup; downstream must clear book state"),

    /**
     * Pitch End of Session Message — sent when the unit shuts down
     */
    END_OF_SESSION_MESSAGE((short) 45, "Pitch End of Session Message \u2014 sent when the unit shuts down");

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
            case 177 -> Optional.of(TIME_REFERENCE_MESSAGE);
            case 32 -> Optional.of(TIME_MESSAGE);
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
