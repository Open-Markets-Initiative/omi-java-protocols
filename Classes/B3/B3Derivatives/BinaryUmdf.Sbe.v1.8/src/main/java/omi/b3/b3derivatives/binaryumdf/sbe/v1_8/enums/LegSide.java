package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Side of this leg.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LegSide {

    /**
     * BUY
     */
    BUY((short) 1, "BUY"),

    /**
     * SELL
     */
    SELL((short) 2, "SELL");

    private final short wire;

    private final String description;

    LegSide(short wire, String description) {
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
    public static Optional<LegSide> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(BUY);
            case 2 -> Optional.of(SELL);
            default -> Optional.empty();
        };
    }
}
