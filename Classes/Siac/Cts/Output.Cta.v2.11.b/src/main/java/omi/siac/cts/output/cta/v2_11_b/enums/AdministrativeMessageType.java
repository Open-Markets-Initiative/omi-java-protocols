package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the type of Administrative message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AdministrativeMessageType {

    /**
     * Start Of End Of Day Summary
     */
    START_OF_END_OF_DAY_SUMMARY('A', "Start Of End Of Day Summary"),

    /**
     * End Of End Of Day Summary
     */
    END_OF_END_OF_DAY_SUMMARY('B', "End Of End Of Day Summary"),

    /**
     * Start Of Start Of Day Summary
     */
    START_OF_START_OF_DAY_SUMMARY('C', "Start Of Start Of Day Summary"),

    /**
     * End Of Start Of Day Summary
     */
    END_OF_START_OF_DAY_SUMMARY('D', "End Of Start Of Day Summary"),

    /**
     * Symbol Reference Data
     */
    SYMBOL_REFERENCE_DATA('S', "Symbol Reference Data");

    private final char wire;

    private final String description;

    AdministrativeMessageType(char wire, String description) {
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
    public static Optional<AdministrativeMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(START_OF_END_OF_DAY_SUMMARY);
            case 'B' -> Optional.of(END_OF_END_OF_DAY_SUMMARY);
            case 'C' -> Optional.of(START_OF_START_OF_DAY_SUMMARY);
            case 'D' -> Optional.of(END_OF_START_OF_DAY_SUMMARY);
            case 'S' -> Optional.of(SYMBOL_REFERENCE_DATA);
            default -> Optional.empty();
        };
    }
}
