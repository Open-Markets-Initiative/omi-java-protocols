package omi.eurex.t7.eti.fbe.v6_1.enums;

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
     * Invalid underlying price
     */
    INVALID_UNDERLYING_PRICE(0x6BL, "Invalid underlying price"),

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
     * Entitlement not assigned for underlying
     */
    ENTITLEMENT_NOT_ASSIGNED_FOR_UNDERLYING(0x77L, "Entitlement not assigned for underlying"),

    /**
     * Instrument is currently not tradeable on book
     */
    CURRENTLY_NOT_TRADEABLE_ON_BOOK(0x7CL, "Instrument is currently not tradeable on book"),

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
     * Book-or-Cancel quote type
     */
    BOOKOR_CANCEL(0x80L, "Book-or-Cancel quote type"),

    /**
     * Instrument state does not allow processing
     */
    CANT_PROC_IN_CURR_INSTR_STATE(0x83L, "Instrument state does not allow processing"),

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
        if (wire == 107L) {
            return Optional.of(INVALID_UNDERLYING_PRICE);
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
        if (wire == 119L) {
            return Optional.of(ENTITLEMENT_NOT_ASSIGNED_FOR_UNDERLYING);
        }
        if (wire == 124L) {
            return Optional.of(CURRENTLY_NOT_TRADEABLE_ON_BOOK);
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
        if (wire == 128L) {
            return Optional.of(BOOKOR_CANCEL);
        }
        if (wire == 131L) {
            return Optional.of(CANT_PROC_IN_CURR_INSTR_STATE);
        }
        if (wire == 4294967295L) {
            return Optional.of(NO_VALUE);
        }
        return Optional.empty();
    }
}
