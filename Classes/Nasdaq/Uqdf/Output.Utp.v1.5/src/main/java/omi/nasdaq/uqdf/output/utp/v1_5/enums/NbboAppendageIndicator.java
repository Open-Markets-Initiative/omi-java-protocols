package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * NBBO Appendage Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NbboAppendageIndicator {

    /**
     * No National BBO Change
     */
    NO_NATIONAL_BBO_CHANGE('0', "No National BBO Change"),

    /**
     * No National BBO Can be Calculated
     */
    NO_NATIONAL_BBO_CAN_BE_CALCULATED('1', "No National BBO Can be Calculated"),

    /**
     * Short Form National BBO Appendage
     */
    SHORT_FORM_NATIONAL_BBO_APPENDAGE('2', "Short Form National BBO Appendage"),

    /**
     * Long Form National BBO Appendage
     */
    LONG_FORM_NATIONAL_BBO_APPENDAGE('3', "Long Form National BBO Appendage"),

    /**
     * Long Form National BBO Appendage
     */
    QUOTE_CONTAINS_ALL_NATIONAL_BBO_INFORMATION('4', "Long Form National BBO Appendage");

    private final char wire;

    private final String description;

    NbboAppendageIndicator(char wire, String description) {
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
    public static Optional<NbboAppendageIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_NATIONAL_BBO_CHANGE);
            case '1' -> Optional.of(NO_NATIONAL_BBO_CAN_BE_CALCULATED);
            case '2' -> Optional.of(SHORT_FORM_NATIONAL_BBO_APPENDAGE);
            case '3' -> Optional.of(LONG_FORM_NATIONAL_BBO_APPENDAGE);
            case '4' -> Optional.of(QUOTE_CONTAINS_ALL_NATIONAL_BBO_INFORMATION);
            default -> Optional.empty();
        };
    }
}
