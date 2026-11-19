package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * 0=None, 1=AON
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecFlag {

    /**
     * None
     */
    NONE('0', "None"),

    /**
     * AON
     */
    AON('1', "AON");

    private final char wire;

    private final String description;

    ExecFlag(char wire, String description) {
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
    public static Optional<ExecFlag> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NONE);
            case '1' -> Optional.of(AON);
            default -> Optional.empty();
        };
    }
}
