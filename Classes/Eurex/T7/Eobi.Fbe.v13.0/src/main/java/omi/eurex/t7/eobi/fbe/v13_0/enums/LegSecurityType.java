package omi.eurex.t7.eobi.fbe.v13_0.enums;

import java.util.Optional;

/**
 * Defines the LegSecurityType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LegSecurityType {

    /**
     * Leg Security Multi Leg
     */
    LEG_SECURITY_MULTI_LEG((short) 1, "Leg Security Multi Leg"),

    /**
     * Leg Security Underlying Leg
     */
    LEG_SECURITY_UNDERLYING_LEG((short) 2, "Leg Security Underlying Leg"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    LegSecurityType(short wire, String description) {
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
    public static Optional<LegSecurityType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LEG_SECURITY_MULTI_LEG);
            case 2 -> Optional.of(LEG_SECURITY_UNDERLYING_LEG);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
