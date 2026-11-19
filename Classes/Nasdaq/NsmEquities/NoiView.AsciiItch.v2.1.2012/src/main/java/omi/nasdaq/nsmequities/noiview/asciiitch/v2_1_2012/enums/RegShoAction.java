package omi.nasdaq.nsmequities.noiview.asciiitch.v2_1_2012.enums;

import java.util.Optional;

/**
 * Denotes the Reg SHO Short Sale Price Test Restriction status for the issue.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RegShoAction {

    /**
     * No Price Test In Place
     */
    NO_PRICE_TEST_IN_PLACE('0', "No Price Test In Place"),

    /**
     * Reg Sho Short Sale Price Test Restriction In Effect Due To An Intraday Price Drop In Security
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTION_IN_EFFECT_DUE_TO_AN_INTRADAY_PRICE_DROP_IN_SECURITY('1', "Reg Sho Short Sale Price Test Restriction In Effect Due To An Intraday Price Drop In Security"),

    /**
     * Reg Sho Short Sale Price Test Restriction Remains In Effect
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTION_REMAINS_IN_EFFECT('2', "Reg Sho Short Sale Price Test Restriction Remains In Effect");

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
            case '0' -> Optional.of(NO_PRICE_TEST_IN_PLACE);
            case '1' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTION_IN_EFFECT_DUE_TO_AN_INTRADAY_PRICE_DROP_IN_SECURITY);
            case '2' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTION_REMAINS_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
