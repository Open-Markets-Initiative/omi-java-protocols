package omi.eurex.t7.xti.fbe.v15_0.enums;

import java.util.Optional;

/**
 * Defines the MidPointType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MidPointType {

    /**
     * Midpoint order
     */
    MID_POINT((short) 1, "Midpoint order"),

    /**
     * Midpoint sweep order
     */
    MID_POINT_SWEEP((short) 2, "Midpoint sweep order"),

    /**
     * Midpoint order - Book Only
     */
    MID_POINT_MBO((short) 3, "Midpoint order - Book Only"),

    /**
     * Midpoint order - Counterparty Resting Time Restriction
     */
    MID_POINT_CRT((short) 4, "Midpoint order - Counterparty Resting Time Restriction"),

    /**
     * Midpoint order - Book Only and Counterparty Resting Time Restriction
     */
    MID_POINT_CRTMBO((short) 5, "Midpoint order - Book Only and Counterparty Resting Time Restriction"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    MidPointType(short wire, String description) {
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
    public static Optional<MidPointType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MID_POINT);
            case 2 -> Optional.of(MID_POINT_SWEEP);
            case 3 -> Optional.of(MID_POINT_MBO);
            case 4 -> Optional.of(MID_POINT_CRT);
            case 5 -> Optional.of(MID_POINT_CRTMBO);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
