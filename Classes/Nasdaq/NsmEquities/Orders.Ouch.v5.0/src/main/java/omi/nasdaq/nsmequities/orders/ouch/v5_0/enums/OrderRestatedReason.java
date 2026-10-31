package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * The reason for this order being restated
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderRestatedReason {

    /**
     * Refresh of display (on an order with reserves)
     */
    REFRESH_OF_DISPLAY('R', "Refresh of display (on an order with reserves)"),

    /**
     * Update of displayed price
     */
    UPDATE_OF_DISPLAYED_PRICE('P', "Update of displayed price");

    private final char wire;

    private final String description;

    OrderRestatedReason(char wire, String description) {
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
    public static Optional<OrderRestatedReason> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(REFRESH_OF_DISPLAY);
            case 'P' -> Optional.of(UPDATE_OF_DISPLAYED_PRICE);
            default -> Optional.empty();
        };
    }
}
