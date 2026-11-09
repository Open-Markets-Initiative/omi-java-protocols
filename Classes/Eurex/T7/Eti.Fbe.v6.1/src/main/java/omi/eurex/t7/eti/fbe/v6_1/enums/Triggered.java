package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the Triggered values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Triggered {

    /**
     * Nottriggered
     */
    NOTTRIGGERED((short) 0, "Nottriggered"),

    /**
     * Triggered Stop
     */
    TRIGGERED_STOP((short) 1, "Triggered Stop"),

    /**
     * Triggered Oco
     */
    TRIGGERED_OCO((short) 2, "Triggered Oco"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    Triggered(short wire, String description) {
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
    public static Optional<Triggered> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOTTRIGGERED);
            case 1 -> Optional.of(TRIGGERED_STOP);
            case 2 -> Optional.of(TRIGGERED_OCO);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
