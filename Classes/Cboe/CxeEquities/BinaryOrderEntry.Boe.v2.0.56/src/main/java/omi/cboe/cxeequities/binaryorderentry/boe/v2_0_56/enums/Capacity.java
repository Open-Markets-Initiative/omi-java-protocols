package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_56.enums;

import java.util.Optional;

/**
 * Defines the Capacity values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Capacity {

    /**
     * Agency (maps to ’AOTC’)
     */
    AGENCY('A', "Agency (maps to \u2019AOTC\u2019)"),

    /**
     * Principal (maps to ’DEAL’)
     */
    PRINCIPAL('P', "Principal (maps to \u2019DEAL\u2019)"),

    /**
     * Riskless Principal (maps to ’MTCH’)
     */
    RISKLESS_PRINCIPAL('R', "Riskless Principal (maps to \u2019MTCH\u2019)");

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
