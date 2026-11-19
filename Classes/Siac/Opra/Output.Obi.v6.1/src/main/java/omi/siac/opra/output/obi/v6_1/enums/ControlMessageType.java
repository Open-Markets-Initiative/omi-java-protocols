package omi.siac.opra.output.obi.v6_1.enums;

import java.util.Optional;

/**
 * Control Message Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ControlMessageType {

    /**
     * Start of Day
     */
    START_OF_DAY('C', "Start of Day"),

    /**
     * Start of Summary
     */
    START_OF_SUMMARY('E', "Start of Summary"),

    /**
     * End of Summary
     */
    END_OF_SUMMARY('F', "End of Summary"),

    /**
     * End of Day
     */
    END_OF_DAY('J', "End of Day"),

    /**
     * Reset Block Sequence Number
     */
    RESET_BLOCK_SEQUENCE_NUMBER('K', "Reset Block Sequence Number"),

    /**
     * Start of Open Interest
     */
    START_OF_OPEN_INTEREST('L', "Start of Open Interest"),

    /**
     * End of Open Interest
     */
    END_OF_OPEN_INTEREST('M', "End of Open Interest"),

    /**
     * Line Integrity
     */
    LINE_INTEGRITY('N', "Line Integrity"),

    /**
     * Disaster Recovery Data Center Activation
     */
    DISASTER_RECOVERY_DATA_CENTER_ACTIVATION('P', "Disaster Recovery Data Center Activation"),

    /**
     * Start of Test Cycle
     */
    START_OF_TEST_CYCLE('A', "Start of Test Cycle"),

    /**
     * End of Test Cycle
     */
    END_OF_TEST_CYCLE('B', "End of Test Cycle"),

    /**
     * Good Morning
     */
    GOOD_MORNING('D', "Good Morning"),

    /**
     * Early Market Close
     */
    EARLY_MARKET_CLOSE('G', "Early Market Close"),

    /**
     * End of Transaction Reporting
     */
    END_OF_TRANSACTION_REPORTING('H', "End of Transaction Reporting"),

    /**
     * Good Night
     */
    GOOD_NIGHT('I', "Good Night");

    private final char wire;

    private final String description;

    ControlMessageType(char wire, String description) {
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
    public static Optional<ControlMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(START_OF_DAY);
            case 'E' -> Optional.of(START_OF_SUMMARY);
            case 'F' -> Optional.of(END_OF_SUMMARY);
            case 'J' -> Optional.of(END_OF_DAY);
            case 'K' -> Optional.of(RESET_BLOCK_SEQUENCE_NUMBER);
            case 'L' -> Optional.of(START_OF_OPEN_INTEREST);
            case 'M' -> Optional.of(END_OF_OPEN_INTEREST);
            case 'N' -> Optional.of(LINE_INTEGRITY);
            case 'P' -> Optional.of(DISASTER_RECOVERY_DATA_CENTER_ACTIVATION);
            case 'A' -> Optional.of(START_OF_TEST_CYCLE);
            case 'B' -> Optional.of(END_OF_TEST_CYCLE);
            case 'D' -> Optional.of(GOOD_MORNING);
            case 'G' -> Optional.of(EARLY_MARKET_CLOSE);
            case 'H' -> Optional.of(END_OF_TRANSACTION_REPORTING);
            case 'I' -> Optional.of(GOOD_NIGHT);
            default -> Optional.empty();
        };
    }
}
