package omi.lseg.tradeecho.level2incrementalrecovery.gtp.v26_1_2.enums;

import java.util.Optional;

/**
 * Only considered if the Request Level is 0. If specified, only data related to the specified order book type is provided. If not specified, data for all available book types for the instrument are provided.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderBookType {

    /**
     * Si Quote Book
     */
    SI_QUOTE_BOOK((short) 1, "Si Quote Book");

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
        return wire == 1 ? Optional.of(SI_QUOTE_BOOK) : Optional.empty();
    }
}
