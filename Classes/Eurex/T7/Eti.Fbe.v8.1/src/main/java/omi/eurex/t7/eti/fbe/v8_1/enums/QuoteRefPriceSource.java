package omi.eurex.t7.eti.fbe.v8_1.enums;

import java.util.Optional;

/**
 * Defines the QuoteRefPriceSource values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteRefPriceSource {

    /**
     * Underlying
     */
    UNDERLYING((short) 1, "Underlying"),

    /**
     * Custom underlying price
     */
    CUSTOM_UNDERLYING_PRICE((short) 2, "Custom underlying price"),

    /**
     * Reference price
     */
    REF_PRICE((short) 3, "Reference price"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    QuoteRefPriceSource(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<QuoteRefPriceSource> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(UNDERLYING);
            case 2 -> Optional.of(CUSTOM_UNDERLYING_PRICE);
            case 3 -> Optional.of(REF_PRICE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
