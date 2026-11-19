package omi.lseg.lse.level1recovery.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Mandatory field if Request Level = 1. Not considered for other Request Levels.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum SourceVenue {

    /**
     * London Stock Exchange
     */
    LONDON_STOCK_EXCHANGE(1, "London Stock Exchange");

    private final int wire;

    private final String description;

    SourceVenue(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<SourceVenue> fromWire(int wire) {
        return wire == 1 ? Optional.of(LONDON_STOCK_EXCHANGE) : Optional.empty();
    }
}
