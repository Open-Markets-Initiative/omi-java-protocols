package omi.databento.marketdata.normalized.dbn.v3.enums;

import java.util.Optional;

/**
 * The record type, which selects the record that follows the header
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Rtype {

    /**
     * Market By Price 0
     */
    MARKET_BY_PRICE_0((short) 0, "Market By Price 0"),

    /**
     * Market By Price 1
     */
    MARKET_BY_PRICE_1((short) 1, "Market By Price 1"),

    /**
     * Market By Price 10
     */
    MARKET_BY_PRICE_10((short) 10, "Market By Price 10"),

    /**
     * Ohlcv Deprecated
     */
    OHLCV_DEPRECATED((short) 17, "Ohlcv Deprecated"),

    /**
     * Status
     */
    STATUS((short) 18, "Status"),

    /**
     * Instrument Definition
     */
    INSTRUMENT_DEFINITION((short) 19, "Instrument Definition"),

    /**
     * Imbalance
     */
    IMBALANCE((short) 20, "Imbalance"),

    /**
     * Error
     */
    ERROR((short) 21, "Error"),

    /**
     * Symbol Mapping
     */
    SYMBOL_MAPPING((short) 22, "Symbol Mapping"),

    /**
     * System
     */
    SYSTEM((short) 23, "System"),

    /**
     * Statistics
     */
    STATISTICS((short) 24, "Statistics"),

    /**
     * Ohlcv 1 Second
     */
    OHLCV_1_SECOND((short) 32, "Ohlcv 1 Second"),

    /**
     * Ohlcv 1 Minute
     */
    OHLCV_1_MINUTE((short) 33, "Ohlcv 1 Minute"),

    /**
     * Ohlcv 1 Hour
     */
    OHLCV_1_HOUR((short) 34, "Ohlcv 1 Hour"),

    /**
     * Ohlcv 1 Day
     */
    OHLCV_1_DAY((short) 35, "Ohlcv 1 Day"),

    /**
     * Ohlcv End Of Day
     */
    OHLCV_END_OF_DAY((short) 36, "Ohlcv End Of Day"),

    /**
     * Market By Order
     */
    MARKET_BY_ORDER((short) 160, "Market By Order"),

    /**
     * Consolidated Market By Price 1
     */
    CONSOLIDATED_MARKET_BY_PRICE_1((short) 177, "Consolidated Market By Price 1"),

    /**
     * Consolidated Bbo 1 Second
     */
    CONSOLIDATED_BBO_1_SECOND((short) 192, "Consolidated Bbo 1 Second"),

    /**
     * Consolidated Bbo 1 Minute
     */
    CONSOLIDATED_BBO_1_MINUTE((short) 193, "Consolidated Bbo 1 Minute"),

    /**
     * Trade With Consolidated Bbo
     */
    TRADE_WITH_CONSOLIDATED_BBO((short) 194, "Trade With Consolidated Bbo"),

    /**
     * Bbo 1 Second
     */
    BBO_1_SECOND((short) 195, "Bbo 1 Second"),

    /**
     * Bbo 1 Minute
     */
    BBO_1_MINUTE((short) 196, "Bbo 1 Minute");

    private final short wire;

    private final String description;

    Rtype(short wire, String description) {
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
    public static Optional<Rtype> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(MARKET_BY_PRICE_0);
            case 1 -> Optional.of(MARKET_BY_PRICE_1);
            case 10 -> Optional.of(MARKET_BY_PRICE_10);
            case 17 -> Optional.of(OHLCV_DEPRECATED);
            case 18 -> Optional.of(STATUS);
            case 19 -> Optional.of(INSTRUMENT_DEFINITION);
            case 20 -> Optional.of(IMBALANCE);
            case 21 -> Optional.of(ERROR);
            case 22 -> Optional.of(SYMBOL_MAPPING);
            case 23 -> Optional.of(SYSTEM);
            case 24 -> Optional.of(STATISTICS);
            case 32 -> Optional.of(OHLCV_1_SECOND);
            case 33 -> Optional.of(OHLCV_1_MINUTE);
            case 34 -> Optional.of(OHLCV_1_HOUR);
            case 35 -> Optional.of(OHLCV_1_DAY);
            case 36 -> Optional.of(OHLCV_END_OF_DAY);
            case 160 -> Optional.of(MARKET_BY_ORDER);
            case 177 -> Optional.of(CONSOLIDATED_MARKET_BY_PRICE_1);
            case 192 -> Optional.of(CONSOLIDATED_BBO_1_SECOND);
            case 193 -> Optional.of(CONSOLIDATED_BBO_1_MINUTE);
            case 194 -> Optional.of(TRADE_WITH_CONSOLIDATED_BBO);
            case 195 -> Optional.of(BBO_1_SECOND);
            case 196 -> Optional.of(BBO_1_MINUTE);
            default -> Optional.empty();
        };
    }
}
