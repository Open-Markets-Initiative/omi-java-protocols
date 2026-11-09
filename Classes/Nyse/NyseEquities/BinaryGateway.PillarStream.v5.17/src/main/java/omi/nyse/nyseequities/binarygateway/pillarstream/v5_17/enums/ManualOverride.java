package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Indicates whether a DBK GUI manual override occurred.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ManualOverride {

    /**
     * Not applicable
     */
    NOT_APPLICABLE((short) 0, "Not applicable"),

    /**
     * Alert for DBK GUI Manual Override
     */
    ALERT((short) 1, "Alert for DBK GUI Manual Override"),

    /**
     * Position Marking for DMM Manual Override
     */
    POSITION_MARKING((short) 2, "Position Marking for DMM Manual Override");

    private final short wire;

    private final String description;

    ManualOverride(short wire, String description) {
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
    public static Optional<ManualOverride> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(ALERT);
            case 2 -> Optional.of(POSITION_MARKING);
            default -> Optional.empty();
        };
    }
}
