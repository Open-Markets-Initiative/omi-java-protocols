package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Type of the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Trading week plan
     */
    WEEK_PLAN(33, "Trading week plan"),

    /**
     * Upcoming calendar day exception
     */
    CALENDAR_EXCEPTION(35, "Upcoming calendar day exception"),

    /**
     * Tick size definition
     */
    TICK_TABLE_ENTRY(32, "Tick size definition"),

    /**
     * Collar table definition
     */
    COLLAR_TABLE_ENTRY(108, "Collar table definition"),

    /**
     * Trading phase definition
     */
    TRADING_PHASE_SCHEDULE_ENTRY(27, "Trading phase definition"),

    /**
     * Messages defining the Trading Venue’s market structure
     */
    MARKET_STRUCTURE(275, "Messages defining the Trading Venue\u2019s market structure"),

    /**
     * Message defining a collar group
     */
    COLLAR_GROUP(299, "Message defining a collar group"),

    /**
     * The message contains a list of underlyings not traded in WATS. It concerns underlyings for derivatives and structured products
     */
    EXTERNAL_UNDERLYING(806, "The message contains a list of underlyings not traded in WATS. It concerns underlyings for derivatives and structured products"),

    /**
     * Definition of a financial instrument
     */
    INSTRUMENT(279, "Definition of a financial instrument"),

    /**
     * Message describing an accrued interest table entry
     */
    ACCRUED_INTEREST_TABLE_ENTRY(36, "Message describing an accrued interest table entry"),

    /**
     * Message describing an indexation table entry
     */
    INDEXATION_TABLE_ENTRY(37, "Message describing an indexation table entry"),

    /**
     * The metadata message for the given index
     */
    INDEX_PARAMS(503, "The metadata message for the given index"),

    /**
     * The message contains information about a product providing the index portfolio
     */
    INDEX_PORTFOLIO_ENTRY(502, "The message contains information about a product providing the index portfolio"),

    /**
     * Auction summary, including auction price and quantity
     */
    AUCTION_SUMMARY(270, "Auction summary, including auction price and quantity"),

    /**
     * Updates IMP/IMV and BBO during an auction
     */
    AUCTION_UPDATE(268, "Updates IMP/IMV and BBO during an auction"),

    /**
     * BBO price levels and volumes
     */
    PRICE_LEVEL_SNAPSHOT(257, "BBO price levels and volumes"),

    /**
     * BBO Level 1
     */
    TOP_PRICE_LEVEL_UPDATE(256, "BBO Level 1"),

    /**
     * Enriched trade report
     */
    TRADE(38, "Enriched trade report"),

    /**
     * Report of open positions
     */
    POSITION_REPORT(801, "Report of open positions"),

    /**
     * Start of a new trading phase
     */
    INSTRUMENT_STATUS_CHANGE(26, "Start of a new trading phase"),

    /**
     * New order price collars
     */
    ORDER_COLLARS(272, "New order price collars"),

    /**
     * New trade price collars
     */
    TRADE_COLLARS(273, "New trade price collars"),

    /**
     * Provides brief instrument summary
     */
    INSTRUMENT_SUMMARY(671, "Provides brief instrument summary"),

    /**
     * Session day product summary
     */
    PRODUCT_SUMMARY(672, "Session day product summary"),

    /**
     * Message indicating a price or YTM update
     */
    PRICE_UPDATE(271, "Message indicating a price or YTM update"),

    /**
     * News message
     */
    NEWS(517, "News message"),

    /**
     * Message providing real-time index values for instruments
     */
    REAL_TIME_INDEX(500, "Message providing real-time index values for instruments"),

    /**
     * The index summary message provides a summary of the data calculated in a stock index for a given day
     */
    INDEX_SUMMARY(501, "The index summary message provides a summary of the data calculated in a stock index for a given day"),

    /**
     * The Trading Session Status provides information on the status of a market and on a trading day events
     */
    TRADING_SESSION_STATUS(23, "The Trading Session Status provides information on the status of a market and on a trading day events"),

    /**
     * A message type used to check connectivity
     */
    HEARTBEAT(1, "A message type used to check connectivity"),

    /**
     * Test event
     */
    TEST_EVENT(8192, "Test event");

    private final int wire;

    private final String description;

    MessageType(int wire, String description) {
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
    public static Optional<MessageType> fromWire(int wire) {
        return switch (wire) {
            case 33 -> Optional.of(WEEK_PLAN);
            case 35 -> Optional.of(CALENDAR_EXCEPTION);
            case 32 -> Optional.of(TICK_TABLE_ENTRY);
            case 108 -> Optional.of(COLLAR_TABLE_ENTRY);
            case 27 -> Optional.of(TRADING_PHASE_SCHEDULE_ENTRY);
            case 275 -> Optional.of(MARKET_STRUCTURE);
            case 299 -> Optional.of(COLLAR_GROUP);
            case 806 -> Optional.of(EXTERNAL_UNDERLYING);
            case 279 -> Optional.of(INSTRUMENT);
            case 36 -> Optional.of(ACCRUED_INTEREST_TABLE_ENTRY);
            case 37 -> Optional.of(INDEXATION_TABLE_ENTRY);
            case 503 -> Optional.of(INDEX_PARAMS);
            case 502 -> Optional.of(INDEX_PORTFOLIO_ENTRY);
            case 270 -> Optional.of(AUCTION_SUMMARY);
            case 268 -> Optional.of(AUCTION_UPDATE);
            case 257 -> Optional.of(PRICE_LEVEL_SNAPSHOT);
            case 256 -> Optional.of(TOP_PRICE_LEVEL_UPDATE);
            case 38 -> Optional.of(TRADE);
            case 801 -> Optional.of(POSITION_REPORT);
            case 26 -> Optional.of(INSTRUMENT_STATUS_CHANGE);
            case 272 -> Optional.of(ORDER_COLLARS);
            case 273 -> Optional.of(TRADE_COLLARS);
            case 671 -> Optional.of(INSTRUMENT_SUMMARY);
            case 672 -> Optional.of(PRODUCT_SUMMARY);
            case 271 -> Optional.of(PRICE_UPDATE);
            case 517 -> Optional.of(NEWS);
            case 500 -> Optional.of(REAL_TIME_INDEX);
            case 501 -> Optional.of(INDEX_SUMMARY);
            case 23 -> Optional.of(TRADING_SESSION_STATUS);
            case 1 -> Optional.of(HEARTBEAT);
            case 8192 -> Optional.of(TEST_EVENT);
            default -> Optional.empty();
        };
    }
}
