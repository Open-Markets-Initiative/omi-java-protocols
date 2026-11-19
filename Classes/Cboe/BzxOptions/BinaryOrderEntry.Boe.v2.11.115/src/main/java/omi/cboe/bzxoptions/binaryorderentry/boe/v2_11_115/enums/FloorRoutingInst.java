package omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the FloorRoutingInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FloorRoutingInst {

    /**
     * Direct (do not attempt to process electronically) 1
     */
    DIRECT('D', "Direct (do not attempt to process electronically) 1"),

    /**
     * Electronic only
     */
    ELECTRONIC_ONLY('E', "Electronic only"),

    /**
     * Route to floor if unable to process electronically
     */
    ROUTE_TO_FLOOR_IF_UNABLE_TO_PROCESS_ELECTRONICALLY('X', "Route to floor if unable to process electronically"),

    /**
     * Port level default The default value for any given port can be changed by requesting an update to the "Default FloorRoutingInst" port attribute. 1When FloorRoutingInst is D or X, RoutingInst must be set to B or R for simple orders; or B for complex instruments.
     */
    PORT_LEVEL_DEFAULT(' ', "Port level default The default value for any given port can be changed by requesting an update to the \"Default FloorRoutingInst\" port attribute. 1When FloorRoutingInst is D or X, RoutingInst must be set to B or R for simple orders; or B for complex instruments.");

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
            case 'X' -> Optional.of(ROUTE_TO_FLOOR_IF_UNABLE_TO_PROCESS_ELECTRONICALLY);
            case ' ' -> Optional.of(PORT_LEVEL_DEFAULT);
            default -> Optional.empty();
        };
    }
}
