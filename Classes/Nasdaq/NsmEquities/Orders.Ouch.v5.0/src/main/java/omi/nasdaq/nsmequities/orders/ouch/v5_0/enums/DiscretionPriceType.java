package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * DiscretionPriceType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DiscretionPriceType {

    /**
     * limit (default)
     */
    LIMIT('L', "limit (default)"),

    /**
     * market peg
     */
    MARKET_PEG('P', "market peg"),

    /**
     * midpoint peg
     */
    MIDPOINT_PEG('M', "midpoint peg"),

    /**
     * primary peg
     */
    PRIMARY_PEG('R', "primary peg");

    private final char wire;

    private final String description;

    DiscretionPriceType(char wire, String description) {
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
    public static Optional<DiscretionPriceType> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(LIMIT);
            case 'P' -> Optional.of(MARKET_PEG);
            case 'M' -> Optional.of(MIDPOINT_PEG);
            case 'R' -> Optional.of(PRIMARY_PEG);
            default -> Optional.empty();
        };
    }
}
