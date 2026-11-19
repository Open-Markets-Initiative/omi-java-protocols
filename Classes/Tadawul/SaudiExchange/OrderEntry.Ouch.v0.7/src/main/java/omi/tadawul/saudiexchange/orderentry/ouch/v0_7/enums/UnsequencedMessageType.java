package omi.tadawul.saudiexchange.orderentry.ouch.v0_7.enums;

import java.util.Optional;

/**
 * Value identifying unsequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnsequencedMessageType {

    /**
     * Client-generated enter order request
     */
    ENTER_ORDER_MESSAGE('O', "Client-generated enter order request"),

    /**
     * Client-generated replace order request. New Price and Quantity for the order must be specified in the message (these are the only values that can be amended)
     */
    REPLACE_ORDER_MESSAGE('U', "Client-generated replace order request. New Price and Quantity for the order must be specified in the message (these are the only values that can be amended)"),

    /**
     * Client-generated cancel order request
     */
    CANCEL_ORDER_MESSAGE('X', "Client-generated cancel order request");

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
