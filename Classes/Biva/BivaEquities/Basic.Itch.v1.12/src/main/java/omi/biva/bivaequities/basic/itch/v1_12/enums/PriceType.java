package omi.biva.bivaequities.basic.itch.v1_12.enums;

import java.util.Optional;

/**
 * Reference price type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceType {

    /**
     * Close Price
     */
    CLOSE_PRICE('C', "Close Price"),

    /**
     * Reference Price
     */
    REFERENCE_PRICE('R', "Reference Price"),

    /**
     * Inav
     */
    INAV('I', "Inav"),

    /**
     * Vwap Or Ppp
     */
    VWAP_OR_PPP('V', "Vwap Or Ppp");

    private final char wire;

    private final String description;

    PriceType(char wire, String description) {
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
    public static Optional<PriceType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSE_PRICE);
            case 'R' -> Optional.of(REFERENCE_PRICE);
            case 'I' -> Optional.of(INAV);
            case 'V' -> Optional.of(VWAP_OR_PPP);
            default -> Optional.empty();
        };
    }
}
