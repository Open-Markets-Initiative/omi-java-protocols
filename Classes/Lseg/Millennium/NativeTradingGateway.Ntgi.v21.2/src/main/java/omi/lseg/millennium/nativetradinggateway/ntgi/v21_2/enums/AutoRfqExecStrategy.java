package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * This field will include the applicable Auto RFQ Execution Strategy ‘Sub LIS Auction with Order Book Sweep or LIS Winner Takes All’ model.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AutoRfqExecStrategy {

    /**
     * Sub Lis Auction
     */
    SUB_LIS_AUCTION((short) 1, "Sub Lis Auction"),

    /**
     * Lis Winner Takes All
     */
    LIS_WINNER_TAKES_ALL((short) 4, "Lis Winner Takes All");

    private final short wire;

    private final String description;

    AutoRfqExecStrategy(short wire, String description) {
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
    public static Optional<AutoRfqExecStrategy> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SUB_LIS_AUCTION);
            case 4 -> Optional.of(LIS_WINNER_TAKES_ALL);
            default -> Optional.empty();
        };
    }
}
