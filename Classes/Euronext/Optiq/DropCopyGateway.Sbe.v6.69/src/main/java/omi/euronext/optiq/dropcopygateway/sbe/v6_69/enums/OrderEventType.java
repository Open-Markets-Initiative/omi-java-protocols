package omi.euronext.optiq.dropcopygateway.sbe.v6_69.enums;

import java.util.Optional;

/**
 * orderEventType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderEventType {

    /**
     * New
     */
    NEW((short) 1, "New"),

    /**
     * Modify
     */
    MODIFY((short) 2, "Modify"),

    /**
     * Fill
     */
    FILL((short) 3, "Fill"),

    /**
     * Cancel
     */
    CANCEL((short) 4, "Cancel"),

    /**
     * Reject
     */
    REJECT((short) 5, "Reject"),

    /**
     * Trigger
     */
    TRIGGER((short) 6, "Trigger"),

    /**
     * Refill
     */
    REFILL((short) 7, "Refill"),

    /**
     * MTL
     */
    MTL((short) 8, "MTL"),

    /**
     * VFA_VFC
     */
    VFA_VFC((short) 9, "VFA_VFC"),

    /**
     * CollarBreach
     */
    COLLAR_BREACH((short) 10, "CollarBreach"),

    /**
     * GTC_GTD_Reload
     */
    GTCGTD_RELOAD((short) 11, "GTC_GTD_Reload"),

    /**
     * Open_Order_Request
     */
    OPEN_ORDER_REQUEST((short) 12, "Open_Order_Request"),

    /**
     * Expired_Reload
     */
    EXPIRED_RELOAD((short) 13, "Expired_Reload"),

    /**
     * Killed_by_Corporate_Event_Reload
     */
    KILLEDBY_CORPORATE_EVENT_RELOAD((short) 14, "Killed_by_Corporate_Event_Reload"),

    /**
     * Ownership_Request
     */
    OWNERSHIP_REQUEST((short) 15, "Ownership_Request"),

    /**
     * Implicit
     */
    IMPLICIT((short) 18, "Implicit"),

    /**
     * Routed
     */
    ROUTED((short) 19, "Routed"),

    /**
     * Routed_New
     */
    ROUTED_NEW((short) 20, "Routed_New"),

    /**
     * Routed_Fill
     */
    ROUTED_FILL((short) 21, "Routed_Fill"),

    /**
     * Routed_Cancel
     */
    ROUTED_CANCEL((short) 22, "Routed_Cancel"),

    /**
     * Move_Dark_to_COB
     */
    MOVE_DARKTO_COB((short) 23, "Move_Dark_to_COB"),

    /**
     * Parked
     */
    PARKED((short) 24, "Parked");

    private final short wire;

    private final String description;

    OrderEventType(short wire, String description) {
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
    public static Optional<OrderEventType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NEW);
            case 2 -> Optional.of(MODIFY);
            case 3 -> Optional.of(FILL);
            case 4 -> Optional.of(CANCEL);
            case 5 -> Optional.of(REJECT);
            case 6 -> Optional.of(TRIGGER);
            case 7 -> Optional.of(REFILL);
            case 8 -> Optional.of(MTL);
            case 9 -> Optional.of(VFA_VFC);
            case 10 -> Optional.of(COLLAR_BREACH);
            case 11 -> Optional.of(GTCGTD_RELOAD);
            case 12 -> Optional.of(OPEN_ORDER_REQUEST);
            case 13 -> Optional.of(EXPIRED_RELOAD);
            case 14 -> Optional.of(KILLEDBY_CORPORATE_EVENT_RELOAD);
            case 15 -> Optional.of(OWNERSHIP_REQUEST);
            case 18 -> Optional.of(IMPLICIT);
            case 19 -> Optional.of(ROUTED);
            case 20 -> Optional.of(ROUTED_NEW);
            case 21 -> Optional.of(ROUTED_FILL);
            case 22 -> Optional.of(ROUTED_CANCEL);
            case 23 -> Optional.of(MOVE_DARKTO_COB);
            case 24 -> Optional.of(PARKED);
            default -> Optional.empty();
        };
    }
}
