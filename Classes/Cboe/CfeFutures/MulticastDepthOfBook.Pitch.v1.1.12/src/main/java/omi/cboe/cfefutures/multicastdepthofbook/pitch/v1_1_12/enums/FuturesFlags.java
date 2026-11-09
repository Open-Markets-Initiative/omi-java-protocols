package omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_12.enums;

import java.util.Optional;

/**
 * Bit 0 – Variance (1: Variance Future, 0: Standard Future)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum FuturesFlags {

    /**
     * Standard Block Flag
     */
    STANDARD((short) 0, "Standard Block Flag"),

    /**
     * Variance Block Flag
     */
    VARIANCE((short) 1, "Variance Block Flag");

    private final short wire;

    private final String description;

    FuturesFlags(short wire, String description) {
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
    public static Optional<FuturesFlags> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(STANDARD);
            case 1 -> Optional.of(VARIANCE);
            default -> Optional.empty();
        };
    }
}
