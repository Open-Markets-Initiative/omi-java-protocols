package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.enums;

import java.util.Optional;

/**
 * The delivery method for the requested symbol index mapping information.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RetransmitMethod {

    /**
     * deliver via UDP
     */
    UDP((short) 0, "deliver via UDP");

    private final short wire;

    private final String description;

    RetransmitMethod(short wire, String description) {
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
    public static Optional<RetransmitMethod> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UDP);
            default -> Optional.empty();
        };
    }
}
