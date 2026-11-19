package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

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
    ORDER_ACKNOWLEDGEMENT_AU_EQUITIES_V1(3501, "Order Acknowledgement messages are sent in response to a New Order message"),

    /**
     * Order Rejected messages are sent in response to a New Order which must be rejected
     */
    ORDER_REJECTED_AU_EQUITIES_V1(3502, "Order Rejected messages are sent in response to a New Order which must be rejected"),

    /**
     * Order Modified messages are sent in response to a Modify Order to indicate that the order has been successfully modified
     */
    ORDER_MODIFIED_AU_EQUITIES_V1(3503, "Order Modified messages are sent in response to a Modify Order to indicate that the order has been successfully modified"),

    /**
     * Modify Rejected messages are sent in response to a Modify Order for an order which cannot be modified
     */
    MODIFY_REJECTED_AU_EQUITIES_V1(3504, "Modify Rejected messages are sent in response to a Modify Order for an order which cannot be modified"),

    /**
     * Order restatement for an iceberg reload or a Self-Trade Protection reduction or cancellation
     */
    ORDER_RESTATED_AU_EQUITIES_V1(3505, "Order restatement for an iceberg reload or a Self-Trade Protection reduction or cancellation"),

    /**
     * An Order Execution is sent for each fill on an order
     */
    ORDER_EXECUTION_AU_EQUITIES_V1(3506, "An Order Execution is sent for each fill on an order"),

    /**
     * Order Cancelled message
     */
    ORDER_CANCELLED_AU_EQUITIES_V1(3507, "Order Cancelled message"),

    /**
     * A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur
     */
    CANCEL_REJECTED_AU_EQUITIES_V1(3508, "A Cancel Rejected message is sent in response to a Cancel Order message to indicate that the cancellation cannot occur"),

    /**
     * Order Execution Restated messages will be issued for all (unbroken) fills of MOC orders after the closing price has been determined
     */
    EXECUTION_RESTATEMENT_AU_EQUITIES_V1(3509, "Order Execution Restated messages will be issued for all (unbroken) fills of MOC orders after the closing price has been determined"),

    /**
     * A Purge Acknowledgment is an unsequenced message sent when a Purge Orders message requesting an order purge has completed cancelling all individual orders
     */
    PURGE_ACKNOWLEDGEMENT_AU_EQUITIES_V1(3510, "A Purge Acknowledgment is an unsequenced message sent when a Purge Orders message requesting an order purge has completed cancelling all individual orders"),

    /**
     * A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur
     */
    PURGE_REJECTED_AU_EQUITIES_V1(3511, "A Purge Rejected message is sent in response to a Purge Orders message to indicate that the mass cancellation cannot occur"),

    /**
     * Used to provide notification that a trade has been cancelled (busted) or corrected (price change only)
     */
    TRADE_CANCEL_CORRECT_AU_EQUITIES_V1(3512, "Used to provide notification that a trade has been cancelled (busted) or corrected (price change only)"),

    /**
     * Order Modified messages are sent in response to a Modify Order, with ExpireDate for multi-day orders
     */
    ORDER_MODIFIED_AU_EQUITIES_V2(3513, "Order Modified messages are sent in response to a Modify Order, with ExpireDate for multi-day orders"),

    /**
     * The Carried Restatement message is used to indicate the restoration of a multi-day GTC or GTD orders at the start of a new business day
     */
    CARRIED_RESTATEMENT_AU_EQUITIES_V1(3514, "The Carried Restatement message is used to indicate the restoration of a multi-day GTC or GTD orders at the start of a new business day"),

    /**
     * Done For Day messages represent orders persisted during the current day session to carry over to the next session
     */
    DONE_FOR_DAY_AU_EQUITIES_V1(3515, "Done For Day messages represent orders persisted during the current day session to carry over to the next session");

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
            case 3501 -> Optional.of(ORDER_ACKNOWLEDGEMENT_AU_EQUITIES_V1);
            case 3502 -> Optional.of(ORDER_REJECTED_AU_EQUITIES_V1);
            case 3503 -> Optional.of(ORDER_MODIFIED_AU_EQUITIES_V1);
            case 3504 -> Optional.of(MODIFY_REJECTED_AU_EQUITIES_V1);
            case 3505 -> Optional.of(ORDER_RESTATED_AU_EQUITIES_V1);
            case 3506 -> Optional.of(ORDER_EXECUTION_AU_EQUITIES_V1);
            case 3507 -> Optional.of(ORDER_CANCELLED_AU_EQUITIES_V1);
            case 3508 -> Optional.of(CANCEL_REJECTED_AU_EQUITIES_V1);
            case 3509 -> Optional.of(EXECUTION_RESTATEMENT_AU_EQUITIES_V1);
            case 3510 -> Optional.of(PURGE_ACKNOWLEDGEMENT_AU_EQUITIES_V1);
            case 3511 -> Optional.of(PURGE_REJECTED_AU_EQUITIES_V1);
            case 3512 -> Optional.of(TRADE_CANCEL_CORRECT_AU_EQUITIES_V1);
            case 3513 -> Optional.of(ORDER_MODIFIED_AU_EQUITIES_V2);
            case 3514 -> Optional.of(CARRIED_RESTATEMENT_AU_EQUITIES_V1);
            case 3515 -> Optional.of(DONE_FOR_DAY_AU_EQUITIES_V1);
            default -> Optional.empty();
        };
    }
}
