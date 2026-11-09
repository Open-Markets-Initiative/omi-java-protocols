package omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.enums;

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
     * RegSHORestrictionMessage
     */
    REG_SHO_RESTRICTION_MESSAGE((short) 2, "RegSHORestrictionMessage"),

    /**
     * SecurityTradingStatusMessage
     */
    SECURITY_TRADING_STATUS_MESSAGE((short) 3, "SecurityTradingStatusMessage"),

    /**
     * TradingSessionStatusMessage
     */
    TRADING_SESSION_STATUS_MESSAGE((short) 5, "TradingSessionStatusMessage"),

    /**
     * OrderAddedMessage
     */
    ORDER_ADDED_MESSAGE((short) 10, "OrderAddedMessage"),

    /**
     * OrderDeletedMessage
     */
    ORDER_DELETED_MESSAGE((short) 11, "OrderDeletedMessage"),

    /**
     * OrderReducedMessage
     */
    ORDER_REDUCED_MESSAGE((short) 12, "OrderReducedMessage"),

    /**
     * OrderExecutedMessage
     */
    ORDER_EXECUTED_MESSAGE((short) 13, "OrderExecutedMessage"),

    /**
     * TradeMessage
     */
    TRADE_MESSAGE((short) 14, "TradeMessage"),

    /**
     * BrokenTradeMessage
     */
    BROKEN_TRADE_MESSAGE((short) 15, "BrokenTradeMessage"),

    /**
     * CorrectedTradeMessage
     */
    CORRECTED_TRADE_MESSAGE((short) 16, "CorrectedTradeMessage"),

    /**
     * ClearBookMessage
     */
    CLEAR_BOOK_MESSAGE((short) 18, "ClearBookMessage"),

    /**
     * SnapshotCompleteMessage
     */
    SNAPSHOT_COMPLETE_MESSAGE((short) 100, "SnapshotCompleteMessage");

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
            case 2 -> Optional.of(REG_SHO_RESTRICTION_MESSAGE);
            case 3 -> Optional.of(SECURITY_TRADING_STATUS_MESSAGE);
            case 5 -> Optional.of(TRADING_SESSION_STATUS_MESSAGE);
            case 10 -> Optional.of(ORDER_ADDED_MESSAGE);
            case 11 -> Optional.of(ORDER_DELETED_MESSAGE);
            case 12 -> Optional.of(ORDER_REDUCED_MESSAGE);
            case 13 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 14 -> Optional.of(TRADE_MESSAGE);
            case 15 -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 16 -> Optional.of(CORRECTED_TRADE_MESSAGE);
            case 18 -> Optional.of(CLEAR_BOOK_MESSAGE);
            case 100 -> Optional.of(SNAPSHOT_COMPLETE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
