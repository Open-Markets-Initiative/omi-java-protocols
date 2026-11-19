package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Priority loss flag
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriorityFlag {

    /**
     * Order modification caused loss of priority
     */
    LOST((short) 1, "Order modification caused loss of priority"),

    /**
     * Order modification did not cause loss of priority
     */
    RETAINED((short) 2, "Order modification did not cause loss of priority");

    private final short wire;

    private final String description;

    PriorityFlag(short wire, String description) {
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
    public static Optional<PriorityFlag> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LOST);
            case 2 -> Optional.of(RETAINED);
            default -> Optional.empty();
        };
    }
}
