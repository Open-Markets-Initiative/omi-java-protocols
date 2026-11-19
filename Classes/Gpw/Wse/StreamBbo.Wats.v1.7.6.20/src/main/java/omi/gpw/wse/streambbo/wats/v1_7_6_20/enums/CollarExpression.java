package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Collar expression (percentage or absolute value in reference price)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CollarExpression {

    /**
     * Percentage
     */
    PERCENTAGE((short) 1, "Percentage"),

    /**
     * Absolute value
     */
    ABSOLUTE_VALUE((short) 2, "Absolute value");

    private final short wire;

    private final String description;

    CollarExpression(short wire, String description) {
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
    public static Optional<CollarExpression> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PERCENTAGE);
            case 2 -> Optional.of(ABSOLUTE_VALUE);
            default -> Optional.empty();
        };
    }
}
