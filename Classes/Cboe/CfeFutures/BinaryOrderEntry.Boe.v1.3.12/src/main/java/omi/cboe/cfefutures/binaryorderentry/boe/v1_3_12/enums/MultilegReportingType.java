package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

import java.util.Optional;

/**
 * Defines the MultilegReportingType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MultilegReportingType {

    /**
     * Simple instrument execution
     */
    SIMPLE_INSTRUMENT_EXECUTION('1', "Simple instrument execution"),

    /**
     * Simple instrument execution that is part of a Spread execution
     */
    SIMPLE_INSTRUMENT_EXECUTION_THAT_IS_PART_OF_A_SPREAD('2', "Simple instrument execution that is part of a Spread execution"),

    /**
     * Spread instrument execution
     */
    SPREAD_INSTRUMENT_EXECUTION('3', "Spread instrument execution");

    private final char wire;

    private final String description;

    MultilegReportingType(char wire, String description) {
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
    public static Optional<MultilegReportingType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(SIMPLE_INSTRUMENT_EXECUTION);
            case '2' -> Optional.of(SIMPLE_INSTRUMENT_EXECUTION_THAT_IS_PART_OF_A_SPREAD);
            case '3' -> Optional.of(SPREAD_INSTRUMENT_EXECUTION);
            default -> Optional.empty();
        };
    }
}
