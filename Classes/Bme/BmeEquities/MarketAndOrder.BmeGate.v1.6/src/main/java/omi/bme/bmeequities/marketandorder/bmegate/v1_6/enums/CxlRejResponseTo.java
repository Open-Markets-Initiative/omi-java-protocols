package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Type of message responded to
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CxlRejResponseTo {

    /**
     * Simple Order Modification
     */
    SIMPLE_ORDER_MODIFICATION('1', "Simple Order Modification"),

    /**
     * Order Cancellation Request
     */
    ORDER_CANCELLATION_REQUEST('2', "Order Cancellation Request");

    private final char wire;

    private final String description;

    CxlRejResponseTo(char wire, String description) {
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
    public static Optional<CxlRejResponseTo> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(SIMPLE_ORDER_MODIFICATION);
            case '2' -> Optional.of(ORDER_CANCELLATION_REQUEST);
            default -> Optional.empty();
        };
    }
}
