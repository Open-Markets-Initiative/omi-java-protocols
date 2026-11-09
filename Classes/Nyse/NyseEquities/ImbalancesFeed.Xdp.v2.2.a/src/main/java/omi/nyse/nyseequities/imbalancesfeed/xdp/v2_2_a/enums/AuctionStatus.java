package omi.nyse.nyseequities.imbalancesfeed.xdp.v2_2_a.enums;

import java.util.Optional;

/**
 * Indicates whether the auction will run
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AuctionStatus {

    /**
     * Will run as always for Open and Close
     */
    WILL_RUN_OPEN_CLOSE((short) 0, "Will run as always for Open and Close"),

    /**
     * Will run, interest exists inside or at the collars or is fully paired off
     */
    WILL_RUN_INTEREST((short) 1, "Will run, interest exists inside or at the collars or is fully paired off"),

    /**
     * Will not run because there is an imbalance through the collars
     */
    WILL_NOT_RUN_IMBALANCE((short) 2, "Will not run because there is an imbalance through the collars"),

    /**
     * Will not run, will transition to the Closing auction instead
     */
    WILL_NOT_RUN_TRANSITION_TO_CLOSING((short) 3, "Will not run, will transition to the Closing auction instead");

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
            case 0 -> Optional.of(WILL_RUN_OPEN_CLOSE);
            case 1 -> Optional.of(WILL_RUN_INTEREST);
            case 2 -> Optional.of(WILL_NOT_RUN_IMBALANCE);
            case 3 -> Optional.of(WILL_NOT_RUN_TRANSITION_TO_CLOSING);
            default -> Optional.empty();
        };
    }
}
