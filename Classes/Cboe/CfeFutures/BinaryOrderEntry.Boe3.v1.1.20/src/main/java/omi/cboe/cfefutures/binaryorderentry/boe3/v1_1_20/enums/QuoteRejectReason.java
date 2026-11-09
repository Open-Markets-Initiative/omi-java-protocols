package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Reason for the quote rejection
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteRejectReason {

    /**
     * Invalid Efid
     */
    INVALID_EFID('C', "Invalid Efid"),

    /**
     * Invalid Wash Id
     */
    INVALID_WASH_ID('D', "Invalid Wash Id"),

    /**
     * Not Enabled For Quotes
     */
    NOT_ENABLED_FOR_QUOTES('F', "Not Enabled For Quotes"),

    /**
     * Incorrect Data Center
     */
    INCORRECT_DATA_CENTER('I', "Incorrect Data Center"),

    /**
     * Order Rate Threshold Exceeded
     */
    ORDER_RATE_THRESHOLD_EXCEEDED('K', "Order Rate Threshold Exceeded"),

    /**
     * Invalid Quote Cnt
     */
    INVALID_QUOTE_CNT('L', "Invalid Quote Cnt"),

    /**
     * Symbols Not On Same Matching Engine
     */
    SYMBOLS_NOT_ON_SAME_MATCHING_ENGINE('M', "Symbols Not On Same Matching Engine"),

    /**
     * Invalid Manual Order Indicator
     */
    INVALID_MANUAL_ORDER_INDICATOR('O', "Invalid Manual Order Indicator"),

    /**
     * Invalid Quote Update Id
     */
    INVALID_QUOTE_UPDATE_ID('Q', "Invalid Quote Update Id"),

    /**
     * Futures Root Does Not Match Across Quotes
     */
    FUTURES_ROOT_DOES_NOT_MATCH_ACROSS_QUOTES('R', "Futures Root Does Not Match Across Quotes"),

    /**
     * Symbol Not Found
     */
    SYMBOL_NOT_FOUND('S', "Symbol Not Found"),

    /**
     * Invalid Wash Prevent Type
     */
    INVALID_WASH_PREVENT_TYPE('W', "Invalid Wash Prevent Type"),

    /**
     * Admin
     */
    ADMIN('a', "Admin"),

    /**
     * Invalid Capacity
     */
    INVALID_CAPACITY('c', "Invalid Capacity"),

    /**
     * Close Only
     */
    CLOSE_ONLY('d', "Close Only"),

    /**
     * Invalid Oeoid
     */
    INVALID_OEOID('e', "Invalid Oeoid"),

    /**
     * Risk Management Mpid Or Custom Group Id Level
     */
    RISK_MANAGEMENT_MPID_OR_CUSTOM_GROUP_ID_LEVEL('f', "Risk Management Mpid Or Custom Group Id Level"),

    /**
     * Invalid Cti Code
     */
    INVALID_CTI_CODE('i', "Invalid Cti Code"),

    /**
     * Invalid Wash Method
     */
    INVALID_WASH_METHOD('m', "Invalid Wash Method"),

    /**
     * Exceeds Max Notional Value Per Order
     */
    EXCEEDS_MAX_NOTIONAL_VALUE_PER_ORDER('n', "Exceeds Max Notional Value Per Order"),

    /**
     * Invalid Open Close
     */
    INVALID_OPEN_CLOSE('o', "Invalid Open Close"),

    /**
     * Invalid Remove
     */
    INVALID_REMOVE('r', "Invalid Remove"),

    /**
     * Invalid Side
     */
    INVALID_SIDE('s', "Invalid Side"),

    /**
     * Symbol Range Unreachable
     */
    SYMBOL_RANGE_UNREACHABLE('U', "Symbol Range Unreachable"),

    /**
     * Exceeds Max Size Per Order
     */
    EXCEEDS_MAX_SIZE_PER_ORDER('x', "Exceeds Max Size Per Order"),

    /**
     * Order Received By Cfe During Replay
     */
    ORDER_RECEIVED_BY_CFE_DURING_REPLAY('y', "Order Received By Cfe During Replay"),

    /**
     * Invalid Size Modifier
     */
    INVALID_SIZE_MODIFIER('z', "Invalid Size Modifier");

    private final char wire;

    private final String description;

    QuoteRejectReason(char wire, String description) {
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
    public static Optional<QuoteRejectReason> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(INVALID_EFID);
            case 'D' -> Optional.of(INVALID_WASH_ID);
            case 'F' -> Optional.of(NOT_ENABLED_FOR_QUOTES);
            case 'I' -> Optional.of(INCORRECT_DATA_CENTER);
            case 'K' -> Optional.of(ORDER_RATE_THRESHOLD_EXCEEDED);
            case 'L' -> Optional.of(INVALID_QUOTE_CNT);
            case 'M' -> Optional.of(SYMBOLS_NOT_ON_SAME_MATCHING_ENGINE);
            case 'O' -> Optional.of(INVALID_MANUAL_ORDER_INDICATOR);
            case 'Q' -> Optional.of(INVALID_QUOTE_UPDATE_ID);
            case 'R' -> Optional.of(FUTURES_ROOT_DOES_NOT_MATCH_ACROSS_QUOTES);
            case 'S' -> Optional.of(SYMBOL_NOT_FOUND);
            case 'W' -> Optional.of(INVALID_WASH_PREVENT_TYPE);
            case 'a' -> Optional.of(ADMIN);
            case 'c' -> Optional.of(INVALID_CAPACITY);
            case 'd' -> Optional.of(CLOSE_ONLY);
            case 'e' -> Optional.of(INVALID_OEOID);
            case 'f' -> Optional.of(RISK_MANAGEMENT_MPID_OR_CUSTOM_GROUP_ID_LEVEL);
            case 'i' -> Optional.of(INVALID_CTI_CODE);
            case 'm' -> Optional.of(INVALID_WASH_METHOD);
            case 'n' -> Optional.of(EXCEEDS_MAX_NOTIONAL_VALUE_PER_ORDER);
            case 'o' -> Optional.of(INVALID_OPEN_CLOSE);
            case 'r' -> Optional.of(INVALID_REMOVE);
            case 's' -> Optional.of(INVALID_SIDE);
            case 'U' -> Optional.of(SYMBOL_RANGE_UNREACHABLE);
            case 'x' -> Optional.of(EXCEEDS_MAX_SIZE_PER_ORDER);
            case 'y' -> Optional.of(ORDER_RECEIVED_BY_CFE_DURING_REPLAY);
            case 'z' -> Optional.of(INVALID_SIZE_MODIFIER);
            default -> Optional.empty();
        };
    }
}
