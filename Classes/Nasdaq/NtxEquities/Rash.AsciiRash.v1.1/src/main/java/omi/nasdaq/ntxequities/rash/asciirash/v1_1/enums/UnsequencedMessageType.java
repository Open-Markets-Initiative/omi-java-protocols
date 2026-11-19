package omi.nasdaq.ntxequities.rash.asciirash.v1_1.enums;

import java.util.Optional;

/**
 * Value identifying unsequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnsequencedMessageType {

    /**
     * The Enter Order Message lets you enter a new order. Each new order must have a Token that is unique to the day and that logical RASH Port account. If you send a valid order, you should receive an Accepted Order Message.
     */
    ENTER_ORDER_MESSAGE('O', "The Enter Order Message lets you enter a new order. Each new order must have a Token that is unique to the day and that logical RASH Port account. If you send a valid order, you should receive an Accepted Order Message."),

    /**
     * Enters orders in much the same way as the Enter Order Message, with a few additional fields. Notably, the Cross Type Flag allows you to specify that an order begins participation in a cross.
     */
    ENTER_ORDER_MESSAGE_WITH_CROSS_FUNCTIONALITY('Q', "Enters orders in much the same way as the Enter Order Message, with a few additional fields. Notably, the Cross Type Flag allows you to specify that an order begins participation in a cross."),

    /**
     * Requests that an order be canceled. A Shares field of zero cancels the entire balance of the order; otherwise Shares is the new intended order size.
     */
    CANCEL_ORDER_MESSAGE('X', "Requests that an order be canceled. A Shares field of zero cancels the entire balance of the order; otherwise Shares is the new intended order size.");

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
            case 'Q' -> Optional.of(ENTER_ORDER_MESSAGE_WITH_CROSS_FUNCTIONALITY);
            case 'X' -> Optional.of(CANCEL_ORDER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
