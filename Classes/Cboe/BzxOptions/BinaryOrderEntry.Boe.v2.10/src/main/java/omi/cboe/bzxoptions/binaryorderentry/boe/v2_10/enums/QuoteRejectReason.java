package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Reason for rejection of an entire Quote Update message by the matching engine. If an error is indicated, then no quotes were entered or updated. QuoteCnt will be 0.
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
     * Invalid Session Eligibility
     */
    INVALID_SESSION_ELIGIBILITY('E', "Invalid Session Eligibility"),

    /**
     * Not Enabled For Quotes
     */
    NOT_ENABLED_FOR_QUOTES('F', "Not Enabled For Quotes"),

    /**
     * Incorrect Data Center
     */
    INCORRECT_DATA_CENTER('I', "Incorrect Data Center"),

    /**
     * Invalid Quote Cnt
     */
    INVALID_QUOTE_CNT('L', "Invalid Quote Cnt"),

    /**
     * Symbols Not On Same Matching Engine
     */
    SYMBOLS_NOT_ON_SAME_MATCHING_ENGINE('M', "Symbols Not On Same Matching Engine"),

    /**
     * Invalid Posting Instruction
     */
    INVALID_POSTING_INSTRUCTION('P', "Invalid Posting Instruction"),

    /**
     * Invalid Quote Update Id
     */
    INVALID_QUOTE_UPDATE_ID('Q', "Invalid Quote Update Id"),

    /**
     * Risk Root Does Not Match Across Quotes
     */
    RISK_ROOT_DOES_NOT_MATCH_ACROSS_QUOTES('R', "Risk Root Does Not Match Across Quotes"),

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
     * Risk Management Efid Or Custom Group Id Level
     */
    RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL('f', "Risk Management Efid Or Custom Group Id Level"),

    /**
     * Invalid Wash Method
     */
    INVALID_WASH_METHOD('m', "Invalid Wash Method"),

    /**
     * Invalid Open Close
     */
    INVALID_OPEN_CLOSE('o', "Invalid Open Close"),

    /**
     * Risk Management Risk Root Level
     */
    RISK_MANAGEMENT_RISK_ROOT_LEVEL('p', "Risk Management Risk Root Level"),

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
    SYMBOL_RANGE_UNREACHABLE('u', "Symbol Range Unreachable"),

    /**
     * Quote Received By Cboe During Replay
     */
    QUOTE_RECEIVED_BY_CBOE_DURING_REPLAY('y', "Quote Received By Cboe During Replay");

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
            case 'E' -> Optional.of(INVALID_SESSION_ELIGIBILITY);
            case 'F' -> Optional.of(NOT_ENABLED_FOR_QUOTES);
            case 'I' -> Optional.of(INCORRECT_DATA_CENTER);
            case 'L' -> Optional.of(INVALID_QUOTE_CNT);
            case 'M' -> Optional.of(SYMBOLS_NOT_ON_SAME_MATCHING_ENGINE);
            case 'P' -> Optional.of(INVALID_POSTING_INSTRUCTION);
            case 'Q' -> Optional.of(INVALID_QUOTE_UPDATE_ID);
            case 'R' -> Optional.of(RISK_ROOT_DOES_NOT_MATCH_ACROSS_QUOTES);
            case 'S' -> Optional.of(SYMBOL_NOT_FOUND);
            case 'W' -> Optional.of(INVALID_WASH_PREVENT_TYPE);
            case 'a' -> Optional.of(ADMIN);
            case 'c' -> Optional.of(INVALID_CAPACITY);
            case 'd' -> Optional.of(CLOSE_ONLY);
            case 'f' -> Optional.of(RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL);
            case 'm' -> Optional.of(INVALID_WASH_METHOD);
            case 'o' -> Optional.of(INVALID_OPEN_CLOSE);
            case 'p' -> Optional.of(RISK_MANAGEMENT_RISK_ROOT_LEVEL);
            case 'r' -> Optional.of(INVALID_REMOVE);
            case 's' -> Optional.of(INVALID_SIDE);
            case 'u' -> Optional.of(SYMBOL_RANGE_UNREACHABLE);
            case 'y' -> Optional.of(QUOTE_RECEIVED_BY_CBOE_DURING_REPLAY);
            default -> Optional.empty();
        };
    }
}
