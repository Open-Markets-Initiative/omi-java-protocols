package omi.ltse.ltseequities.memoirlastsale.sbe.v2_0.enums;

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
     * TradeReportMessage
     */
    TRADE_REPORT_MESSAGE((short) 10, "TradeReportMessage"),

    /**
     * TradeCancelMessage
     */
    TRADE_CANCEL_MESSAGE((short) 11, "TradeCancelMessage"),

    /**
     * TradeCorrectMessage
     */
    TRADE_CORRECT_MESSAGE((short) 12, "TradeCorrectMessage"),

    /**
     * AuctionTradeMessage
     */
    AUCTION_TRADE_MESSAGE((short) 13, "AuctionTradeMessage"),

    /**
     * BrokenAuctionTradeMessage
     */
    BROKEN_AUCTION_TRADE_MESSAGE((short) 14, "BrokenAuctionTradeMessage"),

    /**
     * CorrectedAuctionTradeMessage
     */
    CORRECTED_AUCTION_TRADE_MESSAGE((short) 15, "CorrectedAuctionTradeMessage");

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
            case 10 -> Optional.of(TRADE_REPORT_MESSAGE);
            case 11 -> Optional.of(TRADE_CANCEL_MESSAGE);
            case 12 -> Optional.of(TRADE_CORRECT_MESSAGE);
            case 13 -> Optional.of(AUCTION_TRADE_MESSAGE);
            case 14 -> Optional.of(BROKEN_AUCTION_TRADE_MESSAGE);
            case 15 -> Optional.of(CORRECTED_AUCTION_TRADE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
