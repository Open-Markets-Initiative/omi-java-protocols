package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Cancel Reason
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelReason {

    /**
     * Cancelled Due To Cumulative Risk Metrics
     */
    CANCELLED_DUE_TO_CUMULATIVE_RISK_METRICS('A', "Cancelled Due To Cumulative Risk Metrics"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE('B', "Reserved For Future Use"),

    /**
     * Time In Force Cancelled
     */
    TIME_IN_FORCE_CANCELLED('C', "Time In Force Cancelled"),

    /**
     * Auto Cancel On Disconnect Acod
     */
    AUTO_CANCEL_ON_DISCONNECT_ACOD('D', "Auto Cancel On Disconnect Acod"),

    /**
     * Post Only Order Is Lockingcrossing Miax
     */
    POST_ONLY_ORDER_IS_LOCKINGCROSSING_MIAX('E', "Post Only Order Is Lockingcrossing Miax"),

    /**
     * Auto Cancel On System Failure Acosf
     */
    AUTO_CANCEL_ON_SYSTEM_FAILURE_ACOSF('F', "Auto Cancel On System Failure Acosf"),

    /**
     * Cancelled Due To Price Sliding Instruction
     */
    CANCELLED_DUE_TO_PRICE_SLIDING_INSTRUCTION('G', "Cancelled Due To Price Sliding Instruction"),

    /**
     * Cancelled By Helpdesk Or Over Miax Member
     */
    CANCELLED_BY_HELPDESK_OR_OVER_MIAX_MEMBER('H', "Cancelled By Helpdesk Or Over Miax Member"),

    /**
     * Order Expired
     */
    ORDER_EXPIRED('I', "Order Expired"),

    /**
     * Symbol Trading Status Makes Pac Market
     */
    SYMBOL_TRADING_STATUS_MAKES_PAC_MARKET('J', "Symbol Trading Status Makes Pac Market"),

    /**
     * Trading Collar Protection
     */
    TRADING_COLLAR_PROTECTION('K', "Trading Collar Protection"),

    /**
     * Sell Short Iso When Short Sale Price Test Is
     */
    SELL_SHORT_ISO_WHEN_SHORT_SALE_PRICE_TEST_IS('L', "Sell Short Iso When Short Sale Price Test Is"),

    /**
     * Symbol Is Not Trading
     */
    SYMBOL_IS_NOT_TRADING('M', "Symbol Is Not Trading"),

    /**
     * Limit Order Price Protection
     */
    LIMIT_ORDER_PRICE_PROTECTION('N', "Limit Order Price Protection"),

    /**
     * Route To Primary Listing Market Rejected
     */
    ROUTE_TO_PRIMARY_LISTING_MARKET_REJECTED('O', "Route To Primary Listing Market Rejected"),

    /**
     * Cancelled By A Mass Cancel Request Over A Priority Purge Port
     */
    CANCELLED_BY_A_MASS_CANCEL_REQUEST_OVER_A_PRIORITY_PURGE_PORT('P', "Cancelled By A Mass Cancel Request Over A Priority Purge Port"),

    /**
     * Unexpected Cancel By Primary Listing Market
     */
    UNEXPECTED_CANCEL_BY_PRIMARY_LISTING_MARKET('Q', "Unexpected Cancel By Primary Listing Market"),

    /**
     * Cancelled Due To Failed Price Improvement
     */
    CANCELLED_DUE_TO_FAILED_PRICE_IMPROVEMENT('R', "Cancelled Due To Failed Price Improvement"),

    /**
     * Cancelled Due To Primary Auction Route
     */
    CANCELLED_DUE_TO_PRIMARY_AUCTION_ROUTE('S', "Cancelled Due To Primary Auction Route"),

    /**
     * Cancelled Due To Order Rate Protection
     */
    CANCELLED_DUE_TO_ORDER_RATE_PROTECTION('T', "Cancelled Due To Order Rate Protection"),

    /**
     * Cancelled By User Through Order Entry Session
     */
    CANCELLED_BY_USER_THROUGH_ORDER_ENTRY_SESSION('U', "Cancelled By User Through Order Entry Session"),

    /**
     * Invalid Pegged Order Price
     */
    INVALID_PEGGED_ORDER_PRICE('V', "Invalid Pegged Order Price"),

    /**
     * Pac Order Cancelled As Security Is Halted
     */
    PAC_ORDER_CANCELLED_AS_SECURITY_IS_HALTED('W', "Pac Order Cancelled As Security Is Halted"),

    /**
     * Not Applicable Used When Pending Cancel
     */
    NOT_APPLICABLE_USED_WHEN_PENDING_CANCEL('X', "Not Applicable Used When Pending Cancel"),

    /**
     * Primary Auction Order Is Cancelled Due To A
     */
    PRIMARY_AUCTION_ORDER_IS_CANCELLED_DUE_TO_A('Y', "Primary Auction Order Is Cancelled Due To A"),

    /**
     * Cancelled Due To Market Impact Collar
     */
    CANCELLED_DUE_TO_MARKET_IMPACT_COLLAR('0', "Cancelled Due To Market Impact Collar"),

    /**
     * Full cancel due to Self Trade Protection
     */
    CANCEL_NEWEST_INSTRUCTION('1', "Full cancel due to Self Trade Protection"),

    /**
     * Full cancel due to Self Trade Protection
     */
    CANCEL_OLDEST_INSTRUCTION('2', "Full cancel due to Self Trade Protection"),

    /**
     * Full cancel due to Self Trade Protection
     */
    CANCEL_BOTH_INSTRUCTION('3', "Full cancel due to Self Trade Protection"),

    /**
     * Full/Partial cancel due to Self-Trade Protection
     */
    DECREMENT_AND_CANCEL_INSTRUCTION('4', "Full/Partial cancel due to Self-Trade Protection"),

    /**
     * Cancelled Due To Drop Copy Acod Event
     */
    CANCELLED_DUE_TO_DROP_COPY_ACOD_EVENT('5', "Cancelled Due To Drop Copy Acod Event"),

    /**
     * Cancelled Due To Drop Copy Acosf Event
     */
    CANCELLED_DUE_TO_DROP_COPY_ACOSF_EVENT('6', "Cancelled Due To Drop Copy Acosf Event"),

    /**
     * Cancelled As Order Did Not Set Nbbo
     */
    CANCELLED_AS_ORDER_DID_NOT_SET_NBBO('7', "Cancelled As Order Did Not Set Nbbo"),

    /**
     * Cancelled By User Through A Session Other
     */
    CANCELLED_BY_USER_THROUGH_A_SESSION_OTHER('8', "Cancelled By User Through A Session Other"),

    /**
     * Undefined Reason
     */
    UNDEFINED_REASON('Z', "Undefined Reason"),

    /**
     * Downgraded From Older Version
     */
    DOWNGRADED_FROM_OLDER_VERSION('*', "Downgraded From Older Version");

    private final char wire;

    private final String description;

    CancelReason(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<CancelReason> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(CANCELLED_DUE_TO_CUMULATIVE_RISK_METRICS);
            case 'B' -> Optional.of(RESERVED_FOR_FUTURE_USE);
            case 'C' -> Optional.of(TIME_IN_FORCE_CANCELLED);
            case 'D' -> Optional.of(AUTO_CANCEL_ON_DISCONNECT_ACOD);
            case 'E' -> Optional.of(POST_ONLY_ORDER_IS_LOCKINGCROSSING_MIAX);
            case 'F' -> Optional.of(AUTO_CANCEL_ON_SYSTEM_FAILURE_ACOSF);
            case 'G' -> Optional.of(CANCELLED_DUE_TO_PRICE_SLIDING_INSTRUCTION);
            case 'H' -> Optional.of(CANCELLED_BY_HELPDESK_OR_OVER_MIAX_MEMBER);
            case 'I' -> Optional.of(ORDER_EXPIRED);
            case 'J' -> Optional.of(SYMBOL_TRADING_STATUS_MAKES_PAC_MARKET);
            case 'K' -> Optional.of(TRADING_COLLAR_PROTECTION);
            case 'L' -> Optional.of(SELL_SHORT_ISO_WHEN_SHORT_SALE_PRICE_TEST_IS);
            case 'M' -> Optional.of(SYMBOL_IS_NOT_TRADING);
            case 'N' -> Optional.of(LIMIT_ORDER_PRICE_PROTECTION);
            case 'O' -> Optional.of(ROUTE_TO_PRIMARY_LISTING_MARKET_REJECTED);
            case 'P' -> Optional.of(CANCELLED_BY_A_MASS_CANCEL_REQUEST_OVER_A_PRIORITY_PURGE_PORT);
            case 'Q' -> Optional.of(UNEXPECTED_CANCEL_BY_PRIMARY_LISTING_MARKET);
            case 'R' -> Optional.of(CANCELLED_DUE_TO_FAILED_PRICE_IMPROVEMENT);
            case 'S' -> Optional.of(CANCELLED_DUE_TO_PRIMARY_AUCTION_ROUTE);
            case 'T' -> Optional.of(CANCELLED_DUE_TO_ORDER_RATE_PROTECTION);
            case 'U' -> Optional.of(CANCELLED_BY_USER_THROUGH_ORDER_ENTRY_SESSION);
            case 'V' -> Optional.of(INVALID_PEGGED_ORDER_PRICE);
            case 'W' -> Optional.of(PAC_ORDER_CANCELLED_AS_SECURITY_IS_HALTED);
            case 'X' -> Optional.of(NOT_APPLICABLE_USED_WHEN_PENDING_CANCEL);
            case 'Y' -> Optional.of(PRIMARY_AUCTION_ORDER_IS_CANCELLED_DUE_TO_A);
            case '0' -> Optional.of(CANCELLED_DUE_TO_MARKET_IMPACT_COLLAR);
            case '1' -> Optional.of(CANCEL_NEWEST_INSTRUCTION);
            case '2' -> Optional.of(CANCEL_OLDEST_INSTRUCTION);
            case '3' -> Optional.of(CANCEL_BOTH_INSTRUCTION);
            case '4' -> Optional.of(DECREMENT_AND_CANCEL_INSTRUCTION);
            case '5' -> Optional.of(CANCELLED_DUE_TO_DROP_COPY_ACOD_EVENT);
            case '6' -> Optional.of(CANCELLED_DUE_TO_DROP_COPY_ACOSF_EVENT);
            case '7' -> Optional.of(CANCELLED_AS_ORDER_DID_NOT_SET_NBBO);
            case '8' -> Optional.of(CANCELLED_BY_USER_THROUGH_A_SESSION_OTHER);
            case 'Z' -> Optional.of(UNDEFINED_REASON);
            case '*' -> Optional.of(DOWNGRADED_FROM_OLDER_VERSION);
            default -> Optional.empty();
        };
    }
}
