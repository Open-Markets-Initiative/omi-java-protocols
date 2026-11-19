package omi.jpx.osederivatives.geniuminet.glimpse.v2_2.enums;

import java.util.Optional;

/**
 * An event code is set
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start Of Message Transmission
     */
    START_OF_MESSAGE_TRANSMISSION('O', "Start Of Message Transmission"),

    /**
     * End Of Message Transmission
     */
    END_OF_MESSAGE_TRANSMISSION('C', "End Of Message Transmission");

    private final char wire;

    private final String description;

    EventCode(char wire, String description) {
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
    public static Optional<EventCode> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(START_OF_MESSAGE_TRANSMISSION);
            case 'C' -> Optional.of(END_OF_MESSAGE_TRANSMISSION);
            default -> Optional.empty();
        };
    }
}
