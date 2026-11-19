package omi.bme.meff.retail5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * xRolling reference financing buyer rate
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum XRollingReferenceBuyerRate {

    /**
     * € Str Default Value For Non Flex X Rolling
     */
    _STR_DEFAULT_VALUE_FOR_NON_FLEX_X_ROLLING('S', "\u20AC Str Default Value For Non Flex X Rolling"),

    /**
     * Fis Analitics
     */
    FIS_ANALITICS('F', "Fis Analitics"),

    /**
     * Meff Rate
     */
    MEFF_RATE('M', "Meff Rate"),

    /**
     * Zero
     */
    ZERO('0', "Zero"),

    /**
     * N/A (used in FLEX, in the financing leg)
     */
    NOT_APPLICABLE(' ', "N/A (used in FLEX, in the financing leg)");

    private final char wire;

    private final String description;

    XRollingReferenceBuyerRate(char wire, String description) {
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
    public static Optional<XRollingReferenceBuyerRate> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(_STR_DEFAULT_VALUE_FOR_NON_FLEX_X_ROLLING);
            case 'F' -> Optional.of(FIS_ANALITICS);
            case 'M' -> Optional.of(MEFF_RATE);
            case '0' -> Optional.of(ZERO);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
