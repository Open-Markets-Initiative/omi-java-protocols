package omi.cme.ebs.ilink3.sbe.v8_9.enums;

import java.util.Optional;

/**
 * Constant. Type of cross being submitted to a market
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CrossType {

    /**
     * Default product configuration
     */
    CROSS((short) 3, "Default product configuration"),

    /**
     * RFQ + RFC Cross
     */
    R_CROSS((short) 20, "RFQ + RFC Cross"),

    /**
     * Committed Cross
     */
    C_CROSS((short) 21, "Committed Cross");

    private final short wire;

    private final String description;

    CrossType(short wire, String description) {
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
    public static Optional<CrossType> fromWire(short wire) {
        return switch (wire) {
            case 3 -> Optional.of(CROSS);
            case 20 -> Optional.of(R_CROSS);
            case 21 -> Optional.of(C_CROSS);
            default -> Optional.empty();
        };
    }
}
