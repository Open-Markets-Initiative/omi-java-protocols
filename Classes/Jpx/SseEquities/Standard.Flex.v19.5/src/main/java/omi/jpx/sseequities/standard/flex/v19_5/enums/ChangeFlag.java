package omi.jpx.sseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * For issue status, status flag or short selling regulation flag, indicates whether this has changed or not.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ChangeFlag {

    /**
     * Changed
     */
    CHANGED('1', "Changed"),

    /**
     * Space is set when this tag is sent as Backup Information or All-Day Information.
     */
    NOT_CHANGED(' ', "Space is set when this tag is sent as Backup Information or All-Day Information.");

    private final char wire;

    private final String description;

    ChangeFlag(char wire, String description) {
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
    public static Optional<ChangeFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CHANGED);
            case ' ' -> Optional.of(NOT_CHANGED);
            default -> Optional.empty();
        };
    }
}
