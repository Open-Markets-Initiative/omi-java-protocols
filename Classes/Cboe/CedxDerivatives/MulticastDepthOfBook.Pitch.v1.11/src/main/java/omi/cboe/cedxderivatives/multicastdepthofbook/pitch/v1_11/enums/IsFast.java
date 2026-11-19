package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.enums;

import java.util.Optional;

/**
 * LPP obligations
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum IsFast {

    /**
     * Normal
     */
    NORMAL((short) 0, "Normal"),

    /**
     * Fast
     */
    FAST((short) 1, "Fast");

    private final short wire;

    private final String description;

    IsFast(short wire, String description) {
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
    public static Optional<IsFast> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NORMAL);
            case 1 -> Optional.of(FAST);
            default -> Optional.empty();
        };
    }
}
