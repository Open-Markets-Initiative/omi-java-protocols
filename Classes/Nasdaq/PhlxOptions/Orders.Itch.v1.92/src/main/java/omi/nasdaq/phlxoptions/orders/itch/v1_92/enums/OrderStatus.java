package omi.nasdaq.phlxoptions.orders.itch.v1_92.enums;

import java.util.Optional;

/**
 * Indicates the current status of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderStatus {

    /**
     * Open
     */
    OPEN('O', "Open"),

    /**
     * Filled
     */
    FILLED('F', "Filled"),

    /**
     * Cancelled
     */
    CANCELLED('C', "Cancelled"),

    /**
     * Re-notification
     */
    RENOTIFICATION('R', "Re-notification");

    private final char wire;

    private final String description;

    OrderStatus(char wire, String description) {
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
    public static Optional<OrderStatus> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPEN);
            case 'F' -> Optional.of(FILLED);
            case 'C' -> Optional.of(CANCELLED);
            case 'R' -> Optional.of(RENOTIFICATION);
            default -> Optional.empty();
        };
    }
}
