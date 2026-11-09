package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the OrdType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrdType {

    /**
     * Market
     */
    MARKET((short) 1, "Market"),

    /**
     * Limit
     */
    LIMIT((short) 2, "Limit"),

    /**
     * Stop
     */
    STOP((short) 3, "Stop"),

    /**
     * Stop Limit
     */
    STOP_LIMIT((short) 4, "Stop Limit"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    OrdType(short wire, String description) {
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
    public static Optional<OrdType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MARKET);
            case 2 -> Optional.of(LIMIT);
            case 3 -> Optional.of(STOP);
            case 4 -> Optional.of(STOP_LIMIT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
