package omi.nasdaq.ntxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * The Nasdaq Texas cross session for which the message is being generated.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Nasdaq Texas Opening Cross.
     */
    NASDAQ_TEXAS_OPENING_CROSS('O', "Nasdaq Texas Opening Cross."),

    /**
     * Nasdaq Texas Closing Cross.
     */
    NASDAQ_TEXAS_CLOSING_CROSS('C', "Nasdaq Texas Closing Cross."),

    /**
     * Cross for IPO and halted / paused securities.
     */
    CROSS_FOR_IPO_AND_HALTED_PAUSED('H', "Cross for IPO and halted / paused securities."),

    /**
     * Nasdaq Texas Cross Network: Intraday Cross and Post Close Cross
     */
    NASDAQ_TEXAS_CROSS_NETWORK('I', "Nasdaq Texas Cross Network: Intraday Cross and Post Close Cross");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(NASDAQ_TEXAS_OPENING_CROSS);
            case 'C' -> Optional.of(NASDAQ_TEXAS_CLOSING_CROSS);
            case 'H' -> Optional.of(CROSS_FOR_IPO_AND_HALTED_PAUSED);
            case 'I' -> Optional.of(NASDAQ_TEXAS_CROSS_NETWORK);
            default -> Optional.empty();
        };
    }
}
