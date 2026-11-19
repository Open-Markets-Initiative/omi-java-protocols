package omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_15.enums;

import java.util.Optional;

/**
 * MMT Level 3.5
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BenchmarkIndicator {

    /**
     * Benchmark Trade If Optionally Set By Reporting Party
     */
    BENCHMARK_TRADE_IF_OPTIONALLY_SET_BY_REPORTING_PARTY('B', "Benchmark Trade If Optionally Set By Reporting Party"),

    /**
     * Not Specified
     */
    NOT_SPECIFIED('-', "Not Specified");

    private final char wire;

    private final String description;

    BenchmarkIndicator(char wire, String description) {
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
    public static Optional<BenchmarkIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BENCHMARK_TRADE_IF_OPTIONALLY_SET_BY_REPORTING_PARTY);
            case '-' -> Optional.of(NOT_SPECIFIED);
            default -> Optional.empty();
        };
    }
}
