package omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Reference price indicator short code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReferencePriceIndicator {

    /**
     * Benchmark Trade
     */
    BENCHMARK_TRADE('B', "Benchmark Trade"),

    /**
     * Reference Price Trade
     */
    REFERENCE_PRICE_TRADE('S', "Reference Price Trade"),

    /**
     * Benchmark Trade And Portfolio Transaction And Contingent Transaction
     */
    BENCHMARK_TRADE_AND_PORTFOLIO_TRANSACTION_AND_CONTINGENT_TRANSACTION('O', "Benchmark Trade And Portfolio Transaction And Contingent Transaction"),

    /**
     * Portfolio Transaction And Contingent Transaction
     */
    PORTFOLIO_TRANSACTION_AND_CONTINGENT_TRANSACTION('N', "Portfolio Transaction And Contingent Transaction"),

    /**
     * Benchmark Trade And Contingent Transaction
     */
    BENCHMARK_TRADE_AND_CONTINGENT_TRANSACTION('M', "Benchmark Trade And Contingent Transaction"),

    /**
     * Benchmark Trade And Portfolio Transaction
     */
    BENCHMARK_TRADE_AND_PORTFOLIO_TRANSACTION('Y', "Benchmark Trade And Portfolio Transaction"),

    /**
     * Contingent Transaction
     */
    CONTINGENT_TRANSACTION('C', "Contingent Transaction"),

    /**
     * Portfolio Transaction
     */
    PORTFOLIO_TRANSACTION('P', "Portfolio Transaction"),

    /**
     * Market Closing Price
     */
    MARKET_CLOSING_PRICE('1', "Market Closing Price"),

    /**
     * Market Closing Price And Portfolio Transaction
     */
    MARKET_CLOSING_PRICE_AND_PORTFOLIO_TRANSACTION('2', "Market Closing Price And Portfolio Transaction"),

    /**
     * Reference Price Trade And Market Closing Price
     */
    REFERENCE_PRICE_TRADE_AND_MARKET_CLOSING_PRICE('6', "Reference Price Trade And Market Closing Price"),

    /**
     * Not A Reference Price Trade
     */
    NOT_A_REFERENCE_PRICE_TRADE('-', "Not A Reference Price Trade");

    private final char wire;

    private final String description;

    ReferencePriceIndicator(char wire, String description) {
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
    public static Optional<ReferencePriceIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BENCHMARK_TRADE);
            case 'S' -> Optional.of(REFERENCE_PRICE_TRADE);
            case 'O' -> Optional.of(BENCHMARK_TRADE_AND_PORTFOLIO_TRANSACTION_AND_CONTINGENT_TRANSACTION);
            case 'N' -> Optional.of(PORTFOLIO_TRANSACTION_AND_CONTINGENT_TRANSACTION);
            case 'M' -> Optional.of(BENCHMARK_TRADE_AND_CONTINGENT_TRANSACTION);
            case 'Y' -> Optional.of(BENCHMARK_TRADE_AND_PORTFOLIO_TRANSACTION);
            case 'C' -> Optional.of(CONTINGENT_TRANSACTION);
            case 'P' -> Optional.of(PORTFOLIO_TRANSACTION);
            case '1' -> Optional.of(MARKET_CLOSING_PRICE);
            case '2' -> Optional.of(MARKET_CLOSING_PRICE_AND_PORTFOLIO_TRANSACTION);
            case '6' -> Optional.of(REFERENCE_PRICE_TRADE_AND_MARKET_CLOSING_PRICE);
            case '-' -> Optional.of(NOT_A_REFERENCE_PRICE_TRADE);
            default -> Optional.empty();
        };
    }
}
