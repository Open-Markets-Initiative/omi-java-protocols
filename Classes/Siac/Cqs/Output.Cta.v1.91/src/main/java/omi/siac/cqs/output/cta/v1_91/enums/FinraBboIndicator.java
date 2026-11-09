package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * For FINRA ADF, represents the FINRA BBO state of the FINRA ADF quote
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinraBboIndicator {

    /**
     * FINRA BBO Indicator Not Applicable
     */
    NOT_APPLICABLE(' ', "FINRA BBO Indicator Not Applicable"),

    /**
     * No FINRA BBO Change
     */
    NO_FINRA_BBO_CHANGE('A', "No FINRA BBO Change"),

    /**
     * No FINRA BBO Exists
     */
    NO_FINRA_BBO_EXISTS('B', "No FINRA BBO Exists");

    private final char wire;

    private final String description;

    FinraBboIndicator(char wire, String description) {
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
    public static Optional<FinraBboIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'A' -> Optional.of(NO_FINRA_BBO_CHANGE);
            case 'B' -> Optional.of(NO_FINRA_BBO_EXISTS);
            default -> Optional.empty();
        };
    }
}
