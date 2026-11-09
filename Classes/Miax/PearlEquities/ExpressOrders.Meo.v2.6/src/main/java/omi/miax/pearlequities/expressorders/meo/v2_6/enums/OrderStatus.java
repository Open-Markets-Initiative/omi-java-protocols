package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Order Status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderStatus {

    /**
     * Successful
     */
    SUCCESSFUL(' ', "Successful"),

    /**
     * Duplicate Client Order Id
     */
    DUPLICATE_CLIENT_ORDER_ID('A', "Duplicate Client Order Id"),

    /**
     * Not In Live Order Window
     */
    NOT_IN_LIVE_ORDER_WINDOW('B', "Not In Live Order Window"),

    /**
     * Matching Engine Is Not Available
     */
    MATCHING_ENGINE_IS_NOT_AVAILABLE('C', "Matching Engine Is Not Available"),

    /**
     * Duplicate Order Check Rejected
     */
    DUPLICATE_ORDER_CHECK_REJECTED('D', "Duplicate Order Check Rejected"),

    /**
     * Exceeded Test Symbol Throttle
     */
    EXCEEDED_TEST_SYMBOL_THROTTLE('E', "Exceeded Test Symbol Throttle"),

    /**
     * Iso Orders Not Allowed
     */
    ISO_ORDERS_NOT_ALLOWED('F', "Iso Orders Not Allowed"),

    /**
     * Invalid Self Trade Protection Group Or Its Use
     */
    INVALID_SELF_TRADE_PROTECTION_GROUP_OR_ITS_USE('G', "Invalid Self Trade Protection Group Or Its Use"),

    /**
     * Blocked By Meo User
     */
    BLOCKED_BY_MEO_USER('H', "Blocked By Meo User"),

    /**
     * Invalid Mpid
     */
    INVALID_MPID('I', "Invalid Mpid"),

    /**
     * Invalid Price
     */
    INVALID_PRICE('J', "Invalid Price"),

    /**
     * Invalid Size
     */
    INVALID_SIZE('K', "Invalid Size"),

    /**
     * Blocked By Firm Over Miax Member Firm
     */
    BLOCKED_BY_FIRM_OVER_MIAX_MEMBER_FIRM('L', "Blocked By Firm Over Miax Member Firm"),

    /**
     * Exceeded Max Allowed Size
     */
    EXCEEDED_MAX_ALLOWED_SIZE('M', "Exceeded Max Allowed Size"),

    /**
     * Exceeded Max Notional Value
     */
    EXCEEDED_MAX_NOTIONAL_VALUE('N', "Exceeded Max Notional Value"),

    /**
     * Invalid Client Order Id
     */
    INVALID_CLIENT_ORDER_ID('O', "Invalid Client Order Id"),

    /**
     * Request Is Not Permitted For This Session
     */
    REQUEST_IS_NOT_PERMITTED_FOR_THIS_SESSION('P', "Request Is Not Permitted For This Session"),

    /**
     * Short Sale Orders Not Allowed
     */
    SHORT_SALE_ORDERS_NOT_ALLOWED('Q', "Short Sale Orders Not Allowed"),

    /**
     * Blocked By Cumulative Risk Metrics
     */
    BLOCKED_BY_CUMULATIVE_RISK_METRICS('R', "Blocked By Cumulative Risk Metrics"),

    /**
     * Invalid Symbol Id
     */
    INVALID_SYMBOL_ID('S', "Invalid Symbol Id"),

    /**
     * Invalid Order Type
     */
    INVALID_ORDER_TYPE('T', "Invalid Order Type"),

    /**
     * Invalid Use Of Locate Required
     */
    INVALID_USE_OF_LOCATE_REQUIRED('U', "Invalid Use Of Locate Required"),

    /**
     * Invalid Sell Short
     */
    INVALID_SELL_SHORT('V', "Invalid Sell Short"),

    /**
     * Limit Order Price Protection
     */
    LIMIT_ORDER_PRICE_PROTECTION('W', "Limit Order Price Protection"),

    /**
     * Mpid Not Permitted
     */
    MPID_NOT_PERMITTED('X', "Mpid Not Permitted"),

    /**
     * Iso Attribute Not Compatible With The Order Type
     */
    ISO_ATTRIBUTE_NOT_COMPATIBLE_WITH_THE_ORDER_TYPE('Y', "Iso Attribute Not Compatible With The Order Type"),

    /**
     * Undefined Reason
     */
    UNDEFINED_REASON('Z', "Undefined Reason"),

    /**
     * Invalid Capacity
     */
    INVALID_CAPACITY('a', "Invalid Capacity"),

    /**
     * Invalid Time In Force
     */
    INVALID_TIME_IN_FORCE('b', "Invalid Time In Force"),

    /**
     * Invalid Routing Instruction Or Use
     */
    INVALID_ROUTING_INSTRUCTION_OR_USE('c', "Invalid Routing Instruction Or Use"),

    /**
     * Invalid Self Trade Protection Level
     */
    INVALID_SELF_TRADE_PROTECTION_LEVEL('d', "Invalid Self Trade Protection Level"),

    /**
     * Invalid Self Trade Protection Instruction Or Use
     */
    INVALID_SELF_TRADE_PROTECTION_INSTRUCTION_OR_USE('e', "Invalid Self Trade Protection Instruction Or Use"),

    /**
     * Invalid Attributable Value Or Use
     */
    INVALID_ATTRIBUTABLE_VALUE_OR_USE('f', "Invalid Attributable Value Or Use"),

    /**
     * Invalid Price Sliding And Reprice Frequency Value Or Use
     */
    INVALID_PRICE_SLIDING_AND_REPRICE_FREQUENCY_VALUE_OR_USE('g', "Invalid Price Sliding And Reprice Frequency Value Or Use"),

    /**
     * Invalid Use Of Post Only Instruction
     */
    INVALID_USE_OF_POST_ONLY_INSTRUCTION('h', "Invalid Use Of Post Only Instruction"),

    /**
     * Invalid Use Of Display Instruction
     */
    INVALID_USE_OF_DISPLAY_INSTRUCTION('i', "Invalid Use Of Display Instruction"),

    /**
     * Invalid Value Or Use For Available When Locked
     */
    INVALID_VALUE_OR_USE_FOR_AVAILABLE_WHEN_LOCKED('j', "Invalid Value Or Use For Available When Locked"),

    /**
     * Market Order Price Protection
     */
    MARKET_ORDER_PRICE_PROTECTION('k', "Market Order Price Protection"),

    /**
     * Invalid Routing Strategy Or Its Use
     */
    INVALID_ROUTING_STRATEGY_OR_ITS_USE('l', "Invalid Routing Strategy Or Its Use"),

    /**
     * Invalid Value In Account
     */
    INVALID_VALUE_IN_ACCOUNT('m', "Invalid Value In Account"),

    /**
     * Invalid Value In Clearing Account
     */
    INVALID_VALUE_IN_CLEARING_ACCOUNT('n', "Invalid Value In Clearing Account"),

    /**
     * Invalid Use Of Trading Collar Dollar Value
     */
    INVALID_USE_OF_TRADING_COLLAR_DOLLAR_VALUE('o', "Invalid Use Of Trading Collar Dollar Value"),

    /**
     * Invalid For Current Symbol Trading Status
     */
    INVALID_FOR_CURRENT_SYMBOL_TRADING_STATUS('p', "Invalid For Current Symbol Trading Status"),

    /**
     * Primary Exchange Ipo Not Complete Ipo In Progress
     */
    PRIMARY_EXCHANGE_IPO_NOT_COMPLETE_IPO_IN_PROGRESS('q', "Primary Exchange Ipo Not Complete Ipo In Progress"),

    /**
     * Invalid Use Of Min Qty Size Or Min Qty Exec Type Instruction
     */
    INVALID_USE_OF_MIN_QTY_SIZE_OR_MIN_QTY_EXEC_TYPE_INSTRUCTION('r', "Invalid Use Of Min Qty Size Or Min Qty Exec Type Instruction"),

    /**
     * Invalid Use Of Order Type
     */
    INVALID_USE_OF_ORDER_TYPE('s', "Invalid Use Of Order Type"),

    /**
     * Invalid Max Floor Qty
     */
    INVALID_MAX_FLOOR_QTY('t', "Invalid Max Floor Qty"),

    /**
     * Invalid Display Range Qty
     */
    INVALID_DISPLAY_RANGE_QTY('u', "Invalid Display Range Qty"),

    /**
     * Feature Not Available
     */
    FEATURE_NOT_AVAILABLE('v', "Feature Not Available"),

    /**
     * Primary Listing Market Routing Not Supported
     */
    PRIMARY_LISTING_MARKET_ROUTING_NOT_SUPPORTED('w', "Primary Listing Market Routing Not Supported"),

    /**
     * Too Late For Primary Listing Market Order
     */
    TOO_LATE_FOR_PRIMARY_LISTING_MARKET_ORDER('x', "Too Late For Primary Listing Market Order"),

    /**
     * Pac Orders Are Not Allowed Routing To Primary
     */
    PAC_ORDERS_ARE_NOT_ALLOWED_ROUTING_TO_PRIMARY('y', "Pac Orders Are Not Allowed Routing To Primary"),

    /**
     * Short Sale Exempt Orders Not Allowed
     */
    SHORT_SALE_EXEMPT_ORDERS_NOT_ALLOWED('z', "Short Sale Exempt Orders Not Allowed"),

    /**
     * Limit Price More Aggressive Than Market Impact Collar
     */
    LIMIT_PRICE_MORE_AGGRESSIVE_THAN_MARKET_IMPACT_COLLAR('0', "Limit Price More Aggressive Than Market Impact Collar"),

    /**
     * Market Orders Not Allowed
     */
    MARKET_ORDERS_NOT_ALLOWED('1', "Market Orders Not Allowed"),

    /**
     * Restricted Security Not Allowed
     */
    RESTRICTED_SECURITY_NOT_ALLOWED('2', "Restricted Security Not Allowed"),

    /**
     * Blocked By Order Rate Metrics
     */
    BLOCKED_BY_ORDER_RATE_METRICS('3', "Blocked By Order Rate Metrics"),

    /**
     * Average Daily Volume Protection
     */
    AVERAGE_DAILY_VOLUME_PROTECTION('4', "Average Daily Volume Protection"),

    /**
     * Invalid Offset For Primary Peg Order
     */
    INVALID_OFFSET_FOR_PRIMARY_PEG_ORDER('5', "Invalid Offset For Primary Peg Order"),

    /**
     * Invalid Purge Group Specified
     */
    INVALID_PURGE_GROUP_SPECIFIED('6', "Invalid Purge Group Specified"),

    /**
     * Invalid Or Not Permitted Value In Locate Account
     */
    INVALID_OR_NOT_PERMITTED_VALUE_IN_LOCATE_ACCOUNT('7', "Invalid Or Not Permitted Value In Locate Account"),

    /**
     * Blocked By Drop Copy Acod Event
     */
    BLOCKED_BY_DROP_COPY_ACOD_EVENT('8', "Blocked By Drop Copy Acod Event"),

    /**
     * Blocked By Drop Copy Acosf Event
     */
    BLOCKED_BY_DROP_COPY_ACOSF_EVENT('9', "Blocked By Drop Copy Acosf Event"),

    /**
     * Invalid Use Of Cancel Order If Not A Nbbo Setter
     */
    INVALID_USE_OF_CANCEL_ORDER_IF_NOT_A_NBBO_SETTER('!', "Invalid Use Of Cancel Order If Not A Nbbo Setter"),

    /**
     * Downgraded From Older Version
     */
    DOWNGRADED_FROM_OLDER_VERSION('*', "Downgraded From Older Version");

    private final char wire;

    private final String description;

    OrderStatus(char wire, String description) {
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
    public static Optional<OrderStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(SUCCESSFUL);
            case 'A' -> Optional.of(DUPLICATE_CLIENT_ORDER_ID);
            case 'B' -> Optional.of(NOT_IN_LIVE_ORDER_WINDOW);
            case 'C' -> Optional.of(MATCHING_ENGINE_IS_NOT_AVAILABLE);
            case 'D' -> Optional.of(DUPLICATE_ORDER_CHECK_REJECTED);
            case 'E' -> Optional.of(EXCEEDED_TEST_SYMBOL_THROTTLE);
            case 'F' -> Optional.of(ISO_ORDERS_NOT_ALLOWED);
            case 'G' -> Optional.of(INVALID_SELF_TRADE_PROTECTION_GROUP_OR_ITS_USE);
            case 'H' -> Optional.of(BLOCKED_BY_MEO_USER);
            case 'I' -> Optional.of(INVALID_MPID);
            case 'J' -> Optional.of(INVALID_PRICE);
            case 'K' -> Optional.of(INVALID_SIZE);
            case 'L' -> Optional.of(BLOCKED_BY_FIRM_OVER_MIAX_MEMBER_FIRM);
            case 'M' -> Optional.of(EXCEEDED_MAX_ALLOWED_SIZE);
            case 'N' -> Optional.of(EXCEEDED_MAX_NOTIONAL_VALUE);
            case 'O' -> Optional.of(INVALID_CLIENT_ORDER_ID);
            case 'P' -> Optional.of(REQUEST_IS_NOT_PERMITTED_FOR_THIS_SESSION);
            case 'Q' -> Optional.of(SHORT_SALE_ORDERS_NOT_ALLOWED);
            case 'R' -> Optional.of(BLOCKED_BY_CUMULATIVE_RISK_METRICS);
            case 'S' -> Optional.of(INVALID_SYMBOL_ID);
            case 'T' -> Optional.of(INVALID_ORDER_TYPE);
            case 'U' -> Optional.of(INVALID_USE_OF_LOCATE_REQUIRED);
            case 'V' -> Optional.of(INVALID_SELL_SHORT);
            case 'W' -> Optional.of(LIMIT_ORDER_PRICE_PROTECTION);
            case 'X' -> Optional.of(MPID_NOT_PERMITTED);
            case 'Y' -> Optional.of(ISO_ATTRIBUTE_NOT_COMPATIBLE_WITH_THE_ORDER_TYPE);
            case 'Z' -> Optional.of(UNDEFINED_REASON);
            case 'a' -> Optional.of(INVALID_CAPACITY);
            case 'b' -> Optional.of(INVALID_TIME_IN_FORCE);
            case 'c' -> Optional.of(INVALID_ROUTING_INSTRUCTION_OR_USE);
            case 'd' -> Optional.of(INVALID_SELF_TRADE_PROTECTION_LEVEL);
            case 'e' -> Optional.of(INVALID_SELF_TRADE_PROTECTION_INSTRUCTION_OR_USE);
            case 'f' -> Optional.of(INVALID_ATTRIBUTABLE_VALUE_OR_USE);
            case 'g' -> Optional.of(INVALID_PRICE_SLIDING_AND_REPRICE_FREQUENCY_VALUE_OR_USE);
            case 'h' -> Optional.of(INVALID_USE_OF_POST_ONLY_INSTRUCTION);
            case 'i' -> Optional.of(INVALID_USE_OF_DISPLAY_INSTRUCTION);
            case 'j' -> Optional.of(INVALID_VALUE_OR_USE_FOR_AVAILABLE_WHEN_LOCKED);
            case 'k' -> Optional.of(MARKET_ORDER_PRICE_PROTECTION);
            case 'l' -> Optional.of(INVALID_ROUTING_STRATEGY_OR_ITS_USE);
            case 'm' -> Optional.of(INVALID_VALUE_IN_ACCOUNT);
            case 'n' -> Optional.of(INVALID_VALUE_IN_CLEARING_ACCOUNT);
            case 'o' -> Optional.of(INVALID_USE_OF_TRADING_COLLAR_DOLLAR_VALUE);
            case 'p' -> Optional.of(INVALID_FOR_CURRENT_SYMBOL_TRADING_STATUS);
            case 'q' -> Optional.of(PRIMARY_EXCHANGE_IPO_NOT_COMPLETE_IPO_IN_PROGRESS);
            case 'r' -> Optional.of(INVALID_USE_OF_MIN_QTY_SIZE_OR_MIN_QTY_EXEC_TYPE_INSTRUCTION);
            case 's' -> Optional.of(INVALID_USE_OF_ORDER_TYPE);
            case 't' -> Optional.of(INVALID_MAX_FLOOR_QTY);
            case 'u' -> Optional.of(INVALID_DISPLAY_RANGE_QTY);
            case 'v' -> Optional.of(FEATURE_NOT_AVAILABLE);
            case 'w' -> Optional.of(PRIMARY_LISTING_MARKET_ROUTING_NOT_SUPPORTED);
            case 'x' -> Optional.of(TOO_LATE_FOR_PRIMARY_LISTING_MARKET_ORDER);
            case 'y' -> Optional.of(PAC_ORDERS_ARE_NOT_ALLOWED_ROUTING_TO_PRIMARY);
            case 'z' -> Optional.of(SHORT_SALE_EXEMPT_ORDERS_NOT_ALLOWED);
            case '0' -> Optional.of(LIMIT_PRICE_MORE_AGGRESSIVE_THAN_MARKET_IMPACT_COLLAR);
            case '1' -> Optional.of(MARKET_ORDERS_NOT_ALLOWED);
            case '2' -> Optional.of(RESTRICTED_SECURITY_NOT_ALLOWED);
            case '3' -> Optional.of(BLOCKED_BY_ORDER_RATE_METRICS);
            case '4' -> Optional.of(AVERAGE_DAILY_VOLUME_PROTECTION);
            case '5' -> Optional.of(INVALID_OFFSET_FOR_PRIMARY_PEG_ORDER);
            case '6' -> Optional.of(INVALID_PURGE_GROUP_SPECIFIED);
            case '7' -> Optional.of(INVALID_OR_NOT_PERMITTED_VALUE_IN_LOCATE_ACCOUNT);
            case '8' -> Optional.of(BLOCKED_BY_DROP_COPY_ACOD_EVENT);
            case '9' -> Optional.of(BLOCKED_BY_DROP_COPY_ACOSF_EVENT);
            case '!' -> Optional.of(INVALID_USE_OF_CANCEL_ORDER_IF_NOT_A_NBBO_SETTER);
            case '*' -> Optional.of(DOWNGRADED_FROM_OLDER_VERSION);
            default -> Optional.empty();
        };
    }
}
