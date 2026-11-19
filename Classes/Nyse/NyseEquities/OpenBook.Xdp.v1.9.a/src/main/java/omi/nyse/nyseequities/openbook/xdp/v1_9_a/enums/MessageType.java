package omi.nyse.nyseequities.openbook.xdp.v1_9_a.enums;

import java.util.Optional;

/**
 * The type of this message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Order Book Add Order message. Size of the message: 31 bytes (NYSE, NYSE MKT and NYSE Arca).
     */
    ADD_ORDER_MESSAGE(100, "Order Book Add Order message. Size of the message: 31 bytes (NYSE, NYSE MKT and NYSE Arca)."),

    /**
     * Order Book Attribution Add Order message. Size of the message: NYSE 31 bytes, NYSE MKT 31 bytes, NYSE Arca 36 bytes.
     */
    ATTRIBUTED_ADD_ORDER_MESSAGE(107, "Order Book Attribution Add Order message. Size of the message: NYSE 31 bytes, NYSE MKT 31 bytes, NYSE Arca 36 bytes."),

    /**
     * Sent when an order in the Order Book is modified: the price or the size of the order changes, or the order is routed to an away market with some shares remaining in the Order Book. The Order ID refers to the original order sent in the add order message. Size of the message: 31 bytes (NYSE, NYSE MKT and NYSE Arca).
     */
    MODIFY_ORDER_MESSAGE(101, "Sent when an order in the Order Book is modified: the price or the size of the order changes, or the order is routed to an away market with some shares remaining in the Order Book. The Order ID refers to the original order sent in the add order message. Size of the message: 31 bytes (NYSE, NYSE MKT and NYSE Arca)."),

    /**
     * Sent when an order is taken off of the order book: the order is cancelled, expires, or is routed to an away market. Size of the message: 23 bytes (NYSE, NYSE MKT and NYSE Arca).
     */
    DELETE_ORDER_MESSAGE(102, "Sent when an order is taken off of the order book: the order is cancelled, expires, or is routed to an away market. Size of the message: 23 bytes (NYSE, NYSE MKT and NYSE Arca)."),

    /**
     * Order Book Execution message. With reason codes set to zero, a partial fill is followed by a modify message and a full fill by a delete message for the executed OrderID; with reason codes in use, only the execution message is sent, with reason code 7 (reduce the order's volume) or 3 (remove the order). Size of the message: 34 bytes (NYSE, NYSE MKT and NYSE Arca).
     */
    EXECUTION_MESSAGE(103, "Order Book Execution message. With reason codes set to zero, a partial fill is followed by a modify message and a full fill by a delete message for the executed OrderID; with reason codes in use, only the execution message is sent, with reason code 7 (reduce the order's volume) or 3 (remove the order). Size of the message: 34 bytes (NYSE, NYSE MKT and NYSE Arca)."),

    /**
     * Sent only during a refresh or after a symbol clear which will result in a book refresh. Size of the message: 35 bytes (NYSE, NYSE MKT and NYSE Arca).
     */
    ADD_ORDER_REFRESH_MESSAGE(106, "Sent only during a refresh or after a symbol clear which will result in a book refresh. Size of the message: 35 bytes (NYSE, NYSE MKT and NYSE Arca)."),

    /**
     * Sent by NYSE Arca only during a refresh or after a symbol clear which will result in a book refresh. Size of the message: NYSE 35 bytes, NYSE MKT 35 bytes, NYSE Arca 40 bytes.
     */
    ATTRIBUTED_ADD_ORDER_REFRESH_MESSAGE(108, "Sent by NYSE Arca only during a refresh or after a symbol clear which will result in a book refresh. Size of the message: NYSE 35 bytes, NYSE MKT 35 bytes, NYSE Arca 40 bytes."),

    /**
     * Imbalance message. Size of the message: 52 bytes (NYSE, NYSE MKT and NYSE Arca).
     */
    IMBALANCE_MESSAGE(105, "Imbalance message. Size of the message: 52 bytes (NYSE, NYSE MKT and NYSE Arca).");

    private final int wire;

    private final String description;

    MessageType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<MessageType> fromWire(int wire) {
        return switch (wire) {
            case 100 -> Optional.of(ADD_ORDER_MESSAGE);
            case 107 -> Optional.of(ATTRIBUTED_ADD_ORDER_MESSAGE);
            case 101 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 102 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 103 -> Optional.of(EXECUTION_MESSAGE);
            case 106 -> Optional.of(ADD_ORDER_REFRESH_MESSAGE);
            case 108 -> Optional.of(ATTRIBUTED_ADD_ORDER_REFRESH_MESSAGE);
            case 105 -> Optional.of(IMBALANCE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
