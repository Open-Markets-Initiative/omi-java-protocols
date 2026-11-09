package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Modify Status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ModifyStatus {

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
     * Cannot Find Order With Target Client Order Id
     */
    CANNOT_FIND_ORDER_WITH_TARGET_CLIENT_ORDER_ID('D', "Cannot Find Order With Target Client Order Id"),

    /**
     * Exceeded Test Symbol Throttle
     */
    EXCEEDED_TEST_SYMBOL_THROTTLE('E', "Exceeded Test Symbol Throttle"),

    /**
     * Order Is Routed
     */
    ORDER_IS_ROUTED('F', "Order Is Routed"),

    /**
     * Short Sale Orders Not Allowed
     */
    SHORT_SALE_ORDERS_NOT_ALLOWED('G', "Short Sale Orders Not Allowed"),

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
     * Blocked By Firm Over Miax Member Firm Portal Or By Helpdesk
     */
    BLOCKED_BY_FIRM_OVER_MIAX_MEMBER_FIRM_PORTAL_OR_BY_HELPDESK('L', "Blocked By Firm Over Miax Member Firm Portal Or By Helpdesk"),

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
     * Specified Mpid Does Not Match Target Order
     */
    SPECIFIED_MPID_DOES_NOT_MATCH_TARGET_ORDER('Q', "Specified Mpid Does Not Match Target Order"),

    /**
     * Blocked By Cumulative Risk Metrics
     */
    BLOCKED_BY_CUMULATIVE_RISK_METRICS('R', "Blocked By Cumulative Risk Metrics"),

    /**
     * Invalid Symbol Id
     */
    INVALID_SYMBOL_ID('S', "Invalid Symbol Id"),

    /**
     * Invalid Target Client Order Id
     */
    INVALID_TARGET_CLIENT_ORDER_ID('T', "Invalid Target Client Order Id"),

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
     * Undefined Reason
     */
    UNDEFINED_REASON('Z', "Undefined Reason"),

    /**
     * Invalid Min Qty Modification
     */
    INVALID_MIN_QTY_MODIFICATION('a', "Invalid Min Qty Modification"),

    /**
     * Invalid To Change Max Floor Qty
     */
    INVALID_TO_CHANGE_MAX_FLOOR_QTY('b', "Invalid To Change Max Floor Qty"),

    /**
     * Modification Request Is Sent To Another Market And Pending Completion
     */
    MODIFICATION_REQUEST_IS_SENT_TO_ANOTHER_MARKET_AND_PENDING_COMPLETION('c', "Modification Request Is Sent To Another Market And Pending Completion"),

    /**
     * Not Allowed Order Is Already Pending Modification
     */
    NOT_ALLOWED_ORDER_IS_ALREADY_PENDING_MODIFICATION('d', "Not Allowed Order Is Already Pending Modification"),

    /**
     * Invalid Max Floor Qty
     */
    INVALID_MAX_FLOOR_QTY('t', "Invalid Max Floor Qty"),

    /**
     * Pac Orders Are Not Allowed Routing To Primary
     */
    PAC_ORDERS_ARE_NOT_ALLOWED_ROUTING_TO_PRIMARY('y', "Pac Orders Are Not Allowed Routing To Primary"),

    /**
     * Short Sale Exempt Orders Not Allowed
     */
    SHORT_SALE_EXEMPT_ORDERS_NOT_ALLOWED('z', "Short Sale Exempt Orders Not Allowed"),

    /**
     * Limit Price More Aggressive Than Market Impact
     */
    LIMIT_PRICE_MORE_AGGRESSIVE_THAN_MARKET_IMPACT('0', "Limit Price More Aggressive Than Market Impact"),

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
     * Invalid Or Not Permitted Value In Locate Account Field
     */
    INVALID_OR_NOT_PERMITTED_VALUE_IN_LOCATE_ACCOUNT_FIELD('7', "Invalid Or Not Permitted Value In Locate Account Field"),

    /**
     * Blocked By Drop Copy Acod Event
     */
    BLOCKED_BY_DROP_COPY_ACOD_EVENT('8', "Blocked By Drop Copy Acod Event"),

    /**
     * Blocked By Drop Copy Acosf Event
     */
    BLOCKED_BY_DROP_COPY_ACOSF_EVENT('9', "Blocked By Drop Copy Acosf Event"),

    /**
     * Downgraded From Older Version
     */
    DOWNGRADED_FROM_OLDER_VERSION('*', "Downgraded From Older Version");

    private final char wire;

    private final String description;

    ModifyStatus(char wire, String description) {
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
    public static Optional<ModifyStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(SUCCESSFUL);
            case 'A' -> Optional.of(DUPLICATE_CLIENT_ORDER_ID);
            case 'B' -> Optional.of(NOT_IN_LIVE_ORDER_WINDOW);
            case 'C' -> Optional.of(MATCHING_ENGINE_IS_NOT_AVAILABLE);
            case 'D' -> Optional.of(CANNOT_FIND_ORDER_WITH_TARGET_CLIENT_ORDER_ID);
            case 'E' -> Optional.of(EXCEEDED_TEST_SYMBOL_THROTTLE);
            case 'F' -> Optional.of(ORDER_IS_ROUTED);
            case 'G' -> Optional.of(SHORT_SALE_ORDERS_NOT_ALLOWED);
            case 'H' -> Optional.of(BLOCKED_BY_MEO_USER);
            case 'I' -> Optional.of(INVALID_MPID);
            case 'J' -> Optional.of(INVALID_PRICE);
            case 'K' -> Optional.of(INVALID_SIZE);
            case 'L' -> Optional.of(BLOCKED_BY_FIRM_OVER_MIAX_MEMBER_FIRM_PORTAL_OR_BY_HELPDESK);
            case 'M' -> Optional.of(EXCEEDED_MAX_ALLOWED_SIZE);
            case 'N' -> Optional.of(EXCEEDED_MAX_NOTIONAL_VALUE);
            case 'O' -> Optional.of(INVALID_CLIENT_ORDER_ID);
            case 'P' -> Optional.of(REQUEST_IS_NOT_PERMITTED_FOR_THIS_SESSION);
            case 'Q' -> Optional.of(SPECIFIED_MPID_DOES_NOT_MATCH_TARGET_ORDER);
            case 'R' -> Optional.of(BLOCKED_BY_CUMULATIVE_RISK_METRICS);
            case 'S' -> Optional.of(INVALID_SYMBOL_ID);
            case 'T' -> Optional.of(INVALID_TARGET_CLIENT_ORDER_ID);
            case 'U' -> Optional.of(INVALID_USE_OF_LOCATE_REQUIRED);
            case 'V' -> Optional.of(INVALID_SELL_SHORT);
            case 'W' -> Optional.of(LIMIT_ORDER_PRICE_PROTECTION);
            case 'X' -> Optional.of(MPID_NOT_PERMITTED);
            case 'Z' -> Optional.of(UNDEFINED_REASON);
            case 'a' -> Optional.of(INVALID_MIN_QTY_MODIFICATION);
            case 'b' -> Optional.of(INVALID_TO_CHANGE_MAX_FLOOR_QTY);
            case 'c' -> Optional.of(MODIFICATION_REQUEST_IS_SENT_TO_ANOTHER_MARKET_AND_PENDING_COMPLETION);
            case 'd' -> Optional.of(NOT_ALLOWED_ORDER_IS_ALREADY_PENDING_MODIFICATION);
            case 't' -> Optional.of(INVALID_MAX_FLOOR_QTY);
            case 'y' -> Optional.of(PAC_ORDERS_ARE_NOT_ALLOWED_ROUTING_TO_PRIMARY);
            case 'z' -> Optional.of(SHORT_SALE_EXEMPT_ORDERS_NOT_ALLOWED);
            case '0' -> Optional.of(LIMIT_PRICE_MORE_AGGRESSIVE_THAN_MARKET_IMPACT);
            case '1' -> Optional.of(MARKET_ORDERS_NOT_ALLOWED);
            case '2' -> Optional.of(RESTRICTED_SECURITY_NOT_ALLOWED);
            case '3' -> Optional.of(BLOCKED_BY_ORDER_RATE_METRICS);
            case '4' -> Optional.of(AVERAGE_DAILY_VOLUME_PROTECTION);
            case '7' -> Optional.of(INVALID_OR_NOT_PERMITTED_VALUE_IN_LOCATE_ACCOUNT_FIELD);
            case '8' -> Optional.of(BLOCKED_BY_DROP_COPY_ACOD_EVENT);
            case '9' -> Optional.of(BLOCKED_BY_DROP_COPY_ACOSF_EVENT);
            case '*' -> Optional.of(DOWNGRADED_FROM_OLDER_VERSION);
            default -> Optional.empty();
        };
    }
}
