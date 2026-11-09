package omi.nyse.nationalequities.trades.pillar.v2_6.enums;

import java.util.Optional;

/**
 * Minimum price increment: 0 - All Penny, 1 - Penny/Nickel, 5 - Nickel/Dime.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceResolution {

    /**
     * All Penny
     */
    ALL_PENNY((short) 0, "All Penny"),

    /**
     * Penny Nickel
     */
    PENNY_NICKEL((short) 1, "Penny Nickel"),

    /**
     * Nickel Dime
     */
    NICKEL_DIME((short) 5, "Nickel Dime");

    private final short wire;

    private final String description;

    PriceResolution(short wire, String description) {
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
    public static Optional<PriceResolution> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ALL_PENNY);
            case 1 -> Optional.of(PENNY_NICKEL);
            case 5 -> Optional.of(NICKEL_DIME);
            default -> Optional.empty();
        };
    }
}
