package omi.nyse.amexoptions.topfeed.pillar.v1_2_j.enums;

import java.util.Optional;

/**
 * Additional trade conditions.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond4 {

    /**
     * Na
     */
    NA(' ', "Na"),

    /**
     * Official Open Price
     */
    OFFICIAL_OPEN_PRICE('Q', "Official Open Price");

    private final char wire;

    private final String description;

    TradeCond4(char wire, String description) {
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
    public static Optional<TradeCond4> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NA);
            case 'Q' -> Optional.of(OFFICIAL_OPEN_PRICE);
            default -> Optional.empty();
        };
    }
}
