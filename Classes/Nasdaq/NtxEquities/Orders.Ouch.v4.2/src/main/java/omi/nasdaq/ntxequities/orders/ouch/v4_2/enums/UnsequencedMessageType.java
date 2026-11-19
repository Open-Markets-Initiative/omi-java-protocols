package omi.nasdaq.ntxequities.orders.ouch.v4_2.enums;

import java.util.Optional;

/**
 * Value identifying unsequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnsequencedMessageType {

    /**
     * The Enter Order Message lets you enter a new order into NASDAQ OMX BX.
     */
    ENTER_ORDER_MESSAGE('O', "The Enter Order Message lets you enter a new order into NASDAQ OMX BX."),

    /**
     * The Replace Order Message allows you to alter most of the attributes of an order in a single message. This is more efficient than canceling an existing order and immediately succeeding it with a new order. Replacing an order always gives it a new timestamp for its time priority on the book. If you wish you simply partially cancel an order and retain its time priority, send a Cancel Order Message instead.
     */
    REPLACE_ORDER_MESSAGE('U', "The Replace Order Message allows you to alter most of the attributes of an order in a single message. This is more efficient than canceling an existing order and immediately succeeding it with a new order. Replacing an order always gives it a new timestamp for its time priority on the book. If you wish you simply partially cancel an order and retain its time priority, send a Cancel Order Message instead."),

    /**
     * The Cancel Order Message is used to request that an order be canceled or reduced. In the Cancel Order Message, you must specify the new "intended order size" for the order. The "intended order size" is the maximum number of shares that can be executed in total after the cancel is applied.
     */
    CANCEL_ORDER_MESSAGE('X', "The Cancel Order Message is used to request that an order be canceled or reduced. In the Cancel Order Message, you must specify the new \"intended order size\" for the order. The \"intended order size\" is the maximum number of shares that can be executed in total after the cancel is applied."),

    /**
     * The Modify Order Message is used to request modifications that don't affect order priority on the book. Since priority of the order does not change allowed modifications are restricted to only the ones specified in the message details below.
     */
    MODIFY_ORDER_MESSAGE('M', "The Modify Order Message is used to request modifications that don't affect order priority on the book. Since priority of the order does not change allowed modifications are restricted to only the ones specified in the message details below."),

    /**
     * The Trade Now Message is used to request that an order remove against any available shares of locking contra-side orders. Usage of the Trade Now Message will not affect order priority on the book
     */
    TRADE_NOW_MESSAGE('N', "The Trade Now Message is used to request that an order remove against any available shares of locking contra-side orders. Usage of the Trade Now Message will not affect order priority on the book");

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
            case 'N' -> Optional.of(TRADE_NOW_MESSAGE);
            default -> Optional.empty();
        };
    }
}
