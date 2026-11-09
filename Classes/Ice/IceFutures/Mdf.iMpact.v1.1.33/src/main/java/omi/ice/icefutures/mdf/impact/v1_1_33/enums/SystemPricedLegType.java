package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * System Priced Leg Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SystemPricedLegType {

    /**
     * System Priced Crack Spread Leg
     */
    SYSTEM_PRICED_CRACK_SPREAD_LEG('C', "System Priced Crack Spread Leg"),

    /**
     * System Priced Leg
     */
    SYSTEM_PRICED_LEG('S', "System Priced Leg");

    private final char wire;

    private final String description;

    SystemPricedLegType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<SystemPricedLegType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(SYSTEM_PRICED_CRACK_SPREAD_LEG);
            case 'S' -> Optional.of(SYSTEM_PRICED_LEG);
            default -> Optional.empty();
        };
    }
}
