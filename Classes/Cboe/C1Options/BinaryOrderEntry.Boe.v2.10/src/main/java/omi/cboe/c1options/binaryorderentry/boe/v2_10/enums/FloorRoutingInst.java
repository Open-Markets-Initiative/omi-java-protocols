package omi.cboe.c1options.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Defines the FloorRoutingInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FloorRoutingInst {

    /**
     * Direct
     */
    DIRECT('D', "Direct"),

    /**
     * Electronic Only
     */
    ELECTRONIC_ONLY('E', "Electronic Only"),

    /**
     * Route To Floor If Not Electronic
     */
    ROUTE_TO_FLOOR_IF_NOT_ELECTRONIC('X', "Route To Floor If Not Electronic");

    private final char wire;

    private final String description;

    FloorRoutingInst(char wire, String description) {
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
    public static Optional<FloorRoutingInst> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(DIRECT);
            case 'E' -> Optional.of(ELECTRONIC_ONLY);
            case 'X' -> Optional.of(ROUTE_TO_FLOOR_IF_NOT_ELECTRONIC);
            default -> Optional.empty();
        };
    }
}
