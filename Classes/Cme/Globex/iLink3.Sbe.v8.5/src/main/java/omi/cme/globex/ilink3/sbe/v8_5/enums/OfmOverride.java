package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Flag indicating whether the order quantity stipulated on replace request should be entered into the market as stated without reduction for any fills that have occurred. Also once enabled in the order chain it cannot be disabled
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OfmOverride {

    /**
     * Disabled
     */
    DISABLED((short) 0, "Disabled"),

    /**
     * Enabled
     */
    ENABLED((short) 1, "Enabled");

    private final short wire;

    private final String description;

    OfmOverride(short wire, String description) {
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
    public static Optional<OfmOverride> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DISABLED);
            case 1 -> Optional.of(ENABLED);
            default -> Optional.empty();
        };
    }
}
