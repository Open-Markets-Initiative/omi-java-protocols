package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the ExecRestatementReason values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum ExecRestatementReason {

    /**
     * Order Book Restatement
     */
    ORDER_BOOK_RESTATEMENT(1, "Order Book Restatement"),

    /**
     * Order Added
     */
    ORDER_ADDED(101, "Order Added"),

    /**
     * Order Replaced
     */
    ORDER_MODIFIED(102, "Order Replaced"),

    /**
     * Order Cancelled
     */
    ORDER_CANCELLED(103, "Order Cancelled"),

    /**
     * IOC Order Cancelled
     */
    IOC_ORDER_CANCELLED(105, "IOC Order Cancelled"),

    /**
     * Book Order Executed
     */
    BOOK_ORDER_EXECUTED(108, "Book Order Executed"),

    /**
     * Market Order Triggered
     */
    MARKET_ORDER_TRIGGERED(135, "Market Order Triggered"),

    /**
     * One-cancels-the-other Order has been triggered
     */
    OCO_ORDER_TRIGGERED(164, "One-cancels-the-other Order has been triggered"),

    /**
     * Stop Order Triggered
     */
    STOP_ORDER_TRIGGERED(172, "Stop Order Triggered"),

    /**
     * Order Cancellation Pending
     */
    ORDER_CANCELLATION_PENDING(197, "Order Cancellation Pending"),

    /**
     * Pending Cancellation Executed
     */
    PENDING_CANCELLATION_EXECUTED(199, "Pending Cancellation Executed"),

    /**
     * BOC Order Cancelled
     */
    BOC_ORDER_CANCELLED(212, "BOC Order Cancelled"),

    /**
     * Pending Normal orders downloaded
     */
    PENDING_NORMAL_ORDERS_QUERIED(213, "Pending Normal orders downloaded"),

    /**
     * Pending Stoploss orders downloaded
     */
    PENDING_STOPLOSS_ORDERS_QUERIED(214, "Pending Stoploss orders downloaded"),

    /**
     * RRM Order Added
     */
    RRM_ORDER_ADDED(215, "RRM Order Added"),

    /**
     * RRM Order Accepted
     */
    RRM_ORDER_ACCEPTED(216, "RRM Order Accepted"),

    /**
     * RRM Order Deleted
     */
    RRM_ORDER_DELETED(219, "RRM Order Deleted"),

    /**
     * RRM Market Order Triggered
     */
    RRM_MARKET_ORDER_TRIGGERED(220, "RRM Market Order Triggered"),

    /**
     * Provisional Order Added
     */
    PROV_ORDER_ADDED(221, "Provisional Order Added"),

    /**
     * Provisional Order Accepted
     */
    PROV_ORDER_ACCEPTED(222, "Provisional Order Accepted"),

    /**
     * Provisional Order Updation Rejected
     */
    PROV_ORDER_UPDATION_REJECTED(223, "Provisional Order Updation Rejected"),

    /**
     * Provisional Order Updated Successfully
     */
    PROV_ORDER_UPDATED_SUCCESSFULLY(224, "Provisional Order Updated Successfully"),

    /**
     * Provisional Order Deleted
     */
    PROV_ORDER_DELETED(225, "Provisional Order Deleted"),

    /**
     * Provisional Market Order Triggered
     */
    PROV_MARKET_ORDER_TRIGGERED(226, "Provisional Market Order Triggered"),

    /**
     * CALLAUC Order Deleted
     */
    CALLAUC_ORDER_DELETED(231, "CALLAUC Order Deleted"),

    /**
     * Order Cancelled: Session Expiry
     */
    GTCL_ORDER_DELETED(232, "Order Cancelled: Session Expiry"),

    /**
     * Order Cancelled: Day Expiry
     */
    EOD_ORDER_DELETED(233, "Order Cancelled: Day Expiry"),

    /**
     * Order Cancelled: Halt
     */
    HALT_ORDER_DELETED(234, "Order Cancelled: Halt"),

    /**
     * Block Deal Order Timed Out
     */
    BLOCK_DEAL_ORDER_TIMED_OUT(235, "Block Deal Order Timed Out"),

    /**
     * Out Of Price Band Order
     */
    OUT_OF_PRICE_BAND_ORDER(236, "Out Of Price Band Order"),

    /**
     * Order Worse Than Close Price
     */
    ORDER_WORSE_THAN_CLOSE_PRICE(237, "Order Worse Than Close Price"),

    /**
     * Market order triggered in call auction/pcas sessions
     */
    AUCTION_MARKET_ORDER_TRIGGERED(238, "Market order triggered in call auction/pcas sessions"),

    /**
     * Pending Block Deal orders downloaded
     */
    PENDING_BLOCKDEAL_ORDERS_QUERIED(239, "Pending Block Deal orders downloaded"),

    /**
     * Orders cancelled due to BU is suspended
     */
    BU_SUSPENDED(240, "Orders cancelled due to BU is suspended"),

    /**
     * Orders cancelled due to Cooling off RRM
     */
    COOLING_OFF_RRM_ORDER_DELETED(241, "Orders cancelled due to Cooling off RRM"),

    /**
     * Orders cancelled due to MWPL RRM
     */
    MWPL_RRM_ORDER_DELETED(242, "Orders cancelled due to MWPL RRM"),

    /**
     * Order Cancelled : SPOS Price undetermined
     */
    CALL_AUCTION_UNCROSS_ORDER_DELETED(243, "Order Cancelled : SPOS Price undetermined"),

    /**
     * Order cancelled due to Collateral RRM
     */
    COLLATERAL_RRM(244, "Order cancelled due to Collateral RRM"),

    /**
     * Pending Market2Limit orders downloaded
     */
    PENDING_MARKET_ORDERS_QUERIED(245, "Pending Market2Limit orders downloaded"),

    /**
     * Self Trade Order Deleted
     */
    SELF_TRADE_ORDER_DELETED(246, "Self Trade Order Deleted"),

    /**
     * Reverse Trade Order Deleted
     */
    REVERSE_TRADE_ORDER_DELETED(247, "Reverse Trade Order Deleted"),

    /**
     * Pending OCO orders downloaded
     */
    PENDING_OCO_ORDERS_QUERIED(248, "Pending OCO orders downloaded"),

    /**
     * Client RRM For Product
     */
    CLIENT_RRM_FOR_PRODUCT(250, "Client RRM For Product"),

    /**
     * Orders cancelled due to Client Suspension
     */
    CLIENT_SUSPENDED(251, "Orders cancelled due to Client Suspension"),

    /**
     * Client RRM For Contract
     */
    CLIENT_RRM_FOR_CONTRACT(252, "Client RRM For Contract"),

    /**
     * Member RRM For Contract
     */
    MEMBER_RRM_FOR_CONTRACT(253, "Member RRM For Contract"),

    /**
     * Market Order Out Of Range
     */
    MARKET_ORDER_OUT_OF_RANGE(265, "Market Order Out Of Range"),

    /**
     * Limit Price Out Of Range
     */
    LIMIT_PRICE_OUT_OF_RANGE(267, "Limit Price Out Of Range"),

    /**
     * Matching Criteria Not Fulfilled
     */
    MATCHING_CRITERIA_NOT_FULFILLED(270, "Matching Criteria Not Fulfilled"),

    /**
     * Price Level Quantity Exceeded
     */
    PRICE_LEVEL_QUANTITY_EXCEEDED(269, "Price Level Quantity Exceeded"),

    /**
     * Intraday Debarred
     */
    CLIENT_DEBARRED(271, "Intraday Debarred"),

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
            case 1 -> Optional.of(ORDER_BOOK_RESTATEMENT);
            case 101 -> Optional.of(ORDER_ADDED);
            case 102 -> Optional.of(ORDER_MODIFIED);
            case 103 -> Optional.of(ORDER_CANCELLED);
            case 105 -> Optional.of(IOC_ORDER_CANCELLED);
            case 108 -> Optional.of(BOOK_ORDER_EXECUTED);
            case 135 -> Optional.of(MARKET_ORDER_TRIGGERED);
            case 164 -> Optional.of(OCO_ORDER_TRIGGERED);
            case 172 -> Optional.of(STOP_ORDER_TRIGGERED);
            case 197 -> Optional.of(ORDER_CANCELLATION_PENDING);
            case 199 -> Optional.of(PENDING_CANCELLATION_EXECUTED);
            case 212 -> Optional.of(BOC_ORDER_CANCELLED);
            case 213 -> Optional.of(PENDING_NORMAL_ORDERS_QUERIED);
            case 214 -> Optional.of(PENDING_STOPLOSS_ORDERS_QUERIED);
            case 215 -> Optional.of(RRM_ORDER_ADDED);
            case 216 -> Optional.of(RRM_ORDER_ACCEPTED);
            case 219 -> Optional.of(RRM_ORDER_DELETED);
            case 220 -> Optional.of(RRM_MARKET_ORDER_TRIGGERED);
            case 221 -> Optional.of(PROV_ORDER_ADDED);
            case 222 -> Optional.of(PROV_ORDER_ACCEPTED);
            case 223 -> Optional.of(PROV_ORDER_UPDATION_REJECTED);
            case 224 -> Optional.of(PROV_ORDER_UPDATED_SUCCESSFULLY);
            case 225 -> Optional.of(PROV_ORDER_DELETED);
            case 226 -> Optional.of(PROV_MARKET_ORDER_TRIGGERED);
            case 231 -> Optional.of(CALLAUC_ORDER_DELETED);
            case 232 -> Optional.of(GTCL_ORDER_DELETED);
            case 233 -> Optional.of(EOD_ORDER_DELETED);
            case 234 -> Optional.of(HALT_ORDER_DELETED);
            case 235 -> Optional.of(BLOCK_DEAL_ORDER_TIMED_OUT);
            case 236 -> Optional.of(OUT_OF_PRICE_BAND_ORDER);
            case 237 -> Optional.of(ORDER_WORSE_THAN_CLOSE_PRICE);
            case 238 -> Optional.of(AUCTION_MARKET_ORDER_TRIGGERED);
            case 239 -> Optional.of(PENDING_BLOCKDEAL_ORDERS_QUERIED);
            case 240 -> Optional.of(BU_SUSPENDED);
            case 241 -> Optional.of(COOLING_OFF_RRM_ORDER_DELETED);
            case 242 -> Optional.of(MWPL_RRM_ORDER_DELETED);
            case 243 -> Optional.of(CALL_AUCTION_UNCROSS_ORDER_DELETED);
            case 244 -> Optional.of(COLLATERAL_RRM);
            case 245 -> Optional.of(PENDING_MARKET_ORDERS_QUERIED);
            case 246 -> Optional.of(SELF_TRADE_ORDER_DELETED);
            case 247 -> Optional.of(REVERSE_TRADE_ORDER_DELETED);
            case 248 -> Optional.of(PENDING_OCO_ORDERS_QUERIED);
            case 250 -> Optional.of(CLIENT_RRM_FOR_PRODUCT);
            case 251 -> Optional.of(CLIENT_SUSPENDED);
            case 252 -> Optional.of(CLIENT_RRM_FOR_CONTRACT);
            case 253 -> Optional.of(MEMBER_RRM_FOR_CONTRACT);
            case 265 -> Optional.of(MARKET_ORDER_OUT_OF_RANGE);
            case 267 -> Optional.of(LIMIT_PRICE_OUT_OF_RANGE);
            case 270 -> Optional.of(MATCHING_CRITERIA_NOT_FULFILLED);
            case 269 -> Optional.of(PRICE_LEVEL_QUANTITY_EXCEEDED);
            case 271 -> Optional.of(CLIENT_DEBARRED);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
