package omi.bse.bseindia.eobi.fbe.v1_4.enums;

import java.util.Optional;

/**
 * Unique identifier for a Bse Eobi message layout
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * Published regularly when there is no activity on the snapshot or the incremental channel.
     */
    HEARTBEAT_MESSAGE(13001, "Published regularly when there is no activity on the snapshot or the incremental channel."),

    /**
     * Published once each snapshot cycle, carrying attributes that are equal for all instruments in the product.
     */
    PRODUCT_SUMMARY_MESSAGE(13600, "Published once each snapshot cycle, carrying attributes that are equal for all instruments in the product."),

    /**
     * Represents each individual order or quote in a snapshot cycle on the snapshot channel.
     */
    SNAPSHOT_ORDER_MESSAGE(13602, "Represents each individual order or quote in a snapshot cycle on the snapshot channel."),

    /**
     * Published for each instrument in one snapshot cycle, carrying instrument state information and trade statistics.
     */
    INSTRUMENT_SUMMARY_MESSAGE(13601, "Published for each instrument in one snapshot cycle, carrying instrument state information and trade statistics."),

    /**
     * Carries the best bid and offer of a non crossed order book during an auction call phase.
     */
    AUCTION_BEST_BID_OFFER_MESSAGE(13500, "Carries the best bid and offer of a non crossed order book during an auction call phase."),

    /**
     * Published for a crossed order book in an auction, indicating the potential auction price.
     */
    AUCTION_CLEARING_PRICE_MESSAGE(13501, "Published for a crossed order book in an auction, indicating the potential auction price."),

    /**
     * Carries the best bid and offer of an order book outside continuous trading.
     */
    TOP_OF_BOOK_MESSAGE(13504, "Carries the best bid and offer of an order book outside continuous trading."),

    /**
     * Published for each new order that was entered in the order book.
     */
    ORDER_ADD_MESSAGE(13100, "Published for each new order that was entered in the order book."),

    /**
     * Published if an existing order in the book is modified, whereby the new parameters might cause a change in time priority.
     */
    ORDER_MODIFY_MESSAGE(13101, "Published if an existing order in the book is modified, whereby the new parameters might cause a change in time priority."),

    /**
     * Published if the time priority of an existing order is not changed.
     */
    ORDER_MODIFY_SAME_PRIORITY_MESSAGE(13106, "Published if the time priority of an existing order is not changed."),

    /**
     * Published whenever an existing order is deleted from the order book.
     */
    ORDER_DELETE_MESSAGE(13102, "Published whenever an existing order is deleted from the order book."),

    /**
     * Published when the order book is expected to be emptied.
     */
    ORDER_MASS_DELETE_MESSAGE(13103, "Published when the order book is expected to be emptied."),

    /**
     * Published whenever a visible order is partially executed at its displayed price.
     */
    PARTIAL_ORDER_EXECUTION_MESSAGE(13105, "Published whenever a visible order is partially executed at its displayed price."),

    /**
     * Published whenever a visible order is fully executed at its displayed price.
     */
    FULL_ORDER_EXECUTION_MESSAGE(13104, "Published whenever a visible order is fully executed at its displayed price."),

    /**
     * Published when a trade is reversed.
     */
    TRADE_REVERSAL_MESSAGE(13200, "Published when a trade is reversed."),

    /**
     * Published whenever an incoming order is executed, carrying information on the execution of that incoming order.
     */
    EXECUTION_SUMMARY_MESSAGE(13202, "Published whenever an incoming order is executed, carrying information on the execution of that incoming order."),

    /**
     * Published whenever there is a change in the daily price range of the instrument.
     */
    INSTRUMENT_INFO_MESSAGE(13203, "Published whenever there is a change in the daily price range of the instrument."),

    /**
     * Published whenever there is a change in the limit price protection range of the instrument.
     */
    LPP_RANGE_MESSAGE(13204, "Published whenever there is a change in the limit price protection range of the instrument."),

    /**
     * Provides updates on the trading state for all instruments in a particular product.
     */
    PRODUCT_STATE_CHANGE_MESSAGE(13300, "Provides updates on the trading state for all instruments in a particular product."),

    /**
     * Provides state information for a single instrument.
     */
    INSTRUMENT_STATE_CHANGE_MESSAGE(13301, "Provides state information for a single instrument."),

    /**
     * Published whenever a new complex instrument is created intraday or an existing complex instrument is modified.
     */
    ADD_COMPLEX_INSTRUMENT_MESSAGE(13400, "Published whenever a new complex instrument is created intraday or an existing complex instrument is modified."),

    /**
     * MarketDataReport, MsgType = U20
     */
    PACKET_HEADER(13002, "MarketDataReport, MsgType = U20");

    private final int wire;

    private final String description;

    TemplateId(int wire, String description) {
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
    public static Optional<TemplateId> fromWire(int wire) {
        return switch (wire) {
            case 13001 -> Optional.of(HEARTBEAT_MESSAGE);
            case 13600 -> Optional.of(PRODUCT_SUMMARY_MESSAGE);
            case 13602 -> Optional.of(SNAPSHOT_ORDER_MESSAGE);
            case 13601 -> Optional.of(INSTRUMENT_SUMMARY_MESSAGE);
            case 13500 -> Optional.of(AUCTION_BEST_BID_OFFER_MESSAGE);
            case 13501 -> Optional.of(AUCTION_CLEARING_PRICE_MESSAGE);
            case 13504 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            case 13100 -> Optional.of(ORDER_ADD_MESSAGE);
            case 13101 -> Optional.of(ORDER_MODIFY_MESSAGE);
            case 13106 -> Optional.of(ORDER_MODIFY_SAME_PRIORITY_MESSAGE);
            case 13102 -> Optional.of(ORDER_DELETE_MESSAGE);
            case 13103 -> Optional.of(ORDER_MASS_DELETE_MESSAGE);
            case 13105 -> Optional.of(PARTIAL_ORDER_EXECUTION_MESSAGE);
            case 13104 -> Optional.of(FULL_ORDER_EXECUTION_MESSAGE);
            case 13200 -> Optional.of(TRADE_REVERSAL_MESSAGE);
            case 13202 -> Optional.of(EXECUTION_SUMMARY_MESSAGE);
            case 13203 -> Optional.of(INSTRUMENT_INFO_MESSAGE);
            case 13204 -> Optional.of(LPP_RANGE_MESSAGE);
            case 13300 -> Optional.of(PRODUCT_STATE_CHANGE_MESSAGE);
            case 13301 -> Optional.of(INSTRUMENT_STATE_CHANGE_MESSAGE);
            case 13400 -> Optional.of(ADD_COMPLEX_INSTRUMENT_MESSAGE);
            case 13002 -> Optional.of(PACKET_HEADER);
            default -> Optional.empty();
        };
    }
}
