package omi.cboe.c1options.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Corresponds to MultilegReportingType (442) in Cboe FIX.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MultilegReportingType {

    /**
     * Single Leg Instrument
     */
    SINGLE_LEG_INSTRUMENT('1', "Single Leg Instrument"),

    /**
     * Individual Leg Of Multileg Instrument
     */
    INDIVIDUAL_LEG_OF_MULTILEG_INSTRUMENT('2', "Individual Leg Of Multileg Instrument"),

    /**
     * Entire Multileg Package
     */
    ENTIRE_MULTILEG_PACKAGE('3', "Entire Multileg Package");

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
            case '2' -> Optional.of(INDIVIDUAL_LEG_OF_MULTILEG_INSTRUMENT);
            case '3' -> Optional.of(ENTIRE_MULTILEG_PACKAGE);
            default -> Optional.empty();
        };
    }
}
