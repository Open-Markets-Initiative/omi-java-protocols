package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Acknowledgement type indicating the result or status of the order action.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AckType {

    /**
     * New Interest acknowledgement.
     */
    NEW_INTEREST((short) 1, "New Interest acknowledgement."),

    /**
     * Order priority update with a new OrderID.
     */
    ORDER_PRIORITY_UPDATE_NEW_ID((short) 2, "Order priority update with a new OrderID."),

    /**
     * Order priority update with the same OrderID.
     */
    ORDER_PRIORITY_UPDATE_SAME_ID((short) 3, "Order priority update with the same OrderID."),

    /**
     * Acknowledgement of a Bulk Cancel request.
     */
    BULK_CANCEL_ACK((short) 4, "Acknowledgement of a Bulk Cancel request."),

    /**
     * Cancel request is pending.
     */
    PENDING_CANCEL((short) 5, "Cancel request is pending."),

    /**
     * Cancel/Replace request is pending.
     */
    PENDING_REPLACE((short) 6, "Cancel/Replace request is pending."),

    /**
     * Modify request is pending.
     */
    PENDING_MODIFY((short) 7, "Modify request is pending."),

    /**
     * Order has been replaced.
     */
    REPLACED((short) 8, "Order has been replaced."),

    /**
     * Order has been modified.
     */
    MODIFIED((short) 9, "Order has been modified."),

    /**
     * Order is eligible for cross.
     */
    ELIGIBLE_FOR_CROSS((short) 10, "Order is eligible for cross."),

    /**
     * Order has been canceled.
     */
    CANCELED((short) 11, "Order has been canceled."),

    /**
     * Order is done for the trading day.
     */
    DONE_FOR_DAY((short) 12, "Order is done for the trading day."),

    /**
     * Billable cancel while adding liquidity.
     */
    BILLABLE_CANCEL_ADD_LIQUIDITY((short) 13, "Billable cancel while adding liquidity."),

    /**
     * Billable cancel while removing liquidity.
     */
    BILLABLE_CANCEL_REMOVE_LIQUIDITY((short) 14, "Billable cancel while removing liquidity."),

    /**
     * Billable cancel adding sub-dollar liquidity.
     */
    BILLABLE_CANCEL_SUB_DOLLAR_ADD((short) 15, "Billable cancel adding sub-dollar liquidity."),

    /**
     * Billable cancel removing sub-dollar liquidity.
     */
    BILLABLE_CANCEL_SUB_DOLLAR_REMOVE((short) 16, "Billable cancel removing sub-dollar liquidity.");

    private final short wire;

    private final String description;

    AckType(short wire, String description) {
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
    public static Optional<AckType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NEW_INTEREST);
            case 2 -> Optional.of(ORDER_PRIORITY_UPDATE_NEW_ID);
            case 3 -> Optional.of(ORDER_PRIORITY_UPDATE_SAME_ID);
            case 4 -> Optional.of(BULK_CANCEL_ACK);
            case 5 -> Optional.of(PENDING_CANCEL);
            case 6 -> Optional.of(PENDING_REPLACE);
            case 7 -> Optional.of(PENDING_MODIFY);
            case 8 -> Optional.of(REPLACED);
            case 9 -> Optional.of(MODIFIED);
            case 10 -> Optional.of(ELIGIBLE_FOR_CROSS);
            case 11 -> Optional.of(CANCELED);
            case 12 -> Optional.of(DONE_FOR_DAY);
            case 13 -> Optional.of(BILLABLE_CANCEL_ADD_LIQUIDITY);
            case 14 -> Optional.of(BILLABLE_CANCEL_REMOVE_LIQUIDITY);
            case 15 -> Optional.of(BILLABLE_CANCEL_SUB_DOLLAR_ADD);
            case 16 -> Optional.of(BILLABLE_CANCEL_SUB_DOLLAR_REMOVE);
            default -> Optional.empty();
        };
    }
}
