package omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.enums;

import java.util.Optional;

/**
 * Instrument class of the security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityType {

    /**
     * Debentures
     */
    DEBENTURES('d', "Debentures"),

    /**
     * Rights
     */
    RIGHTS('r', "Rights"),

    /**
     * Notes
     */
    NOTES('n', "Notes"),

    /**
     * Warrants
     */
    WARRANTS('w', "Warrants");

    private final char wire;

    private final String description;

    SecurityType(char wire, String description) {
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
    public static Optional<SecurityType> fromWire(char wire) {
        return switch (wire) {
            case 'd' -> Optional.of(DEBENTURES);
            case 'r' -> Optional.of(RIGHTS);
            case 'n' -> Optional.of(NOTES);
            case 'w' -> Optional.of(WARRANTS);
            default -> Optional.empty();
        };
    }
}
