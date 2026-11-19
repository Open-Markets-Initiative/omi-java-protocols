package omi.nasdaq.iseoptions.orderfeed.itch.v1_1.enums;

import java.util.Optional;

/**
 * Indicates what kind of option this is
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingType {

    /**
     * Equity
     */
    EQUITY('E', "Equity"),

    /**
     * Index
     */
    INDEX('I', "Index"),

    /**
     * ETF
     */
    ETF('F', "ETF"),

    /**
     * Currency
     */
    CURRENCY('C', "Currency");

    private final char wire;

    private final String description;

    TradingType(char wire, String description) {
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
    public static Optional<TradingType> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(EQUITY);
            case 'I' -> Optional.of(INDEX);
            case 'F' -> Optional.of(ETF);
            case 'C' -> Optional.of(CURRENCY);
            default -> Optional.empty();
        };
    }
}
