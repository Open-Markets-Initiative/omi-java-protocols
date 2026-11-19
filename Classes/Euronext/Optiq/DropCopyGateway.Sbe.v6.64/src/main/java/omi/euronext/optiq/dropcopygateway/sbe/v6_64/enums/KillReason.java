package omi.euronext.optiq.dropcopygateway.sbe.v6_64.enums;

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
    ORDERCANCELLEDDUETOA_KILLCOMMAND(17, "Order_cancelled_due_to_a_Kill_command"),

    /**
     * Order_cancelled_due_to_Static_Collars
     */
    ORDERCANCELLEDDUETO_STATIC_COLLARS(18, "Order_cancelled_due_to_Static_Collars"),

    /**
     * LP_Order_cancelled_due_to_RFQ_expiration
     */
    LP_ORDERCANCELLEDDUETO_RF_QEXPIRATION(19, "LP_Order_cancelled_due_to_RFQ_expiration"),

    /**
     * LP_Order_cancelled_due_to_RFQ_cancellation
     */
    LP_ORDERCANCELLEDDUETO_RF_QCANCELLATION(20, "LP_Order_cancelled_due_to_RFQ_cancellation"),

    /**
     * RFQ_Remaining_quantity_killed
     */
    RFQ_REMAININGQUANTITYKILLED(21, "RFQ_Remaining_quantity_killed"),

    /**
     * LP_Order_cancelled_due_to_RFQ_confirmation
     */
    LP_ORDERCANCELLEDDUETO_RF_QCONFIRMATION(22, "LP_Order_cancelled_due_to_RFQ_confirmation"),

    /**
     * Order_cancelled_due_to_Market_Maker_Protection
     */
    ORDERCANCELLEDDUETO_MARKET_MAKER_PROTECTION(23, "Order_cancelled_due_to_Market_Maker_Protection"),

    /**
     * Order_cancelled_by_clearing_risk_manager
     */
    ORDERCANCELLEDBYCLEARINGRISKMANAGER(24, "Order_cancelled_by_clearing_risk_manager"),

    /**
     * Order_cancelled_by_member_risk_manager
     */
    ORDERCANCELLEDBYMEMBERRISKMANAGER(25, "Order_cancelled_by_member_risk_manager"),

    /**
     * Order_cancelled_due_to_Trade_Price_Validation
     */
    ORDERCANCELLEDDUETO_TRADE_PRICE_VALIDATION(26, "Order_cancelled_due_to_Trade_Price_Validation"),

    /**
     * Conditional_Order_cancelled_due_to_Potential_Matching
     */
    CONDITIONAL_ORDERCANCELLEDDUETO_POTENTIAL_MATCHING(30, "Conditional_Order_cancelled_due_to_Potential_Matching"),

    /**
     * Order_Cancelled_due_to_breach_of_Ownership_Limit
     */
    ORDER_CANCELLEDDUETOBREACHOF_OWNERSHIP_LIMIT(31, "Order_Cancelled_due_to_breach_of_Ownership_Limit"),

    /**
     * Order_Cancelled_due_to_breach_of_Credit_Limit
     */
    ORDER_CANCELLEDDUETOBREACHOF_CREDIT_LIMIT(32, "Order_Cancelled_due_to_breach_of_Credit_Limit"),

    /**
     * Order_Cancelled_upon_CSD_request
     */
    ORDER_CANCELLEDUPON_CS_DREQUEST(33, "Order_Cancelled_upon_CSD_request"),

    /**
     * Order_Cancelled_due_to_breach_of_Short_Selling_Limit
     */
    ORDER_CANCELLEDDUETOBREACHOF_SHORT_SELLING_LIMIT(34, "Order_Cancelled_due_to_breach_of_Short_Selling_Limit"),

    /**
     * Order_Cancelled_due_to_Instrument_not_being_Eligible_for_Margin
     */
    ORDER_CANCELLEDDUETO_INSTRUMENTNOTBEING_ELIGIBLEFOR_MARGIN(35, "Order_Cancelled_due_to_Instrument_not_being_Eligible_for_Margin"),

    /**
     * Order_Cancelled_due_to_a_potential_trade_outside_FSP_limits
     */
    ORDER_CANCELLEDDUETOAPOTENTIALTRADEOUTSIDE_FS_PLIMITS(36, "Order_Cancelled_due_to_a_potential_trade_outside_FSP_limits"),

    /**
     * Remaining_RFC_Quantity_Cancelled
     */
    REMAINING_RFC_QUANTITY_CANCELLED(37, "Remaining_RFC_Quantity_Cancelled"),

    /**
     * Order_Cancelled_due_to_an_incorrect_Reactor_Response
     */
    ORDER_CANCELLEDDUETOANINCORRECT_REACTOR_RESPONSE(38, "Order_Cancelled_due_to_an_incorrect_Reactor_Response"),

    /**
     * Order_Cancelled_due_to_Instrument_not_Eligible_for_ShortSelling
     */
    ORDER_CANCELLEDDUETO_INSTRUMENTNOT_ELIGIBLEFOR_SHORT_SELLING(39, "Order_Cancelled_due_to_Instrument_not_Eligible_for_ShortSelling"),

    /**
     * Order_Cancelled_due_to_breach_of_ShortSell_Price_Check
     */
    ORDER_CANCELLEDDUETOBREACHOF_SHORT_SELL_PRICE_CHECK(40, "Order_Cancelled_due_to_breach_of_ShortSell_Price_Check"),

    /**
     * Order_cancelled_due_to_Order_Price_Control_Collar_breach
     */
    ORDERCANCELLEDDUETO_ORDER_PRICE_CONTROL_COLLARBREACH(41, "Order_cancelled_due_to_Order_Price_Control_Collar_breach"),

    /**
     * Order_cancelled_due_to_Execution_Prevention_Across_All_Firms
     */
    ORDERCANCELLEDDUETO_EXECUTION_PREVENTION_ACROSS_ALL_FIRMS(42, "Order_cancelled_due_to_Execution_Prevention_Across_All_Firms"),

    /**
     * Cancelled_due_to_Breach_of_MEP_set_by_a_clearing_risk_manager
     */
    CANCELLEDDUETO_BREACHOF_ME_PSETBYACLEARINGRISKMANAGER(43, "Cancelled_due_to_Breach_of_MEP_set_by_a_clearing_risk_manager"),

    /**
     * Cancelled_due_to_Breach_of_MEP_set_by_a_member_risk_manager
     */
    CANCELLEDDUETO_BREACHOF_ME_PSETBYAMEMBERRISKMANAGER(44, "Cancelled_due_to_Breach_of_MEP_set_by_a_member_risk_manager"),

    /**
     * Auto_RFQ_fully_matched_with_other_counterparts
     */
    AUTO_RF_QFULLYMATCHEDWITHOTHERCOUNTERPARTS(45, "Auto_RFQ_fully_matched_with_other_counterparts"),

    /**
     * Order_Cancelled_due_to_incompatibility_with_Uncrossing_Price
     */
    ORDER_CANCELLEDDUETOINCOMPATIBILITYWITH_UNCROSSING_PRICE(46, "Order_Cancelled_due_to_incompatibility_with_Uncrossing_Price"),

    /**
     * killReason
     */
    NO_VALUE(65535, "killReason");

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
            case 18 -> Optional.of(ORDERCANCELLEDDUETO_STATIC_COLLARS);
            case 19 -> Optional.of(LP_ORDERCANCELLEDDUETO_RF_QEXPIRATION);
            case 20 -> Optional.of(LP_ORDERCANCELLEDDUETO_RF_QCANCELLATION);
            case 21 -> Optional.of(RFQ_REMAININGQUANTITYKILLED);
            case 22 -> Optional.of(LP_ORDERCANCELLEDDUETO_RF_QCONFIRMATION);
            case 23 -> Optional.of(ORDERCANCELLEDDUETO_MARKET_MAKER_PROTECTION);
            case 24 -> Optional.of(ORDERCANCELLEDBYCLEARINGRISKMANAGER);
            case 25 -> Optional.of(ORDERCANCELLEDBYMEMBERRISKMANAGER);
            case 26 -> Optional.of(ORDERCANCELLEDDUETO_TRADE_PRICE_VALIDATION);
            case 30 -> Optional.of(CONDITIONAL_ORDERCANCELLEDDUETO_POTENTIAL_MATCHING);
            case 31 -> Optional.of(ORDER_CANCELLEDDUETOBREACHOF_OWNERSHIP_LIMIT);
            case 32 -> Optional.of(ORDER_CANCELLEDDUETOBREACHOF_CREDIT_LIMIT);
            case 33 -> Optional.of(ORDER_CANCELLEDUPON_CS_DREQUEST);
            case 34 -> Optional.of(ORDER_CANCELLEDDUETOBREACHOF_SHORT_SELLING_LIMIT);
            case 35 -> Optional.of(ORDER_CANCELLEDDUETO_INSTRUMENTNOTBEING_ELIGIBLEFOR_MARGIN);
            case 36 -> Optional.of(ORDER_CANCELLEDDUETOAPOTENTIALTRADEOUTSIDE_FS_PLIMITS);
            case 37 -> Optional.of(REMAINING_RFC_QUANTITY_CANCELLED);
            case 38 -> Optional.of(ORDER_CANCELLEDDUETOANINCORRECT_REACTOR_RESPONSE);
            case 39 -> Optional.of(ORDER_CANCELLEDDUETO_INSTRUMENTNOT_ELIGIBLEFOR_SHORT_SELLING);
            case 40 -> Optional.of(ORDER_CANCELLEDDUETOBREACHOF_SHORT_SELL_PRICE_CHECK);
            case 41 -> Optional.of(ORDERCANCELLEDDUETO_ORDER_PRICE_CONTROL_COLLARBREACH);
            case 42 -> Optional.of(ORDERCANCELLEDDUETO_EXECUTION_PREVENTION_ACROSS_ALL_FIRMS);
            case 43 -> Optional.of(CANCELLEDDUETO_BREACHOF_ME_PSETBYACLEARINGRISKMANAGER);
            case 44 -> Optional.of(CANCELLEDDUETO_BREACHOF_ME_PSETBYAMEMBERRISKMANAGER);
            case 45 -> Optional.of(AUTO_RF_QFULLYMATCHEDWITHOTHERCOUNTERPARTS);
            case 46 -> Optional.of(ORDER_CANCELLEDDUETOINCOMPATIBILITYWITH_UNCROSSING_PRICE);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
