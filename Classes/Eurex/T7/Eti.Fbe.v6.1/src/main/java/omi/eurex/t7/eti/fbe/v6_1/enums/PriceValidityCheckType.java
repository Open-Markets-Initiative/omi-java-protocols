package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the PriceValidityCheckType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceValidityCheckType {

    /**
     * None
     */
    NONE((short) 0, "None"),

    /**
     * Optional
     */
    OPTIONAL((short) 1, "Optional"),

    /**
     * Mandatory
     */
    MANDATORY((short) 2, "Mandatory"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    PriceValidityCheckType(short wire, String description) {
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
    public static Optional<PriceValidityCheckType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(OPTIONAL);
            case 2 -> Optional.of(MANDATORY);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
