package omi.eurex.t7.xti.fbe.v7_1.enums;

import java.util.Optional;

/**
 * Defines the QuoteEntryRejectReason values.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteEntryRejectReason {

    /**
     * Unknown security
     */
    UNKNOWN_SECURITY(0x1L, "Unknown security"),

    /**
     * Duplicate quote
     */
    DUPLICATE_QUOTE(0x6L, "Duplicate quote"),

    /**
     * Invalid price
     */
    INVALID_PRICE(0x8L, "Invalid price"),

    /**
     * Reference price not available
     */
    NO_REFERENCE_PRICE_AVAILABLE(0x10L, "Reference price not available"),

    /**
     * Single sided quotes not allowed
     */
    NO_SINGLE_SIDED_QUOTES(0x64L, "Single sided quotes not allowed"),

    /**
     * Invalid usage of quoting model
     */
    INVALID_QUOTING_MODEL(0x67L, "Invalid usage of quoting model"),

    /**
     * Invalid size
     */
    INVALID_SIZE(0x6AL, "Invalid size"),

    /**
     * Bid price not reasonable
     */
    BID_PRICE_NOT_REASONABLE(0x6CL, "Bid price not reasonable"),

    /**
     * Ask price not reasonable
     */
    ASK_PRICE_NOT_REASONABLE(0x6DL, "Ask price not reasonable"),

    /**
     * Bid price exceeds extended price range
     */
    BID_PRICE_EXCEEDS_RANGE(0x6EL, "Bid price exceeds extended price range"),

    /**
     * Ask price exceeds extended price range
     */
    ASK_PRICE_EXCEEDS_RANGE(0x6FL, "Ask price exceeds extended price range"),

    /**
     * Instrument state freeze
     */
    INSTRUMENT_STATE_FREEZE(0x73L, "Instrument state freeze"),

    /**
     * Deletion already pending
     */
    DELETION_ALREADY_PENDING(0x74L, "Deletion already pending"),

    /**
     * Fuse Box violation on session level
     */
    PRE_TRADE_RISK_SESSION_LIMIT_EXCEEDED(0x75L, "Fuse Box violation on session level"),

    /**
     * Fuse Box violation on BU level
     */
    PRE_TRADE_RISK_BU_LIMIT_EXCEEDED(0x76L, "Fuse Box violation on BU level"),

    /**
     * Bid value exceeds limit
     */
    BID_VALUE_EXCEEDS_LIMIT(0x78L, "Bid value exceeds limit"),

    /**
     * Ask value exceeds limit
     */
    ASK_VALUE_EXCEEDS_LIMIT(0x79L, "Ask value exceeds limit"),

    /**
     * Instrument cannot be traded by Business Unit
     */
    NOT_TRADEABLE_FOR_BUSINESS_UNIT(0x7AL, "Instrument cannot be traded by Business Unit"),

    /**
     * Quantity exceeds trader specific limit
     */
    QUANTITY_LIMIT_EXCEEDED(0x7DL, "Quantity exceeds trader specific limit"),

    /**
     * Value exceeds trader specific limit
     */
    VALUE_LIMIT_EXCEEDED(0x7EL, "Value exceeds trader specific limit"),

    /**
     * Invalid quote spread
     */
    INVALID_QUOTE_SPREAD(0x7FL, "Invalid quote spread"),

    /**
     * Instrument state does not allow processing
     */
    CANT_PROC_IN_CURR_INSTR_STATE(0x83L, "Instrument state does not allow processing"),

    /**
     * PWT Quote not allowed in current state
     */
    PWT_QUOTENOTALLOWEDINCURRENTSTATE(0x87L, "PWT Quote not allowed in current state"),

    /**
     * Standard Quote not allowed with crossed book
     */
    STANDARD_QUOTENOTALLOWEDINCURRENTSTATE(0x88L, "Standard Quote not allowed with crossed book"),

    /**
     * PWT Quote not allowed with crossed book
     */
    PWT_QUOTENOTALLOWEDWITHCROSSEDBOOK(0x89L, "PWT Quote not allowed with crossed book"),

    /**
     * Ask side quote not allowed
     */
    ASKSIDEQUOTENOTALLOWED(0x8AL, "Ask side quote not allowed"),

    /**
     * Ask side quote with qty not allowed
     */
    ASKSIDEQUOTEWITHQTYNOTALLOWED(0x8BL, "Ask side quote with qty not allowed"),

    /**
     * Invalid change liquidity provision session
     */
    INVALIDCHANGE_L_PSESSION(0x8CL, "Invalid change liquidity provision session"),

    /**
     * On-Book trading disabled for instrument type
     */
    ON_BOOK_TRADINGDISABLEDFOR_INSTRUMENT_TYPE(0x90L, "On-Book trading disabled for instrument type"),

    /**
     * LP licence not assigned
     */
    L_PLICENCENOTASSIGNED(0x91L, "LP licence not assigned"),

    /**
     * SP licence not assigned
     */
    S_PLICENCENOTASSIGNED(0x92L, "SP licence not assigned"),

    /**
     * Liquidity provider protection bid side cancelled
     */
    LIQUIDITYPROVIDERPROTECTIONBIDSIDECANCELLED(0x93L, "Liquidity provider protection bid side cancelled"),

    /**
     * Liquidity provider protection ask side cancelled
     */
    LIQUIDITYPROVIDERPROTECTIONASKSIDECANCELLED(0x94L, "Liquidity provider protection ask side cancelled"),

    /**
     * Quantity exceeds instrument specific limit
     */
    QUANTITY_LIMIT_EXCEEDED_INSTRUMENT(0x95L, "Quantity exceeds instrument specific limit"),

    /**
     * Value exceeds instrument specific limit
     */
    VALUE_LIMIT_EXCEEDED_INSTRUMENT(0x96L, "Value exceeds instrument specific limit"),

    /**
     * No Value
     */
    NO_VALUE(0xFFFFFFFFL, "No Value");

    private final long wire;

    private final String description;

    QuoteEntryRejectReason(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<QuoteEntryRejectReason> fromWire(long wire) {
        if (wire == 1L) {
            return Optional.of(UNKNOWN_SECURITY);
        }
        if (wire == 6L) {
            return Optional.of(DUPLICATE_QUOTE);
        }
        if (wire == 8L) {
            return Optional.of(INVALID_PRICE);
        }
        if (wire == 16L) {
            return Optional.of(NO_REFERENCE_PRICE_AVAILABLE);
        }
        if (wire == 100L) {
            return Optional.of(NO_SINGLE_SIDED_QUOTES);
        }
        if (wire == 103L) {
            return Optional.of(INVALID_QUOTING_MODEL);
        }
        if (wire == 106L) {
            return Optional.of(INVALID_SIZE);
        }
        if (wire == 108L) {
            return Optional.of(BID_PRICE_NOT_REASONABLE);
        }
        if (wire == 109L) {
            return Optional.of(ASK_PRICE_NOT_REASONABLE);
        }
        if (wire == 110L) {
            return Optional.of(BID_PRICE_EXCEEDS_RANGE);
        }
        if (wire == 111L) {
            return Optional.of(ASK_PRICE_EXCEEDS_RANGE);
        }
        if (wire == 115L) {
            return Optional.of(INSTRUMENT_STATE_FREEZE);
        }
        if (wire == 116L) {
            return Optional.of(DELETION_ALREADY_PENDING);
        }
        if (wire == 117L) {
            return Optional.of(PRE_TRADE_RISK_SESSION_LIMIT_EXCEEDED);
        }
        if (wire == 118L) {
            return Optional.of(PRE_TRADE_RISK_BU_LIMIT_EXCEEDED);
        }
        if (wire == 120L) {
            return Optional.of(BID_VALUE_EXCEEDS_LIMIT);
        }
        if (wire == 121L) {
            return Optional.of(ASK_VALUE_EXCEEDS_LIMIT);
        }
        if (wire == 122L) {
            return Optional.of(NOT_TRADEABLE_FOR_BUSINESS_UNIT);
        }
        if (wire == 125L) {
            return Optional.of(QUANTITY_LIMIT_EXCEEDED);
        }
        if (wire == 126L) {
            return Optional.of(VALUE_LIMIT_EXCEEDED);
        }
        if (wire == 127L) {
            return Optional.of(INVALID_QUOTE_SPREAD);
        }
        if (wire == 131L) {
            return Optional.of(CANT_PROC_IN_CURR_INSTR_STATE);
        }
        if (wire == 135L) {
            return Optional.of(PWT_QUOTENOTALLOWEDINCURRENTSTATE);
        }
        if (wire == 136L) {
            return Optional.of(STANDARD_QUOTENOTALLOWEDINCURRENTSTATE);
        }
        if (wire == 137L) {
            return Optional.of(PWT_QUOTENOTALLOWEDWITHCROSSEDBOOK);
        }
        if (wire == 138L) {
            return Optional.of(ASKSIDEQUOTENOTALLOWED);
        }
        if (wire == 139L) {
            return Optional.of(ASKSIDEQUOTEWITHQTYNOTALLOWED);
        }
        if (wire == 140L) {
            return Optional.of(INVALIDCHANGE_L_PSESSION);
        }
        if (wire == 144L) {
            return Optional.of(ON_BOOK_TRADINGDISABLEDFOR_INSTRUMENT_TYPE);
        }
        if (wire == 145L) {
            return Optional.of(L_PLICENCENOTASSIGNED);
        }
        if (wire == 146L) {
            return Optional.of(S_PLICENCENOTASSIGNED);
        }
        if (wire == 147L) {
            return Optional.of(LIQUIDITYPROVIDERPROTECTIONBIDSIDECANCELLED);
        }
        if (wire == 148L) {
            return Optional.of(LIQUIDITYPROVIDERPROTECTIONASKSIDECANCELLED);
        }
        if (wire == 149L) {
            return Optional.of(QUANTITY_LIMIT_EXCEEDED_INSTRUMENT);
        }
        if (wire == 150L) {
            return Optional.of(VALUE_LIMIT_EXCEEDED_INSTRUMENT);
        }
        if (wire == 4294967295L) {
            return Optional.of(NO_VALUE);
        }
        return Optional.empty();
    }
}
