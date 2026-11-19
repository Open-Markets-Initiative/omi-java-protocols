package omi.cboe.cfefutures.binaryorderentry.boe.v1_3.enums;

import java.util.Optional;

/**
 * Defines the ManualOrderIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ManualOrderIndicator {

    /**
     * Manual Order Entry
     */
    MANUAL_ORDER_ENTRY('Y', "Manual Order Entry"),

    /**
     * Automated Order Entry
     */
    AUTOMATED_ORDER_ENTRY('N', "Automated Order Entry"),

    /**
     * Simple Instrument Execution
     */
    SIMPLE_INSTRUMENT_EXECUTION('1', "Simple Instrument Execution"),

    /**
     * Simple Instrument Execution That Is Part Of A Spread Execution
     */
    SIMPLE_INSTRUMENT_EXECUTION_THAT_IS_PART_OF_A_SPREAD_EXECUTION('2', "Simple Instrument Execution That Is Part Of A Spread Execution"),

    /**
     * Spread Instrument Execution
     */
    SPREAD_INSTRUMENT_EXECUTION('3', "Spread Instrument Execution");

    private final char wire;

    private final String description;

    ManualOrderIndicator(char wire, String description) {
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
    public static Optional<ManualOrderIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(MANUAL_ORDER_ENTRY);
            case 'N' -> Optional.of(AUTOMATED_ORDER_ENTRY);
            case '1' -> Optional.of(SIMPLE_INSTRUMENT_EXECUTION);
            case '2' -> Optional.of(SIMPLE_INSTRUMENT_EXECUTION_THAT_IS_PART_OF_A_SPREAD_EXECUTION);
            case '3' -> Optional.of(SPREAD_INSTRUMENT_EXECUTION);
            default -> Optional.empty();
        };
    }
}
