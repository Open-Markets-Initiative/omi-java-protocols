package omi.cme.globex.mdp3.sbe.v1_9.enums;

import java.util.Optional;

/**
 * Leg side
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LegSide {

    /**
     * Buy Side
     */
    BUY_SIDE((short) 1, "Buy Side"),

    /**
     * Sell Side
     */
    SELL_SIDE((short) 2, "Sell Side");

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
            case 1 -> Optional.of(BUY_SIDE);
            case 2 -> Optional.of(SELL_SIDE);
            default -> Optional.empty();
        };
    }
}
