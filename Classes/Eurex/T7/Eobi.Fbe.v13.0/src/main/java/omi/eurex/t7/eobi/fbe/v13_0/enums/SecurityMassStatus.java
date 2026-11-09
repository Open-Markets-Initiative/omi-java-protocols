package omi.eurex.t7.eobi.fbe.v13_0.enums;

import java.util.Optional;

/**
 * Defines the SecurityMassStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityMassStatus {

    /**
     * Active
     */
    ACTIVE((short) 1, "Active"),

    /**
     * Inactive
     */
    INACTIVE((short) 2, "Inactive"),

    /**
     * Expired
     */
    EXPIRED((short) 4, "Expired"),

    /**
     * Knocked Out
     */
    KNOCKED_OUT((short) 6, "Knocked Out"),

    /**
     * Knock Out Revoked
     */
    KNOCK_OUT_REVOKED((short) 7, "Knock Out Revoked"),

    /**
     * Suspended
     */
    SUSPENDED((short) 9, "Suspended"),

    /**
     * Pending Deletion
     */
    PENDING_DELETION((short) 11, "Pending Deletion"),

    /**
     * Knocked Out And Suspended
     */
    KNOCKED_OUT_AND_SUSPENDED((short) 12, "Knocked Out And Suspended"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    SecurityMassStatus(short wire, String description) {
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
    public static Optional<SecurityMassStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ACTIVE);
            case 2 -> Optional.of(INACTIVE);
            case 4 -> Optional.of(EXPIRED);
            case 6 -> Optional.of(KNOCKED_OUT);
            case 7 -> Optional.of(KNOCK_OUT_REVOKED);
            case 9 -> Optional.of(SUSPENDED);
            case 11 -> Optional.of(PENDING_DELETION);
            case 12 -> Optional.of(KNOCKED_OUT_AND_SUSPENDED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
