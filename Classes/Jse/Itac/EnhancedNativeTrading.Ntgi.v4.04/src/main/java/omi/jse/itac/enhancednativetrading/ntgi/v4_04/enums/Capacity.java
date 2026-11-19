package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Capacity in which the order is submitted
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Capacity {

    /**
     * Principal
     */
    PRINCIPAL((short) 2, "Principal"),

    /**
     * Agency
     */
    AGENCY((short) 3, "Agency");

    private final short wire;

    private final String description;

    Capacity(short wire, String description) {
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
    public static Optional<Capacity> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(PRINCIPAL);
            case 3 -> Optional.of(AGENCY);
            default -> Optional.empty();
        };
    }
}
