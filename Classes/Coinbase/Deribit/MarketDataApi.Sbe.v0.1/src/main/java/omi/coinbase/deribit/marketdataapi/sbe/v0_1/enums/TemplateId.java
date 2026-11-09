package omi.coinbase.deribit.marketdataapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * InstrumentMessage
     */
    INSTRUMENT_MESSAGE(10, "InstrumentMessage"),

    /**
     * TradingStatusUpdateMessage
     */
    TRADING_STATUS_UPDATE_MESSAGE(12, "TradingStatusUpdateMessage"),

    /**
     * InstrumentInfoMessage
     */
    INSTRUMENT_INFO_MESSAGE(13, "InstrumentInfoMessage"),

    /**
     * InstrumentRefMessage
     */
    INSTRUMENT_REF_MESSAGE(14, "InstrumentRefMessage"),

    /**
     * BidPutMessage
     */
    BID_PUT_MESSAGE(20, "BidPutMessage"),

    /**
     * AskPutMessage
     */
    ASK_PUT_MESSAGE(21, "AskPutMessage"),

    /**
     * BidQtyReducedMessage
     */
    BID_QTY_REDUCED_MESSAGE(22, "BidQtyReducedMessage"),

    /**
     * AskQtyReducedMessage
     */
    ASK_QTY_REDUCED_MESSAGE(23, "AskQtyReducedMessage"),

    /**
     * BidDeleteMessage
     */
    BID_DELETE_MESSAGE(24, "BidDeleteMessage"),

    /**
     * AskDeleteMessage
     */
    ASK_DELETE_MESSAGE(25, "AskDeleteMessage"),

    /**
     * TradeSummaryMessage
     */
    TRADE_SUMMARY_MESSAGE(30, "TradeSummaryMessage"),

    /**
     * TradeMessage
     */
    TRADE_MESSAGE(31, "TradeMessage"),

    /**
     * BlockTradeMessage
     */
    BLOCK_TRADE_MESSAGE(33, "BlockTradeMessage"),

    /**
     * SnapshotHeaderMessage
     */
    SNAPSHOT_HEADER_MESSAGE(100, "SnapshotHeaderMessage"),

    /**
     * SnapshotTrailerMessage
     */
    SNAPSHOT_TRAILER_MESSAGE(101, "SnapshotTrailerMessage"),

    /**
     * EndOfCycleMessage
     */
    END_OF_CYCLE_MESSAGE(119, "EndOfCycleMessage"),

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
            case 10 -> Optional.of(INSTRUMENT_MESSAGE);
            case 12 -> Optional.of(TRADING_STATUS_UPDATE_MESSAGE);
            case 13 -> Optional.of(INSTRUMENT_INFO_MESSAGE);
            case 14 -> Optional.of(INSTRUMENT_REF_MESSAGE);
            case 20 -> Optional.of(BID_PUT_MESSAGE);
            case 21 -> Optional.of(ASK_PUT_MESSAGE);
            case 22 -> Optional.of(BID_QTY_REDUCED_MESSAGE);
            case 23 -> Optional.of(ASK_QTY_REDUCED_MESSAGE);
            case 24 -> Optional.of(BID_DELETE_MESSAGE);
            case 25 -> Optional.of(ASK_DELETE_MESSAGE);
            case 30 -> Optional.of(TRADE_SUMMARY_MESSAGE);
            case 31 -> Optional.of(TRADE_MESSAGE);
            case 33 -> Optional.of(BLOCK_TRADE_MESSAGE);
            case 100 -> Optional.of(SNAPSHOT_HEADER_MESSAGE);
            case 101 -> Optional.of(SNAPSHOT_TRAILER_MESSAGE);
            case 119 -> Optional.of(END_OF_CYCLE_MESSAGE);
            case 200 -> Optional.of(RETRANSMIT_REQUEST_MESSAGE);
            case 202 -> Optional.of(RETRANSMIT_REJECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
