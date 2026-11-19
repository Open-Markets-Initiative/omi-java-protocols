package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.enums;

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
     * OrderAcknowledgementMessage
     */
    ORDER_ACKNOWLEDGEMENT_MESSAGE(2501, "OrderAcknowledgementMessage"),

    /**
     * OrderAcknowledgementMessage
     */
    CROSS_ORDER_ACKNOWLEDGMENT_MESSAGE(2502, "OrderAcknowledgementMessage"),

    /**
     * Quote Update Acknowledgment messages are sent in response to a Quote Update message
     */
    QUOTE_UPDATE_ACKNOWLEDGEMENT_MESSAGE(2517, "Quote Update Acknowledgment messages are sent in response to a Quote Update message"),

    /**
     * Order Rejected messages are sent in response to a New Order message which must be rejected
     */
    ORDER_REJECTED_MESSAGE(2503, "Order Rejected messages are sent in response to a New Order message which must be rejected"),

    /**
     * Cross Order Rejected messages are sent in response to a New Order Cross and New Order Cross Multileg message which must be rejected
     */
    CROSS_ORDER_REJECTED_MESSAGE(2504, "Cross Order Rejected messages are sent in response to a New Order Cross and New Order Cross Multileg message which must be rejected"),

    /**
     * Quote Update Rejected messages are sent in response to a Quote Update message when the entire quote block is rejected by the order handler
     */
    QUOTE_UPDATE_REJECTED_MESSAGE(2518, "Quote Update Rejected messages are sent in response to a Quote Update message when the entire quote block is rejected by the order handler"),

    /**
     * Order Modified messages are sent in response to a Modify Request message to indicate that the order has been successfully modified
     */
    ORDER_MODIFIED_MESSAGE(2507, "Order Modified messages are sent in response to a Modify Request message to indicate that the order has been successfully modified"),

    /**
     * Order Restated messages are sent to inform the Member that an order has been asynchronously modified
     */
    ORDER_RESTATED_MESSAGE(2509, "Order Restated messages are sent to inform the Member that an order has been asynchronously modified"),

    /**
     * Quote Restated messages are sent to inform the Member that an order has been asynchronously modified for some reason by the Exchange
     */
    QUOTE_RESTATED_MESSAGE(2521, "Quote Restated messages are sent to inform the Member that an order has been asynchronously modified for some reason by the Exchange"),

    /**
     * User Modify Rejected messages are sent in response to a Modify Order message for an order which cannot be modified
     */
    MODIFY_REJECTED_MESSAGE(2508, "User Modify Rejected messages are sent in response to a Modify Order message for an order which cannot be modified"),

    /**
     * This message indicates an order has been cancelled
     */
    ORDER_CANCELLED_MESSAGE(2512, "This message indicates an order has been cancelled"),

    /**
     * A Quote Cancelled message will be sent to indicate an unsolicited cancellation of a quote entered with a Quote Update message
     */
    QUOTE_CANCELLED_MESSAGE(2519, "A Quote Cancelled message will be sent to indicate an unsolicited cancellation of a quote entered with a Quote Update message"),

    /**
     * A New Order Cross message has been cancelled
     */
    CROSS_ORDER_CANCELLED_MESSAGE(2513, "A New Order Cross message has been cancelled"),

    /**
     * A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur
     */
    CANCEL_REJECTED_MESSAGE(2514, "A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur"),

    /**
     * An Order Execution message is sent for each fill on an order
     */
    ORDER_EXECUTION_MESSAGE(2515, "An Order Execution message is sent for each fill on an order"),

    /**
     * A Quote Execution message is used to indicate an execution has occurred on a resting quote
     */
    QUOTE_EXECUTION_MESSAGE(2520, "A Quote Execution message is used to indicate an execution has occurred on a resting quote"),

    /**
     * Used to relay a trade which has been cancelled (busted) or corrected
     */
    TRADE_CANCEL_CORRECT_MESSAGE(2516, "Used to relay a trade which has been cancelled (busted) or corrected"),

    /**
     * A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur
     */
    PURGE_REJECTED_MESSAGE(2526, "A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur"),

    /**
     * Response to a Reset Risk message request
     */
    RESET_RISK_ACKNOWLEDGEMENT_MESSAGE(2522, "Response to a Reset Risk message request"),

    /**
     * A Mass Cancel Acknowledgment message is an unsequenced message sent when a Mass Cancel Order message requesting a mass cancellation has completed canceling all individual orders
     */
    MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE(2523, "A Mass Cancel Acknowledgment message is an unsequenced message sent when a Mass Cancel Order message requesting a mass cancellation has completed canceling all individual orders"),

    /**
     * A Mass Cancel Rejected message is sent in response to a Mass Cancel message to indicate that the mass cancellation cannot occur
     */
    MASS_CANCEL_REJECTED_MESSAGE(2524, "A Mass Cancel Rejected message is sent in response to a Mass Cancel message to indicate that the mass cancellation cannot occur"),

    /**
     * A Purge Acknowledgment message is an unsequenced message sent when a Purge Orders message requesting an order purge has completed canceling all individual orders
     */
    PURGE_ACKNOWLEDGEMENT_MESSAGE(2525, "A Purge Acknowledgment message is an unsequenced message sent when a Purge Orders message requesting an order purge has completed canceling all individual orders"),

    /**
     * One Purge Notification message is sent for each matching unit that cancelled orders for that order entry port
     */
    PURGE_NOTIFICATION_MESSAGE(2527, "One Purge Notification message is sent for each matching unit that cancelled orders for that order entry port"),

    /**
     * The New Complex Instrument Accepted message is used to indicate acceptance of a complex strategy
     */
    NEW_COMPLEX_INSTRUMENT_ACCEPTED_MESSAGE(2505, "The New Complex Instrument Accepted message is used to indicate acceptance of a complex strategy"),

    /**
     * The New Complex Instrument Rejected message is used to indicate that a requested complex strategy has been rejected
     */
    NEW_COMPLEX_INSTRUMENT_REJECTED_MESSAGE(2506, "The New Complex Instrument Rejected message is used to indicate that a requested complex strategy has been rejected"),

    /**
     * The Carried Restatement message is used to indicate the restoration of a multi-day GTC or GTD order at the start of a new business day
     */
    CARRIED_RESTATEMENT_MESSAGE(2510, "The Carried Restatement message is used to indicate the restoration of a multi-day GTC or GTD order at the start of a new business day"),

    /**
     * The Done For Day messages represent orders persisted during the current day session to carry over to the next session
     */
    DONE_FOR_DAY_MESSAGE(2511, "The Done For Day messages represent orders persisted during the current day session to carry over to the next session");

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
            case 2501 -> Optional.of(ORDER_ACKNOWLEDGEMENT_MESSAGE);
            case 2502 -> Optional.of(CROSS_ORDER_ACKNOWLEDGMENT_MESSAGE);
            case 2517 -> Optional.of(QUOTE_UPDATE_ACKNOWLEDGEMENT_MESSAGE);
            case 2503 -> Optional.of(ORDER_REJECTED_MESSAGE);
            case 2504 -> Optional.of(CROSS_ORDER_REJECTED_MESSAGE);
            case 2518 -> Optional.of(QUOTE_UPDATE_REJECTED_MESSAGE);
            case 2507 -> Optional.of(ORDER_MODIFIED_MESSAGE);
            case 2509 -> Optional.of(ORDER_RESTATED_MESSAGE);
            case 2521 -> Optional.of(QUOTE_RESTATED_MESSAGE);
            case 2508 -> Optional.of(MODIFY_REJECTED_MESSAGE);
            case 2512 -> Optional.of(ORDER_CANCELLED_MESSAGE);
            case 2519 -> Optional.of(QUOTE_CANCELLED_MESSAGE);
            case 2513 -> Optional.of(CROSS_ORDER_CANCELLED_MESSAGE);
            case 2514 -> Optional.of(CANCEL_REJECTED_MESSAGE);
            case 2515 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 2520 -> Optional.of(QUOTE_EXECUTION_MESSAGE);
            case 2516 -> Optional.of(TRADE_CANCEL_CORRECT_MESSAGE);
            case 2526 -> Optional.of(PURGE_REJECTED_MESSAGE);
            case 2522 -> Optional.of(RESET_RISK_ACKNOWLEDGEMENT_MESSAGE);
            case 2523 -> Optional.of(MASS_CANCEL_ACKNOWLEDGMENT_MESSAGE);
            case 2524 -> Optional.of(MASS_CANCEL_REJECTED_MESSAGE);
            case 2525 -> Optional.of(PURGE_ACKNOWLEDGEMENT_MESSAGE);
            case 2527 -> Optional.of(PURGE_NOTIFICATION_MESSAGE);
            case 2505 -> Optional.of(NEW_COMPLEX_INSTRUMENT_ACCEPTED_MESSAGE);
            case 2506 -> Optional.of(NEW_COMPLEX_INSTRUMENT_REJECTED_MESSAGE);
            case 2510 -> Optional.of(CARRIED_RESTATEMENT_MESSAGE);
            case 2511 -> Optional.of(DONE_FOR_DAY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
