package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * PostOnly
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PostOnly {

    /**
     * Post Only (Mid-point Post Only not available on BX)
     */
    POST_ONLY('P', "Post Only (Mid-point Post Only not available on BX)"),

    /**
     * No (default)
     */
    NO('N', "No (default)");

    private final char wire;

    private final String description;

    PostOnly(char wire, String description) {
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
    public static Optional<PostOnly> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(POST_ONLY);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
