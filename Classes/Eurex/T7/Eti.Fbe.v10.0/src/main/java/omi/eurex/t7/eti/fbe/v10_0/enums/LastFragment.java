package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the LastFragment values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LastFragment {

    /**
     * Not Last Message
     */
    NOT_LAST_MESSAGE((short) 0, "Not Last Message"),

    /**
     * Last Message
     */
    LAST_MESSAGE((short) 1, "Last Message"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    LastFragment(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<LastFragment> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_LAST_MESSAGE);
            case 1 -> Optional.of(LAST_MESSAGE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
