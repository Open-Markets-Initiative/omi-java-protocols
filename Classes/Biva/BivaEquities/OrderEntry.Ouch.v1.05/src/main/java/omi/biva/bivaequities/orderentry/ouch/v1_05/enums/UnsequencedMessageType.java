package omi.biva.bivaequities.orderentry.ouch.v1_05.enums;

import java.util.Optional;

/**
 * Value identifying unsequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnsequencedMessageType {

    /**
     * Enter order message
     */
    ENTER_ORDER_MESSAGE('O', "Enter order message"),

    /**
     * Replace order message, the account id orderbook client id and order verb are inherited from the original order
     */
    REPLACE_ORDER_MESSAGE('U', "Replace order message, the account id orderbook client id and order verb are inherited from the original order"),

    /**
     * Cancel order message
     */
    CANCEL_ORDER_MESSAGE('X', "Cancel order message");

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
            default -> Optional.empty();
        };
    }
}
