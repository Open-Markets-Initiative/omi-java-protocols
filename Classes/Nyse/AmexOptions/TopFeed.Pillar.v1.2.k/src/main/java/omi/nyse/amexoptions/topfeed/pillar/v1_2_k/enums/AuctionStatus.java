package omi.nyse.amexoptions.topfeed.pillar.v1_2_k.enums;

import java.util.Optional;

/**
 * Indicates whether the auction will run
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AuctionStatus {

    /**
     * Will Run As Usual
     */
    WILL_RUN_AS_USUAL((short) 0, "Will Run As Usual"),

    /**
     * Auction Will Not Run Because Legal Width Quote Does Not Exist
     */
    AUCTION_WILL_NOT_RUN_BECAUSE_LEGAL_WIDTH_QUOTE_DOES_NOT_EXIST((short) 4, "Auction Will Not Run Because Legal Width Quote Does Not Exist"),

    /**
     * Auction Will Not Run Because Market Maker Quote Is Not Received
     */
    AUCTION_WILL_NOT_RUN_BECAUSE_MARKET_MAKER_QUOTE_IS_NOT_RECEIVED((short) 5, "Auction Will Not Run Because Market Maker Quote Is Not Received");

    private final short wire;

    private final String description;

    AuctionStatus(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<AuctionStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(WILL_RUN_AS_USUAL);
            case 4 -> Optional.of(AUCTION_WILL_NOT_RUN_BECAUSE_LEGAL_WIDTH_QUOTE_DOES_NOT_EXIST);
            case 5 -> Optional.of(AUCTION_WILL_NOT_RUN_BECAUSE_MARKET_MAKER_QUOTE_IS_NOT_RECEIVED);
            default -> Optional.empty();
        };
    }
}
