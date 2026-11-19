package omi.nasdaq.psxequities.orders.ouch.v4_2.enums;

import java.util.Optional;

/**
 * Order State
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderState {

    /**
     * Order Live
     */
    LIVE('L', "Order Live"),

    /**
     * Order Dead
     */
    DEAD('D', "Order Dead");

    private final char wire;

    private final String description;

    OrderState(char wire, String description) {
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
    public static Optional<OrderState> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(LIVE);
            case 'D' -> Optional.of(DEAD);
            default -> Optional.empty();
        };
    }
}
