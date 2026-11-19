package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.enums;

import java.util.Optional;

/**
 * Defines the MultilegReportingType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MultilegReportingType {

    /**
     * Single-leg /Simple instrument
     */
    SINGLE_LEG_SIMPLE_INSTRUMENT('1', "Single-leg /Simple instrument"),

    /**
     * Individual leg of multi-leg instrument (Options), or Sim- ple instrument execution that is part of a Spread instrument execution (Futures)
     */
    INDIVIDUAL_LEG_OF_MULTI_LEG_INSTRUMENT('2', "Individual leg of multi-leg instrument (Options), or Sim- ple instrument execution that is part of a Spread instrument execution (Futures)"),

    /**
     * Entire multi-leg / Spread instrument package
     */
    ENTIRE_MULTI_LEG_SPREAD_INSTRUMENT_PACKAGE('3', "Entire multi-leg / Spread instrument package");

    private final char wire;

    private final String description;

    MultilegReportingType(char wire, String description) {
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
    public static Optional<MultilegReportingType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(SINGLE_LEG_SIMPLE_INSTRUMENT);
            case '2' -> Optional.of(INDIVIDUAL_LEG_OF_MULTI_LEG_INSTRUMENT);
            case '3' -> Optional.of(ENTIRE_MULTI_LEG_SPREAD_INSTRUMENT_PACKAGE);
            default -> Optional.empty();
        };
    }
}
