package omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_46.enums;

import java.util.Optional;

/**
 * Style of the warrant.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Style {

    /**
     * American Style
     */
    AMERICAN_STYLE('A', "American Style"),

    /**
     * European Style
     */
    EUROPEAN_STYLE('E', "European Style"),

    /**
     * Other
     */
    OTHER(' ', "Other");

    private final char wire;

    private final String description;

    Style(char wire, String description) {
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
    public static Optional<Style> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AMERICAN_STYLE);
            case 'E' -> Optional.of(EUROPEAN_STYLE);
            case ' ' -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
