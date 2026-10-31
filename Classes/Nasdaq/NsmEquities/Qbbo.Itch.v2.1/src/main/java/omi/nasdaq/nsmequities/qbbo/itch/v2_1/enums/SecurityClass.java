package omi.nasdaq.nsmequities.qbbo.itch.v2_1.enums;

import java.util.Optional;

/**
 * Indicates the primary listing market for the issue.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityClass {

    /**
     * Nasdaq-Listed Issue
     */
    NASDAQ_LISTED_ISSUE('Q', "Nasdaq-Listed Issue"),

    /**
     * NYSE
     */
    NYSE('N', "NYSE"),

    /**
     * NYSE American
     */
    NYSE_AMERICAN('A', "NYSE American"),

    /**
     * NYSE Arca
     */
    NYSE_ARCA('P', "NYSE Arca"),

    /**
     * NYSE Texas
     */
    NYSE_TEXAS('M', "NYSE Texas"),

    /**
     * BATS
     */
    BATS('Z', "BATS"),

    /**
     * IEXG
     */
    IEXG('V', "IEXG");

    private final char wire;

    private final String description;

    SecurityClass(char wire, String description) {
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
    public static Optional<SecurityClass> fromWire(char wire) {
        return switch (wire) {
            case 'Q' -> Optional.of(NASDAQ_LISTED_ISSUE);
            case 'N' -> Optional.of(NYSE);
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'M' -> Optional.of(NYSE_TEXAS);
            case 'Z' -> Optional.of(BATS);
            case 'V' -> Optional.of(IEXG);
            default -> Optional.empty();
        };
    }
}
