package omi.sgx.titandt.depthofbook.itch.v1_4.enums;

import java.util.Optional;

/**
 * Lot Type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LotType {

    /**
     * Round Lot
     */
    ROUND_LOT((short) 2, "Round Lot");

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
        return wire == 2 ? Optional.of(ROUND_LOT) : Optional.empty();
    }
}
