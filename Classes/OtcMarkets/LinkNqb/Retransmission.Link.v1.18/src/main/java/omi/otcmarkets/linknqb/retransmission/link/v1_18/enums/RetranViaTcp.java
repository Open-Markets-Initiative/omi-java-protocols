package omi.otcmarkets.linknqb.retransmission.link.v1_18.enums;

import java.util.Optional;

/**
 * "Y" - sent back on the same TCP channel.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RetranViaTcp {

    /**
     * "Y" - sent back on the same TCP channel.
     */
    SAME_TCP_CHANNEL((short) 89, "\"Y\" - sent back on the same TCP channel.");

    private final short wire;

    private final String description;

    RetranViaTcp(short wire, String description) {
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
    public static Optional<RetranViaTcp> fromWire(short wire) {
        return wire == 89 ? Optional.of(SAME_TCP_CHANNEL) : Optional.empty();
    }
}
