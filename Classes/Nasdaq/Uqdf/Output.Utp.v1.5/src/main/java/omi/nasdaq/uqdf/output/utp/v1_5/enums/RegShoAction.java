package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Reg SHO Action
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RegShoAction {

    /**
     * No price test in effect
     */
    NO_PRICE_TEST_IN_EFFECT('0', "No price test in effect"),

    /**
     * Reg SHO in effect due to an intra day price drop
     */
    REG_SHO_IN_EFFECT_DUE_TO_AN_INTRA_DAY_PRICE_DROP('1', "Reg SHO in effect due to an intra day price drop"),

    /**
     * Reg SHO Restriction remains in effect
     */
    REG_SHO_RESTRICTION_REMAINS_IN_EFFECT('2', "Reg SHO Restriction remains in effect");

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
            case '0' -> Optional.of(NO_PRICE_TEST_IN_EFFECT);
            case '1' -> Optional.of(REG_SHO_IN_EFFECT_DUE_TO_AN_INTRA_DAY_PRICE_DROP);
            case '2' -> Optional.of(REG_SHO_RESTRICTION_REMAINS_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
