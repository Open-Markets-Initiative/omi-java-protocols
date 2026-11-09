package omi.cme.globex.mdp3.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Market Data entry type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryTypeDailyStatistics {

    /**
     * Settlement Price
     */
    SETTLEMENT_PRICE('6', "Settlement Price"),

    /**
     * Cleared Volume
     */
    CLEARED_VOLUME('B', "Cleared Volume"),

    /**
     * Open Interest
     */
    OPEN_INTEREST('C', "Open Interest"),

    /**
     * Fixing Price
     */
    FIXING_PRICE('W', "Fixing Price");

    private final char wire;

    private final String description;

    MdEntryTypeDailyStatistics(char wire, String description) {
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
    public static Optional<MdEntryTypeDailyStatistics> fromWire(char wire) {
        return switch (wire) {
            case '6' -> Optional.of(SETTLEMENT_PRICE);
            case 'B' -> Optional.of(CLEARED_VOLUME);
            case 'C' -> Optional.of(OPEN_INTEREST);
            case 'W' -> Optional.of(FIXING_PRICE);
            default -> Optional.empty();
        };
    }
}
