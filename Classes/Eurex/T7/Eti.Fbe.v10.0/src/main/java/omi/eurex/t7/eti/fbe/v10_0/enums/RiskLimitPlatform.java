package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the RiskLimitPlatform values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RiskLimitPlatform {

    /**
     * On-Book
     */
    ON_BOOK((short) 0, "On-Book"),

    /**
     * Off-Book(TES)
     */
    OFF_BOOK((short) 1, "Off-Book(TES)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    RiskLimitPlatform(short wire, String description) {
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
    public static Optional<RiskLimitPlatform> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ON_BOOK);
            case 1 -> Optional.of(OFF_BOOK);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
