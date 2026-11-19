package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_56.enums;

import java.util.Optional;

/**
 * Defines the OrdType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrdType {

    /**
     * Market
     */
    MARKET('1', "Market"),

    /**
     * Limit (default)
     */
    LIMIT('2', "Limit (default)"),

    /**
     * Pegged Pegged requires ExecInst be set to L, M, P, or R.
     */
    PEGGED('P', "Pegged Pegged requires ExecInst be set to L, M, P, or R.");

    private final char wire;

    private final String description;

    OrdType(char wire, String description) {
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
    public static Optional<OrdType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(MARKET);
            case '2' -> Optional.of(LIMIT);
            case 'P' -> Optional.of(PEGGED);
            default -> Optional.empty();
        };
    }
}
