package omi.eurex.t7.eobi.fbe.v13_0.enums;

import java.util.Optional;

/**
 * Defines the InstrumentScopeProductComplex values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum InstrumentScopeProductComplex {

    /**
     * Simple Instrument
     */
    SIMPLE_INSTRUMENT((short) 1, "Simple Instrument"),

    /**
     * Standard Option Strategy
     */
    STANDARD_OPTION_STRATEGY((short) 2, "Standard Option Strategy"),

    /**
     * Non Standard Option Strategy
     */
    NON_STANDARD_OPTION_STRATEGY((short) 3, "Non Standard Option Strategy"),

    /**
     * Volatility Strategy
     */
    VOLATILITY_STRATEGY((short) 4, "Volatility Strategy"),

    /**
     * Futures Spread
     */
    FUTURES_SPREAD((short) 5, "Futures Spread"),

    /**
     * Inter Product Spread
     */
    INTER_PRODUCT_SPREAD((short) 6, "Inter Product Spread"),

    /**
     * Standard Futures Strategy
     */
    STANDARD_FUTURES_STRATEGY((short) 7, "Standard Futures Strategy"),

    /**
     * Pack And Bundle
     */
    PACK_AND_BUNDLE((short) 8, "Pack And Bundle"),

    /**
     * Strip
     */
    STRIP((short) 9, "Strip"),

    /**
     * Flexible Instrument
     */
    FLEXIBLE_INSTRUMENT((short) 10, "Flexible Instrument"),

    /**
     * Commodity Strip
     */
    COMMODITY_STRIP((short) 11, "Commodity Strip"),

    /**
     * Scaled Simple Instrument
     */
    SCALED_SIMPLE_INSTRUMENT((short) 12, "Scaled Simple Instrument"),

    /**
     * Non Standard Volatility Strategy
     */
    NON_STANDARD_VOLATILITY_STRATEGY((short) 13, "Non Standard Volatility Strategy"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    InstrumentScopeProductComplex(short wire, String description) {
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
    public static Optional<InstrumentScopeProductComplex> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SIMPLE_INSTRUMENT);
            case 2 -> Optional.of(STANDARD_OPTION_STRATEGY);
            case 3 -> Optional.of(NON_STANDARD_OPTION_STRATEGY);
            case 4 -> Optional.of(VOLATILITY_STRATEGY);
            case 5 -> Optional.of(FUTURES_SPREAD);
            case 6 -> Optional.of(INTER_PRODUCT_SPREAD);
            case 7 -> Optional.of(STANDARD_FUTURES_STRATEGY);
            case 8 -> Optional.of(PACK_AND_BUNDLE);
            case 9 -> Optional.of(STRIP);
            case 10 -> Optional.of(FLEXIBLE_INSTRUMENT);
            case 11 -> Optional.of(COMMODITY_STRIP);
            case 12 -> Optional.of(SCALED_SIMPLE_INSTRUMENT);
            case 13 -> Optional.of(NON_STANDARD_VOLATILITY_STRATEGY);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
