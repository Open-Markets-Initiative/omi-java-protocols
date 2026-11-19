package omi.nasdaq.iseoptions.depthofmarket.itch.v2_1_2026.enums;

import java.util.Optional;

/**
 * Change Reason
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ChangeReason {

    /**
     * User
     */
    USER('U', "User"),

    /**
     * Reprice
     */
    REPRICE('R', "Reprice"),

    /**
     * Suspend
     */
    SUSPEND('S', "Suspend");

    private final char wire;

    private final String description;

    ChangeReason(char wire, String description) {
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
    public static Optional<ChangeReason> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(USER);
            case 'R' -> Optional.of(REPRICE);
            case 'S' -> Optional.of(SUSPEND);
            default -> Optional.empty();
        };
    }
}
