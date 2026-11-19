package omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.enums;

import java.util.Optional;

/**
 * type of message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum ExchangeMessageType {

    /**
     * A Login Response message is sent in response to a Login Request message
     */
    LOGIN_RESPONSE_MESSAGE(501, "A Login Response message is sent in response to a Login Request message"),

    /**
     * Replay Complete
     */
    REPLAY_COMPLETE_MESSAGE(502, "Replay Complete"),

    /**
     * A Logout Response is usually sent in response to a Logout Request
     */
    LOGOUT_RESPONSE_MESSAGE(503, "A Logout Response is usually sent in response to a Logout Request"),

    /**
     * Server Heartbeat
     */
    SERVER_HEARTBEAT_MESSAGE(504, "Server Heartbeat"),

    /**
     * Order Acknowledgement messages are sent in response to a New Order message
     */
    ORDER_ACKNOWLEDGEMENT_JP_EQUITIES_V1(5501, "Order Acknowledgement messages are sent in response to a New Order message"),

    /**
     * Order Rejected messages are sent in response to a New Order which must be rejected
     */
    ORDER_REJECTED_JP_EQUITIES_V1(5502, "Order Rejected messages are sent in response to a New Order which must be rejected"),

    /**
     * Order Modified messages are sent in response to a Modify Order to indicate that the order has been successfully modified
     */
    ORDER_MODIFIED_JP_EQUITIES_V1(5503, "Order Modified messages are sent in response to a Modify Order to indicate that the order has been successfully modified"),

    /**
     * Modify Rejected messages are sent in response to a Modify Order for an order which cannot be modified
     */
    MODIFY_REJECTED_JP_EQUITIES_V1(5504, "Modify Rejected messages are sent in response to a Modify Order for an order which cannot be modified"),

    /**
     * If an order is cancelled or reduced due to Self-Trade Protection instructions, the order will be restated with reductions to OrderQty and/or LeavesQty
     */
    ORDER_RESTATED_JP_EQUITIES_V1(5505, "If an order is cancelled or reduced due to Self-Trade Protection instructions, the order will be restated with reductions to OrderQty and/or LeavesQty"),

    /**
     * An Order Execution is sent for each fill on an order
     */
    ORDER_EXECUTION_JP_EQUITIES_V1(5506, "An Order Execution is sent for each fill on an order"),

    /**
     * Order Cancelled message
     */
    ORDER_CANCELLED_JP_EQUITIES_V1(5507, "Order Cancelled message"),

    /**
     * A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur
     */
    CANCEL_REJECTED_JP_EQUITIES_V1(5508, "A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur"),

    /**
     * A Purge Acknowledgment is an unsequenced message sent when a Purge Orders message requesting an order purge has completed cancelling all individual orders
     */
    PURGE_ACKNOWLEDGEMENT_JP_EQUITIES_V1(5510, "A Purge Acknowledgment is an unsequenced message sent when a Purge Orders message requesting an order purge has completed cancelling all individual orders"),

    /**
     * A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur
     */
    PURGE_REJECTED_JP_EQUITIES_V1(5511, "A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur");

    private final int wire;

    private final String description;

    ExchangeMessageType(int wire, String description) {
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
    public static Optional<ExchangeMessageType> fromWire(int wire) {
        return switch (wire) {
            case 501 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 502 -> Optional.of(REPLAY_COMPLETE_MESSAGE);
            case 503 -> Optional.of(LOGOUT_RESPONSE_MESSAGE);
            case 504 -> Optional.of(SERVER_HEARTBEAT_MESSAGE);
            case 5501 -> Optional.of(ORDER_ACKNOWLEDGEMENT_JP_EQUITIES_V1);
            case 5502 -> Optional.of(ORDER_REJECTED_JP_EQUITIES_V1);
            case 5503 -> Optional.of(ORDER_MODIFIED_JP_EQUITIES_V1);
            case 5504 -> Optional.of(MODIFY_REJECTED_JP_EQUITIES_V1);
            case 5505 -> Optional.of(ORDER_RESTATED_JP_EQUITIES_V1);
            case 5506 -> Optional.of(ORDER_EXECUTION_JP_EQUITIES_V1);
            case 5507 -> Optional.of(ORDER_CANCELLED_JP_EQUITIES_V1);
            case 5508 -> Optional.of(CANCEL_REJECTED_JP_EQUITIES_V1);
            case 5510 -> Optional.of(PURGE_ACKNOWLEDGEMENT_JP_EQUITIES_V1);
            case 5511 -> Optional.of(PURGE_REJECTED_JP_EQUITIES_V1);
            default -> Optional.empty();
        };
    }
}
