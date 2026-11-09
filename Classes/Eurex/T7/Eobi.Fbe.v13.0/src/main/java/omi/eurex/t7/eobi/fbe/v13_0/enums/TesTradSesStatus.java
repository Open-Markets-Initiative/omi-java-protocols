package omi.eurex.t7.eobi.fbe.v13_0.enums;

import java.util.Optional;

/**
 * Defines the TesTradSesStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TesTradSesStatus {

    /**
     * Halted
     */
    HALTED((short) 1, "Halted"),

    /**
     * Open
     */
    OPEN((short) 2, "Open"),

    /**
     * Closed
     */
    CLOSED((short) 3, "Closed"),

    /**
     * Pre Close
     */
    PRE_CLOSE((short) 5, "Pre Close"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TesTradSesStatus(short wire, String description) {
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
    public static Optional<TesTradSesStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(HALTED);
            case 2 -> Optional.of(OPEN);
            case 3 -> Optional.of(CLOSED);
            case 5 -> Optional.of(PRE_CLOSE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
