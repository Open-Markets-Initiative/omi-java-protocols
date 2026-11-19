package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

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
     * Invalid underlying leg price
     */
    INVALID_UNDERLYING_PRICE(0x6BL, "Invalid underlying leg price"),

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
     * Instrument state does not allow processing
     */
    CANT_PROC_IN_CURR_INSTR_STATE(0x83L, "Instrument state does not allow processing"),

    /**
     * Location id is not set
     */
    LOCATION_ID_NOT_SET(0x84L, "Location id is not set"),

    /**
     * Client code is not set
     */
    CLIENT_CODE_NOT_SET(0x85L, "Client code is not set"),

    /**
     * Client code cannot be modified
     */
    CLIENT_CANNOT_BE_MODIFIED(0x86L, "Client code cannot be modified"),

    /**
     * Client type not set
     */
    CLIENT_TYPE_NOT_SET(0x87L, "Client type not set"),

    /**
     * Invalid value in client code for client type own
     */
    INVALID_CLIENT_CODE_FOR_CLIENT_TYPE_OWN(0x88L, "Invalid value in client code for client type own"),

    /**
     * Own client type orders are not allowed for 4L/6L instrument id
     */
    OWN_CLIENT_TYPE_NOT_ALLOWED(0x89L, "Own client type orders are not allowed for 4L/6L instrument id"),

    /**
     * Message tag not set
     */
    MESSAGE_TAG_NOT_SET(0x8AL, "Message tag not set"),

    /**
     * Price beyond circuit limit
     */
    PRICE_BEYOND_CIRCUIT_LIMIT(0x8BL, "Price beyond circuit limit"),

    /**
     * Quantity not a multiple of lot size
     */
    QUANTITY_NOT_A_MULTIPLE_OF_LOT_SIZE(0x8CL, "Quantity not a multiple of lot size"),

    /**
     * Quotes not allowed in RRM
     */
    QUOTES_NOT_ALLOWED_IN_RRM(0x8DL, "Quotes not allowed in RRM"),

    /**
     * Amount exceeds TVL
     */
    AMOUNT_EXCEEDS_TVL(0x8EL, "Amount exceeds TVL"),

    /**
     * Quotes not allowed in auction
     */
    QUOTES_NOT_ALLOWED_IN_AUCTION(0x8FL, "Quotes not allowed in auction"),

    /**
     * Client code debarred
     */
    CLIENT_CODE_DEBARRED(0x90L, "Client code debarred"),

    /**
     * Price not a multiple of tick size
     */
    PRICE_NOT_MULTIPLE_OF_TICK_SIZE(0x91L, "Price not a multiple of tick size"),

    /**
     * Quotes not allowed in post closing
     */
    QUOTES_NOT_ALLOWED_IN_POST_CLOSING(0x92L, "Quotes not allowed in post closing"),

    /**
     * Participant code cannot be modified
     */
    PARTICIPANT_CODE_CANNOT_BE_MODIFIED(0x93L, "Participant code cannot be modified"),

    /**
     * Client type cannot be modified
     */
    CLIENT_TYPE_CANNOT_BE_MODIFIED(0x94L, "Client type cannot be modified"),

    /**
     * Quoting not allowed
     */
    QUOTING_NOT_ALLOWED(0x95L, "Quoting not allowed"),

    /**
     * Invalid participant code
     */
    INVALID_PARTICIPANT_CODE(0x96L, "Invalid participant code"),

    /**
     * Price band not set
     */
    PRICE_BAND_NOT_SET(0x97L, "Price band not set"),

    /**
     * Tick size not set
     */
    TICK_SIZE_NOTSET(0x98L, "Tick size not set"),

    /**
     * Client type not allowed
     */
    CLIENT_TYPE_NOT_ALLOWED(0x99L, "Client type not allowed"),

    /**
     * Value less than 5000
     */
    INVALID_VALUE(0x9AL, "Value less than 5000"),

    /**
     * Client Code not allowed to trade in Trading Restriction Window- PIT
     */
    CLIENT_CODE_NOT_ALLOWED_TO_TRADE_IN_TRADING_RESTRICTION_WINDOW_PIT(0x9BL, "Client Code not allowed to trade in Trading Restriction Window- PIT"),

    /**
     * Deactivated vide SEBI cir dtd 29-07-22
     */
    DEACTIVATEDVIDE_SEB_ICIRDTD_290722(0x9CL, "Deactivated vide SEBI cir dtd 29-07-22"),

    /**
     * Bid price not in LPP range
     */
    BID_PRICE_NOT_IN_LPP_RANGE(0x9DL, "Bid price not in LPP range"),

    /**
     * Ask price not in LPP range
     */
    ASK_PRICE_NOT_IN_LPP_RANGE(0x9EL, "Ask price not in LPP range"),

    /**
     * Price Level Quantity Exceeded
     */
    PRICE_LEVEL_QUANTITY_EXCEEDED(0x9FL, "Price Level Quantity Exceeded"),

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
        if (wire == 131L) {
            return Optional.of(CANT_PROC_IN_CURR_INSTR_STATE);
        }
        if (wire == 132L) {
            return Optional.of(LOCATION_ID_NOT_SET);
        }
        if (wire == 133L) {
            return Optional.of(CLIENT_CODE_NOT_SET);
        }
        if (wire == 134L) {
            return Optional.of(CLIENT_CANNOT_BE_MODIFIED);
        }
        if (wire == 135L) {
            return Optional.of(CLIENT_TYPE_NOT_SET);
        }
        if (wire == 136L) {
            return Optional.of(INVALID_CLIENT_CODE_FOR_CLIENT_TYPE_OWN);
        }
        if (wire == 137L) {
            return Optional.of(OWN_CLIENT_TYPE_NOT_ALLOWED);
        }
        if (wire == 138L) {
            return Optional.of(MESSAGE_TAG_NOT_SET);
        }
        if (wire == 139L) {
            return Optional.of(PRICE_BEYOND_CIRCUIT_LIMIT);
        }
        if (wire == 140L) {
            return Optional.of(QUANTITY_NOT_A_MULTIPLE_OF_LOT_SIZE);
        }
        if (wire == 141L) {
            return Optional.of(QUOTES_NOT_ALLOWED_IN_RRM);
        }
        if (wire == 142L) {
            return Optional.of(AMOUNT_EXCEEDS_TVL);
        }
        if (wire == 143L) {
            return Optional.of(QUOTES_NOT_ALLOWED_IN_AUCTION);
        }
        if (wire == 144L) {
            return Optional.of(CLIENT_CODE_DEBARRED);
        }
        if (wire == 145L) {
            return Optional.of(PRICE_NOT_MULTIPLE_OF_TICK_SIZE);
        }
        if (wire == 146L) {
            return Optional.of(QUOTES_NOT_ALLOWED_IN_POST_CLOSING);
        }
        if (wire == 147L) {
            return Optional.of(PARTICIPANT_CODE_CANNOT_BE_MODIFIED);
        }
        if (wire == 148L) {
            return Optional.of(CLIENT_TYPE_CANNOT_BE_MODIFIED);
        }
        if (wire == 149L) {
            return Optional.of(QUOTING_NOT_ALLOWED);
        }
        if (wire == 150L) {
            return Optional.of(INVALID_PARTICIPANT_CODE);
        }
        if (wire == 151L) {
            return Optional.of(PRICE_BAND_NOT_SET);
        }
        if (wire == 152L) {
            return Optional.of(TICK_SIZE_NOTSET);
        }
        if (wire == 153L) {
            return Optional.of(CLIENT_TYPE_NOT_ALLOWED);
        }
        if (wire == 154L) {
            return Optional.of(INVALID_VALUE);
        }
        if (wire == 155L) {
            return Optional.of(CLIENT_CODE_NOT_ALLOWED_TO_TRADE_IN_TRADING_RESTRICTION_WINDOW_PIT);
        }
        if (wire == 156L) {
            return Optional.of(DEACTIVATEDVIDE_SEB_ICIRDTD_290722);
        }
        if (wire == 157L) {
            return Optional.of(BID_PRICE_NOT_IN_LPP_RANGE);
        }
        if (wire == 158L) {
            return Optional.of(ASK_PRICE_NOT_IN_LPP_RANGE);
        }
        if (wire == 159L) {
            return Optional.of(PRICE_LEVEL_QUANTITY_EXCEEDED);
        }
        if (wire == 4294967295L) {
            return Optional.of(NO_VALUE);
        }
        return Optional.empty();
    }
}
