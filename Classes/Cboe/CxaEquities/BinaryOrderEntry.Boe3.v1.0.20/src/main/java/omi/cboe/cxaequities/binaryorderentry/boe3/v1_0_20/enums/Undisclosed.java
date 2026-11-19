package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * If true, indicates an undisclosed order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Undisclosed {

    /**
     * True
     */
    TRUE('Y', "True"),

    /**
     * False
     */
    FALSE('N', "False");

    private final char wire;

    private final String description;

    Undisclosed(char wire, String description) {
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
    public static Optional<Undisclosed> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(TRUE);
            case 'N' -> Optional.of(FALSE);
            default -> Optional.empty();
        };
    }
}
