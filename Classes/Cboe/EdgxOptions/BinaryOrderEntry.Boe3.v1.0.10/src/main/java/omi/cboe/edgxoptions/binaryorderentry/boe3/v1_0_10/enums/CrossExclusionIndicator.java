package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.enums;

import java.util.Optional;

/**
 * CrossExclusionIndicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossExclusionIndicator {

    /**
     * Contracts Were Executed In Auction Against Contra Party
     */
    CONTRACTS_WERE_EXECUTED_IN_AUCTION_AGAINST_CONTRA_PARTY('N', "Contracts Were Executed In Auction Against Contra Party"),

    /**
     * Contracts Were Executed In Auction Against Another Party
     */
    CONTRACTS_WERE_EXECUTED_IN_AUCTION_AGAINST_ANOTHER_PARTY('Y', "Contracts Were Executed In Auction Against Another Party");

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
            case 'N' -> Optional.of(CONTRACTS_WERE_EXECUTED_IN_AUCTION_AGAINST_CONTRA_PARTY);
            case 'Y' -> Optional.of(CONTRACTS_WERE_EXECUTED_IN_AUCTION_AGAINST_ANOTHER_PARTY);
            default -> Optional.empty();
        };
    }
}
