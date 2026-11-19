package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * FloorRoutingInst
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FloorRoutingInst {

    /**
     * Direct Do Not Attempt To Process Electronically
     */
    DIRECT_DO_NOT_ATTEMPT_TO_PROCESS_ELECTRONICALLY('D', "Direct Do Not Attempt To Process Electronically"),

    /**
     * Electronic Only
     */
    ELECTRONIC_ONLY('E', "Electronic Only"),

    /**
     * Route To Floor If Unable To Process Electronically
     */
    ROUTE_TO_FLOOR_IF_UNABLE_TO_PROCESS_ELECTRONICALLY('X', "Route To Floor If Unable To Process Electronically"),

    /**
     * Port Level Default
     */
    PORT_LEVEL_DEFAULT(' ', "Port Level Default");

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
            case 'D' -> Optional.of(DIRECT_DO_NOT_ATTEMPT_TO_PROCESS_ELECTRONICALLY);
            case 'E' -> Optional.of(ELECTRONIC_ONLY);
            case 'X' -> Optional.of(ROUTE_TO_FLOOR_IF_UNABLE_TO_PROCESS_ELECTRONICALLY);
            case ' ' -> Optional.of(PORT_LEVEL_DEFAULT);
            default -> Optional.empty();
        };
    }
}
