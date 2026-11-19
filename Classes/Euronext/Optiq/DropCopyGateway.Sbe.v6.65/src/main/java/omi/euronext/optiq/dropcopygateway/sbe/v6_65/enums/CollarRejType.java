package omi.euronext.optiq.dropcopygateway.sbe.v6_65.enums;

import java.util.Optional;

/**
 * collarRejType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CollarRejType {

    /**
     * Low_dynamic_collar
     */
    LOWDYNAMICCOLLAR((short) 1, "Low_dynamic_collar"),

    /**
     * High_dynamic_collar
     */
    HIGHDYNAMICCOLLAR((short) 2, "High_dynamic_collar"),

    /**
     * Low_static_collar
     */
    LOWSTATICCOLLAR((short) 3, "Low_static_collar"),

    /**
     * High_static_collar
     */
    HIGHSTATICCOLLAR((short) 4, "High_static_collar"),

    /**
     * collarRejType
     */
    NO_VALUE((short) 255, "collarRejType");

    private final short wire;

    private final String description;

    CollarRejType(short wire, String description) {
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
    public static Optional<CollarRejType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LOWDYNAMICCOLLAR);
            case 2 -> Optional.of(HIGHDYNAMICCOLLAR);
            case 3 -> Optional.of(LOWSTATICCOLLAR);
            case 4 -> Optional.of(HIGHSTATICCOLLAR);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
