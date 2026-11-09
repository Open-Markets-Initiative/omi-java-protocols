package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the PartyDetailRoleQualifier values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PartyDetailRoleQualifier {

    /**
     * Trader
     */
    TRADER((short) 10, "Trader"),

    /**
     * Head Trader
     */
    HEAD_TRADER((short) 11, "Head Trader"),

    /**
     * Supervisor
     */
    SUPERVISOR((short) 12, "Supervisor"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    PartyDetailRoleQualifier(short wire, String description) {
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
    public static Optional<PartyDetailRoleQualifier> fromWire(short wire) {
        return switch (wire) {
            case 10 -> Optional.of(TRADER);
            case 11 -> Optional.of(HEAD_TRADER);
            case 12 -> Optional.of(SUPERVISOR);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
