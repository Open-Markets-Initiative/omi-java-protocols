package omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.enums;

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
     * Order Acknowledgement messages are sent in response to a new order message
     */
    ORDER_ACKNOWLEDGEMENT_MESSAGE(1501, "Order Acknowledgement messages are sent in response to a new order message"),

    /**
     * Order Rejected messages are sent in response to a New Order which must be rejected
     */
    ORDER_REJECTED_MESSAGE(1502, "Order Rejected messages are sent in response to a New Order which must be rejected"),

    /**
     * Order Modified messages are sent in response to a Modify Order to indicate that the orderhas been successfully modified
     */
    ORDER_MODIFIED_MESSAGE(1503, "Order Modified messages are sent in response to a Modify Order to indicate that the orderhas been successfully modified"),

    /**
     * Modify Rejected messages are sent in response to a Modify Order for an order which cannot be modified
     */
    MODIFY_REJECTED_MESSAGE(1504, "Modify Rejected messages are sent in response to a Modify Order for an order which cannot be modified"),

    /**
     * An Order Execution is sent for each fill on an order
     */
    ORDER_EXECUTION_MESSAGE(1505, "An Order Execution is sent for each fill on an order"),

    /**
     * Order Cancelled message
     */
    ORDER_CANCELLED_MESSAGE(1506, "Order Cancelled message"),

    /**
     * A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur
     */
    CANCEL_REJECTED_MESSAGE(1507, "A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur"),

    /**
     * A Mass Cancel Acknowledgment is an unsequenced message sent when a Cancel Order or Purge Orders message requesting a mass cancellation has completed cancelling all individual orders
     */
    MASS_CANCEL_ACKNOWLEDGEMENT_MESSAGE(1508, "A Mass Cancel Acknowledgment is an unsequenced message sent when a Cancel Order or Purge Orders message requesting a mass cancellation has completed cancelling all individual orders"),

    /**
     * A Mass Cancel Rejected message is sent in response to a Mass Cancel Order message to indicate that the mass cancellation cannot occur
     */
    MASS_CANCEL_REJECTED_MESSAGE(1509, "A Mass Cancel Rejected message is sent in response to a Mass Cancel Order message to indicate that the mass cancellation cannot occur"),

    /**
     * A Purge Acknowledgment is an unsequenced message sent when a Purge Orders message requesting an order purge has completed cancelling all individual orders
     */
    PURGE_ACKNOWLEDGEMENT_MESSAGE(1510, "A Purge Acknowledgment is an unsequenced message sent when a Purge Orders message requesting an order purge has completed cancelling all individual orders"),

    /**
     * A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur
     */
    PURGE_REJECTED_MESSAGE(1511, "A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur"),

    /**
     * Used to provide notification that a trade has been cancelled or corrected
     */
    TRADE_CANCEL_OR_CORRECT_MESSAGE(1512, "Used to provide notification that a trade has been cancelled or corrected"),

    /**
     * A Tas Restatement is sent post-settlement time for each TAS execution during the associated business day to communicate the updated Price and Symbol associated with the cleared execution
     */
    TAS_RESTATEMENT_MESSAGE(1513, "A Tas Restatement is sent post-settlement time for each TAS execution during the associated business day to communicate the updated Price and Symbol associated with the cleared execution"),

    /**
     * A Variance Restatement is sent post-settlement time for each VA and VAO execution during the associated business day to communicate updated Price, Size and Symbol associated with the cleared execution
     */
    VARIANCE_RESTATEMENT_MESSAGE(1514, "A Variance Restatement is sent post-settlement time for each VA and VAO execution during the associated business day to communicate updated Price, Size and Symbol associated with the cleared execution"),

    /**
     * Quote Update Acknowledgment messages are sent in response to a Quote Update or Quote Update Option message
     */
    QUOTE_UPDATE_ACKNOWLEDGEMENT_MESSAGE(1515, "Quote Update Acknowledgment messages are sent in response to a Quote Update or Quote Update Option message"),

    /**
     * Quote Update Rejected messages are sent in response to a Quote Update or Quote Update Option message when the entire quote block is rejected by the order handler
     */
    QUOTE_UPDATE_REJECTED_MESSAGE(1516, "Quote Update Rejected messages are sent in response to a Quote Update or Quote Update Option message when the entire quote block is rejected by the order handler"),

    /**
     * Quote Restated messages are sent to inform the TPH that an order has been asynchronously modified for some reason by CFE
     */
    QUOTE_RESTATED_MESSAGE(1517, "Quote Restated messages are sent to inform the TPH that an order has been asynchronously modified for some reason by CFE"),

    /**
     * A Quote Execution message is used to indicate an execution has occurred on a resting quote
     */
    QUOTE_EXECUTION_MESSAGE(1518, "A Quote Execution message is used to indicate an execution has occurred on a resting quote"),

    /**
     * A Quote Cancelled message will be sent to indicate an unsolicited cancellation of a quote entered with a Quote Update message
     */
    QUOTE_CANCELLED_MESSAGE(1519, "A Quote Cancelled message will be sent to indicate an unsolicited cancellation of a quote entered with a Quote Update message"),

    /**
     * A TAS Quote Restatement is sent post-settlement time for each TAS quote execution during the associated business day to communicate the updated Price and Symbol associated with the cleared execution
     */
    TAS_QUOTE_RESTATEMENT_MESSAGE(1520, "A TAS Quote Restatement is sent post-settlement time for each TAS quote execution during the associated business day to communicate the updated Price and Symbol associated with the cleared execution"),

    /**
     * A Variance Quote Restatement is sent post-settlement time for each VA and VAO execution during the associated business day to communicate updated Price, Size, and Symbol values associated with the cleared execution
     */
    VARIANCE_QUOTE_RESTATEMENT_MESSAGE(1521, "A Variance Quote Restatement is sent post-settlement time for each VA and VAO execution during the associated business day to communicate updated Price, Size, and Symbol values associated with the cleared execution"),

    /**
     * Response to a Reset Risk request
     */
    RESET_RISK_ACKNOWLEDGEMENT_MESSAGE(1522, "Response to a Reset Risk request");

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
            case 1501 -> Optional.of(ORDER_ACKNOWLEDGEMENT_MESSAGE);
            case 1502 -> Optional.of(ORDER_REJECTED_MESSAGE);
            case 1503 -> Optional.of(ORDER_MODIFIED_MESSAGE);
            case 1504 -> Optional.of(MODIFY_REJECTED_MESSAGE);
            case 1505 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 1506 -> Optional.of(ORDER_CANCELLED_MESSAGE);
            case 1507 -> Optional.of(CANCEL_REJECTED_MESSAGE);
            case 1508 -> Optional.of(MASS_CANCEL_ACKNOWLEDGEMENT_MESSAGE);
            case 1509 -> Optional.of(MASS_CANCEL_REJECTED_MESSAGE);
            case 1510 -> Optional.of(PURGE_ACKNOWLEDGEMENT_MESSAGE);
            case 1511 -> Optional.of(PURGE_REJECTED_MESSAGE);
            case 1512 -> Optional.of(TRADE_CANCEL_OR_CORRECT_MESSAGE);
            case 1513 -> Optional.of(TAS_RESTATEMENT_MESSAGE);
            case 1514 -> Optional.of(VARIANCE_RESTATEMENT_MESSAGE);
            case 1515 -> Optional.of(QUOTE_UPDATE_ACKNOWLEDGEMENT_MESSAGE);
            case 1516 -> Optional.of(QUOTE_UPDATE_REJECTED_MESSAGE);
            case 1517 -> Optional.of(QUOTE_RESTATED_MESSAGE);
            case 1518 -> Optional.of(QUOTE_EXECUTION_MESSAGE);
            case 1519 -> Optional.of(QUOTE_CANCELLED_MESSAGE);
            case 1520 -> Optional.of(TAS_QUOTE_RESTATEMENT_MESSAGE);
            case 1521 -> Optional.of(VARIANCE_QUOTE_RESTATEMENT_MESSAGE);
            case 1522 -> Optional.of(RESET_RISK_ACKNOWLEDGEMENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
