package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Type of matching algorithm
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingPhaseType {

    /**
     * Continuous price and time
     */
    CONTINUOUS_PRICE_TIME((short) 1, "Continuous price and time"),

    /**
     * Continuous time at reference price
     */
    CONTINUOUS_REF_PRICE_TIME((short) 2, "Continuous time at reference price"),

    /**
     * Trade at last
     */
    CONTINUOUS_LAST_AUCTION_TIME((short) 3, "Trade at last"),

    /**
     * Opening auction
     */
    AUCTION_OPENING((short) 4, "Opening auction"),

    /**
     * Block transaction, exact matching
     */
    BLOCK_EXACT_MATCHING((short) 5, "Block transaction, exact matching"),

    /**
     * Trading disabled, no matching
     */
    NO_TRADING_CLOSED((short) 6, "Trading disabled, no matching"),

    /**
     * Uncrossing
     */
    UNCROSSING((short) 7, "Uncrossing"),

    /**
     * Closing auction
     */
    AUCTION_CLOSING((short) 8, "Closing auction"),

    /**
     * Intraday auction
     */
    AUCTION_INTRADAY((short) 9, "Intraday auction"),

    /**
     * Volatility auction after static collars breach
     */
    AUCTION_VOLATILITY_STATIC((short) 10, "Volatility auction after static collars breach"),

    /**
     * Volatility auction after dynamic collars breach
     */
    AUCTION_VOLATILITY_DYNAMIC((short) 11, "Volatility auction after dynamic collars breach"),

    /**
     * Additional volatility auction after static collar breach
     */
    AUCTION_EXTENDED_VOLATILITY_STATIC((short) 12, "Additional volatility auction after static collar breach"),

    /**
     * Additional volatility auction after dynamic collar breach
     */
    AUCTION_EXTENDED_VOLATILITY_DYNAMIC((short) 13, "Additional volatility auction after dynamic collar breach"),

    /**
     * Early Monitoring
     */
    NO_TRADING_EARLY_MONITORING((short) 14, "Early Monitoring"),

    /**
     * Late Monitoring
     */
    NO_TRADING_LATE_MONITORING((short) 15, "Late Monitoring"),

    /**
     * Hybrid normal trading
     */
    HYBRID((short) 16, "Hybrid normal trading"),

    /**
     * Hybrid buy only phase
     */
    HYBRID_BUY_ONLY((short) 17, "Hybrid buy only phase"),

    /**
     * Hybrid pre trade phase
     */
    HYBRID_PRE_TRADE((short) 18, "Hybrid pre trade phase"),

    /**
     * A phase triggered whenever an instrument’s changes its status from RegulatorySuspension or MarketOperationSuspension before entering into continuous phase
     */
    UNSUSPENSION_AUCTION((short) 19, "A phase triggered whenever an instrument\u2019s changes its status from RegulatorySuspension or MarketOperationSuspension before entering into continuous phase"),

    /**
     * Initial public offering phase
     */
    IPO((short) 20, "Initial public offering phase"),

    /**
     * Tender offer phase
     */
    TENDER_OFFER((short) 21, "Tender offer phase"),

    /**
     * Hybrid pre trade BuyOnly phase
     */
    HYBRID_PRE_TRADE_BUY_ONLY((short) 22, "Hybrid pre trade BuyOnly phase"),

    /**
     * Instrument distribution phase
     */
    DISTRIBUTION((short) 23, "Instrument distribution phase");

    private final short wire;

    private final String description;

    TradingPhaseType(short wire, String description) {
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
    public static Optional<TradingPhaseType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CONTINUOUS_PRICE_TIME);
            case 2 -> Optional.of(CONTINUOUS_REF_PRICE_TIME);
            case 3 -> Optional.of(CONTINUOUS_LAST_AUCTION_TIME);
            case 4 -> Optional.of(AUCTION_OPENING);
            case 5 -> Optional.of(BLOCK_EXACT_MATCHING);
            case 6 -> Optional.of(NO_TRADING_CLOSED);
            case 7 -> Optional.of(UNCROSSING);
            case 8 -> Optional.of(AUCTION_CLOSING);
            case 9 -> Optional.of(AUCTION_INTRADAY);
            case 10 -> Optional.of(AUCTION_VOLATILITY_STATIC);
            case 11 -> Optional.of(AUCTION_VOLATILITY_DYNAMIC);
            case 12 -> Optional.of(AUCTION_EXTENDED_VOLATILITY_STATIC);
            case 13 -> Optional.of(AUCTION_EXTENDED_VOLATILITY_DYNAMIC);
            case 14 -> Optional.of(NO_TRADING_EARLY_MONITORING);
            case 15 -> Optional.of(NO_TRADING_LATE_MONITORING);
            case 16 -> Optional.of(HYBRID);
            case 17 -> Optional.of(HYBRID_BUY_ONLY);
            case 18 -> Optional.of(HYBRID_PRE_TRADE);
            case 19 -> Optional.of(UNSUSPENSION_AUCTION);
            case 20 -> Optional.of(IPO);
            case 21 -> Optional.of(TENDER_OFFER);
            case 22 -> Optional.of(HYBRID_PRE_TRADE_BUY_ONLY);
            case 23 -> Optional.of(DISTRIBUTION);
            default -> Optional.empty();
        };
    }
}
