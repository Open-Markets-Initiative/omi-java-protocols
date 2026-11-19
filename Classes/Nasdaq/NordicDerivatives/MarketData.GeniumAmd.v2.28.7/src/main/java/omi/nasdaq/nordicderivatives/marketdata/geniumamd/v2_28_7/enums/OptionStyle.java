package omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.enums;

import java.util.Optional;

/**
 * Defines the style of option. 0 = Not applicable 1 = American 2 = European 3 = Asian
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum OptionStyle {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(0, "Not Applicable"),

    /**
     * American
     */
    AMERICAN(1, "American"),

    /**
     * European
     */
    EUROPEAN(2, "European"),

    /**
     * Asian
     */
    ASIAN(3, "Asian");

    private final int wire;

    private final String description;

    OptionStyle(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<OptionStyle> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(AMERICAN);
            case 2 -> Optional.of(EUROPEAN);
            case 3 -> Optional.of(ASIAN);
            default -> Optional.empty();
        };
    }
}
