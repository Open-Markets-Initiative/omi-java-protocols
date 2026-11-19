package omi.cboe.c2options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the CrossExclusionIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossExclusionIndicator {

    /**
     * Contracts were executed in auction against Contra party or against a resting order when auction was initiated
     */
    CONTRACTS_WERE_EXECUTED_IN_AUCTION_AGAINST_CONTRA_PARTY_OR('N', "Contracts were executed in auction against Contra party or against a resting order when auction was initiated"),

    /**
     * Contracts were executed in auction against another party
     */
    CONTRACTS_WERE_EXECUTED_IN_AUCTION_AGAINST_ANOTHER_PARTY('Y', "Contracts were executed in auction against another party");

    private final char wire;

    private final String description;

    CrossExclusionIndicator(char wire, String description) {
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
    public static Optional<CrossExclusionIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(CONTRACTS_WERE_EXECUTED_IN_AUCTION_AGAINST_CONTRA_PARTY_OR);
            case 'Y' -> Optional.of(CONTRACTS_WERE_EXECUTED_IN_AUCTION_AGAINST_ANOTHER_PARTY);
            default -> Optional.empty();
        };
    }
}
