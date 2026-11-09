package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the ProductComplex values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ProductComplex {

    /**
     * Simple instrument
     */
    SIMPLEINSTRUMENT((short) 1, "Simple instrument"),

    /**
     * Standard Option Strategy
     */
    STANDARDOPTIONSTRATEGY((short) 2, "Standard Option Strategy"),

    /**
     * Non-Standard Option Strategy
     */
    NONSTANDARDOPTIONSTRATEGY((short) 3, "Non-Standard Option Strategy"),

    /**
     * Volatility Strategy
     */
    VOLATILITYSTRATEGY((short) 4, "Volatility Strategy"),

    /**
     * Futures Spread
     */
    FUTURES_SPREAD((short) 5, "Futures Spread"),

    /**
     * Inter-Product Spread
     */
    INTERPRODUCTSPREAD((short) 6, "Inter-Product Spread"),

    /**
     * Standard Future Strategy
     */
    STANDARDFUTURESTRATEGY((short) 7, "Standard Future Strategy"),

    /**
     * Pack and Bundle
     */
    PACKANDBUNDLE((short) 8, "Pack and Bundle"),

    /**
     * Strip
     */
    STRIP((short) 9, "Strip"),

    /**
     * Flexible Simple Instrument
     */
    FLEXIBLESIMPLEINSTRUMENT((short) 10, "Flexible Simple Instrument"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    ProductComplex(short wire, String description) {
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
    public static Optional<ProductComplex> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SIMPLEINSTRUMENT);
            case 2 -> Optional.of(STANDARDOPTIONSTRATEGY);
            case 3 -> Optional.of(NONSTANDARDOPTIONSTRATEGY);
            case 4 -> Optional.of(VOLATILITYSTRATEGY);
            case 5 -> Optional.of(FUTURES_SPREAD);
            case 6 -> Optional.of(INTERPRODUCTSPREAD);
            case 7 -> Optional.of(STANDARDFUTURESTRATEGY);
            case 8 -> Optional.of(PACKANDBUNDLE);
            case 9 -> Optional.of(STRIP);
            case 10 -> Optional.of(FLEXIBLESIMPLEINSTRUMENT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
