package omi.cme.globex.mdp3.sbe.v1_5.enums;

import java.util.Optional;

/**
 * Market Data entry type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryTypeStatistics {

    /**
     * Open Price
     */
    OPEN_PRICE('4', "Open Price"),

    /**
     * High Trade
     */
    HIGH_TRADE('7', "High Trade"),

    /**
     * Low Trade
     */
    LOW_TRADE('8', "Low Trade"),

    /**
     * Highest Bid
     */
    HIGHEST_BID('N', "Highest Bid"),

    /**
     * Lowest Offer
     */
    LOWEST_OFFER('O', "Lowest Offer");

    private final char wire;

    private final String description;

    MdEntryTypeStatistics(char wire, String description) {
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
    public static Optional<MdEntryTypeStatistics> fromWire(char wire) {
        return switch (wire) {
            case '4' -> Optional.of(OPEN_PRICE);
            case '7' -> Optional.of(HIGH_TRADE);
            case '8' -> Optional.of(LOW_TRADE);
            case 'N' -> Optional.of(HIGHEST_BID);
            case 'O' -> Optional.of(LOWEST_OFFER);
            default -> Optional.empty();
        };
    }
}
