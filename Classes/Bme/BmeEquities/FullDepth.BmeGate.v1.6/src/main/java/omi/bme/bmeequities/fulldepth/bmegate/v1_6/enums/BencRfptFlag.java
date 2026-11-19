package omi.bme.bmeequities.fulldepth.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Benchmark or Reference Price Indicator MMT
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BencRfptFlag {

    /**
     * Normal Trade
     */
    NORMAL_TRADE(' ', "Normal Trade"),

    /**
     * Benchmark Trade Benc
     */
    BENCHMARK_TRADE_BENC('6', "Benchmark Trade Benc"),

    /**
     * Reference Price Trade Rfpt
     */
    REFERENCE_PRICE_TRADE_RFPT('3', "Reference Price Trade Rfpt"),

    /**
     * Contingency Trade Cont
     */
    CONTINGENCY_TRADE_CONT('C', "Contingency Trade Cont"),

    /**
     * Benc Cont
     */
    BENC_CONT('M', "Benc Cont");

    private final char wire;

    private final String description;

    BencRfptFlag(char wire, String description) {
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
    public static Optional<BencRfptFlag> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NORMAL_TRADE);
            case '6' -> Optional.of(BENCHMARK_TRADE_BENC);
            case '3' -> Optional.of(REFERENCE_PRICE_TRADE_RFPT);
            case 'C' -> Optional.of(CONTINGENCY_TRADE_CONT);
            case 'M' -> Optional.of(BENC_CONT);
            default -> Optional.empty();
        };
    }
}
