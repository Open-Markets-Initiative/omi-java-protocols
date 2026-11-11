package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.enums;

import java.util.Optional;

/**
 * The type of bond. Additional types will be supported in future releases.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityType {

    /**
     * Corporate Bonds
     */
    CORPORATE_BONDS((short) 1, "Corporate Bonds");

    private final short wire;

    private final String description;

    SecurityType(short wire, String description) {
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
    public static Optional<SecurityType> fromWire(short wire) {
        return wire == 1 ? Optional.of(CORPORATE_BONDS) : Optional.empty();
    }
}
