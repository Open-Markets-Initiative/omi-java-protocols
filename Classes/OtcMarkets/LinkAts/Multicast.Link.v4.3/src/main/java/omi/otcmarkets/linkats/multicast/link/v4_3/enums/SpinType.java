package omi.otcmarkets.linkats.multicast.link.v4_3.enums;

import java.util.Optional;

/**
 * Spin type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SpinType {

    /**
     * Reference spin cycle
     */
    REFERENCE((short) 1, "Reference spin cycle"),

    /**
     * Market data spin cycle
     */
    MARKET_DATA((short) 2, "Market data spin cycle"),

    /**
     * Opening spin cycle
     */
    OPENING((short) 3, "Opening spin cycle");

    private final short wire;

    private final String description;

    SpinType(short wire, String description) {
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
    public static Optional<SpinType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(REFERENCE);
            case 2 -> Optional.of(MARKET_DATA);
            case 3 -> Optional.of(OPENING);
            default -> Optional.empty();
        };
    }
}
