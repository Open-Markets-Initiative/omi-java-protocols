package omi.cme.globex.mdp3.sbe.v1_5.enums;

import java.util.Optional;

/**
 * Indicates aggressor side in the trade, if value is 0 then there is no aggressor
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AggressorSide {

    /**
     * Indicates aggressor side in the trade, if value is 0 then there is no aggressor
     */
    NO_VALUE((short) 255, "Indicates aggressor side in the trade, if value is 0 then there is no aggressor"),

    /**
     * No Aggressor
     */
    NO_AGGRESSOR((short) 0, "No Aggressor"),

    /**
     * Buy
     */
    BUY((short) 1, "Buy"),

    /**
     * Sell
     */
    SELL((short) 2, "Sell");

    private final short wire;

    private final String description;

    AggressorSide(short wire, String description) {
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
    public static Optional<AggressorSide> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(NO_AGGRESSOR);
            case 1 -> Optional.of(BUY);
            case 2 -> Optional.of(SELL);
            default -> Optional.empty();
        };
    }
}
