package omi.eurex.t7.xti.fbe.v7_1.enums;

import java.util.Optional;

/**
 * Defines the SecurityStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityStatus {

    /**
     * Knocked-out
     */
    KNOCKEDOUT((short) 6, "Knocked-out"),

    /**
     * Knocked-out revoked
     */
    KNOCKOUTREVOKED((short) 7, "Knocked-out revoked"),

    /**
     * Knocked-out and suspended
     */
    KNOCKEDOUTANDSUSPEND((short) 12, "Knocked-out and suspended"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    SecurityStatus(short wire, String description) {
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
    public static Optional<SecurityStatus> fromWire(short wire) {
        return switch (wire) {
            case 6 -> Optional.of(KNOCKEDOUT);
            case 7 -> Optional.of(KNOCKOUTREVOKED);
            case 12 -> Optional.of(KNOCKEDOUTANDSUSPEND);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
