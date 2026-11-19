package omi.eurex.t7.xti.fbe.v12_1.enums;

import java.util.Optional;

/**
 * Defines the ClearingInstruction values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ClearingInstruction {

    /**
     * Bilateral netting only
     */
    BILATERALNETTINGONLY((short) 2, "Bilateral netting only"),

    /**
     * Self clearing
     */
    SELFCLEARING((short) 13, "Self clearing"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    ClearingInstruction(short wire, String description) {
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
    public static Optional<ClearingInstruction> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(BILATERALNETTINGONLY);
            case 13 -> Optional.of(SELFCLEARING);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
