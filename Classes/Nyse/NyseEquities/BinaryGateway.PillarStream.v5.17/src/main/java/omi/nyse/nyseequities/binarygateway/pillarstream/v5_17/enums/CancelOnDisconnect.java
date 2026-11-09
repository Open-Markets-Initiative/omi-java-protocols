package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * CancelOnDisconnect enum
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CancelOnDisconnect {

    /**
     * Cancel on Disconnect Disabled
     */
    DISABLED((short) 0, "Cancel on Disconnect Disabled"),

    /**
     * Enable Cancel on Disconnect Day
     */
    ENABLE_DAY((short) 1, "Enable Cancel on Disconnect Day"),

    /**
     * Enable Cancel on Disconnect All*
     */
    ENABLE_ALL((short) 2, "Enable Cancel on Disconnect All*");

    private final short wire;

    private final String description;

    CancelOnDisconnect(short wire, String description) {
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
    public static Optional<CancelOnDisconnect> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DISABLED);
            case 1 -> Optional.of(ENABLE_DAY);
            case 2 -> Optional.of(ENABLE_ALL);
            default -> Optional.empty();
        };
    }
}
