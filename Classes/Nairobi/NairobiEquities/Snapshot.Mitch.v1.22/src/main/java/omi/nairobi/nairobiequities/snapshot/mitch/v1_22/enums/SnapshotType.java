package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Type of snapshot being requested.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SnapshotType {

    /**
     * Order Book
     */
    ORDER_BOOK((short) 0, "Order Book"),

    /**
     * Symbol Status
     */
    SYMBOL_STATUS((short) 1, "Symbol Status"),

    /**
     * Instrument
     */
    INSTRUMENT((short) 2, "Instrument"),

    /**
     * Trades
     */
    TRADES((short) 3, "Trades"),

    /**
     * Book Level Statistics
     */
    BOOK_LEVEL_STATISTICS((short) 4, "Book Level Statistics"),

    /**
     * News
     */
    NEWS((short) 5, "News"),

    /**
     * Top Of Book
     */
    TOP_OF_BOOK((short) 8, "Top Of Book");

    private final short wire;

    private final String description;

    SnapshotType(short wire, String description) {
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
    public static Optional<SnapshotType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ORDER_BOOK);
            case 1 -> Optional.of(SYMBOL_STATUS);
            case 2 -> Optional.of(INSTRUMENT);
            case 3 -> Optional.of(TRADES);
            case 4 -> Optional.of(BOOK_LEVEL_STATISTICS);
            case 5 -> Optional.of(NEWS);
            case 8 -> Optional.of(TOP_OF_BOOK);
            default -> Optional.empty();
        };
    }
}
