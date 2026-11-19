package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Indicates how the order should be routed: C = CXC; 2 = CX2; D = CXD; S = Smart Order Router (requires RoutingStrategy)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExDestination {

    /**
     * CXC
     */
    CXC('C', "CXC"),

    /**
     * CX2
     */
    CX_2('2', "CX2"),

    /**
     * CXD
     */
    CXD('D', "CXD"),

    /**
     * Smart Order Router (requires RoutingStrategy)
     */
    SMART_ORDER_ROUTER('S', "Smart Order Router (requires RoutingStrategy)");

    private final char wire;

    private final String description;

    ExDestination(char wire, String description) {
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
    public static Optional<ExDestination> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CXC);
            case '2' -> Optional.of(CX_2);
            case 'D' -> Optional.of(CXD);
            case 'S' -> Optional.of(SMART_ORDER_ROUTER);
            default -> Optional.empty();
        };
    }
}
