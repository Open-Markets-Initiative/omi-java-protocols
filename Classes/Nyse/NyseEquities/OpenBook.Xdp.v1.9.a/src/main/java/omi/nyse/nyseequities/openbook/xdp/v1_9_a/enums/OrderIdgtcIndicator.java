package omi.nyse.nyseequities.openbook.xdp.v1_9_a.enums;

import java.util.Optional;

/**
 * This field specifies if Trade Order ID is a GTC order
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderIdgtcIndicator {

    /**
     * Day Order
     */
    DAY_ORDER((short) 0, "Day Order"),

    /**
     * Gtc Order
     */
    GTC_ORDER((short) 1, "Gtc Order");

    private final short wire;

    private final String description;

    OrderIdgtcIndicator(short wire, String description) {
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
    public static Optional<OrderIdgtcIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAY_ORDER);
            case 1 -> Optional.of(GTC_ORDER);
            default -> Optional.empty();
        };
    }
}
