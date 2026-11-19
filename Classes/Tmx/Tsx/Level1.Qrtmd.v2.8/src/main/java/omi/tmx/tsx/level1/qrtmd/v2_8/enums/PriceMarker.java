package omi.tmx.tsx.level1.qrtmd.v2_8.enums;

import java.util.Optional;

/**
 * Identifies the price type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceMarker {

    /**
     * Indicative Closing Price
     */
    INDICATIVE_CLOSING_PRICE('C', "Indicative Closing Price"),

    /**
     * Calculated Opening Price
     */
    CALCULATED_OPENING_PRICE('O', "Calculated Opening Price");

    private final char wire;

    private final String description;

    PriceMarker(char wire, String description) {
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
    public static Optional<PriceMarker> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(INDICATIVE_CLOSING_PRICE);
            case 'O' -> Optional.of(CALCULATED_OPENING_PRICE);
            default -> Optional.empty();
        };
    }
}
