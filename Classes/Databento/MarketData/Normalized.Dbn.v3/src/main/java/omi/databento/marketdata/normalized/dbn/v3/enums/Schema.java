package omi.databento.marketdata.normalized.dbn.v3.enums;

import java.util.Optional;

/**
 * The data record schema; no value for a file of mixed schemas
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum Schema {

    /**
     * Mbo
     */
    MBO(0, "Mbo"),

    /**
     * Mbp1
     */
    MBP_1(1, "Mbp1"),

    /**
     * Mbp10
     */
    MBP_10(2, "Mbp10"),

    /**
     * Tbbo
     */
    TBBO(3, "Tbbo"),

    /**
     * Trades
     */
    TRADES(4, "Trades"),

    /**
     * Ohlcv1 S
     */
    OHLCV_1S(5, "Ohlcv1 S"),

    /**
     * Ohlcv1 M
     */
    OHLCV_1M(6, "Ohlcv1 M"),

    /**
     * Ohlcv1 H
     */
    OHLCV_1H(7, "Ohlcv1 H"),

    /**
     * Ohlcv1 D
     */
    OHLCV_1D(8, "Ohlcv1 D"),

    /**
     * Definition
     */
    DEFINITION(9, "Definition"),

    /**
     * Statistics
     */
    STATISTICS(10, "Statistics"),

    /**
     * Status
     */
    STATUS(11, "Status"),

    /**
     * Imbalance
     */
    IMBALANCE(12, "Imbalance"),

    /**
     * Ohlcv Eod
     */
    OHLCV_EOD(13, "Ohlcv Eod"),

    /**
     * Cmbp1
     */
    CMBP_1(14, "Cmbp1"),

    /**
     * Cbbo1 S
     */
    CBBO_1S(15, "Cbbo1 S"),

    /**
     * Cbbo1 M
     */
    CBBO_1M(16, "Cbbo1 M"),

    /**
     * Tcbbo
     */
    TCBBO(17, "Tcbbo"),

    /**
     * Bbo1 S
     */
    BBO_1S(18, "Bbo1 S"),

    /**
     * Bbo1 M
     */
    BBO_1M(19, "Bbo1 M"),

    /**
     * The data record schema; no value for a file of mixed schemas
     */
    NO_VALUE(65535, "The data record schema; no value for a file of mixed schemas");

    private final int wire;

    private final String description;

    Schema(int wire, String description) {
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
    public static Optional<Schema> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(MBO);
            case 1 -> Optional.of(MBP_1);
            case 2 -> Optional.of(MBP_10);
            case 3 -> Optional.of(TBBO);
            case 4 -> Optional.of(TRADES);
            case 5 -> Optional.of(OHLCV_1S);
            case 6 -> Optional.of(OHLCV_1M);
            case 7 -> Optional.of(OHLCV_1H);
            case 8 -> Optional.of(OHLCV_1D);
            case 9 -> Optional.of(DEFINITION);
            case 10 -> Optional.of(STATISTICS);
            case 11 -> Optional.of(STATUS);
            case 12 -> Optional.of(IMBALANCE);
            case 13 -> Optional.of(OHLCV_EOD);
            case 14 -> Optional.of(CMBP_1);
            case 15 -> Optional.of(CBBO_1S);
            case 16 -> Optional.of(CBBO_1M);
            case 17 -> Optional.of(TCBBO);
            case 18 -> Optional.of(BBO_1S);
            case 19 -> Optional.of(BBO_1M);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
