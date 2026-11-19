package omi.bme.bmeequities.retail5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Type of exemption
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExemptionSituation {

    /**
     * Specialists Non Exempted
     */
    SPECIALISTS_NON_EXEMPTED('0', "Specialists Non Exempted"),

    /**
     * Specialists Exempted In The Buy Side
     */
    SPECIALISTS_EXEMPTED_IN_THE_BUY_SIDE('1', "Specialists Exempted In The Buy Side"),

    /**
     * Specialists Exempted In The Sell Side
     */
    SPECIALISTS_EXEMPTED_IN_THE_SELL_SIDE('2', "Specialists Exempted In The Sell Side"),

    /**
     * Specialists Exempted In Both Sides Buy And Sell
     */
    SPECIALISTS_EXEMPTED_IN_BOTH_SIDES_BUY_AND_SELL('3', "Specialists Exempted In Both Sides Buy And Sell");

    private final char wire;

    private final String description;

    ExemptionSituation(char wire, String description) {
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
    public static Optional<ExemptionSituation> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(SPECIALISTS_NON_EXEMPTED);
            case '1' -> Optional.of(SPECIALISTS_EXEMPTED_IN_THE_BUY_SIDE);
            case '2' -> Optional.of(SPECIALISTS_EXEMPTED_IN_THE_SELL_SIDE);
            case '3' -> Optional.of(SPECIALISTS_EXEMPTED_IN_BOTH_SIDES_BUY_AND_SELL);
            default -> Optional.empty();
        };
    }
}
