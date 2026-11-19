package omi.eurex.t7.xti.fbe.v6_0.enums;

import java.util.Optional;

/**
 * Defines the LastMkt values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum LastMkt {

    /**
     * XETR
     */
    XETR(3, "XETR"),

    /**
     * XVIE
     */
    XVIE(4, "XVIE"),

    /**
     * XDUB
     */
    XDUB(5, "XDUB"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    LastMkt(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<LastMkt> fromWire(int wire) {
        return switch (wire) {
            case 3 -> Optional.of(XETR);
            case 4 -> Optional.of(XVIE);
            case 5 -> Optional.of(XDUB);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
