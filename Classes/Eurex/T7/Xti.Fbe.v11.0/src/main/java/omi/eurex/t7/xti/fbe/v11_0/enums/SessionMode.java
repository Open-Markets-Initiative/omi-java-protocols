package omi.eurex.t7.xti.fbe.v11_0.enums;

import java.util.Optional;

/**
 * Defines the SessionMode values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SessionMode {

    /**
     * ETI HF
     */
    ETIHF((short) 1, "ETI HF"),

    /**
     * ETI LF
     */
    ETILF((short) 2, "ETI LF"),

    /**
     * GUI
     */
    GUI((short) 3, "GUI"),

    /**
     * FIX LF
     */
    FIXLF((short) 4, "FIX LF"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    SessionMode(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<SessionMode> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ETIHF);
            case 2 -> Optional.of(ETILF);
            case 3 -> Optional.of(GUI);
            case 4 -> Optional.of(FIXLF);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
