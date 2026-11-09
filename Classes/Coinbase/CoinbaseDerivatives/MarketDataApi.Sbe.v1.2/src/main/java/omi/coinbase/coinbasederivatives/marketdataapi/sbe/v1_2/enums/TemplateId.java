package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * OutrightInstrumentDefinitionMessage
     */
    OUTRIGHT_INSTRUMENT_DEFINITION_MESSAGE(10, "OutrightInstrumentDefinitionMessage"),

    /**
     * SpreadInstrumentDefinitionMessage
     */
    SPREAD_INSTRUMENT_DEFINITION_MESSAGE(11, "SpreadInstrumentDefinitionMessage"),

    /**
     * TradingStatusUpdateMessage
     */
    TRADING_STATUS_UPDATE_MESSAGE(17, "TradingStatusUpdateMessage"),

    /**
     * OrderPutMessage
     */
    ORDER_PUT_MESSAGE(20, "OrderPutMessage"),

    /**
     * OrderDeleteMessage
     */
    ORDER_DELETE_MESSAGE(21, "OrderDeleteMessage"),

    /**
     * ImpliedOrderUpdateMessage
     */
    IMPLIED_ORDER_UPDATE_MESSAGE(22, "ImpliedOrderUpdateMessage"),

    /**
     * TradeSummaryMessage
     */
    TRADE_SUMMARY_MESSAGE(33, "TradeSummaryMessage"),

    /**
     * TradeMessage
     */
    TRADE_MESSAGE(30, "TradeMessage"),

    /**
     * TradeAmendMessage
     */
    TRADE_AMEND_MESSAGE(31, "TradeAmendMessage"),

    /**
     * SpreadTradeAmendMessage
     */
    SPREAD_TRADE_AMEND_MESSAGE(34, "SpreadTradeAmendMessage"),

    /**
     * TradeBustMessage
     */
    TRADE_BUST_MESSAGE(32, "TradeBustMessage"),

    /**
     * MarketStatMessage
     */
    MARKET_STAT_MESSAGE(40, "MarketStatMessage"),

    /**
     * TradeSessionVolumeMessage
     */
    TRADE_SESSION_VOLUME_MESSAGE(41, "TradeSessionVolumeMessage"),

    /**
     * OpenInterestMessage
     */
    OPEN_INTEREST_MESSAGE(42, "OpenInterestMessage"),

    /**
     * StartOfOutrightInstrumentSnapshotMessage
     */
    START_OF_OUTRIGHT_INSTRUMENT_SNAPSHOT_MESSAGE(110, "StartOfOutrightInstrumentSnapshotMessage"),

    /**
     * StartOfSpreadInstrumentSnapshotMessage
     */
    START_OF_SPREAD_INSTRUMENT_SNAPSHOT_MESSAGE(111, "StartOfSpreadInstrumentSnapshotMessage"),

    /**
     * OrderSnapshotMessage
     */
    ORDER_SNAPSHOT_MESSAGE(120, "OrderSnapshotMessage"),

    /**
     * EndOfSnapshotMessage
     */
    END_OF_SNAPSHOT_MESSAGE(122, "EndOfSnapshotMessage"),

    /**
     * RetransmitRequestMessage
     */
    RETRANSMIT_REQUEST_MESSAGE(200, "RetransmitRequestMessage"),

    /**
     * RetransmitRejectMessage
     */
    RETRANSMIT_REJECT_MESSAGE(202, "RetransmitRejectMessage");

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
            case 10 -> Optional.of(OUTRIGHT_INSTRUMENT_DEFINITION_MESSAGE);
            case 11 -> Optional.of(SPREAD_INSTRUMENT_DEFINITION_MESSAGE);
            case 17 -> Optional.of(TRADING_STATUS_UPDATE_MESSAGE);
            case 20 -> Optional.of(ORDER_PUT_MESSAGE);
            case 21 -> Optional.of(ORDER_DELETE_MESSAGE);
            case 22 -> Optional.of(IMPLIED_ORDER_UPDATE_MESSAGE);
            case 33 -> Optional.of(TRADE_SUMMARY_MESSAGE);
            case 30 -> Optional.of(TRADE_MESSAGE);
            case 31 -> Optional.of(TRADE_AMEND_MESSAGE);
            case 34 -> Optional.of(SPREAD_TRADE_AMEND_MESSAGE);
            case 32 -> Optional.of(TRADE_BUST_MESSAGE);
            case 40 -> Optional.of(MARKET_STAT_MESSAGE);
            case 41 -> Optional.of(TRADE_SESSION_VOLUME_MESSAGE);
            case 42 -> Optional.of(OPEN_INTEREST_MESSAGE);
            case 110 -> Optional.of(START_OF_OUTRIGHT_INSTRUMENT_SNAPSHOT_MESSAGE);
            case 111 -> Optional.of(START_OF_SPREAD_INSTRUMENT_SNAPSHOT_MESSAGE);
            case 120 -> Optional.of(ORDER_SNAPSHOT_MESSAGE);
            case 122 -> Optional.of(END_OF_SNAPSHOT_MESSAGE);
            case 200 -> Optional.of(RETRANSMIT_REQUEST_MESSAGE);
            case 202 -> Optional.of(RETRANSMIT_REJECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
