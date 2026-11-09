package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Indicates whether the connection is primary or backup
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum FaultToleranceIndicator {

    /**
     * Indicates whether the connection is primary or backup
     */
    NO_VALUE((short) 255, "Indicates whether the connection is primary or backup"),

    /**
     * Backup
     */
    BACKUP((short) 0, "Backup"),

    /**
     * Primary
     */
    PRIMARY((short) 1, "Primary");

    private final short wire;

    private final String description;

    FaultToleranceIndicator(short wire, String description) {
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
    public static Optional<FaultToleranceIndicator> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(BACKUP);
            case 1 -> Optional.of(PRIMARY);
            default -> Optional.empty();
        };
    }
}
