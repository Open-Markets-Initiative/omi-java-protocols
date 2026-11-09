package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * OptionsStyle: ‘A’ – American, ‘E’ – European, ‘0’ – None, ‘3’ – Asian, ‘4’ – One Time
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OptionsStyle {

    /**
     * American
     */
    AMERICAN('A', "American"),

    /**
     * European
     */
    EUROPEAN('E', "European"),

    /**
     * None
     */
    NONE('0', "None"),

    /**
     * Asian
     */
    ASIAN('3', "Asian"),

    /**
     * One Time
     */
    ONE_TIME('4', "One Time");

    private final char wire;

    private final String description;

    OptionsStyle(char wire, String description) {
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
    public static Optional<OptionsStyle> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AMERICAN);
            case 'E' -> Optional.of(EUROPEAN);
            case '0' -> Optional.of(NONE);
            case '3' -> Optional.of(ASIAN);
            case '4' -> Optional.of(ONE_TIME);
            default -> Optional.empty();
        };
    }
}
