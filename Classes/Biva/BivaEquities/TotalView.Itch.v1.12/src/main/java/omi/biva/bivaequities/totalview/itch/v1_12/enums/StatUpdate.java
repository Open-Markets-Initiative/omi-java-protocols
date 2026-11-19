package omi.biva.bivaequities.totalview.itch.v1_12.enums;

import java.util.Optional;

/**
 * Indicates which stats are updated by this trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StatUpdate {

    /**
     * All Stats
     */
    ALL_STATS('A', "All Stats"),

    /**
     * Last Traded Price And Volume
     */
    LAST_TRADED_PRICE_AND_VOLUME('V', "Last Traded Price And Volume"),

    /**
     * Last Traded Price Only
     */
    LAST_TRADED_PRICE_ONLY('L', "Last Traded Price Only"),

    /**
     * Volume Only
     */
    VOLUME_ONLY('C', "Volume Only"),

    /**
     * None
     */
    NONE('N', "None");

    private final char wire;

    private final String description;

    StatUpdate(char wire, String description) {
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
    public static Optional<StatUpdate> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ALL_STATS);
            case 'V' -> Optional.of(LAST_TRADED_PRICE_AND_VOLUME);
            case 'L' -> Optional.of(LAST_TRADED_PRICE_ONLY);
            case 'C' -> Optional.of(VOLUME_ONLY);
            case 'N' -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
