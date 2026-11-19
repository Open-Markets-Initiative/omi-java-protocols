package omi.eurex.t7.edci.fbe.v14_1.enums;

import java.util.Optional;

/**
 * Defines the SelfMatchPreventionInstruction values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SelfMatchPreventionInstruction {

    /**
     * Reject cross on business unit level
     */
    CROSSREJECTED_BU((short) 100, "Reject cross on business unit level"),

    /**
     * Reject cross on market level
     */
    CROSSREJECTED_MARKET((short) 101, "Reject cross on market level"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    SelfMatchPreventionInstruction(short wire, String description) {
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
    public static Optional<SelfMatchPreventionInstruction> fromWire(short wire) {
        return switch (wire) {
            case 100 -> Optional.of(CROSSREJECTED_BU);
            case 101 -> Optional.of(CROSSREJECTED_MARKET);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
