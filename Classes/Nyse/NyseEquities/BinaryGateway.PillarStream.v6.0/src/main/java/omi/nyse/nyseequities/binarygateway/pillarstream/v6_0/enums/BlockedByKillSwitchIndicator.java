package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Indicates whether the entity is blocked by a kill switch.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BlockedByKillSwitchIndicator {

    /**
     * Not Blocked by Kill Switch
     */
    NOT_BLOCKED((short) 0, "Not Blocked by Kill Switch"),

    /**
     * Blocked by Kill Switch
     */
    BLOCKED((short) 1, "Blocked by Kill Switch");

    private final short wire;

    private final String description;

    BlockedByKillSwitchIndicator(short wire, String description) {
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
    public static Optional<BlockedByKillSwitchIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_BLOCKED);
            case 1 -> Optional.of(BLOCKED);
            default -> Optional.empty();
        };
    }
}
