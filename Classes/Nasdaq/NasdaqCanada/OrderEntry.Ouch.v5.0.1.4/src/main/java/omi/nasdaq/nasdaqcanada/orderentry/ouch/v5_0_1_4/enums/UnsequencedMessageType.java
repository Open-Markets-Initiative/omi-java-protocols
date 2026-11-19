package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Value identifying unsequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnsequencedMessageType {

    /**
     * Enter Order Message
     */
    ENTER_ORDER_MESSAGE('O', "Enter Order Message"),

    /**
     * The Replace Order Message allows you to alter most of the attributes of an order in a single message. This is more efficient than canceling an existing order and immediately succeeding it with a new order.
     */
    REPLACE_ORDER_REQUEST_MESSAGE('U', "The Replace Order Message allows you to alter most of the attributes of an order in a single message. This is more efficient than canceling an existing order and immediately succeeding it with a new order."),

    /**
     * The Cancel Order Message is used to request that an order be canceled or reduced. You must specify the new intended order size, the maximum number of shares that can be executed in total after the cancel is applied.
     */
    CANCEL_ORDER_REQUEST_MESSAGE('X', "The Cancel Order Message is used to request that an order be canceled or reduced. You must specify the new intended order size, the maximum number of shares that can be executed in total after the cancel is applied."),

    /**
     * The Account Query Request message can be used when recovering state to request the next available UserRefNum that can be used for identifying new transactions.
     */
    ACCOUNT_QUERY_REQUEST_MESSAGE('Q', "The Account Query Request message can be used when recovering state to request the next available UserRefNum that can be used for identifying new transactions.");

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
            case 'U' -> Optional.of(REPLACE_ORDER_REQUEST_MESSAGE);
            case 'X' -> Optional.of(CANCEL_ORDER_REQUEST_MESSAGE);
            case 'Q' -> Optional.of(ACCOUNT_QUERY_REQUEST_MESSAGE);
            default -> Optional.empty();
        };
    }
}
