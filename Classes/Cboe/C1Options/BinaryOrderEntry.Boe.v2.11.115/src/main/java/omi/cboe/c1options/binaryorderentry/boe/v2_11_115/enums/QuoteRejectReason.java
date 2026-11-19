package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Reason for rejection of an entire Quote Update message by the matching engine. If an error is indicated, then no quotes were entered or updated. QuoteCnt will be 0. &lt;space&gt; = Success See Quote Reason Codes for a list of possible quote reject codes. Additional reasons may be added in the future without warning.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteRejectReason {

    /**
     * Invalid EFID (ClearingFirm)
     */
    INVALID_EFID('C', "Invalid EFID (ClearingFirm)"),

    /**
     * Invalid WashId
     */
    INVALID_WASH_ID('D', "Invalid WashId"),

    /**
     * Invalid SessionEligibility
     */
    INVALID_SESSION_ELIGIBILITY('E', "Invalid SessionEligibility"),

    /**
     * Not enabled for quotes
     */
    NOT_ENABLED_FOR_QUOTES('F', "Not enabled for quotes"),

    /**
     * Incorrect data center
     */
    INCORRECT_DATA_CENTER('I', "Incorrect data center"),

    /**
     * Invalid QuoteCnt
     */
    INVALID_QUOTE_CNT('L', "Invalid QuoteCnt"),

    /**
     * Symbols not on same matching engine
     */
    SYMBOLS_NOT_ON_SAME_MATCHING_ENGINE('M', "Symbols not on same matching engine"),

    /**
     * Invalid PostingInstruction
     */
    INVALID_POSTING_INSTRUCTION('P', "Invalid PostingInstruction"),

    /**
     * Invalid QuoteUpdateID
     */
    INVALID_QUOTE_UPDATE_ID('Q', "Invalid QuoteUpdateID"),

    /**
     * Risk root does not match across quotes
     */
    RISK_ROOT_DOES_NOT_MATCH_ACROSS_QUOTES('R', "Risk root does not match across quotes"),

    /**
     * Symbol not found
     */
    SYMBOL_NOT_FOUND('S', "Symbol not found"),

    /**
     * Message unable to be sent to Matching Engine
     */
    MESSAGE_UNABLE_TO_BE_SENT_TO_MATCHING_ENGINE('U', "Message unable to be sent to Matching Engine"),

    /**
     * Invalid WashPreventType
     */
    INVALID_WASH_PREVENT_TYPE('W', "Invalid WashPreventType"),

    /**
     * Admin
     */
    ADMIN('a', "Admin"),

    /**
     * Invalid Capacity
     */
    INVALID_CAPACITY('c', "Invalid Capacity"),

    /**
     * Close only
     */
    CLOSE_ONLY('d', "Close only"),

    /**
     * Risk management EFID or Custom Group ID level
     */
    RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL('f', "Risk management EFID or Custom Group ID level"),

    /**
     * Invalid WashMethod
     */
    INVALID_WASH_METHOD('m', "Invalid WashMethod"),

    /**
     * Exceedes max notional value per order
     */
    EXCEEDES_MAX_NOTIONAL_VALUE_PER_ORDER('n', "Exceedes max notional value per order"),

    /**
     * Invalid Open/Close
     */
    INVALID_OPEN_CLOSE('o', "Invalid Open/Close"),

    /**
     * Risk management risk root level
     */
    RISK_MANAGEMENT_RISK_ROOT_LEVEL('p', "Risk management risk root level"),

    /**
     * Invalid Remove
     */
    INVALID_REMOVE('r', "Invalid Remove"),

    /**
     * Invalid Side
     */
    INVALID_SIDE('s', "Invalid Side"),

    /**
     * Invalid SendTime
     */
    INVALID_SEND_TIME('t', "Invalid SendTime"),

    /**
     * Symbol range unreachable
     */
    SYMBOL_RANGE_UNREACHABLE('u', "Symbol range unreachable"),

    /**
     * Exceeds max size per order
     */
    EXCEEDS_MAX_SIZE_PER_ORDER('x', "Exceeds max size per order"),

    /**
     * Quote received by Cboe during replay
     */
    QUOTE_RECEIVED_BY_CBOE_DURING_REPLAY('y', "Quote received by Cboe during replay");

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
            case 'U' -> Optional.of(MESSAGE_UNABLE_TO_BE_SENT_TO_MATCHING_ENGINE);
            case 'W' -> Optional.of(INVALID_WASH_PREVENT_TYPE);
            case 'a' -> Optional.of(ADMIN);
            case 'c' -> Optional.of(INVALID_CAPACITY);
            case 'd' -> Optional.of(CLOSE_ONLY);
            case 'f' -> Optional.of(RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL);
            case 'm' -> Optional.of(INVALID_WASH_METHOD);
            case 'n' -> Optional.of(EXCEEDES_MAX_NOTIONAL_VALUE_PER_ORDER);
            case 'o' -> Optional.of(INVALID_OPEN_CLOSE);
            case 'p' -> Optional.of(RISK_MANAGEMENT_RISK_ROOT_LEVEL);
            case 'r' -> Optional.of(INVALID_REMOVE);
            case 's' -> Optional.of(INVALID_SIDE);
            case 't' -> Optional.of(INVALID_SEND_TIME);
            case 'u' -> Optional.of(SYMBOL_RANGE_UNREACHABLE);
            case 'x' -> Optional.of(EXCEEDS_MAX_SIZE_PER_ORDER);
            case 'y' -> Optional.of(QUOTE_RECEIVED_BY_CBOE_DURING_REPLAY);
            default -> Optional.empty();
        };
    }
}
