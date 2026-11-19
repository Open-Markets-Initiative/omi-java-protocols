package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Corresponds to MultilegReportingType (442) in Cboe FIX. Indicates the type of Order Execution message. 1=Single-leg instrument 2=Individual leg of multi-leg instrument
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MultilegReportingType {

    /**
     * Single-leg instrument
     */
    SINGLE_LEG_INSTRUMENT('1', "Single-leg instrument"),

    /**
     * Individual leg of multi-leg instrument
     */
    INDIVIDUAL_LEG_OF_MULTI_LEG_INSTRUMENT('2', "Individual leg of multi-leg instrument"),

    /**
     * Entire multi-leg instrument package
     */
    ENTIRE_MULTI_LEG_INSTRUMENT_PACKAGE('3', "Entire multi-leg instrument package"),

    /**
     * Last individual leg of multi-leg instrument
     */
    LAST_INDIVIDUAL_LEG_OF_MULTI_LEG_INSTRUMENT('4', "Last individual leg of multi-leg instrument");

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
            case '1' -> Optional.of(SINGLE_LEG_INSTRUMENT);
            case '2' -> Optional.of(INDIVIDUAL_LEG_OF_MULTI_LEG_INSTRUMENT);
            case '3' -> Optional.of(ENTIRE_MULTI_LEG_INSTRUMENT_PACKAGE);
            case '4' -> Optional.of(LAST_INDIVIDUAL_LEG_OF_MULTI_LEG_INSTRUMENT);
            default -> Optional.empty();
        };
    }
}
