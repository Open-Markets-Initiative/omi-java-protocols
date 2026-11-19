package omi.nasdaq.nomoptions.itto.itch.v4_0_2025.enums;

import java.util.Optional;

/**
 * Minimum Price Variation for this option. See Notes below for further explanation:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Mpv {

    /**
     * Everywhere
     */
    EVERYWHERE('E', "Everywhere"),

    /**
     * Scaled
     */
    SCALED('S', "Scaled"),

    /**
     * Pilot
     */
    PILOT('P', "Pilot");

    private final char wire;

    private final String description;

    Mpv(char wire, String description) {
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
    public static Optional<Mpv> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(EVERYWHERE);
            case 'S' -> Optional.of(SCALED);
            case 'P' -> Optional.of(PILOT);
            default -> Optional.empty();
        };
    }
}
