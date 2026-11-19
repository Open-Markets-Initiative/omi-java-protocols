package omi.memx.memxoptions.memoirdepth.sbe.v1_3.enums;

import java.util.Optional;

/**
 * T8 Identifier of the message template
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * InstrumentDirectoryMessage
     */
    INSTRUMENT_DIRECTORY_MESSAGE((short) 1, "InstrumentDirectoryMessage"),

    /**
     * InstrumentTradingStatusMessage
     */
    INSTRUMENT_TRADING_STATUS_MESSAGE((short) 2, "InstrumentTradingStatusMessage"),

    /**
     * TradingSessionStatusMessage
     */
    TRADING_SESSION_STATUS_MESSAGE((short) 3, "TradingSessionStatusMessage"),

    /**
     * BrokenTradeMessage
     */
    BROKEN_TRADE_MESSAGE((short) 5, "BrokenTradeMessage"),

    /**
     * CorrectedTradeMessage
     */
    CORRECTED_TRADE_MESSAGE((short) 6, "CorrectedTradeMessage"),

    /**
     * SnapshotCompleteMessage
     */
    SNAPSHOT_COMPLETE_MESSAGE((short) 7, "SnapshotCompleteMessage"),

    /**
     * OrderAddedShortMessage
     */
    ORDER_ADDED_SHORT_MESSAGE((short) 10, "OrderAddedShortMessage"),

    /**
     * OrderAddedLongMessage
     */
    ORDER_ADDED_LONG_MESSAGE((short) 11, "OrderAddedLongMessage"),

    /**
     * OrderAddedExtendedMessage
     */
    ORDER_ADDED_EXTENDED_MESSAGE((short) 12, "OrderAddedExtendedMessage"),

    /**
     * OrderDeletedMessage
     */
    ORDER_DELETED_MESSAGE((short) 13, "OrderDeletedMessage"),

    /**
     * OrderReducedMessage
     */
    ORDER_REDUCED_MESSAGE((short) 14, "OrderReducedMessage"),

    /**
     * OrderExecutedMessage
     */
    ORDER_EXECUTED_MESSAGE((short) 15, "OrderExecutedMessage"),

    /**
     * ClearBookMessage
     */
    CLEAR_BOOK_MESSAGE((short) 18, "ClearBookMessage");

    private final short wire;

    private final String description;

    TemplateId(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<TemplateId> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INSTRUMENT_DIRECTORY_MESSAGE);
            case 2 -> Optional.of(INSTRUMENT_TRADING_STATUS_MESSAGE);
            case 3 -> Optional.of(TRADING_SESSION_STATUS_MESSAGE);
            case 5 -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 6 -> Optional.of(CORRECTED_TRADE_MESSAGE);
            case 7 -> Optional.of(SNAPSHOT_COMPLETE_MESSAGE);
            case 10 -> Optional.of(ORDER_ADDED_SHORT_MESSAGE);
            case 11 -> Optional.of(ORDER_ADDED_LONG_MESSAGE);
            case 12 -> Optional.of(ORDER_ADDED_EXTENDED_MESSAGE);
            case 13 -> Optional.of(ORDER_DELETED_MESSAGE);
            case 14 -> Optional.of(ORDER_REDUCED_MESSAGE);
            case 15 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 18 -> Optional.of(CLEAR_BOOK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
