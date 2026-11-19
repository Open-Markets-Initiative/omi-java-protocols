package omi.lseg.tradeecho.level2incrementalreplay.gtp.v26_1_2.enums;

import java.util.Optional;

/**
 * Type of the order.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderType {

    /**
     * Si Quote
     */
    SI_QUOTE((short) 0, "Si Quote");

    private final short wire;

    private final String description;

    OrderType(short wire, String description) {
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
    public static Optional<OrderType> fromWire(short wire) {
        return wire == 0 ? Optional.of(SI_QUOTE) : Optional.empty();
    }
}
