package omi.nyse.nationalequities.trades.pillar.v2_6.enums;

import java.util.Optional;

/**
 * The delivery method for the requested symbol index mapping information. Valid values: 0 - deliver via UDP.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RetransmitMethod {

    /**
     * Deliver Via Udp
     */
    DELIVER_VIA_UDP((short) 0, "Deliver Via Udp");

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
        return wire == 0 ? Optional.of(DELIVER_VIA_UDP) : Optional.empty();
    }
}
