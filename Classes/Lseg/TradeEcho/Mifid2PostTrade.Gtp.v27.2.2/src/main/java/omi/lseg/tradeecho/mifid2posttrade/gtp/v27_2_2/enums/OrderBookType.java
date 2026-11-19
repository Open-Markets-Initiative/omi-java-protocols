package omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Order book type the status applies to.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderBookType {

    /**
     * Off Book
     */
    OFF_BOOK((short) 2, "Off Book");

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
        return wire == 2 ? Optional.of(OFF_BOOK) : Optional.empty();
    }
}
