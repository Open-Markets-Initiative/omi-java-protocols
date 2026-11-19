package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Order book the status relates to.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SubBook {

    /**
     * Regular
     */
    REGULAR((short) 1, "Regular"),

    /**
     * Off Book
     */
    OFF_BOOK((short) 2, "Off Book"),

    /**
     * Odd Lot
     */
    ODD_LOT((short) 3, "Odd Lot"),

    /**
     * Block Trade
     */
    BLOCK_TRADE((short) 4, "Block Trade"),

    /**
     * All Or None
     */
    ALL_OR_NONE((short) 5, "All Or None"),

    /**
     * Early Settlement
     */
    EARLY_SETTLEMENT((short) 6, "Early Settlement"),

    /**
     * Auction
     */
    AUCTION((short) 7, "Auction"),

    /**
     * Bulletin Board
     */
    BULLETIN_BOARD((short) 9, "Bulletin Board");

    private final short wire;

    private final String description;

    SubBook(short wire, String description) {
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
    public static Optional<SubBook> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(REGULAR);
            case 2 -> Optional.of(OFF_BOOK);
            case 3 -> Optional.of(ODD_LOT);
            case 4 -> Optional.of(BLOCK_TRADE);
            case 5 -> Optional.of(ALL_OR_NONE);
            case 6 -> Optional.of(EARLY_SETTLEMENT);
            case 7 -> Optional.of(AUCTION);
            case 9 -> Optional.of(BULLETIN_BOARD);
            default -> Optional.empty();
        };
    }
}
