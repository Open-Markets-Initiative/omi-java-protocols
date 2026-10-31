package omi.iex.iexequities.deep.iextp.v1_08.enums;

import java.util.Optional;

/**
 * Security event identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityEvent {

    /**
     * Opening Process Complete
     */
    OPENING_PROCESS_COMPLETE('O', "Opening Process Complete"),

    /**
     * Closing Process Complete
     */
    CLOSING_PROCESS_COMPLETE('C', "Closing Process Complete");

    private final char wire;

    private final String description;

    SecurityEvent(char wire, String description) {
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
    public static Optional<SecurityEvent> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPENING_PROCESS_COMPLETE);
            case 'C' -> Optional.of(CLOSING_PROCESS_COMPLETE);
            default -> Optional.empty();
        };
    }
}
