package omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.enums;

import java.util.Optional;

/**
 * All or None
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AllOrNone {

    /**
     * All or None Order
     */
    ALL_OR_NONE_ORDER('Y', "All or None Order"),

    /**
     * Not All or None Order
     */
    NOT_ALL_OR_NONE_ORDER('N', "Not All or None Order");

    private final char wire;

    private final String description;

    AllOrNone(char wire, String description) {
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
    public static Optional<AllOrNone> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(ALL_OR_NONE_ORDER);
            case 'N' -> Optional.of(NOT_ALL_OR_NONE_ORDER);
            default -> Optional.empty();
        };
    }
}
