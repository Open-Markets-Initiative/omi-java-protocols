package omi.nasdaq.psxequities.rash.asciirash.v1_1.enums;

import java.util.Optional;

/**
 * Indicates if the order is a Trade Now order (optional field).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeNow {

    /**
     * Trade Now
     */
    TRADE_NOW('B', "Trade Now"),

    /**
     * Not a Trade Now message
     */
    NOT_A_TRADE_NOW('N', "Not a Trade Now message");

    private final char wire;

    private final String description;

    TradeNow(char wire, String description) {
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
    public static Optional<TradeNow> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(TRADE_NOW);
            case 'N' -> Optional.of(NOT_A_TRADE_NOW);
            default -> Optional.empty();
        };
    }
}
