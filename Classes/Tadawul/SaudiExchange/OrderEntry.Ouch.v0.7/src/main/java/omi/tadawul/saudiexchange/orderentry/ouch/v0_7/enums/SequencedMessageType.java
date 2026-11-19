package omi.tadawul.saudiexchange.orderentry.ouch.v0_7.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * Indicates the start and end of OUCH operation. Market events (e.g. pre-open, open) are sent via the ITCH protocol
     */
    SYSTEM_EVENT_MESSAGE('S', "Indicates the start and end of OUCH operation. Market events (e.g. pre-open, open) are sent via the ITCH protocol"),

    /**
     * Acknowledges the receipt and acceptance of a valid Enter Order Message. A successfully entered order will result in an OUCH Accepted Message being sent by the exchange. For an IOC order that expires immediately without trading, the Accepted message has the state Dead
     */
    ACCEPTED_MESSAGE('A', "Acknowledges the receipt and acceptance of a valid Enter Order Message. A successfully entered order will result in an OUCH Accepted Message being sent by the exchange. For an IOC order that expires immediately without trading, the Accepted message has the state Dead"),

    /**
     * A successfully replaced order will result in an OUCH Replaced Message being sent by the exchange. For an order replaced with a new quantity equal to the total executed quantity, the replace is accepted and the Replaced message has the state Dead
     */
    REPLACED_MESSAGE('U', "A successfully replaced order will result in an OUCH Replaced Message being sent by the exchange. For an order replaced with a new quantity equal to the total executed quantity, the replace is accepted and the Replaced message has the state Dead"),

    /**
     * Sent by the exchange when an order is cancelled or reduced. May be sent in response to a Cancel Order or Replace Order request, or unsolicited
     */
    CANCELLED_MESSAGE('C', "Sent by the exchange when an order is cancelled or reduced. May be sent in response to a Cancel Order or Replace Order request, or unsolicited"),

    /**
     * Sent by the exchange when a portion of an order is executed
     */
    EXECUTED_ORDER_MESSAGE('E', "Sent by the exchange when a portion of an order is executed"),

    /**
     * Sent by the exchange when an Enter Order or Replace Order request is rejected
     */
    REJECTED_ORDER_MESSAGE('J', "Sent by the exchange when an Enter Order or Replace Order request is rejected");

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
            case 'A' -> Optional.of(ACCEPTED_MESSAGE);
            case 'U' -> Optional.of(REPLACED_MESSAGE);
            case 'C' -> Optional.of(CANCELLED_MESSAGE);
            case 'E' -> Optional.of(EXECUTED_ORDER_MESSAGE);
            case 'J' -> Optional.of(REJECTED_ORDER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
