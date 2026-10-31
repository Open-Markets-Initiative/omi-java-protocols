package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

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
     * The Replace Order Message allows you to cancel and replace an existing order in a single message. This is more efficient than canceling an existing order and immediately succeeding it with a new order. Replacing an order always gives it a new timestamp for its time priority on the book. If you wish you simply partially cancel an order and retain its time priority, send a Cancel Order Message instead.
     */
    REPLACE_ORDER_MESSAGE('U', "The Replace Order Message allows you to cancel and replace an existing order in a single message. This is more efficient than canceling an existing order and immediately succeeding it with a new order. Replacing an order always gives it a new timestamp for its time priority on the book. If you wish you simply partially cancel an order and retain its time priority, send a Cancel Order Message instead."),

    /**
     * The Cancel Order Message is used to request that an order be canceled or reduced. In the Cancel Order Message, you must specify the new "intended order size" for the order. The "intended order size" is the maximum number of shares that can be executed in total after the cancel is applied.
     */
    CANCEL_ORDER_MESSAGE('X', "The Cancel Order Message is used to request that an order be canceled or reduced. In the Cancel Order Message, you must specify the new \"intended order size\" for the order. The \"intended order size\" is the maximum number of shares that can be executed in total after the cancel is applied."),

    /**
     * The Modify Order Message is used to request modifications that will not affect order priority on the book. Since priority of the order does not change, allowed modifications are restricted. Increasing share amount is not allowed and requests to do so will be ignored.
     */
    MODIFY_ORDER_MESSAGE('M', "The Modify Order Message is used to request modifications that will not affect order priority on the book. Since priority of the order does not change, allowed modifications are restricted. Increasing share amount is not allowed and requests to do so will be ignored."),

    /**
     * The Account Query Request message can be used when recovering state to request the next available UserRefNum that can be used for identifying new transactions.
     */
    ACCOUNT_QUERY_MESSAGE('Q', "The Account Query Request message can be used when recovering state to request the next available UserRefNum that can be used for identifying new transactions."),

    /**
     * The Mass Cancel Request message allows firms to initiate the cancellation of one or more orders that are currently booked at the exchange if they match the criteria specified in the request. If no optional criteria are specified then all orders for the specified firm on the account will be cancelled. Optional criteria can be specified in the Appendage field.
     */
    MASS_CANCEL_REQUEST_MESSAGE('C', "The Mass Cancel Request message allows firms to initiate the cancellation of one or more orders that are currently booked at the exchange if they match the criteria specified in the request. If no optional criteria are specified then all orders for the specified firm on the account will be cancelled. Optional criteria can be specified in the Appendage field."),

    /**
     * The Disable Order Entry Request allows firms the ability to block submissions of new orders on a particular account.
     */
    DISABLE_ORDER_ENTRY_REQUEST_MESSAGE('D', "The Disable Order Entry Request allows firms the ability to block submissions of new orders on a particular account."),

    /**
     * The Enable Order Entry Request allows firms the ability to unblock submission of new orders on a particular account.
     */
    ENABLE_ORDER_ENTRY_REQUEST_MESSAGE('E', "The Enable Order Entry Request allows firms the ability to unblock submission of new orders on a particular account.");

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
            case 'M' -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 'Q' -> Optional.of(ACCOUNT_QUERY_MESSAGE);
            case 'C' -> Optional.of(MASS_CANCEL_REQUEST_MESSAGE);
            case 'D' -> Optional.of(DISABLE_ORDER_ENTRY_REQUEST_MESSAGE);
            case 'E' -> Optional.of(ENABLE_ORDER_ENTRY_REQUEST_MESSAGE);
            default -> Optional.empty();
        };
    }
}
