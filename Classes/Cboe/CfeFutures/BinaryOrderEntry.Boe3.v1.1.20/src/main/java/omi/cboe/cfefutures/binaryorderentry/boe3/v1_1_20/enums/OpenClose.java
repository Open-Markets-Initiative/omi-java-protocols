package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Indicates status of client position in a trade resulting from the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenClose {

    /**
     * Open
     */
    OPEN('O', "Open"),

    /**
     * Close
     */
    CLOSE('C', "Close"),

    /**
     * None
     */
    NONE_N('N', "None"),

    /**
     * NULL (0x00), None
     */
    NONE_0('0', "NULL (0x00), None");

    private final char wire;

    private final String description;

    OpenClose(char wire, String description) {
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
    public static Optional<OpenClose> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPEN);
            case 'C' -> Optional.of(CLOSE);
            case 'N' -> Optional.of(NONE_N);
            case '0' -> Optional.of(NONE_0);
            default -> Optional.empty();
        };
    }
}
