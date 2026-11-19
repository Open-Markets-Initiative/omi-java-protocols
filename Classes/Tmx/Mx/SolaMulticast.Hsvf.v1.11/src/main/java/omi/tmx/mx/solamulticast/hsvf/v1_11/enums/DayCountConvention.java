package omi.tmx.mx.solamulticast.hsvf.v1_11.enums;

import java.util.Optional;

/**
 * Convention used in the swap future contract settlement price calculations:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DayCountConvention {

    /**
     * Act 365
     */
    ACT_365('A', "Act 365"),

    /**
     * Act 360
     */
    ACT_360('B', "Act 360"),

    /**
     * Thirty 360
     */
    THIRTY_360('C', "Thirty 360");

    private final char wire;

    private final String description;

    DayCountConvention(char wire, String description) {
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
    public static Optional<DayCountConvention> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACT_365);
            case 'B' -> Optional.of(ACT_360);
            case 'C' -> Optional.of(THIRTY_360);
            default -> Optional.empty();
        };
    }
}
