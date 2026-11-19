package omi.otcmarkets.overnight.depthofbook.link.v1_0.enums;

import java.util.Optional;

/**
 * Spin type.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SpinType {

    /**
     * Reference.
     */
    REFERENCE((short) 1, "Reference.");

    private final short wire;

    private final String description;

    SpinType(short wire, String description) {
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
    public static Optional<SpinType> fromWire(short wire) {
        return wire == 1 ? Optional.of(REFERENCE) : Optional.empty();
    }
}
