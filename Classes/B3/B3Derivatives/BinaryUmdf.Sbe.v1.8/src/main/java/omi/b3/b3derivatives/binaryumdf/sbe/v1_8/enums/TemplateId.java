package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * SequenceReset_1Message
     */
    SEQUENCE_RESET_1_MESSAGE(1, "SequenceReset_1Message"),

    /**
     * Sequence_2Message
     */
    SEQUENCE_2_MESSAGE(2, "Sequence_2Message"),

    /**
     * EmptyBook_9Message
     */
    EMPTY_BOOK_9_MESSAGE(9, "EmptyBook_9Message"),

    /**
     * ChannelReset_11Message
     */
    CHANNEL_RESET_11_MESSAGE(11, "ChannelReset_11Message"),

    /**
     * SecurityStatus_3Message
     */
    SECURITY_STATUS_3_MESSAGE(3, "SecurityStatus_3Message"),

    /**
     * SecurityGroupPhase_10Message
     */
    SECURITY_GROUP_PHASE_10_MESSAGE(10, "SecurityGroupPhase_10Message"),

    /**
     * SecurityDefinition_4Message
     */
    DEPRECATEDSECURITY_DEFINITION_MESSAGE(4, "SecurityDefinition_4Message"),

    /**
     * SecurityDefinition_12Message
     */
    SECURITY_DEFINITION_MESSAGE(12, "SecurityDefinition_12Message"),

    /**
     * News_5Message
     */
    NEWS_5_MESSAGE(5, "News_5Message"),

    /**
     * OpeningPrice_15Message
     */
    OPENING_PRICE_15_MESSAGE(15, "OpeningPrice_15Message"),

    /**
     * TheoreticalOpeningPrice_16Message
     */
    THEORETICAL_OPENING_PRICE_16_MESSAGE(16, "TheoreticalOpeningPrice_16Message"),

    /**
     * ClosingPrice_17Message
     */
    CLOSING_PRICE_17_MESSAGE(17, "ClosingPrice_17Message"),

    /**
     * AuctionImbalance_19Message
     */
    AUCTION_IMBALANCE_19_MESSAGE(19, "AuctionImbalance_19Message"),

    /**
     * PriceBand_20Message
     */
    PRICE_BAND_20_MESSAGE(20, "PriceBand_20Message"),

    /**
     * QuantityBand_21Message
     */
    QUANTITY_BAND_21_MESSAGE(21, "QuantityBand_21Message"),

    /**
     * PriceBand_22Message
     */
    PRICE_BAND_22_MESSAGE(22, "PriceBand_22Message"),

    /**
     * HighPrice_24Message
     */
    HIGH_PRICE_24_MESSAGE(24, "HighPrice_24Message"),

    /**
     * LowPrice_25Message
     */
    LOW_PRICE_25_MESSAGE(25, "LowPrice_25Message"),

    /**
     * LastTradePrice_27Message
     */
    LAST_TRADE_PRICE_27_MESSAGE(27, "LastTradePrice_27Message"),

    /**
     * SettlementPrice_28Message
     */
    SETTLEMENT_PRICE_28_MESSAGE(28, "SettlementPrice_28Message"),

    /**
     * OpenInterest_29Message
     */
    OPEN_INTEREST_29_MESSAGE(29, "OpenInterest_29Message"),

    /**
     * SnapshotFullRefresh_Header_30Message
     */
    SNAPSHOT_FULL_REFRESH_HEADER_30_MESSAGE(30, "SnapshotFullRefresh_Header_30Message"),

    /**
     * Order_MBO_50Message
     */
    ORDER_MB_O50_MESSAGE(50, "Order_MBO_50Message"),

    /**
     * DeleteOrder_MBO_51Message
     */
    DELETE_ORDER_MB_O51_MESSAGE(51, "DeleteOrder_MBO_51Message"),

    /**
     * MassDeleteOrders_MBO_52Message
     */
    MASS_DELETE_ORDERS_MB_O52_MESSAGE(52, "MassDeleteOrders_MBO_52Message"),

    /**
     * Trade_53Message
     */
    TRADE_53_MESSAGE(53, "Trade_53Message"),

    /**
     * ForwardTrade_54Message
     */
    FORWARD_TRADE_54_MESSAGE(54, "ForwardTrade_54Message"),

    /**
     * ExecutionSummary_55Message
     */
    EXECUTION_SUMMARY_55_MESSAGE(55, "ExecutionSummary_55Message"),

    /**
     * ExecutionStatistics_56Message
     */
    EXECUTION_STATISTICS_56_MESSAGE(56, "ExecutionStatistics_56Message"),

    /**
     * TradeBust_57Message
     */
    TRADE_BUST_57_MESSAGE(57, "TradeBust_57Message"),

    /**
     * SnapshotFullRefresh_Orders_MBO_71Message
     */
    SNAPSHOT_FULL_REFRESH_ORDERS_MB_O71_MESSAGE(71, "SnapshotFullRefresh_Orders_MBO_71Message");

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
            case 1 -> Optional.of(SEQUENCE_RESET_1_MESSAGE);
            case 2 -> Optional.of(SEQUENCE_2_MESSAGE);
            case 9 -> Optional.of(EMPTY_BOOK_9_MESSAGE);
            case 11 -> Optional.of(CHANNEL_RESET_11_MESSAGE);
            case 3 -> Optional.of(SECURITY_STATUS_3_MESSAGE);
            case 10 -> Optional.of(SECURITY_GROUP_PHASE_10_MESSAGE);
            case 4 -> Optional.of(DEPRECATEDSECURITY_DEFINITION_MESSAGE);
            case 12 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 5 -> Optional.of(NEWS_5_MESSAGE);
            case 15 -> Optional.of(OPENING_PRICE_15_MESSAGE);
            case 16 -> Optional.of(THEORETICAL_OPENING_PRICE_16_MESSAGE);
            case 17 -> Optional.of(CLOSING_PRICE_17_MESSAGE);
            case 19 -> Optional.of(AUCTION_IMBALANCE_19_MESSAGE);
            case 20 -> Optional.of(PRICE_BAND_20_MESSAGE);
            case 21 -> Optional.of(QUANTITY_BAND_21_MESSAGE);
            case 22 -> Optional.of(PRICE_BAND_22_MESSAGE);
            case 24 -> Optional.of(HIGH_PRICE_24_MESSAGE);
            case 25 -> Optional.of(LOW_PRICE_25_MESSAGE);
            case 27 -> Optional.of(LAST_TRADE_PRICE_27_MESSAGE);
            case 28 -> Optional.of(SETTLEMENT_PRICE_28_MESSAGE);
            case 29 -> Optional.of(OPEN_INTEREST_29_MESSAGE);
            case 30 -> Optional.of(SNAPSHOT_FULL_REFRESH_HEADER_30_MESSAGE);
            case 50 -> Optional.of(ORDER_MB_O50_MESSAGE);
            case 51 -> Optional.of(DELETE_ORDER_MB_O51_MESSAGE);
            case 52 -> Optional.of(MASS_DELETE_ORDERS_MB_O52_MESSAGE);
            case 53 -> Optional.of(TRADE_53_MESSAGE);
            case 54 -> Optional.of(FORWARD_TRADE_54_MESSAGE);
            case 55 -> Optional.of(EXECUTION_SUMMARY_55_MESSAGE);
            case 56 -> Optional.of(EXECUTION_STATISTICS_56_MESSAGE);
            case 57 -> Optional.of(TRADE_BUST_57_MESSAGE);
            case 71 -> Optional.of(SNAPSHOT_FULL_REFRESH_ORDERS_MB_O71_MESSAGE);
            default -> Optional.empty();
        };
    }
}
