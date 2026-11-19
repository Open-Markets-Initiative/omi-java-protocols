package omi.miax.pearloptions.topofmarket.mach.v2_3.enums;

import java.util.Optional;

/**
 * Restricted Option value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RestrictedOption {

    /**
     * Miax Will Accept Position Closing Orders Only
     */
    ACCEPT_POSITION_CLOSING('Y', "Miax Will Accept Position Closing Orders Only"),

    /**
     * Miax Will Accept Open And Close Positions
     */
    ACCEPT_OPEN_AND_CLOSE('N', "Miax Will Accept Open And Close Positions");

    private final char wire;

    private final String description;

    RestrictedOption(char wire, String description) {
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
    public static Optional<RestrictedOption> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(ACCEPT_POSITION_CLOSING);
            case 'N' -> Optional.of(ACCEPT_OPEN_AND_CLOSE);
            default -> Optional.empty();
        };
    }
}
