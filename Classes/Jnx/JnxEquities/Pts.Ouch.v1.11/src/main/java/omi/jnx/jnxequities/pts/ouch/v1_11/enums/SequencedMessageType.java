package omi.jnx.jnxequities.pts.ouch.v1_11.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * A System Event Message signals a Japannext PTS system-wide event
     */
    SYSTEM_EVENT_MESSAGE('S', "A System Event Message signals a Japannext PTS system-wide event"),

    /**
     * An Order Accepted Message acknowledges the receipt and acceptance of a valid Enter Order Message
     */
    ORDER_ACCEPTED_MESSAGE('A', "An Order Accepted Message acknowledges the receipt and acceptance of a valid Enter Order Message"),

    /**
     * An Order Replaced Message acknowledges the receipt and acceptance of a valid Replace Order Message
     */
    ORDER_REPLACED_MESSAGE('U', "An Order Replaced Message acknowledges the receipt and acceptance of a valid Replace Order Message"),

    /**
     * An Order Canceled Message denotes that an order has been canceled
     */
    ORDER_CANCELED_MESSAGE('C', "An Order Canceled Message denotes that an order has been canceled"),

    /**
     * An Order AIQ Canceled Message denotes that an order has been canceled by Japannext PTS to prevent a self-trade
     */
    ORDER_AIQ_CANCELED_MESSAGE('D', "An Order AIQ Canceled Message denotes that an order has been canceled by Japannext PTS to prevent a self-trade"),

    /**
     * An Order Executed Message denotes that all or part of an order has been executed
     */
    ORDER_EXECUTED_MESSAGE('E', "An Order Executed Message denotes that all or part of an order has been executed"),

    /**
     * An Order Rejected Message may be sent in response to an Enter Order Message if the order cannot be accepted
     */
    ORDER_REJECTED_MESSAGE('J', "An Order Rejected Message may be sent in response to an Enter Order Message if the order cannot be accepted");

    private final char wire;

    private final String description;

    SequencedMessageType(char wire, String description) {
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
    public static Optional<SequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'A' -> Optional.of(ORDER_ACCEPTED_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACED_MESSAGE);
            case 'C' -> Optional.of(ORDER_CANCELED_MESSAGE);
            case 'D' -> Optional.of(ORDER_AIQ_CANCELED_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'J' -> Optional.of(ORDER_REJECTED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
