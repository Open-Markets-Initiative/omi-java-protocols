package omi.nasdaq.nsmequities.lastsaletrftradesfilterview.asciiitch.v2_0_2013.enums;

import java.util.Optional;

/**
 * Denotes the NLS type of system event for which the message is being generated.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Denotes that the NLS system has started its daily transmission schedule.
     */
    START_OF_TRANSMISSIONS('O', "Denotes that the NLS system has started its daily transmission schedule."),

    /**
     * Denotes that the NLS system has ended its daily transmission schedule.
     */
    END_OF_TRANSMISSIONS('C', "Denotes that the NLS system has ended its daily transmission schedule.");

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
            case 'O' -> Optional.of(START_OF_TRANSMISSIONS);
            case 'C' -> Optional.of(END_OF_TRANSMISSIONS);
            default -> Optional.empty();
        };
    }
}
