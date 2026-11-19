package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Confirmation type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecType2 {

    /**
     * New Order Confirmation
     */
    NEW_ORDER_CONFIRMATION('A', "New Order Confirmation"),

    /**
     * Order Cancellation
     */
    ORDER_CANCELLATION('B', "Order Cancellation"),

    /**
     * Order Modification
     */
    ORDER_MODIFICATION('M', "Order Modification"),

    /**
     * Order Refresh
     */
    ORDER_REFRESH('R', "Order Refresh"),

    /**
     * Order Rejection
     */
    ORDER_REJECTION('8', "Order Rejection"),

    /**
     * Expired Order
     */
    EXPIRED_ORDER('X', "Expired Order"),

    /**
     * Order Status
     */
    ORDER_STATUS('W', "Order Status");

    private final char wire;

    private final String description;

    ExecType2(char wire, String description) {
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
    public static Optional<ExecType2> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NEW_ORDER_CONFIRMATION);
            case 'B' -> Optional.of(ORDER_CANCELLATION);
            case 'M' -> Optional.of(ORDER_MODIFICATION);
            case 'R' -> Optional.of(ORDER_REFRESH);
            case '8' -> Optional.of(ORDER_REJECTION);
            case 'X' -> Optional.of(EXPIRED_ORDER);
            case 'W' -> Optional.of(ORDER_STATUS);
            default -> Optional.empty();
        };
    }
}
