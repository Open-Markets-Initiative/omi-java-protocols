package omi.bme.meff.topofbook5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * xRolling reference financing seller rate
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum XRollingReferenceSellerRate {

    /**
     * € Str
     */
    _STR('S', "\u20AC Str"),

    /**
     * Fis Analitics
     */
    FIS_ANALITICS('F', "Fis Analitics"),

    /**
     * Meff Rate Default Value For Non Flex X Rolling
     */
    MEFF_RATE_DEFAULT_VALUE_FOR_NON_FLEX_X_ROLLING('M', "Meff Rate Default Value For Non Flex X Rolling"),

    /**
     * Cero
     */
    CERO('0', "Cero"),

    /**
     * N/A (used in FLEX, in the financing leg)
     */
    NOT_APPLICABLE(' ', "N/A (used in FLEX, in the financing leg)");

    private final char wire;

    private final String description;

    XRollingReferenceSellerRate(char wire, String description) {
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
    public static Optional<XRollingReferenceSellerRate> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(_STR);
            case 'F' -> Optional.of(FIS_ANALITICS);
            case 'M' -> Optional.of(MEFF_RATE_DEFAULT_VALUE_FOR_NON_FLEX_X_ROLLING);
            case '0' -> Optional.of(CERO);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
