package omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.enums;

import java.util.Optional;

/**
 * The original sale condition code level 4, Sro Trade Detail Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OriginalSaleCondition4 {

    /**
     * PriceVariation
     */
    PRICE_VARIATION('H', "PriceVariation"),

    /**
     * OddLot
     */
    ODD_LOT('I', "OddLot"),

    /**
     * Cross
     */
    CROSS('X', "Cross"),

    /**
     * NotApplicable
     */
    NOT_APPLICABLE(' ', "NotApplicable");

    private final char wire;

    private final String description;

    OriginalSaleCondition4(char wire, String description) {
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
    public static Optional<OriginalSaleCondition4> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(PRICE_VARIATION);
            case 'I' -> Optional.of(ODD_LOT);
            case 'X' -> Optional.of(CROSS);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
