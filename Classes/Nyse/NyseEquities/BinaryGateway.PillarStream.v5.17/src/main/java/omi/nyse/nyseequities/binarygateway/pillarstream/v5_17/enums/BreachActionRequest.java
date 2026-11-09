package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Breach Action Request enum
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BreachActionRequest {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE((short) 0, "Not Applicable"),

    /**
     * Notifications Only
     */
    NOTIFICATIONS_ONLY((short) 1, "Notifications Only"),

    /**
     * Cancel Non-Auction Orders and Block
     */
    CANCEL_NON_AUCTION_ORDERS_AND_BLOCK((short) 2, "Cancel Non-Auction Orders and Block"),

    /**
     * Block Only
     */
    BLOCK_ONLY((short) 3, "Block Only");

    private final short wire;

    private final String description;

    BreachActionRequest(short wire, String description) {
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
    public static Optional<BreachActionRequest> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(NOTIFICATIONS_ONLY);
            case 2 -> Optional.of(CANCEL_NON_AUCTION_ORDERS_AND_BLOCK);
            case 3 -> Optional.of(BLOCK_ONLY);
            default -> Optional.empty();
        };
    }
}
