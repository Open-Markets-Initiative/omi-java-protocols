package omi.nyse.amexequities.integratedfeed.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * Indicates whether the auction will run.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AuctionStatus {

    /**
     * Will Run As Always For Open And Close
     */
    WILL_RUN_AS_ALWAYS_FOR_OPEN_AND_CLOSE((short) 0, "Will Run As Always For Open And Close"),

    /**
     * Will Run Interest Exists Inside Or At The Collars Or Is Fully Paired Off
     */
    WILL_RUN_INTEREST_EXISTS_INSIDE_OR_AT_THE_COLLARS_OR_IS_FULLY_PAIRED_OFF((short) 1, "Will Run Interest Exists Inside Or At The Collars Or Is Fully Paired Off"),

    /**
     * Will Not Run Because There Is An Imbalance Through The Collars
     */
    WILL_NOT_RUN_BECAUSE_THERE_IS_AN_IMBALANCE_THROUGH_THE_COLLARS((short) 2, "Will Not Run Because There Is An Imbalance Through The Collars"),

    /**
     * Will Not Run Will Transition To The Closing Auction Instead
     */
    WILL_NOT_RUN_WILL_TRANSITION_TO_THE_CLOSING_AUCTION_INSTEAD((short) 3, "Will Not Run Will Transition To The Closing Auction Instead");

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
            case 0 -> Optional.of(WILL_RUN_AS_ALWAYS_FOR_OPEN_AND_CLOSE);
            case 1 -> Optional.of(WILL_RUN_INTEREST_EXISTS_INSIDE_OR_AT_THE_COLLARS_OR_IS_FULLY_PAIRED_OFF);
            case 2 -> Optional.of(WILL_NOT_RUN_BECAUSE_THERE_IS_AN_IMBALANCE_THROUGH_THE_COLLARS);
            case 3 -> Optional.of(WILL_NOT_RUN_WILL_TRANSITION_TO_THE_CLOSING_AUCTION_INSTEAD);
            default -> Optional.empty();
        };
    }
}
