package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the SettlMethod values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlMethod {

    /**
     * Cash Settlement
     */
    CASH_SETTLEMENT('C', "Cash Settlement"),

    /**
     * Physical Settlement
     */
    PHYSICAL_SETTLEMENT('P', "Physical Settlement");

    private final char wire;

    private final String description;

    SettlMethod(char wire, String description) {
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
    public static Optional<SettlMethod> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CASH_SETTLEMENT);
            case 'P' -> Optional.of(PHYSICAL_SETTLEMENT);
            default -> Optional.empty();
        };
    }
}
