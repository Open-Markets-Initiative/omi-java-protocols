package omi.eurex.t7.xti.fbe.v13_1.enums;

import java.util.Optional;

/**
 * Defines the ExecRestatementReason values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum ExecRestatementReason {

    /**
     * Corporate Action
     */
    CORPORATE_ACTION(0, "Corporate Action"),

    /**
     * Order book restatement
     */
    ORDER_BOOK_RESTATEMENT(1, "Order book restatement"),

    /**
     * Exchange option
     */
    EXCHANGE_OPTION(8, "Exchange option"),

    /**
     * Order add accepted
     */
    ORDER_ADDED(101, "Order add accepted"),

    /**
     * Order modify accepted
     */
    ORDER_MODIFIED(102, "Order modify accepted"),

    /**
     * Order delete accepted
     */
    ORDER_CANCELLED(103, "Order delete accepted"),

    /**
     * IOC Order accepted
     */
    IOC_ORDER_CANCELLED(105, "IOC Order accepted"),

    /**
     * FOK Order accepted
     */
    FOK_ORDER_CANCELLED(107, "FOK Order accepted"),

    /**
     * Book Order executed
     */
    BOOK_ORDER_EXECUTED(108, "Book Order executed"),

    /**
     * Order has been changed to IOC
     */
    CHANGEDTO_IOC(114, "Order has been changed to IOC"),

    /**
     * Change of Specialist
     */
    CHANGEOF_SPECIALIST(119, "Change of Specialist"),

    /**
     * Instrument State Change
     */
    INSTRUMENT_STATE_CHANGE(122, "Instrument State Change"),

    /**
     * Pending New
     */
    PENDING_NEW(138, "Pending New"),

    /**
     * Pending new order processed (end of FREEZE state)
     */
    PENDING_NEW_APPLIED(141, "Pending new order processed (end of FREEZE state)"),

    /**
     * Pending modify
     */
    PENDING_REPLACE(139, "Pending modify"),

    /**
     * Pending modified order processed (end of FREEZE state)
     */
    PENDING_REPLACE_APPLIED(142, "Pending modified order processed (end of FREEZE state)"),

    /**
     * End of Day processing
     */
    END_OF_DAY_PROCESSING(146, "End of Day processing"),

    /**
     * Order expiration
     */
    ORDER_EXPIRATION(148, "Order expiration"),

    /**
     * Closing Auction Order has been activated
     */
    CAO_ORDER_ACTIVATED(149, "Closing Auction Order has been activated"),

    /**
     * Closing Auction Order has been inactivated
     */
    CAO_ORDER_INACTIVATED(150, "Closing Auction Order has been inactivated"),

    /**
     * Opening Auction Order has been activated
     */
    OAO_ORDER_ACTIVATED(151, "Opening Auction Order has been activated"),

    /**
     * Opening Auction Order has been inactivated
     */
    OAO_ORDER_INACTIVATED(152, "Opening Auction Order has been inactivated"),

    /**
     * Any Auction Order has been activated
     */
    AAO_ORDER_ACTIVATED(153, "Any Auction Order has been activated"),

    /**
     * Any Auction Order has been inactivated
     */
    AAO_ORDER_INACTIVATED(154, "Any Auction Order has been inactivated"),

    /**
     * Intraday Auction Order has been activated
     */
    IAO_ORDER_ACTIVATED(159, "Intraday Auction Order has been activated"),

    /**
     * Intraday Auction Order has been inactivated
     */
    IAO_ORDER_INACTIVATED(160, "Intraday Auction Order has been inactivated"),

    /**
     * Order refreshed
     */
    ORDER_REFRESHED(155, "Order refreshed"),

    /**
     * One-cancels-the-other Order has been triggered
     */
    OCO_ORDER_TRIGGERED(164, "One-cancels-the-other Order has been triggered"),

    /**
     * Stop Order has been triggered
     */
    STOP_ORDER_TRIGGERED(172, "Stop Order has been triggered"),

    /**
     * Ownership Changed
     */
    OWNERSHIP_CHANGED(181, "Ownership Changed"),

    /**
     * Pending order deletion
     */
    ORDER_CANCELLATION_PENDING(197, "Pending order deletion"),

    /**
     * Pending order cancellation processed (end of FREEZE state)
     */
    PENDING_CANCELLATION_EXECUTED(199, "Pending order cancellation processed (end of FREEZE state)"),

    /**
     * Midpoint Sweep order changed to regular order
     */
    MIDPOINT_ORDER_SWEEP(205, "Midpoint Sweep order changed to regular order"),

    /**
     * Book or Cancel Order accepted
     */
    BOC_ORDER_CANCELLED(212, "Book or Cancel Order accepted"),

    /**
     * Trailing Stop Updated
     */
    TRAILING_STOP_UPDATE(213, "Trailing Stop Updated"),

    /**
     * Order quantity exceeds maximum quantity
     */
    EXCEEDS_MAXIMUM_QUANTITY(237, "Order quantity exceeds maximum quantity"),

    /**
     * Invalid limit price
     */
    INVALID_LIMIT_PRICE(238, "Invalid limit price"),

    /**
     * User does not exist anymore
     */
    USER_DOES_NOT_EXIST(241, "User does not exist anymore"),

    /**
     * Session does not exist anymore
     */
    SESSION_DOES_NOT_EXIST(242, "Session does not exist anymore"),

    /**
     * Invalid stop price
     */
    INVALID_STOP_PRICE(243, "Invalid stop price"),

    /**
     * Instrument does not exist anymore
     */
    INSTRUMENT_DOES_NOT_EXIST(245, "Instrument does not exist anymore"),

    /**
     * Business Unit Risk Event
     */
    BUSINESS_UNIT_RISK_EVENT(246, "Business Unit Risk Event"),

    /**
     * Panic Cancel
     */
    PANIC_CANCEL(261, "Panic Cancel"),

    /**
     * Dividend Payment
     */
    DIVIDEND_PAYMENT(292, "Dividend Payment"),

    /**
     * Last Trading Day
     */
    LAST_TRADING_DAY(294, "Last Trading Day"),

    /**
     * Trading Parameter Change
     */
    TRADING_PARAMETER_CHANGE(295, "Trading Parameter Change"),

    /**
     * Currency Change
     */
    CURRENCY_CHANGE(296, "Currency Change"),

    /**
     * Product Assignment Change
     */
    PRODUCT_ASSIGNMENT_CHANGE(297, "Product Assignment Change"),

    /**
     * Reference Price Change
     */
    REFERENCE_PRICE_CHANGE(298, "Reference Price Change"),

    /**
     * Tick Rule Change
     */
    TICK_RULE_CHANGE(300, "Tick Rule Change"),

    /**
     * QRS Order Expiry
     */
    QRS_EXPIRY(316, "QRS Order Expiry"),

    /**
     * RLP Order/Quote Cleanup
     */
    RLP_ORDER_QUOTE_CLEANUP(320, "RLP Order/Quote Cleanup"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    ExecRestatementReason(int wire, String description) {
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
    public static Optional<ExecRestatementReason> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(CORPORATE_ACTION);
            case 1 -> Optional.of(ORDER_BOOK_RESTATEMENT);
            case 8 -> Optional.of(EXCHANGE_OPTION);
            case 101 -> Optional.of(ORDER_ADDED);
            case 102 -> Optional.of(ORDER_MODIFIED);
            case 103 -> Optional.of(ORDER_CANCELLED);
            case 105 -> Optional.of(IOC_ORDER_CANCELLED);
            case 107 -> Optional.of(FOK_ORDER_CANCELLED);
            case 108 -> Optional.of(BOOK_ORDER_EXECUTED);
            case 114 -> Optional.of(CHANGEDTO_IOC);
            case 119 -> Optional.of(CHANGEOF_SPECIALIST);
            case 122 -> Optional.of(INSTRUMENT_STATE_CHANGE);
            case 138 -> Optional.of(PENDING_NEW);
            case 141 -> Optional.of(PENDING_NEW_APPLIED);
            case 139 -> Optional.of(PENDING_REPLACE);
            case 142 -> Optional.of(PENDING_REPLACE_APPLIED);
            case 146 -> Optional.of(END_OF_DAY_PROCESSING);
            case 148 -> Optional.of(ORDER_EXPIRATION);
            case 149 -> Optional.of(CAO_ORDER_ACTIVATED);
            case 150 -> Optional.of(CAO_ORDER_INACTIVATED);
            case 151 -> Optional.of(OAO_ORDER_ACTIVATED);
            case 152 -> Optional.of(OAO_ORDER_INACTIVATED);
            case 153 -> Optional.of(AAO_ORDER_ACTIVATED);
            case 154 -> Optional.of(AAO_ORDER_INACTIVATED);
            case 159 -> Optional.of(IAO_ORDER_ACTIVATED);
            case 160 -> Optional.of(IAO_ORDER_INACTIVATED);
            case 155 -> Optional.of(ORDER_REFRESHED);
            case 164 -> Optional.of(OCO_ORDER_TRIGGERED);
            case 172 -> Optional.of(STOP_ORDER_TRIGGERED);
            case 181 -> Optional.of(OWNERSHIP_CHANGED);
            case 197 -> Optional.of(ORDER_CANCELLATION_PENDING);
            case 199 -> Optional.of(PENDING_CANCELLATION_EXECUTED);
            case 205 -> Optional.of(MIDPOINT_ORDER_SWEEP);
            case 212 -> Optional.of(BOC_ORDER_CANCELLED);
            case 213 -> Optional.of(TRAILING_STOP_UPDATE);
            case 237 -> Optional.of(EXCEEDS_MAXIMUM_QUANTITY);
            case 238 -> Optional.of(INVALID_LIMIT_PRICE);
            case 241 -> Optional.of(USER_DOES_NOT_EXIST);
            case 242 -> Optional.of(SESSION_DOES_NOT_EXIST);
            case 243 -> Optional.of(INVALID_STOP_PRICE);
            case 245 -> Optional.of(INSTRUMENT_DOES_NOT_EXIST);
            case 246 -> Optional.of(BUSINESS_UNIT_RISK_EVENT);
            case 261 -> Optional.of(PANIC_CANCEL);
            case 292 -> Optional.of(DIVIDEND_PAYMENT);
            case 294 -> Optional.of(LAST_TRADING_DAY);
            case 295 -> Optional.of(TRADING_PARAMETER_CHANGE);
            case 296 -> Optional.of(CURRENCY_CHANGE);
            case 297 -> Optional.of(PRODUCT_ASSIGNMENT_CHANGE);
            case 298 -> Optional.of(REFERENCE_PRICE_CHANGE);
            case 300 -> Optional.of(TICK_RULE_CHANGE);
            case 316 -> Optional.of(QRS_EXPIRY);
            case 320 -> Optional.of(RLP_ORDER_QUOTE_CLEANUP);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
