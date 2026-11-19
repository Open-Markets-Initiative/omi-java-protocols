package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * P=Principal, A=Agency, R=Riskless Principal, space=Not Applicable
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PrimaryStockCapacity {

    /**
     * Principal
     */
    PRINCIPAL('P', "Principal"),

    /**
     * Agency
     */
    AGENCY('A', "Agency"),

    /**
     * Riskless Principal
     */
    RISKLESS_PRINCIPAL('R', "Riskless Principal"),

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable");

    private final char wire;

    private final String description;

    PrimaryStockCapacity(char wire, String description) {
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
    public static Optional<PrimaryStockCapacity> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRINCIPAL);
            case 'A' -> Optional.of(AGENCY);
            case 'R' -> Optional.of(RISKLESS_PRINCIPAL);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
