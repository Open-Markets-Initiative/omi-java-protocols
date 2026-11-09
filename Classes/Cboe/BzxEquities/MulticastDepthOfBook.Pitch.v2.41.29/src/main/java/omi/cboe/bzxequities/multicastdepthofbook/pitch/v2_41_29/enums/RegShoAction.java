package omi.cboe.bzxequities.multicastdepthofbook.pitch.v2_41_29.enums;

import java.util.Optional;

/**
 * Reg SHO Action Values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RegShoAction {

    /**
     * No Price Test In Effect
     */
    NO_PRICE_TEST_IN_EFFECT('0', "No Price Test In Effect"),

    /**
     * Reg Sho Price Test Restriction In Effect
     */
    REG_SHO_PRICE_TEST_RESTRICTION_IN_EFFECT('1', "Reg Sho Price Test Restriction In Effect");

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
            case '1' -> Optional.of(REG_SHO_PRICE_TEST_RESTRICTION_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
