package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Cancellation scope and behavior code
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BulkCancelType {

    /**
     * Cancel orders for the individual gateway session only. Cancel – Day; Directed Orders
     */
    SESSION_DAY_DIRECTED((short) 1, "Cancel orders for the individual gateway session only. Cancel \u2013 Day; Directed Orders"),

    /**
     * Cancel orders for the individual gateway session only. Cancel – ALL orders
     */
    SESSION_ALL_ORDERS((short) 2, "Cancel orders for the individual gateway session only. Cancel \u2013 ALL orders"),

    /**
     * Cancel orders for the individual gateway session only. Cancel – At the Opening; Day; Directed orders
     */
    SESSION_OPENING_DAY_DIRECTED((short) 3, "Cancel orders for the individual gateway session only. Cancel \u2013 At the Opening; Day; Directed orders"),

    /**
     * Cancel orders for the MPID. Cancel – At the Opening; Day; Directed orders
     */
    MPID_OPENING_DAY_DIRECTED((short) 4, "Cancel orders for the MPID. Cancel \u2013 At the Opening; Day; Directed orders"),

    /**
     * Cancel orders for the MPID. Cancel – Day; Directed orders
     */
    MPID_DAY_DIRECTED((short) 5, "Cancel orders for the MPID. Cancel \u2013 Day; Directed orders"),

    /**
     * Cancel orders for the MPID. Cancel – GTC orders (NYSE Arca &amp; American Options only)
     */
    MPID_GTC((short) 6, "Cancel orders for the MPID. Cancel \u2013 GTC orders (NYSE Arca & American Options only)"),

    /**
     * Cancel orders for the MPID. Cancel – At the Opening and On Close orders
     */
    MPID_OPENING_CLOSE((short) 7, "Cancel orders for the MPID. Cancel \u2013 At the Opening and On Close orders"),

    /**
     * Cancel orders for the MPID. Cancel – Day orders
     */
    MPID_DAY_ORDERS((short) 8, "Cancel orders for the MPID. Cancel \u2013 Day orders"),

    /**
     * Cancel orders for the MPID, and Block all new
     */
    MPID_CANCEL_BLOCK_NEW((short) 9, "Cancel orders for the MPID, and Block all new"),

    /**
     * Block all new order entry for the MPID
     */
    MPID_BLOCK_NEW((short) 10, "Block all new order entry for the MPID"),

    /**
     * Unblock new order entry for the MPID
     */
    MPID_UNBLOCK_NEW((short) 11, "Unblock new order entry for the MPID"),

    /**
     * Cancel orders for the MPID. Cancel – Directed orders
     */
    MPID_DIRECTED_ORDERS((short) 12, "Cancel orders for the MPID. Cancel \u2013 Directed orders"),

    /**
     * Cancel orders for the MPID. Cancel – Capital Commitment Orders
     */
    MPID_CAPITAL_COMMITMENT((short) 13, "Cancel orders for the MPID. Cancel \u2013 Capital Commitment Orders");

    private final short wire;

    private final String description;

    BulkCancelType(short wire, String description) {
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
    public static Optional<BulkCancelType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SESSION_DAY_DIRECTED);
            case 2 -> Optional.of(SESSION_ALL_ORDERS);
            case 3 -> Optional.of(SESSION_OPENING_DAY_DIRECTED);
            case 4 -> Optional.of(MPID_OPENING_DAY_DIRECTED);
            case 5 -> Optional.of(MPID_DAY_DIRECTED);
            case 6 -> Optional.of(MPID_GTC);
            case 7 -> Optional.of(MPID_OPENING_CLOSE);
            case 8 -> Optional.of(MPID_DAY_ORDERS);
            case 9 -> Optional.of(MPID_CANCEL_BLOCK_NEW);
            case 10 -> Optional.of(MPID_BLOCK_NEW);
            case 11 -> Optional.of(MPID_UNBLOCK_NEW);
            case 12 -> Optional.of(MPID_DIRECTED_ORDERS);
            case 13 -> Optional.of(MPID_CAPITAL_COMMITMENT);
            default -> Optional.empty();
        };
    }
}
