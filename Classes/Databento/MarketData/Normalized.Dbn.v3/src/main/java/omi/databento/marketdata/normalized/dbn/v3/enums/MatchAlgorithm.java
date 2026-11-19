package omi.databento.marketdata.normalized.dbn.v3.enums;

import java.util.Optional;

/**
 * The matching algorithm used for the instrument, typically FIFO
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MatchAlgorithm {

    /**
     * Undefined
     */
    UNDEFINED(' ', "Undefined"),

    /**
     * Allocation
     */
    ALLOCATION('A', "Allocation"),

    /**
     * Pro Rata
     */
    PRO_RATA('C', "Pro Rata"),

    /**
     * Fifo
     */
    FIFO('F', "Fifo"),

    /**
     * Configurable
     */
    CONFIGURABLE('K', "Configurable"),

    /**
     * Threshold Pro Rata
     */
    THRESHOLD_PRO_RATA('O', "Threshold Pro Rata"),

    /**
     * Time Pro Rata
     */
    TIME_PRO_RATA('P', "Time Pro Rata"),

    /**
     * Threshold Pro Rata Lmm
     */
    THRESHOLD_PRO_RATA_LMM('Q', "Threshold Pro Rata Lmm"),

    /**
     * Fifo Top Lmm
     */
    FIFO_TOP_LMM('S', "Fifo Top Lmm"),

    /**
     * Fifo Lmm
     */
    FIFO_LMM('T', "Fifo Lmm"),

    /**
     * Institutional Prioritization
     */
    INSTITUTIONAL_PRIORITIZATION('V', "Institutional Prioritization"),

    /**
     * Eurodollar Futures
     */
    EURODOLLAR_FUTURES('Y', "Eurodollar Futures");

    private final char wire;

    private final String description;

    MatchAlgorithm(char wire, String description) {
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
    public static Optional<MatchAlgorithm> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(UNDEFINED);
            case 'A' -> Optional.of(ALLOCATION);
            case 'C' -> Optional.of(PRO_RATA);
            case 'F' -> Optional.of(FIFO);
            case 'K' -> Optional.of(CONFIGURABLE);
            case 'O' -> Optional.of(THRESHOLD_PRO_RATA);
            case 'P' -> Optional.of(TIME_PRO_RATA);
            case 'Q' -> Optional.of(THRESHOLD_PRO_RATA_LMM);
            case 'S' -> Optional.of(FIFO_TOP_LMM);
            case 'T' -> Optional.of(FIFO_LMM);
            case 'V' -> Optional.of(INSTITUTIONAL_PRIORITIZATION);
            case 'Y' -> Optional.of(EURODOLLAR_FUTURES);
            default -> Optional.empty();
        };
    }
}
