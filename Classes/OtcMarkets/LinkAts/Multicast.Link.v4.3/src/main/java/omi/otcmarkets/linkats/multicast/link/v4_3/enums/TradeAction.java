package omi.otcmarkets.linkats.multicast.link.v4_3.enums;

import java.util.Optional;

/**
 * Trade action indicator.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeAction {

    /**
     * Add trade
     */
    ADD((short) 2, "Add trade");

    private final short wire;

    private final String description;

    TradeAction(short wire, String description) {
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
    public static Optional<TradeAction> fromWire(short wire) {
        return wire == 2 ? Optional.of(ADD) : Optional.empty();
    }
}
