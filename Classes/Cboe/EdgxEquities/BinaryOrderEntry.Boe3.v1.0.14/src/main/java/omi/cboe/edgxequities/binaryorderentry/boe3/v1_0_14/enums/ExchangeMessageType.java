package omi.cboe.edgxequities.binaryorderentry.boe3.v1_0_14.enums;

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
     * Order Acknowledgment messages are sent in response to New Order messages
     */
    ORDER_ACKNOWLEDGEMENT_US_EQUITIES_V1(4501, "Order Acknowledgment messages are sent in response to New Order messages"),

    /**
     * Order Rejected messages are sent in response to a New Order message which must be rejected
     */
    ORDER_REJECTED_US_EQUITIES_V1(4502, "Order Rejected messages are sent in response to a New Order message which must be rejected"),

    /**
     * Order Modified messages are sent in response to a Modify Request message to indicate that the order has been successfully modified
     */
    ORDER_MODIFIED_US_EQUITIES_V1(4503, "Order Modified messages are sent in response to a Modify Request message to indicate that the order has been successfully modified"),

    /**
     * Order Restated messages are sent to inform the Member that an order has been asynchronously modified for some reason without an explicit Modify Order message request having been sent
     */
    ORDER_RESTATED_US_EQUITIES_V1(4505, "Order Restated messages are sent to inform the Member that an order has been asynchronously modified for some reason without an explicit Modify Order message request having been sent"),

    /**
     * User Modify Rejected messages are sent in response to a Modify Order message for an order which cannot be modified
     */
    MODIFY_REJECTED_US_EQUITIES_V1(4504, "User Modify Rejected messages are sent in response to a Modify Order message for an order which cannot be modified"),

    /**
     * This message indicates an order has been cancelled
     */
    ORDER_CANCELLED_US_EQUITIES_V1(4506, "This message indicates an order has been cancelled"),

    /**
     * A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur
     */
    CANCEL_REJECTED_US_EQUITIES_V1(4507, "A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur"),

    /**
     * An Order Execution message is sent for each fill on an order
     */
    ORDER_EXECUTION_US_EQUITIES_V1(4508, "An Order Execution message is sent for each fill on an order"),

    /**
     * Used to relay a trade which has been cancelled (busted) or corrected (price change only)
     */
    TRADE_CANCEL_CORRECT_US_EQUITIES_V1(4509, "Used to relay a trade which has been cancelled (busted) or corrected (price change only)"),

    /**
     * A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur
     */
    PURGE_REJECTED_US_EQUITIES_V1(4512, "A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur"),

    /**
     * Response to a Reset Risk message request
     */
    RESET_RISK_ACKNOWLEDGEMENT_US_EQUITIES_V1(4510, "Response to a Reset Risk message request"),

    /**
     * A Purge Acknowledgment message is an unsequenced message sent when a Purge Orders message requesting an order purge has completed canceling all individual orders
     */
    PURGE_ACKNOWLEDGEMENT_US_EQUITIES_V1(4511, "A Purge Acknowledgment message is an unsequenced message sent when a Purge Orders message requesting an order purge has completed canceling all individual orders");

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
            case 4501 -> Optional.of(ORDER_ACKNOWLEDGEMENT_US_EQUITIES_V1);
            case 4502 -> Optional.of(ORDER_REJECTED_US_EQUITIES_V1);
            case 4503 -> Optional.of(ORDER_MODIFIED_US_EQUITIES_V1);
            case 4505 -> Optional.of(ORDER_RESTATED_US_EQUITIES_V1);
            case 4504 -> Optional.of(MODIFY_REJECTED_US_EQUITIES_V1);
            case 4506 -> Optional.of(ORDER_CANCELLED_US_EQUITIES_V1);
            case 4507 -> Optional.of(CANCEL_REJECTED_US_EQUITIES_V1);
            case 4508 -> Optional.of(ORDER_EXECUTION_US_EQUITIES_V1);
            case 4509 -> Optional.of(TRADE_CANCEL_CORRECT_US_EQUITIES_V1);
            case 4512 -> Optional.of(PURGE_REJECTED_US_EQUITIES_V1);
            case 4510 -> Optional.of(RESET_RISK_ACKNOWLEDGEMENT_US_EQUITIES_V1);
            case 4511 -> Optional.of(PURGE_ACKNOWLEDGEMENT_US_EQUITIES_V1);
            default -> Optional.empty();
        };
    }
}
