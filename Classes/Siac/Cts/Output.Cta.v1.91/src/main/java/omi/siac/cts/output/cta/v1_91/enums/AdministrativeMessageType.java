package omi.siac.cts.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Administrative message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AdministrativeMessageType {

    /**
     * Start Of End Of Day Message
     */
    START_OF_END_OF_DAY_MESSAGE('A', "Start Of End Of Day Message"),

    /**
     * End Of End Of Day Message
     */
    END_OF_END_OF_DAY_MESSAGE('B', "End Of End Of Day Message"),

    /**
     * Start Of Start Of Day Message
     */
    START_OF_START_OF_DAY_MESSAGE('C', "Start Of Start Of Day Message"),

    /**
     * End Of Start Of Day Message
     */
    END_OF_START_OF_DAY_MESSAGE('D', "End Of Start Of Day Message"),

    /**
     * Administrative Unformatted Message
     */
    ADMINISTRATIVE_UNFORMATTED_MESSAGE('H', "Administrative Unformatted Message");

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
            case 'A' -> Optional.of(START_OF_END_OF_DAY_MESSAGE);
            case 'B' -> Optional.of(END_OF_END_OF_DAY_MESSAGE);
            case 'C' -> Optional.of(START_OF_START_OF_DAY_MESSAGE);
            case 'D' -> Optional.of(END_OF_START_OF_DAY_MESSAGE);
            case 'H' -> Optional.of(ADMINISTRATIVE_UNFORMATTED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
