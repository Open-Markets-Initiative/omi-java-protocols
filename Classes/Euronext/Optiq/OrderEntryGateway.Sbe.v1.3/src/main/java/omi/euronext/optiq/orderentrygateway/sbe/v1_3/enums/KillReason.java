package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * killReason
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum KillReason {

    /**
     * Order_Cancelled_by_Client
     */
    ORDER_CANCELLEDBY_CLIENT(1, "Order_Cancelled_by_Client"),

    /**
     * Order_Expired
     */
    ORDER_EXPIRED(2, "Order_Expired"),

    /**
     * Order_Cancelled_by_Market_Operations
     */
    ORDER_CANCELLEDBY_MARKET_OPERATIONS(3, "Order_Cancelled_by_Market_Operations"),

    /**
     * Order_Eliminated_due_to_Corporate_Event
     */
    ORDER_ELIMINATEDDUETO_CORPORATE_EVENT(4, "Order_Eliminated_due_to_Corporate_Event"),

    /**
     * Done_for_day
     */
    DONEFORDAY(5, "Done_for_day"),

    /**
     * Cancelled_MTL_in_an_empty_Order_Book
     */
    CANCELLED_MT_LINANEMPTY_ORDER_BOOK(6, "Cancelled_MTL_in_an_empty_Order_Book"),

    /**
     * Cancelled_by_STP
     */
    CANCELLEDBY_STP(7, "Cancelled_by_STP"),

    /**
     * Remaining_quantity_killed_IOC
     */
    REMAININGQUANTITYKILLED_IOC(8, "Remaining_quantity_killed_IOC"),

    /**
     * Beginning_of_PAKO_Period
     */
    BEGINNINGOF_PAKO_PERIOD(9, "Beginning_of_PAKO_Period"),

    /**
     * Order_Cancelled_due_to_Cancel_On_Disconnect_Mechanism
     */
    ORDER_CANCELLEDDUETO_CANCEL_ON_DISCONNECT_MECHANISM(11, "Order_Cancelled_due_to_Cancel_On_Disconnect_Mechanism"),

    /**
     * RFQ_expired_
     */
    RF_QEXPIRED(12, "RFQ_expired_"),

    /**
     * RFQ_partially_or_fully_matched_with_other_counterparts
     */
    RF_QPARTIALLYORFULLYMATCHEDWITHOTHERCOUNTERPARTS(13, "RFQ_partially_or_fully_matched_with_other_counterparts"),

    /**
     * RFQ_cancelled_by_the_issuer
     */
    RF_QCANCELLEDBYTHEISSUER(14, "RFQ_cancelled_by_the_issuer"),

    /**
     * RFQ_Not_matched_due_to_issuer_orders_features
     */
    RFQ_NOTMATCHEDDUETOISSUERORDERSFEATURES(15, "RFQ_Not_matched_due_to_issuer_orders_features"),

    /**
     * Quote_cancelled_due_to_Knock_Out
     */
    QUOTECANCELLEDDUETO_KNOCK_OUT(16, "Quote_cancelled_due_to_Knock_Out"),

    /**
     * Order_cancelled_due_to_a_Kill_command
     */
    ORDERCANCELLEDDUETOA_KILLCOMMAND(17, "Order_cancelled_due_to_a_Kill_command");

    private final int wire;

    private final String description;

    KillReason(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<KillReason> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(ORDER_CANCELLEDBY_CLIENT);
            case 2 -> Optional.of(ORDER_EXPIRED);
            case 3 -> Optional.of(ORDER_CANCELLEDBY_MARKET_OPERATIONS);
            case 4 -> Optional.of(ORDER_ELIMINATEDDUETO_CORPORATE_EVENT);
            case 5 -> Optional.of(DONEFORDAY);
            case 6 -> Optional.of(CANCELLED_MT_LINANEMPTY_ORDER_BOOK);
            case 7 -> Optional.of(CANCELLEDBY_STP);
            case 8 -> Optional.of(REMAININGQUANTITYKILLED_IOC);
            case 9 -> Optional.of(BEGINNINGOF_PAKO_PERIOD);
            case 11 -> Optional.of(ORDER_CANCELLEDDUETO_CANCEL_ON_DISCONNECT_MECHANISM);
            case 12 -> Optional.of(RF_QEXPIRED);
            case 13 -> Optional.of(RF_QPARTIALLYORFULLYMATCHEDWITHOTHERCOUNTERPARTS);
            case 14 -> Optional.of(RF_QCANCELLEDBYTHEISSUER);
            case 15 -> Optional.of(RFQ_NOTMATCHEDDUETOISSUERORDERSFEATURES);
            case 16 -> Optional.of(QUOTECANCELLEDDUETO_KNOCK_OUT);
            case 17 -> Optional.of(ORDERCANCELLEDDUETOA_KILLCOMMAND);
            default -> Optional.empty();
        };
    }
}
