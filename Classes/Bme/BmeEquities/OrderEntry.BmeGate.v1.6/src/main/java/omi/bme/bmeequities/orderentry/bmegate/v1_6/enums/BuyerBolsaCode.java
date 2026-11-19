package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Stock Exchange code of the buyer
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BuyerBolsaCode {

    /**
     * Valencia
     */
    VALENCIA('3', "Valencia"),

    /**
     * Barcelona
     */
    BARCELONA('4', "Barcelona"),

    /**
     * Bilbao
     */
    BILBAO('5', "Bilbao"),

    /**
     * Madrid
     */
    MADRID('6', "Madrid");

    private final char wire;

    private final String description;

    BuyerBolsaCode(char wire, String description) {
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
    public static Optional<BuyerBolsaCode> fromWire(char wire) {
        return switch (wire) {
            case '3' -> Optional.of(VALENCIA);
            case '4' -> Optional.of(BARCELONA);
            case '5' -> Optional.of(BILBAO);
            case '6' -> Optional.of(MADRID);
            default -> Optional.empty();
        };
    }
}
