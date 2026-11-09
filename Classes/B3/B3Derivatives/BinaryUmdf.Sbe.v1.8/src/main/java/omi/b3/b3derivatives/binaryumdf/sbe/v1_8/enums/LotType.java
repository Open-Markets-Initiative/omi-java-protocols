package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * lotType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LotType {

    /**
     * Odd lot.
     */
    ODD_LOT((short) 1, "Odd lot."),

    /**
     * Round lot.
     */
    ROUND_LOT((short) 2, "Round lot."),

    /**
     * Block lot.
     */
    BLOCK_LOT((short) 3, "Block lot."),

    /**
     * lotType
     */
    NO_VALUE((short) 255, "lotType");

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
            case 1 -> Optional.of(ODD_LOT);
            case 2 -> Optional.of(ROUND_LOT);
            case 3 -> Optional.of(BLOCK_LOT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
