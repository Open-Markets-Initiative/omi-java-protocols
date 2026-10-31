package omi.nasdaq.ntxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Denotes the Reg SHO Short Sale Price Test Restriction status for the issue at the time of the message dissemination.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RegShoAction {

    /**
     * No price test in place
     */
    NO_PRICE_TEST('0', "No price test in place"),

    /**
     * Reg SHO Short Sale Price Test Restriction in effect due to an intra-day price drop in security
     */
    REG_SHO_IN_EFFECT('1', "Reg SHO Short Sale Price Test Restriction in effect due to an intra-day price drop in security"),

    /**
     * Reg SHO Short Sale Price Test Restriction remains in effect
     */
    REG_SHO_REMAINS('2', "Reg SHO Short Sale Price Test Restriction remains in effect");

    private final char wire;

    private final String description;

    RegShoAction(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<RegShoAction> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_PRICE_TEST);
            case '1' -> Optional.of(REG_SHO_IN_EFFECT);
            case '2' -> Optional.of(REG_SHO_REMAINS);
            default -> Optional.empty();
        };
    }
}
