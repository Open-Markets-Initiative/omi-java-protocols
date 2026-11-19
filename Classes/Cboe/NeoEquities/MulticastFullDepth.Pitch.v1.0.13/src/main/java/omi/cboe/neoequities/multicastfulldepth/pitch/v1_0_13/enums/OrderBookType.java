package omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.enums;

import java.util.Optional;

/**
 * Order book to which the trading status applies.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderBookType {

    /**
     * All Books
     */
    ALL_BOOKS((short) 0, "All Books"),

    /**
     * Neo L
     */
    NEO_L((short) 3, "Neo L"),

    /**
     * Neo N
     */
    NEO_N((short) 4, "Neo N"),

    /**
     * Neo D
     */
    NEO_D((short) 5, "Neo D"),

    /**
     * Crossing Facility
     */
    CROSSING_FACILITY((short) 6, "Crossing Facility"),

    /**
     * Sst
     */
    SST((short) 7, "Sst");

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
        return switch (wire) {
            case 0 -> Optional.of(ALL_BOOKS);
            case 3 -> Optional.of(NEO_L);
            case 4 -> Optional.of(NEO_N);
            case 5 -> Optional.of(NEO_D);
            case 6 -> Optional.of(CROSSING_FACILITY);
            case 7 -> Optional.of(SST);
            default -> Optional.empty();
        };
    }
}
