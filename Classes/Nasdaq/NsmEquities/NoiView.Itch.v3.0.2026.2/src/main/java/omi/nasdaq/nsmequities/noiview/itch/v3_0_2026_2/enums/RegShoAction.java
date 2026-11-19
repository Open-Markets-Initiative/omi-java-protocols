package omi.nasdaq.nsmequities.noiview.itch.v3_0_2026_2.enums;

import java.util.Optional;

/**
 * Reg SHO restriction status at time of dissemination
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RegShoAction {

    /**
     * No Price Test In Place
     */
    NO_PRICE_TEST_IN_PLACE('0', "No Price Test In Place"),

    /**
     * Due to intra-day price drop in security
     */
    RESTRICTION_IN_EFFECT('1', "Due to intra-day price drop in security"),

    /**
     * Restriction Remains In Effect
     */
    RESTRICTION_REMAINS_IN_EFFECT('2', "Restriction Remains In Effect");

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
            case '1' -> Optional.of(RESTRICTION_IN_EFFECT);
            case '2' -> Optional.of(RESTRICTION_REMAINS_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
