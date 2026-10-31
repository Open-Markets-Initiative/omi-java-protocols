package omi.nasdaq.nsmequities.qbbo.itch.v2_1.enums;

import java.util.Optional;

/**
 * Indicates the type of price improvement available
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InterestFlag {

    /**
     * PI orders available on the buy side
     */
    BUY_SIDE('B', "PI orders available on the buy side"),

    /**
     * PI orders available on the sell side
     */
    SELL_SIDE('S', "PI orders available on the sell side"),

    /**
     * PI orders available on both sides (buy and sell)
     */
    BOTH_SIDES('A', "PI orders available on both sides (buy and sell)"),

    /**
     * No PI orders available
     */
    NO_PI_AVAILABLE('N', "No PI orders available");

    private final char wire;

    private final String description;

    InterestFlag(char wire, String description) {
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
    public static Optional<InterestFlag> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY_SIDE);
            case 'S' -> Optional.of(SELL_SIDE);
            case 'A' -> Optional.of(BOTH_SIDES);
            case 'N' -> Optional.of(NO_PI_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
