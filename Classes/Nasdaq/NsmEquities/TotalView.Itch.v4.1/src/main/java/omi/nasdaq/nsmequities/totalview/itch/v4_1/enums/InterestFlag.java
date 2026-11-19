package omi.nasdaq.nsmequities.totalview.itch.v4_1.enums;

import java.util.Optional;

/**
 * Identifies the retail interest indication for the issue.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InterestFlag {

    /**
     * RPI orders available on the buy side
     */
    RPI_BUY('B', "RPI orders available on the buy side"),

    /**
     * RPI orders available on the sell side
     */
    RPI_SELL('S', "RPI orders available on the sell side"),

    /**
     * RPI orders available on both sides (buy and sell)
     */
    RPI_BOTH('A', "RPI orders available on both sides (buy and sell)"),

    /**
     * No RPI orders available
     */
    NO_RPI('N', "No RPI orders available");

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
            case 'B' -> Optional.of(RPI_BUY);
            case 'S' -> Optional.of(RPI_SELL);
            case 'A' -> Optional.of(RPI_BOTH);
            case 'N' -> Optional.of(NO_RPI);
            default -> Optional.empty();
        };
    }
}
