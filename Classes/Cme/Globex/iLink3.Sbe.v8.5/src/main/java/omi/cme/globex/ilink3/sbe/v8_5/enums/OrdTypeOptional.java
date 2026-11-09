package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Order type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrdTypeOptional {

    /**
     * Market With Protection
     */
    MARKET_WITH_PROTECTION('1', "Market With Protection"),

    /**
     * Limit
     */
    LIMIT('2', "Limit"),

    /**
     * Stop Limit
     */
    STOP_LIMIT('4', "Stop Limit"),

    /**
     * Market With Leftover As Limit
     */
    MARKET_WITH_LEFTOVER_AS_LIMIT('K', "Market With Leftover As Limit");

    private final char wire;

    private final String description;

    OrdTypeOptional(char wire, String description) {
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
    public static Optional<OrdTypeOptional> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(MARKET_WITH_PROTECTION);
            case '2' -> Optional.of(LIMIT);
            case '4' -> Optional.of(STOP_LIMIT);
            case 'K' -> Optional.of(MARKET_WITH_LEFTOVER_AS_LIMIT);
            default -> Optional.empty();
        };
    }
}
