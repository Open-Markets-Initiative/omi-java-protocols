package omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.enums;

import java.util.Optional;

/**
 * Trade report type. Valid only for off-exchange trade reports, space otherwise.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeReportType {

    /**
     * Block Trade
     */
    BLOCK_TRADE('B', "Block Trade"),

    /**
     * Large Portfolio Trade
     */
    LARGE_PORTFOLIO_TRADE('P', "Large Portfolio Trade"),

    /**
     * Large Principal Transaction
     */
    LARGE_PRINCIPAL_TRANSACTION('T', "Large Principal Transaction"),

    /**
     * Trades With Price Improvement
     */
    TRADES_WITH_PRICE_IMPROVEMENT('S', "Trades With Price Improvement"),

    /**
     * Permitted Trade During Post Trading Hours Period
     */
    PERMITTED_TRADE_DURING_POST_TRADING_HOURS_PERIOD('L', "Permitted Trade During Post Trading Hours Period"),

    /**
     * Permitted Trade During Pre Trading Hours Period
     */
    PERMITTED_TRADE_DURING_PRE_TRADING_HOURS_PERIOD('M', "Permitted Trade During Pre Trading Hours Period"),

    /**
     * Out Of Hours Trade
     */
    OUT_OF_HOURS_TRADE('E', "Out Of Hours Trade"),

    /**
     * Etf Trade Report For Unit Creations Or Redemptions
     */
    ETF_TRADE_REPORT_FOR_UNIT_CREATIONS_OR_REDEMPTIONS('F', "Etf Trade Report For Unit Creations Or Redemptions"),

    /**
     * Not Applicable On Exchange
     */
    NOT_APPLICABLE_ON_EXCHANGE(' ', "Not Applicable On Exchange");

    private final char wire;

    private final String description;

    TradeReportType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<TradeReportType> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BLOCK_TRADE);
            case 'P' -> Optional.of(LARGE_PORTFOLIO_TRADE);
            case 'T' -> Optional.of(LARGE_PRINCIPAL_TRANSACTION);
            case 'S' -> Optional.of(TRADES_WITH_PRICE_IMPROVEMENT);
            case 'L' -> Optional.of(PERMITTED_TRADE_DURING_POST_TRADING_HOURS_PERIOD);
            case 'M' -> Optional.of(PERMITTED_TRADE_DURING_PRE_TRADING_HOURS_PERIOD);
            case 'E' -> Optional.of(OUT_OF_HOURS_TRADE);
            case 'F' -> Optional.of(ETF_TRADE_REPORT_FOR_UNIT_CREATIONS_OR_REDEMPTIONS);
            case ' ' -> Optional.of(NOT_APPLICABLE_ON_EXCHANGE);
            default -> Optional.empty();
        };
    }
}
