package omi.nasdaq.nsmequities.totalview.asciiitch.v2_0_a.enums;

import java.util.Optional;

/**
 * Indicates if the stock symbol is halted on NASDAQ system.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StockHalted {

    /**
     * True, stock is halted
     */
    HALTED('T', "True, stock is halted"),

    /**
     * False, stock is trading normally
     */
    TRADING('F', "False, stock is trading normally");

    private final char wire;

    private final String description;

    StockHalted(char wire, String description) {
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
    public static Optional<StockHalted> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(HALTED);
            case 'F' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
