package omi.lseg.turquoise.replay.gtp.v26_3.enums;

import java.util.Optional;

/**
 * For Turquoise Lit Order Book, 1[2] will be sent for execution of visible[hidden] quantities. For Turquoise Plato Order Book, it will always be set to 2 (Hidden).
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum HiddenExecutionIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE((short) 0, "Not Applicable"),

    /**
     * Visible
     */
    VISIBLE((short) 1, "Visible"),

    /**
     * Hidden
     */
    HIDDEN((short) 2, "Hidden");

    private final short wire;

    private final String description;

    HiddenExecutionIndicator(short wire, String description) {
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
    public static Optional<HiddenExecutionIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(VISIBLE);
            case 2 -> Optional.of(HIDDEN);
            default -> Optional.empty();
        };
    }
}
