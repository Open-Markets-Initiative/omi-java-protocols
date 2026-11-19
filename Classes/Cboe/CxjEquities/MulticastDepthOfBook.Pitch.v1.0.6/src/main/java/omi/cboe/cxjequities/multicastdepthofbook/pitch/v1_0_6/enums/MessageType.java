package omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Instructs feed recipients to clear all orders for the Cboe Japan book in the unit specified in the Sequenced Unit Header. It would be distributed in rare recovery events such as a datacenter fail-over.
     */
    UNIT_CLEAR_MESSAGE((short) 151, "Instructs feed recipients to clear all orders for the Cboe Japan book in the unit specified in the Sequenced Unit Header. It would be distributed in rare recovery events such as a datacenter fail-over."),

    /**
     * Used to indicate the current trading status of a security. A Trading Status message will be sent whenever trading status changes for a security.
     */
    TRADING_STATUS_MESSAGE((short) 80, "Used to indicate the current trading status of a security. A Trading Status message will be sent whenever trading status changes for a security."),

    /**
     * Represents a newly accepted order on the Cboe Japan book. It includes a day-specific Order Id assigned by Cboe Japan to the order.
     */
    ADD_ORDER_MESSAGE((short) 81, "Represents a newly accepted order on the Cboe Japan book. It includes a day-specific Order Id assigned by Cboe Japan to the order."),

    /**
     * Sent when a visible order on the Cboe Japan book is executed in whole or in part. The execution price equals the order price found in the original Add Order message or the order price in the latest Modify Order message referencing the Order Id.
     */
    ORDER_EXECUTED_MESSAGE((short) 82, "Sent when a visible order on the Cboe Japan book is executed in whole or in part. The execution price equals the order price found in the original Add Order message or the order price in the latest Modify Order message referencing the Order Id."),

    /**
     * Sent when a visible order on the Cboe Japan book is partially reduced.
     */
    REDUCE_SIZE_MESSAGE((short) 57, "Sent when a visible order on the Cboe Japan book is partially reduced."),

    /**
     * Sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message.
     */
    MODIFY_ORDER_MESSAGE((short) 58, "Sent whenever an open order is visibly modified. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * Sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message.
     */
    DELETE_ORDER_MESSAGE((short) 60, "Sent whenever a booked order is cancelled or leaves the order book. The Order Id refers to the Order Id of the original Add Order message."),

    /**
     * Sent when there is an execution against any non-displayed portion of an iceberg order. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book.
     */
    TRADE_MESSAGE((short) 83, "Sent when there is an execution against any non-displayed portion of an iceberg order. Trade messages do not alter the book and can be ignored if messages are being used solely to build a book."),

    /**
     * Sent whenever an execution on Cboe Japan is cancelled.
     */
    TRADE_BREAK_MESSAGE((short) 62, "Sent whenever an execution on Cboe Japan is cancelled."),

    /**
     * Sent for each unit when the unit shuts down. No additional sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.
     */
    END_OF_SESSION_MESSAGE((short) 45, "Sent for each unit when the unit shuts down. No additional sequenced messages will be delivered for this unit, but heartbeats from the unit may be received.");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 80 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 81 -> Optional.of(ADD_ORDER_MESSAGE);
            case 82 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 57 -> Optional.of(REDUCE_SIZE_MESSAGE);
            case 58 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 60 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 83 -> Optional.of(TRADE_MESSAGE);
            case 62 -> Optional.of(TRADE_BREAK_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
