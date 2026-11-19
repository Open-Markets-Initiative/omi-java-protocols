package omi.bruceats.bruceequities.bestbidandoffer.itch.v3_3.enums;

import java.util.Optional;

/**
 * Indicates Listing market for the issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCategory {

    /**
     * NYSE American
     */
    NYSE_AMERICAN('A', "NYSE American"),

    /**
     * NYSE
     */
    NYSE('N', "NYSE"),

    /**
     * NYSE ARCA
     */
    NYSE_ARCA('P', "NYSE ARCA"),

    /**
     * NASDAQ
     */
    NASDAQ('Q', "NASDAQ"),

    /**
     * Investors Exchange LLC
     */
    INVESTORS_EXCHANGE_LLC('V', "Investors Exchange LLC"),

    /**
     * CBOE BZX Exchange
     */
    CBOE_BZX('Z', "CBOE BZX Exchange"),

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available");

    private final char wire;

    private final String description;

    MarketCategory(char wire, String description) {
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
    public static Optional<MarketCategory> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'V' -> Optional.of(INVESTORS_EXCHANGE_LLC);
            case 'Z' -> Optional.of(CBOE_BZX);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
