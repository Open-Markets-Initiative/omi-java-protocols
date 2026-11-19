package omi.otcmarkets.moonats.retransmission.link.v1_3.enums;

import java.util.Optional;

/**
 * The market tier assigned by OTC Markets Group.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Tier {

    /**
     * No Tier.
     */
    NO_TIER((short) 0, "No Tier.");

    private final short wire;

    private final String description;

    Tier(short wire, String description) {
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
    public static Optional<Tier> fromWire(short wire) {
        return wire == 0 ? Optional.of(NO_TIER) : Optional.empty();
    }
}
