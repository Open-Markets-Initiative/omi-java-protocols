package omi.lseg.lse.level2mbo.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Start or end of day event code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * End Of Day
     */
    END_OF_DAY('C', "End Of Day"),

    /**
     * Start Of Day
     */
    START_OF_DAY('O', "Start Of Day");

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
            case 'C' -> Optional.of(END_OF_DAY);
            case 'O' -> Optional.of(START_OF_DAY);
            default -> Optional.empty();
        };
    }
}
