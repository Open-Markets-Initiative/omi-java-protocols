package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * 0 = No routing arrangement in place; 1 = Routing arrangement in place
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RoutingArrangementIndicator {

    /**
     * No routing arrangement in place
     */
    NO_ROUTING_ARRANGEMENT_IN_PLACE('0', "No routing arrangement in place"),

    /**
     * Routing arrangement in place
     */
    ROUTING_ARRANGEMENT_IN_PLACE('1', "Routing arrangement in place");

    private final char wire;

    private final String description;

    RoutingArrangementIndicator(char wire, String description) {
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
    public static Optional<RoutingArrangementIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_ROUTING_ARRANGEMENT_IN_PLACE);
            case '1' -> Optional.of(ROUTING_ARRANGEMENT_IN_PLACE);
            default -> Optional.empty();
        };
    }
}
