package omi.nasdaq.nsmequities.lastsale.itch.v2_1_2015.enums;

import java.util.Optional;

/**
 * Indicates the primary listing market for the issue.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityClass {

    /**
     * NASDAQ-Listed Issue
     */
    NASDAQ('Q', "NASDAQ-Listed Issue"),

    /**
     * NYSE Listed Issue
     */
    NYSE('N', "NYSE Listed Issue"),

    /**
     * NYSE MKT-Listed Issue
     */
    NYSE_MKT('A', "NYSE MKT-Listed Issue"),

    /**
     * NYSE Arca-Listed Issue
     */
    NYSE_ARCA('P', "NYSE Arca-Listed Issue"),

    /**
     * BATS-Listed Issue
     */
    BATS('Z', "BATS-Listed Issue");

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
            case 'Q' -> Optional.of(NASDAQ);
            case 'N' -> Optional.of(NYSE);
            case 'A' -> Optional.of(NYSE_MKT);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Z' -> Optional.of(BATS);
            default -> Optional.empty();
        };
    }
}
