package omi.cboe.cboeeurope.multicastsiquotes.pitch.v6_68.enums;

import java.util.Optional;

/**
 * MMT Level 3.5
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BenchmarkReferencePriceIndicator {

    /**
     * Benchmark Trade If Optionally Set By Reporting Party
     */
    BENCHMARK_TRADE_IF_OPTIONALLY_SET_BY_REPORTING_PARTY('B', "Benchmark Trade If Optionally Set By Reporting Party"),

    /**
     * Reference Price Trade
     */
    REFERENCE_PRICE_TRADE('S', "Reference Price Trade"),

    /**
     * Not Specified
     */
    NOT_SPECIFIED('-', "Not Specified"),

    /**
     * Cont
     */
    CONT('C', "Cont"),

    /**
     * Benc Cont
     */
    BENC_CONT('M', "Benc Cont"),

    /**
     * Port Cont
     */
    PORT_CONT('N', "Port Cont"),

    /**
     * Benc Port Cont
     */
    BENC_PORT_CONT('O', "Benc Port Cont"),

    /**
     * Port
     */
    PORT('P', "Port"),

    /**
     * Benc Port
     */
    BENC_PORT('Y', "Benc Port"),

    /**
     * Clse
     */
    CLSE('1', "Clse"),

    /**
     * Clse Port
     */
    CLSE_PORT('2', "Clse Port"),

    /**
     * Clse Cont
     */
    CLSE_CONT('3', "Clse Cont"),

    /**
     * Clse Port Cont
     */
    CLSE_PORT_CONT('4', "Clse Port Cont");

    private final char wire;

    private final String description;

    BenchmarkReferencePriceIndicator(char wire, String description) {
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
    public static Optional<BenchmarkReferencePriceIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BENCHMARK_TRADE_IF_OPTIONALLY_SET_BY_REPORTING_PARTY);
            case 'S' -> Optional.of(REFERENCE_PRICE_TRADE);
            case '-' -> Optional.of(NOT_SPECIFIED);
            case 'C' -> Optional.of(CONT);
            case 'M' -> Optional.of(BENC_CONT);
            case 'N' -> Optional.of(PORT_CONT);
            case 'O' -> Optional.of(BENC_PORT_CONT);
            case 'P' -> Optional.of(PORT);
            case 'Y' -> Optional.of(BENC_PORT);
            case '1' -> Optional.of(CLSE);
            case '2' -> Optional.of(CLSE_PORT);
            case '3' -> Optional.of(CLSE_CONT);
            case '4' -> Optional.of(CLSE_PORT_CONT);
            default -> Optional.empty();
        };
    }
}
