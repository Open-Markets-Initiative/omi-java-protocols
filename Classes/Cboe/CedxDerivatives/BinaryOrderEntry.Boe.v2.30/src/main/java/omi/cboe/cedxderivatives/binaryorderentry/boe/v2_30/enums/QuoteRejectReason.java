package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.enums;

import java.util.Optional;

/**
 * Reason for rejection of an entire Quote Up- date message by the matching engine. If an error is indicated, then no quotes were entered or updated. QuoteCnt will be 0. &lt;space&gt; = Success See Quote Reason Codes (§ 7.2, p. 197) for a list of possible quote reject codes. Additional reasons may be added in the future without warning.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteRejectReason {

    /**
     * Invalid ClearingFirm
     */
    INVALID_CLEARING_FIRM('C', "Invalid ClearingFirm"),

    /**
     * Invalid WashId
     */
    INVALID_WASH_ID('D', "Invalid WashId"),

    /**
     * Not enabled for quotes
     */
    NOT_ENABLED_FOR_QUOTES('F', "Not enabled for quotes"),

    /**
     * Incorrect Data Center
     */
    INCORRECT_DATA_CENTER('I', "Incorrect Data Center"),

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
     * Product Code does not match across quotes
     */
    PRODUCT_CODE_DOES_NOT_MATCH_ACROSS_QUOTES('R', "Product Code does not match across quotes"),

    /**
     * Symbol not found
     */
    SYMBOL_NOT_FOUND('S', "Symbol not found"),

    /**
     * Symbol range unreachable
     */
    SYMBOL_RANGE_UNREACHABLE('U', "Symbol range unreachable"),

    /**
     * Invalid WashPreventType
     */
    INVALID_WASH_PREVENT_TYPE('W', "Invalid WashPreventType"),

    /**
     * Admin
     */
    ADMIN('a', "Admin"),

    /**
     * Invalid AccountType
     */
    INVALID_ACCOUNT_TYPE('b', "Invalid AccountType"),

    /**
     * Invalid Capacity
     */
    INVALID_CAPACITY('c', "Invalid Capacity"),

    /**
     * Risk Management Trading Firm Level
     */
    RISK_MANAGEMENT_TRADING_FIRM_LEVEL('f', "Risk Management Trading Firm Level"),

    /**
     * Liquidity Provision quotes require active LPP registration for product
     */
    LIQUIDITY_PROVISION_QUOTES_REQUIRE_ACTIVE_LPP_REGISTRATION_FOR_PRODUCT('l', "Liquidity Provision quotes require active LPP registration for product"),

    /**
     * Invalid WashMethod
     */
    INVALID_WASH_METHOD('m', "Invalid WashMethod"),

    /**
     * Exceed max notional value per order
     */
    EXCEED_MAX_NOTIONAL_VALUE_PER_ORDER('n', "Exceed max notional value per order"),

    /**
     * Invalid OpenClose
     */
    INVALID_OPEN_CLOSE('o', "Invalid OpenClose"),

    /**
     * Invalid Side
     */
    INVALID_SIDE('s', "Invalid Side"),

    /**
     * Invalid EU Record Keeping info, such as OrderOrigination, AlgorithmicIndicator, LiquidityProvision,
     */
    INVALID_EU_RECORD_KEEPING_INFO_SUCH_AS_ORDER_ORIGINATION_ALGORITHMIC_INDICATOR_LIQUIDITY_PROVISION('v', "Invalid EU Record Keeping info, such as OrderOrigination, AlgorithmicIndicator, LiquidityProvision,"),

    /**
     * Exceed max size per order
     */
    EXCEED_MAX_SIZE_PER_ORDER('x', "Exceed max size per order"),

    /**
     * Quote Received by Cboe During Replay
     */
    QUOTE_RECEIVED_BY_CBOE_DURING_REPLAY('y', "Quote Received by Cboe During Replay"),

    /**
     * Session End
     */
    SESSION_END('z', "Session End");

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
            case 'C' -> Optional.of(INVALID_CLEARING_FIRM);
            case 'D' -> Optional.of(INVALID_WASH_ID);
            case 'F' -> Optional.of(NOT_ENABLED_FOR_QUOTES);
            case 'I' -> Optional.of(INCORRECT_DATA_CENTER);
            case 'L' -> Optional.of(INVALID_QUOTE_CNT);
            case 'M' -> Optional.of(SYMBOLS_NOT_ON_SAME_MATCHING_ENGINE);
            case 'P' -> Optional.of(INVALID_POSTING_INSTRUCTION);
            case 'Q' -> Optional.of(INVALID_QUOTE_UPDATE_ID);
            case 'R' -> Optional.of(PRODUCT_CODE_DOES_NOT_MATCH_ACROSS_QUOTES);
            case 'S' -> Optional.of(SYMBOL_NOT_FOUND);
            case 'U' -> Optional.of(SYMBOL_RANGE_UNREACHABLE);
            case 'W' -> Optional.of(INVALID_WASH_PREVENT_TYPE);
            case 'a' -> Optional.of(ADMIN);
            case 'b' -> Optional.of(INVALID_ACCOUNT_TYPE);
            case 'c' -> Optional.of(INVALID_CAPACITY);
            case 'f' -> Optional.of(RISK_MANAGEMENT_TRADING_FIRM_LEVEL);
            case 'l' -> Optional.of(LIQUIDITY_PROVISION_QUOTES_REQUIRE_ACTIVE_LPP_REGISTRATION_FOR_PRODUCT);
            case 'm' -> Optional.of(INVALID_WASH_METHOD);
            case 'n' -> Optional.of(EXCEED_MAX_NOTIONAL_VALUE_PER_ORDER);
            case 'o' -> Optional.of(INVALID_OPEN_CLOSE);
            case 's' -> Optional.of(INVALID_SIDE);
            case 'v' -> Optional.of(INVALID_EU_RECORD_KEEPING_INFO_SUCH_AS_ORDER_ORIGINATION_ALGORITHMIC_INDICATOR_LIQUIDITY_PROVISION);
            case 'x' -> Optional.of(EXCEED_MAX_SIZE_PER_ORDER);
            case 'y' -> Optional.of(QUOTE_RECEIVED_BY_CBOE_DURING_REPLAY);
            case 'z' -> Optional.of(SESSION_END);
            default -> Optional.empty();
        };
    }
}
