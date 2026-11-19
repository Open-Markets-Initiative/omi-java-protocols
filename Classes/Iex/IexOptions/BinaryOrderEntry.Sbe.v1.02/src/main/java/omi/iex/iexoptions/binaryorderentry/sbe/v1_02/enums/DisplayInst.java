package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * displayInst
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum DisplayInst {

    /**
     * PostOnly
     */
    POST_ONLY((byte) 1, "PostOnly");

    private final byte wire;

    private final String description;

    DisplayInst(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<DisplayInst> fromWire(byte wire) {
        return wire == 1 ? Optional.of(POST_ONLY) : Optional.empty();
    }
}
