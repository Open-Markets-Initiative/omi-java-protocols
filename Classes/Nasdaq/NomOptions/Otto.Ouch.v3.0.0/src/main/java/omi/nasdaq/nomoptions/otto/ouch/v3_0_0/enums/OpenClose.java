package omi.nasdaq.nomoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * O=Open, C=Closed, space=Carry Forward
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenClose {

    /**
     * Open
     */
    OPEN('O', "Open"),

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Blank Space = Carry Forward
     */
    CARRY_FORWARD(' ', "Blank Space = Carry Forward");

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
            case 'C' -> Optional.of(CLOSED);
            case ' ' -> Optional.of(CARRY_FORWARD);
            default -> Optional.empty();
        };
    }
}
