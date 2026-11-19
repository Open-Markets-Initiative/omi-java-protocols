package omi.nse.nsecom.dropcopy.nnfdirect.v1_5.enums;

import java.util.Optional;

/**
 * Book the order belongs to
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BookTypeShort {

    /**
     * Regular Lot Order
     */
    REGULAR_LOT_ORDER((short) 1, "Regular Lot Order"),

    /**
     * Special Terms Order
     */
    SPECIAL_TERMS_ORDER((short) 2, "Special Terms Order"),

    /**
     * Stop Loss Mit Order
     */
    STOP_LOSS_MIT_ORDER((short) 3, "Stop Loss Mit Order"),

    /**
     * Negotiated Order Not Used
     */
    NEGOTIATED_ORDER_NOT_USED((short) 4, "Negotiated Order Not Used"),

    /**
     * Odd Lot Order Not Used
     */
    ODD_LOT_ORDER_NOT_USED((short) 5, "Odd Lot Order Not Used"),

    /**
     * Spot Order Not Used
     */
    SPOT_ORDER_NOT_USED((short) 6, "Spot Order Not Used"),

    /**
     * Auction Order Not Used
     */
    AUCTION_ORDER_NOT_USED((short) 7, "Auction Order Not Used");

    private final short wire;

    private final String description;

    BookTypeShort(short wire, String description) {
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
    public static Optional<BookTypeShort> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(REGULAR_LOT_ORDER);
            case 2 -> Optional.of(SPECIAL_TERMS_ORDER);
            case 3 -> Optional.of(STOP_LOSS_MIT_ORDER);
            case 4 -> Optional.of(NEGOTIATED_ORDER_NOT_USED);
            case 5 -> Optional.of(ODD_LOT_ORDER_NOT_USED);
            case 6 -> Optional.of(SPOT_ORDER_NOT_USED);
            case 7 -> Optional.of(AUCTION_ORDER_NOT_USED);
            default -> Optional.empty();
        };
    }
}
