package omi.lseg.turquoise.analytics.gtp.v26_3.enums;

import java.util.Optional;

/**
 * Order book the status applies to.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderBookType {

    /**
     * Electronic
     */
    ELECTRONIC((short) 3, "Electronic");

    private final short wire;

    private final String description;

    OrderBookType(short wire, String description) {
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
    public static Optional<OrderBookType> fromWire(short wire) {
        return wire == 3 ? Optional.of(ELECTRONIC) : Optional.empty();
    }
}
