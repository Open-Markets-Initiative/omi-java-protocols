package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Capacity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Capacity {

    /**
     * Agency
     */
    AGENCY('A', "Agency"),

    /**
     * Principal
     */
    PRINCIPAL('P', "Principal"),

    /**
     * Riskless Principal
     */
    RISKLESS_PRINCIPAL('R', "Riskless Principal");

    private final char wire;

    private final String description;

    Capacity(char wire, String description) {
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
    public static Optional<Capacity> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AGENCY);
            case 'P' -> Optional.of(PRINCIPAL);
            case 'R' -> Optional.of(RISKLESS_PRINCIPAL);
            default -> Optional.empty();
        };
    }
}
