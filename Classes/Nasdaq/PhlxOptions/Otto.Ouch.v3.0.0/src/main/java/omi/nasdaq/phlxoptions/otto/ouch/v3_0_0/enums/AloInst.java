package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * N=Not ALO, Y=ALO
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AloInst {

    /**
     * Not ALO
     */
    NOT_ALO('N', "Not ALO"),

    /**
     * ALO
     */
    ALO('Y', "ALO");

    private final char wire;

    private final String description;

    AloInst(char wire, String description) {
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
    public static Optional<AloInst> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NOT_ALO);
            case 'Y' -> Optional.of(ALO);
            default -> Optional.empty();
        };
    }
}
