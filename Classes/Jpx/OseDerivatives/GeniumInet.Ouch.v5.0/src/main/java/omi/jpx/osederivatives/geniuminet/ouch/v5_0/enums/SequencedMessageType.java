package omi.jpx.osederivatives.geniuminet.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * Acknowledges the receipt and acceptance of a valid Enter Order Message
     */
    ORDER_ACCEPTED('A', "Acknowledges the receipt and acceptance of a valid Enter Order Message"),

    /**
     * System notification indicating acceptance of a mass cancel request.
     */
    MASS_CANCEL_ACCEPTED('M', "System notification indicating acceptance of a mass cancel request."),

    /**
     * System notification indicating that an order has been rejected.
     */
    ORDER_REJECTED('J', "System notification indicating that an order has been rejected."),

    /**
     * System notification indicating that an order has been successfully replaced.
     */
    ORDER_REPLACED('U', "System notification indicating that an order has been successfully replaced."),

    /**
     * System notification indicating that an order has been canceled.
     */
    ORDER_CANCELED('C', "System notification indicating that an order has been canceled."),

    /**
     * System notification indicating that an order (or order leg) has been executed.
     */
    ORDER_EXECUTED('E', "System notification indicating that an order (or order leg) has been executed.");

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
            case 'A' -> Optional.of(ORDER_ACCEPTED);
            case 'M' -> Optional.of(MASS_CANCEL_ACCEPTED);
            case 'J' -> Optional.of(ORDER_REJECTED);
            case 'U' -> Optional.of(ORDER_REPLACED);
            case 'C' -> Optional.of(ORDER_CANCELED);
            case 'E' -> Optional.of(ORDER_EXECUTED);
            default -> Optional.empty();
        };
    }
}
