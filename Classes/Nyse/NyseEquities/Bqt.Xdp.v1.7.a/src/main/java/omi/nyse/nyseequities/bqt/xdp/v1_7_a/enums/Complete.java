package omi.nyse.nyseequities.bqt.xdp.v1_7_a.enums;

import java.util.Optional;

/**
 * Completion indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Complete {

    /**
     * Normal. Data is complete
     */
    NORMAL((short) 0, "Normal. Data is complete"),

    /**
     * An unrecoverable gap was experienced in the input stream, so data may not be complete
     */
    ABNORMAL((short) 1, "An unrecoverable gap was experienced in the input stream, so data may not be complete");

    private final short wire;

    private final String description;

    Complete(short wire, String description) {
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
    public static Optional<Complete> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NORMAL);
            case 1 -> Optional.of(ABNORMAL);
            default -> Optional.empty();
        };
    }
}
