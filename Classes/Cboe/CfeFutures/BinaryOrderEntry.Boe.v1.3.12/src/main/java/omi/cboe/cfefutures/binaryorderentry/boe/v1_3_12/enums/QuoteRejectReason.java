package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

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
     * Not enabled for quotes
     */
    NOT_ENABLED_FOR_QUOTES('F', "Not enabled for quotes"),

    /**
     * Incorrect data center
     */
    INCORRECT_DATA_CENTER('I', "Incorrect data center"),

    /**
     * Message rate threshold
     */
    MESSAGE_RATE_THRESHOLD('K', "Message rate threshold"),

    /**
     * Invalid QuoteCnt
     */
    INVALID_QUOTE_CNT('L', "Invalid QuoteCnt"),

    /**
     * Symbols not on same matching engine
     */
    SYMBOLS_NOT_ON_SAME_MATCHING_ENGINE('M', "Symbols not on same matching engine"),

    /**
     * Invalid ManualOrderIndicator
     */
    INVALID_MANUAL_ORDER_INDICATOR('O', "Invalid ManualOrderIndicator"),

    /**
     * Invalid QuoteUpdateID
     */
    INVALID_QUOTE_UPDATE_ID('Q', "Invalid QuoteUpdateID"),

    /**
     * Futures root does not match across quotes
     */
    FUTURES_ROOT_DOES_NOT_MATCH_ACROSS_QUOTES('R', "Futures root does not match across quotes"),

    /**
     * Symbol not found
     */
    SYMBOL_NOT_FOUND('S', "Symbol not found"),

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
     * Invalid OEOID (Order Entry Operator Id)
     */
    INVALID_OEOID('e', "Invalid OEOID (Order Entry Operator Id)"),

    /**
     * Risk management EFID or Custom Group ID level
     */
    RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL('f', "Risk management EFID or Custom Group ID level"),

    /**
     * Invalid CtiCode
     */
    INVALID_CTI_CODE('i', "Invalid CtiCode"),

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
     * Risk management product level
     */
    RISK_MANAGEMENT_PRODUCT_LEVEL('p', "Risk management product level"),

    /**
     * Invalid Remove
     */
    INVALID_REMOVE('r', "Invalid Remove"),

    /**
     * Invalid Side
     */
    INVALID_SIDE('s', "Invalid Side"),

    /**
     * Symbol range unreachable
     */
    SYMBOL_RANGE_UNREACHABLE('u', "Symbol range unreachable"),

    /**
     * Exceedes max size per order
     */
    EXCEEDES_MAX_SIZE_PER_ORDER('x', "Exceedes max size per order"),

    /**
     * Quote received by CFE during replay
     */
    QUOTE_RECEIVED_BY_CFE_DURING_REPLAY('y', "Quote received by CFE during replay"),

    /**
     * Invalid SizeModifier
     */
    INVALID_SIZE_MODIFIER('z', "Invalid SizeModifier");

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
            case 'K' -> Optional.of(MESSAGE_RATE_THRESHOLD);
            case 'L' -> Optional.of(INVALID_QUOTE_CNT);
            case 'M' -> Optional.of(SYMBOLS_NOT_ON_SAME_MATCHING_ENGINE);
            case 'O' -> Optional.of(INVALID_MANUAL_ORDER_INDICATOR);
            case 'Q' -> Optional.of(INVALID_QUOTE_UPDATE_ID);
            case 'R' -> Optional.of(FUTURES_ROOT_DOES_NOT_MATCH_ACROSS_QUOTES);
            case 'S' -> Optional.of(SYMBOL_NOT_FOUND);
            case 'W' -> Optional.of(INVALID_WASH_PREVENT_TYPE);
            case 'a' -> Optional.of(ADMIN);
            case 'c' -> Optional.of(INVALID_CAPACITY);
            case 'e' -> Optional.of(INVALID_OEOID);
            case 'f' -> Optional.of(RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL);
            case 'i' -> Optional.of(INVALID_CTI_CODE);
            case 'm' -> Optional.of(INVALID_WASH_METHOD);
            case 'n' -> Optional.of(EXCEEDES_MAX_NOTIONAL_VALUE_PER_ORDER);
            case 'o' -> Optional.of(INVALID_OPEN_CLOSE);
            case 'p' -> Optional.of(RISK_MANAGEMENT_PRODUCT_LEVEL);
            case 'r' -> Optional.of(INVALID_REMOVE);
            case 's' -> Optional.of(INVALID_SIDE);
            case 'u' -> Optional.of(SYMBOL_RANGE_UNREACHABLE);
            case 'x' -> Optional.of(EXCEEDES_MAX_SIZE_PER_ORDER);
            case 'y' -> Optional.of(QUOTE_RECEIVED_BY_CFE_DURING_REPLAY);
            case 'z' -> Optional.of(INVALID_SIZE_MODIFIER);
            default -> Optional.empty();
        };
    }
}
