package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * InstrumentTradingStatusIncrementalMessage
     */
    INSTRUMENT_TRADING_STATUS_INCREMENTAL_MESSAGE(3, "InstrumentTradingStatusIncrementalMessage"),

    /**
     * TradesIncrementalMessage
     */
    TRADES_INCREMENTAL_MESSAGE(4, "TradesIncrementalMessage"),

    /**
     * TradeCorrectMessage
     */
    TRADE_CORRECT_MESSAGE(5, "TradeCorrectMessage"),

    /**
     * TradeBustMessage
     */
    TRADE_BUST_MESSAGE(6, "TradeBustMessage"),

    /**
     * OrderBookIncrementalMessage
     */
    ORDER_BOOK_INCREMENTAL_MESSAGE(7, "OrderBookIncrementalMessage"),

    /**
     * MarketSummaryIncrementalMessage
     */
    MARKET_SUMMARY_INCREMENTAL_MESSAGE(8, "MarketSummaryIncrementalMessage"),

    /**
     * OrderBookSnapshotMessage
     */
    ORDER_BOOK_SNAPSHOT_MESSAGE(11, "OrderBookSnapshotMessage"),

    /**
     * MarketSummarySnapshotMessage
     */
    MARKET_SUMMARY_SNAPSHOT_MESSAGE(12, "MarketSummarySnapshotMessage"),

    /**
     * IndexValueSnapshotMessage
     */
    INDEX_VALUE_SNAPSHOT_MESSAGE(13, "IndexValueSnapshotMessage"),

    /**
     * SingleInstrumentDefinitionIncrementalV2Message
     */
    SINGLE_INSTRUMENT_DEFINITION_INCREMENTAL_V2_MESSAGE(14, "SingleInstrumentDefinitionIncrementalV2Message"),

    /**
     * MultilegDefinitionIncrementalV2Message
     */
    MULTILEG_DEFINITION_INCREMENTAL_V2_MESSAGE(15, "MultilegDefinitionIncrementalV2Message"),

    /**
     * SingleInstrumentDefinitionSnapshotV2Message
     */
    SINGLE_INSTRUMENT_DEFINITION_SNAPSHOT_V2_MESSAGE(16, "SingleInstrumentDefinitionSnapshotV2Message"),

    /**
     * MultilegDefinitionSnapshotV2Message
     */
    MULTILEG_DEFINITION_SNAPSHOT_V2_MESSAGE(17, "MultilegDefinitionSnapshotV2Message");

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
            case 3 -> Optional.of(INSTRUMENT_TRADING_STATUS_INCREMENTAL_MESSAGE);
            case 4 -> Optional.of(TRADES_INCREMENTAL_MESSAGE);
            case 5 -> Optional.of(TRADE_CORRECT_MESSAGE);
            case 6 -> Optional.of(TRADE_BUST_MESSAGE);
            case 7 -> Optional.of(ORDER_BOOK_INCREMENTAL_MESSAGE);
            case 8 -> Optional.of(MARKET_SUMMARY_INCREMENTAL_MESSAGE);
            case 11 -> Optional.of(ORDER_BOOK_SNAPSHOT_MESSAGE);
            case 12 -> Optional.of(MARKET_SUMMARY_SNAPSHOT_MESSAGE);
            case 13 -> Optional.of(INDEX_VALUE_SNAPSHOT_MESSAGE);
            case 14 -> Optional.of(SINGLE_INSTRUMENT_DEFINITION_INCREMENTAL_V2_MESSAGE);
            case 15 -> Optional.of(MULTILEG_DEFINITION_INCREMENTAL_V2_MESSAGE);
            case 16 -> Optional.of(SINGLE_INSTRUMENT_DEFINITION_SNAPSHOT_V2_MESSAGE);
            case 17 -> Optional.of(MULTILEG_DEFINITION_SNAPSHOT_V2_MESSAGE);
            default -> Optional.empty();
        };
    }
}
