package omi.nasdaq.nomoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * Reason for the reject. See Reject Codes
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum RejectCode {

    /**
     * Invalid Firm
     */
    INVALID_FIRM(10, "Invalid Firm"),

    /**
     * Invalid Instrument
     */
    INVALID_INSTRUMENT(11, "Invalid Instrument"),

    /**
     * Invalid InstrumentType
     */
    INVALID_INSTRUMENT_TYPE(12, "Invalid InstrumentType"),

    /**
     * Invalid Quantity
     */
    INVALID_QUANTITY(13, "Invalid Quantity"),

    /**
     * Invalid Price
     */
    INVALID_PRICE(14, "Invalid Price"),

    /**
     * Invalid Side
     */
    INVALID_SIDE(15, "Invalid Side"),

    /**
     * Invalid Tif
     */
    INVALID_TIF(16, "Invalid Tif"),

    /**
     * Invalid Iso
     */
    INVALID_ISO(17, "Invalid Iso"),

    /**
     * Invalid AuctionType
     */
    INVALID_AUCTION_TYPE(18, "Invalid AuctionType"),

    /**
     * Invalid AuctionId
     */
    INVALID_AUCTION_ID(19, "Invalid AuctionId"),

    /**
     * Invalid OrderType
     */
    INVALID_ORDER_TYPE(20, "Invalid OrderType"),

    /**
     * Invalid PrefParty
     */
    INVALID_PREF_PARTY(21, "Invalid PrefParty"),

    /**
     * Invalid ALO
     */
    INVALID_ALO(22, "Invalid ALO"),

    /**
     * Invalid Capacity
     */
    INVALID_CAPACITY(23, "Invalid Capacity"),

    /**
     * Invalid ReservedInst
     */
    INVALID_RESERVED_INST(24, "Invalid ReservedInst"),

    /**
     * Invalid Trade
     */
    INVALID_TRADE(25, "Invalid Trade"),

    /**
     * Invalid Format
     */
    INVALID_FORMAT(26, "Invalid Format"),

    /**
     * Invalid CrossType
     */
    INVALID_CROSS_TYPE(27, "Invalid CrossType"),

    /**
     * Invalid MinQuantity
     */
    INVALID_MIN_QUANTITY(28, "Invalid MinQuantity"),

    /**
     * Invalid PriceProtection
     */
    INVALID_PRICE_PROTECTION(29, "Invalid PriceProtection"),

    /**
     * Invalid Reserve
     */
    INVALID_RESERVE(30, "Invalid Reserve"),

    /**
     * Invalid Persist
     */
    INVALID_PERSIST(31, "Invalid Persist"),

    /**
     * Invalid ShortSaleInd
     */
    INVALID_SHORT_SALE_IND(32, "Invalid ShortSaleInd"),

    /**
     * Invalid Product
     */
    INVALID_PRODUCT(33, "Invalid Product"),

    /**
     * Invalid Scope
     */
    INVALID_SCOPE(34, "Invalid Scope"),

    /**
     * Invalid Clearing Info
     */
    INVALID_CLEARING_INFO(35, "Invalid Clearing Info"),

    /**
     * Invalid Position Effect
     */
    INVALID_POSITION_EFFECT(36, "Invalid Position Effect"),

    /**
     * Invalid CrossId
     */
    INVALID_CROSS_ID(37, "Invalid CrossId"),

    /**
     * Invalid MatchId
     */
    INVALID_MATCH_ID(38, "Invalid MatchId"),

    /**
     * Invalid Client Order Id
     */
    INVALID_CLIENT_ORDER_ID(39, "Invalid Client Order Id"),

    /**
     * Invalid Killswitch Action
     */
    INVALID_KILLSWITCH_ACTION(40, "Invalid Killswitch Action"),

    /**
     * Invalid Leg Count
     */
    INVALID_LEG_COUNT(41, "Invalid Leg Count"),

    /**
     * Invalid Leg Type
     */
    INVALID_LEG_TYPE(42, "Invalid Leg Type"),

    /**
     * Invalid Leg Ratio
     */
    INVALID_LEG_RATIO(43, "Invalid Leg Ratio"),

    /**
     * Invalid Mpid
     */
    INVALID_MPID(44, "Invalid Mpid"),

    /**
     * Invalid Time
     */
    INVALID_TIME(45, "Invalid Time"),

    /**
     * Invalid Msg Type
     */
    INVALID_MSG_TYPE(46, "Invalid Msg Type"),

    /**
     * Invalid Disclosure Mask
     */
    INVALID_DISCLOSURE_MASK(47, "Invalid Disclosure Mask"),

    /**
     * Post Only Reprice
     */
    POST_ONLY_REPRICE(48, "Post Only Reprice"),

    /**
     * UnAuthorized GiveUp
     */
    UN_AUTHORIZED_GIVE_UP(49, "UnAuthorized GiveUp"),

    /**
     * InvalidSession
     */
    INVALID_SESSION(50, "InvalidSession"),

    /**
     * Not Free Trading
     */
    NOT_FREE_TRADING(101, "Not Free Trading"),

    /**
     * Pref Not Allowed
     */
    PREF_NOT_ALLOWED(102, "Pref Not Allowed"),

    /**
     * Stock Combo Not Allowed
     */
    STOCK_COMBO_NOT_ALLOWED(103, "Stock Combo Not Allowed"),

    /**
     * Instrument Halted
     */
    INSTRUMENT_HALTED(104, "Instrument Halted"),

    /**
     * Kill Switch In Effect
     */
    KILL_SWITCH_IN_EFFECT(105, "Kill Switch In Effect"),

    /**
     * System Closed
     */
    SYSTEM_CLOSED(106, "System Closed"),

    /**
     * Test Mode
     */
    TEST_MODE(107, "Test Mode"),

    /**
     * Order Not Found
     */
    ORDER_NOT_FOUND(108, "Order Not Found"),

    /**
     * Too Late To Act
     */
    TOO_LATE_TO_ACT(109, "Too Late To Act"),

    /**
     * Instrument Closed
     */
    INSTRUMENT_CLOSED(110, "Instrument Closed"),

    /**
     * Instrument State
     */
    INSTRUMENT_STATE(111, "Instrument State"),

    /**
     * Action Not Allowed
     */
    ACTION_NOT_ALLOWED(112, "Action Not Allowed"),

    /**
     * LULD In Effect
     */
    LULD_IN_EFFECT(113, "LULD In Effect"),

    /**
     * Too Many Combos
     */
    TOO_MANY_COMBOS(114, "Too Many Combos"),

    /**
     * Request Cancelled
     */
    REQUEST_CANCELLED(115, "Request Cancelled"),

    /**
     * Below Minimum Reserve
     */
    BELOW_MINIMUM_RESERVE(116, "Below Minimum Reserve"),

    /**
     * Port Rate Breached
     */
    PORT_RATE_BREACHED(117, "Port Rate Breached"),

    /**
     * Invalid Trader ID
     */
    INVALID_TRADER_ID(118, "Invalid Trader ID"),

    /**
     * Stop Price Not Allowed
     */
    STOP_PRICE_NOT_ALLOWED(119, "Stop Price Not Allowed"),

    /**
     * Stop Price
     */
    STOP_PRICE(120, "Stop Price"),

    /**
     * Firm Suspended
     */
    FIRM_SUSPENDED(121, "Firm Suspended"),

    /**
     * Trader Suspended
     */
    TRADER_SUSPENDED(122, "Trader Suspended"),

    /**
     * Port Suspended
     */
    PORT_SUSPENDED(123, "Port Suspended"),

    /**
     * Invalid Investment Decision
     */
    INVALID_INVESTMENT_DECISION(124, "Invalid Investment Decision"),

    /**
     * Invalid Execution Decision
     */
    INVALID_EXECUTION_DECISION(125, "Invalid Execution Decision"),

    /**
     * Invalid Dea
     */
    INVALID_DEA(126, "Invalid Dea"),

    /**
     * Invalid ClientId
     */
    INVALID_CLIENT_ID(127, "Invalid ClientId"),

    /**
     * Invalid Party Role Qualifier
     */
    INVALID_PARTY_ROLE_QUALIFIER(128, "Invalid Party Role Qualifier"),

    /**
     * Order Expired
     */
    ORDER_EXPIRED(129, "Order Expired"),

    /**
     * Invalid Good Til Date
     */
    INVALID_GOOD_TIL_DATE(130, "Invalid Good Til Date"),

    /**
     * Instrument Expired
     */
    INSTRUMENT_EXPIRED(131, "Instrument Expired"),

    /**
     * Invalid Self Match PrevId
     */
    INVALID_SELF_MATCH_PREV_ID(132, "Invalid Self Match PrevId"),

    /**
     * Spread
     */
    SPREAD(133, "Spread"),

    /**
     * Not Permitted
     */
    NOT_PERMITTED(134, "Not Permitted"),

    /**
     * Size
     */
    SIZE(135, "Size"),

    /**
     * Attribute
     */
    ATTRIBUTE(136, "Attribute"),

    /**
     * Reentry Required
     */
    REENTRY_REQUIRED(137, "Reentry Required"),

    /**
     * Opening Rotation
     */
    OPENING_ROTATION(138, "Opening Rotation"),

    /**
     * KillSwitch Reentry Required
     */
    KILL_SWITCH_REENTRY_REQUIRED(139, "KillSwitch Reentry Required"),

    /**
     * Auction
     */
    AUCTION(140, "Auction"),

    /**
     * Market Closed
     */
    MARKET_CLOSED(141, "Market Closed"),

    /**
     * Pending
     */
    PENDING(142, "Pending"),

    /**
     * System Error
     */
    SYSTEM_ERROR(143, "System Error"),

    /**
     * Cancel on Disconnect
     */
    CANCEL_ON_DISCONNECT(144, "Cancel on Disconnect"),

    /**
     * Auction Duration
     */
    AUCTION_DURATION(145, "Auction Duration");

    private final int wire;

    private final String description;

    RejectCode(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<RejectCode> fromWire(int wire) {
        return switch (wire) {
            case 10 -> Optional.of(INVALID_FIRM);
            case 11 -> Optional.of(INVALID_INSTRUMENT);
            case 12 -> Optional.of(INVALID_INSTRUMENT_TYPE);
            case 13 -> Optional.of(INVALID_QUANTITY);
            case 14 -> Optional.of(INVALID_PRICE);
            case 15 -> Optional.of(INVALID_SIDE);
            case 16 -> Optional.of(INVALID_TIF);
            case 17 -> Optional.of(INVALID_ISO);
            case 18 -> Optional.of(INVALID_AUCTION_TYPE);
            case 19 -> Optional.of(INVALID_AUCTION_ID);
            case 20 -> Optional.of(INVALID_ORDER_TYPE);
            case 21 -> Optional.of(INVALID_PREF_PARTY);
            case 22 -> Optional.of(INVALID_ALO);
            case 23 -> Optional.of(INVALID_CAPACITY);
            case 24 -> Optional.of(INVALID_RESERVED_INST);
            case 25 -> Optional.of(INVALID_TRADE);
            case 26 -> Optional.of(INVALID_FORMAT);
            case 27 -> Optional.of(INVALID_CROSS_TYPE);
            case 28 -> Optional.of(INVALID_MIN_QUANTITY);
            case 29 -> Optional.of(INVALID_PRICE_PROTECTION);
            case 30 -> Optional.of(INVALID_RESERVE);
            case 31 -> Optional.of(INVALID_PERSIST);
            case 32 -> Optional.of(INVALID_SHORT_SALE_IND);
            case 33 -> Optional.of(INVALID_PRODUCT);
            case 34 -> Optional.of(INVALID_SCOPE);
            case 35 -> Optional.of(INVALID_CLEARING_INFO);
            case 36 -> Optional.of(INVALID_POSITION_EFFECT);
            case 37 -> Optional.of(INVALID_CROSS_ID);
            case 38 -> Optional.of(INVALID_MATCH_ID);
            case 39 -> Optional.of(INVALID_CLIENT_ORDER_ID);
            case 40 -> Optional.of(INVALID_KILLSWITCH_ACTION);
            case 41 -> Optional.of(INVALID_LEG_COUNT);
            case 42 -> Optional.of(INVALID_LEG_TYPE);
            case 43 -> Optional.of(INVALID_LEG_RATIO);
            case 44 -> Optional.of(INVALID_MPID);
            case 45 -> Optional.of(INVALID_TIME);
            case 46 -> Optional.of(INVALID_MSG_TYPE);
            case 47 -> Optional.of(INVALID_DISCLOSURE_MASK);
            case 48 -> Optional.of(POST_ONLY_REPRICE);
            case 49 -> Optional.of(UN_AUTHORIZED_GIVE_UP);
            case 50 -> Optional.of(INVALID_SESSION);
            case 101 -> Optional.of(NOT_FREE_TRADING);
            case 102 -> Optional.of(PREF_NOT_ALLOWED);
            case 103 -> Optional.of(STOCK_COMBO_NOT_ALLOWED);
            case 104 -> Optional.of(INSTRUMENT_HALTED);
            case 105 -> Optional.of(KILL_SWITCH_IN_EFFECT);
            case 106 -> Optional.of(SYSTEM_CLOSED);
            case 107 -> Optional.of(TEST_MODE);
            case 108 -> Optional.of(ORDER_NOT_FOUND);
            case 109 -> Optional.of(TOO_LATE_TO_ACT);
            case 110 -> Optional.of(INSTRUMENT_CLOSED);
            case 111 -> Optional.of(INSTRUMENT_STATE);
            case 112 -> Optional.of(ACTION_NOT_ALLOWED);
            case 113 -> Optional.of(LULD_IN_EFFECT);
            case 114 -> Optional.of(TOO_MANY_COMBOS);
            case 115 -> Optional.of(REQUEST_CANCELLED);
            case 116 -> Optional.of(BELOW_MINIMUM_RESERVE);
            case 117 -> Optional.of(PORT_RATE_BREACHED);
            case 118 -> Optional.of(INVALID_TRADER_ID);
            case 119 -> Optional.of(STOP_PRICE_NOT_ALLOWED);
            case 120 -> Optional.of(STOP_PRICE);
            case 121 -> Optional.of(FIRM_SUSPENDED);
            case 122 -> Optional.of(TRADER_SUSPENDED);
            case 123 -> Optional.of(PORT_SUSPENDED);
            case 124 -> Optional.of(INVALID_INVESTMENT_DECISION);
            case 125 -> Optional.of(INVALID_EXECUTION_DECISION);
            case 126 -> Optional.of(INVALID_DEA);
            case 127 -> Optional.of(INVALID_CLIENT_ID);
            case 128 -> Optional.of(INVALID_PARTY_ROLE_QUALIFIER);
            case 129 -> Optional.of(ORDER_EXPIRED);
            case 130 -> Optional.of(INVALID_GOOD_TIL_DATE);
            case 131 -> Optional.of(INSTRUMENT_EXPIRED);
            case 132 -> Optional.of(INVALID_SELF_MATCH_PREV_ID);
            case 133 -> Optional.of(SPREAD);
            case 134 -> Optional.of(NOT_PERMITTED);
            case 135 -> Optional.of(SIZE);
            case 136 -> Optional.of(ATTRIBUTE);
            case 137 -> Optional.of(REENTRY_REQUIRED);
            case 138 -> Optional.of(OPENING_ROTATION);
            case 139 -> Optional.of(KILL_SWITCH_REENTRY_REQUIRED);
            case 140 -> Optional.of(AUCTION);
            case 141 -> Optional.of(MARKET_CLOSED);
            case 142 -> Optional.of(PENDING);
            case 143 -> Optional.of(SYSTEM_ERROR);
            case 144 -> Optional.of(CANCEL_ON_DISCONNECT);
            case 145 -> Optional.of(AUCTION_DURATION);
            default -> Optional.empty();
        };
    }
}
