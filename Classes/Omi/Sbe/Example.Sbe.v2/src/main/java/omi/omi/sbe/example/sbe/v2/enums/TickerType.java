package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * tickerType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TickerType {

    /**
     * EQUITY
     */
    EQUITY('E', "EQUITY"),

    /**
     * FUTURES
     */
    FUTURES('F', "FUTURES"),

    /**
     * EQUITY_OPTION
     */
    EQUITY_OPTION('O', "EQUITY_OPTION"),

    /**
     * FUTURES_OPTION
     */
    FUTURES_OPTION('P', "FUTURES_OPTION"),

    /**
     * SPREAD
     */
    SPREAD('S', "SPREAD"),

    /**
     * INDEX
     */
    INDEX('I', "INDEX"),

    /**
     * INDEX_OPTION
     */
    INDEX_OPTION('X', "INDEX_OPTION"),

    /**
     * UNSET
     */
    UNSET('U', "UNSET");

    private final char wire;

    private final String description;

    TickerType(char wire, String description) {
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
    public static Optional<TickerType> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(EQUITY);
            case 'F' -> Optional.of(FUTURES);
            case 'O' -> Optional.of(EQUITY_OPTION);
            case 'P' -> Optional.of(FUTURES_OPTION);
            case 'S' -> Optional.of(SPREAD);
            case 'I' -> Optional.of(INDEX);
            case 'X' -> Optional.of(INDEX_OPTION);
            case 'U' -> Optional.of(UNSET);
            default -> Optional.empty();
        };
    }
}
