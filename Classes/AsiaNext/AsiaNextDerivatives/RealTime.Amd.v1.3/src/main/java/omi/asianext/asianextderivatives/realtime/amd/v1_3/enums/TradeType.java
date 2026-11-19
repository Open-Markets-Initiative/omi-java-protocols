package omi.asianext.asianextderivatives.realtime.amd.v1_3.enums;

import java.util.Optional;

/**
 * 1 = a trade against visible order quantity in the continuous trading order book
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeType {

    /**
     * A trade against visible order quantity in the continuous trading order book
     */
    VISIBLE((short) 1, "A trade against visible order quantity in the continuous trading order book");

    private final short wire;

    private final String description;

    TradeType(short wire, String description) {
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
    public static Optional<TradeType> fromWire(short wire) {
        return wire == 1 ? Optional.of(VISIBLE) : Optional.empty();
    }
}
