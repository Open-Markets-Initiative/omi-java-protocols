package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Type of manual action performed by the DMM.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ManualActionType {

    /**
     * New Manual DMM Order entered via DMM Interest Template
     */
    NEW_MANUAL_DMM_ORDER((short) 1, "New Manual DMM Order entered via DMM Interest Template"),

    /**
     * Aggregate reduction in Manual DMM Order(s) Quantity via DMM Interest Template
     */
    REDUCE_MANUAL_DMM_QTY((short) 2, "Aggregate reduction in Manual DMM Order(s) Quantity via DMM Interest Template"),

    /**
     * Opening Auction via Opening Template
     */
    OPENING_AUCTION((short) 3, "Opening Auction via Opening Template"),

    /**
     * Re-opening Auction via Opening Template
     */
    REOPENING_AUCTION((short) 4, "Re-opening Auction via Opening Template"),

    /**
     * Closing Auction via Closing Template
     */
    CLOSING_AUCTION((short) 5, "Closing Auction via Closing Template"),

    /**
     * Manual Cross DMM against NYSE Floor Broker via G-Key Template
     */
    MANUAL_CROSS((short) 6, "Manual Cross DMM against NYSE Floor Broker via G-Key Template"),

    /**
     * Cancel all Manual DMM Orders per Side via DMM Interest Template
     */
    CANCEL_ALL_MANUAL_ORDERS((short) 7, "Cancel all Manual DMM Orders per Side via DMM Interest Template");

    private final short wire;

    private final String description;

    ManualActionType(short wire, String description) {
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
    public static Optional<ManualActionType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NEW_MANUAL_DMM_ORDER);
            case 2 -> Optional.of(REDUCE_MANUAL_DMM_QTY);
            case 3 -> Optional.of(OPENING_AUCTION);
            case 4 -> Optional.of(REOPENING_AUCTION);
            case 5 -> Optional.of(CLOSING_AUCTION);
            case 6 -> Optional.of(MANUAL_CROSS);
            case 7 -> Optional.of(CANCEL_ALL_MANUAL_ORDERS);
            default -> Optional.empty();
        };
    }
}
