package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * ordType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Ordtype {

    /**
     * MARKET
     */
    MARKET('1', "MARKET"),

    /**
     * LIMIT
     */
    LIMIT('2', "LIMIT"),

    /**
     * STOP_LOSS
     */
    STOP_LOSS('3', "STOP_LOSS"),

    /**
     * STOP_LIMIT
     */
    STOP_LIMIT('4', "STOP_LIMIT"),

    /**
     * MARKET_WITH_LEFTOVER_AS_LIMIT
     */
    MARKET_WITH_LEFTOVER_AS_LIMIT('K', "MARKET_WITH_LEFTOVER_AS_LIMIT"),

    /**
     * RLP
     */
    RLP('W', "RLP"),

    /**
     * PEGGED_MIDPOINT
     */
    PEGGED_MIDPOINT('P', "PEGGED_MIDPOINT");

    private final char wire;

    private final String description;

    Ordtype(char wire, String description) {
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
    public static Optional<Ordtype> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(MARKET);
            case '2' -> Optional.of(LIMIT);
            case '3' -> Optional.of(STOP_LOSS);
            case '4' -> Optional.of(STOP_LIMIT);
            case 'K' -> Optional.of(MARKET_WITH_LEFTOVER_AS_LIMIT);
            case 'W' -> Optional.of(RLP);
            case 'P' -> Optional.of(PEGGED_MIDPOINT);
            default -> Optional.empty();
        };
    }
}
