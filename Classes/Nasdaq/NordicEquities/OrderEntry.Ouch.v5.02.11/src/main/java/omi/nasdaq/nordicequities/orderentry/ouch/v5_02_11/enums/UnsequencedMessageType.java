package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.enums;

import java.util.Optional;

/**
 * Value identifying unsequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnsequencedMessageType {

    /**
     * Enters a new order into Nasdaq Nordic
     */
    ENTER_ORDER_MESSAGE('O', "Enters a new order into Nasdaq Nordic"),

    /**
     * Alters attributes of a live order in a single message
     */
    REPLACE_ORDER_MESSAGE('U', "Alters attributes of a live order in a single message"),

    /**
     * Requests that an order be cancelled or reduced
     */
    CANCEL_ORDER_MESSAGE('X', "Requests that an order be cancelled or reduced"),

    /**
     * Requests the next available UserRefNum when recovering state
     */
    ACCOUNT_QUERY_MESSAGE('Q', "Requests the next available UserRefNum when recovering state"),

    /**
     * Requests a market making instruction notification
     */
    MMI_NOTIFICATION_REQUEST_MESSAGE('M', "Requests a market making instruction notification");

    private final char wire;

    private final String description;

    UnsequencedMessageType(char wire, String description) {
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
    public static Optional<UnsequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(ENTER_ORDER_MESSAGE);
            case 'U' -> Optional.of(REPLACE_ORDER_MESSAGE);
            case 'X' -> Optional.of(CANCEL_ORDER_MESSAGE);
            case 'Q' -> Optional.of(ACCOUNT_QUERY_MESSAGE);
            case 'M' -> Optional.of(MMI_NOTIFICATION_REQUEST_MESSAGE);
            default -> Optional.empty();
        };
    }
}
