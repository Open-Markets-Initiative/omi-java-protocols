package omi.jpx.osederivatives.geniuminet.itch.v5_0_6.enums;

import java.util.Optional;

/**
 * Lot Type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LotType {

    /**
     * Undefined
     */
    UNDEFINED((short) 0, "Undefined"),

    /**
     * Odd Lot
     */
    ODD_LOT((short) 1, "Odd Lot"),

    /**
     * Round Lot
     */
    ROUND_LOT((short) 2, "Round Lot"),

    /**
     * Block Lot
     */
    BLOCK_LOT((short) 3, "Block Lot"),

    /**
     * All Or None Lot
     */
    ALL_OR_NONE_LOT((short) 4, "All Or None Lot");

    private final short wire;

    private final String description;

    LotType(short wire, String description) {
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
    public static Optional<LotType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNDEFINED);
            case 1 -> Optional.of(ODD_LOT);
            case 2 -> Optional.of(ROUND_LOT);
            case 3 -> Optional.of(BLOCK_LOT);
            case 4 -> Optional.of(ALL_OR_NONE_LOT);
            default -> Optional.empty();
        };
    }
}
