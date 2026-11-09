package omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.enums;

import java.util.Optional;

/**
 * The corrected sale condition code level 3, Extended Hours Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CorrectedSaleCondition3 {

    /**
     * FormT
     */
    FORM_T('T', "FormT"),

    /**
     * NotApplicable
     */
    NOT_APPLICABLE(' ', "NotApplicable");

    private final char wire;

    private final String description;

    CorrectedSaleCondition3(char wire, String description) {
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
    public static Optional<CorrectedSaleCondition3> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(FORM_T);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
