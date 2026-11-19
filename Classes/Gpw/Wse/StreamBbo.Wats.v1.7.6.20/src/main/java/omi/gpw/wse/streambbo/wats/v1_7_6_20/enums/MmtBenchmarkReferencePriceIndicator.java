package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Benchmark / Reference Price Indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtBenchmarkReferencePriceIndicator {

    /**
     * B = Benchmark Trade
     */
    BENCHMARK_TRADE((short) 1, "B = Benchmark Trade"),

    /**
     * S = Reference Price Trade
     */
    REFERENCE_PRICE_TRADE((short) 2, "S = Reference Price Trade"),

    /**
     * - = No Benchmark or Reference Price Trade
     */
    NO_BENCHMARKOR_REFERENCE_PRICE_TRADE((short) 3, "- = No Benchmark or Reference Price Trade");

    private final short wire;

    private final String description;

    MmtBenchmarkReferencePriceIndicator(short wire, String description) {
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
    public static Optional<MmtBenchmarkReferencePriceIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(BENCHMARK_TRADE);
            case 2 -> Optional.of(REFERENCE_PRICE_TRADE);
            case 3 -> Optional.of(NO_BENCHMARKOR_REFERENCE_PRICE_TRADE);
            default -> Optional.empty();
        };
    }
}
