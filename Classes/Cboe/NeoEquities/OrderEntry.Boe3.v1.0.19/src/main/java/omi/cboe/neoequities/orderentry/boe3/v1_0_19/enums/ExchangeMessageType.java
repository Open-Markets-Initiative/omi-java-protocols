package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

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
     * Order Acknowledgement sent in response to a New Order message
     */
    ORDER_ACKNOWLEDGEMENT_CA_EQUITIES_V1(6501, "Order Acknowledgement sent in response to a New Order message"),

    /**
     * Order Rejected message sent in response to a New Order or New Order Cross that must be rejected
     */
    ORDER_REJECTED_CA_EQUITIES_V1(6502, "Order Rejected message sent in response to a New Order or New Order Cross that must be rejected"),

    /**
     * Order Modified message sent in response to a Modify Order indicating successful modification
     */
    ORDER_MODIFIED_CA_EQUITIES_V1(6503, "Order Modified message sent in response to a Modify Order indicating successful modification"),

    /**
     * Modify Rejected message sent in response to a Modify Order that cannot be modified
     */
    MODIFY_REJECTED_CA_EQUITIES_V1(6504, "Modify Rejected message sent in response to a Modify Order that cannot be modified"),

    /**
     * Order Restated message sent when iceberg order reloads or when self-trade protection reduces an order
     */
    ORDER_RESTATED_CA_EQUITIES_V1(6505, "Order Restated message sent when iceberg order reloads or when self-trade protection reduces an order"),

    /**
     * Order Execution message sent for each fill on an order
     */
    ORDER_EXECUTION_CA_EQUITIES_V1(6506, "Order Execution message sent for each fill on an order"),

    /**
     * Order Cancelled message
     */
    ORDER_CANCELLED_CA_EQUITIES_V1(6507, "Order Cancelled message"),

    /**
     * Cancel Rejected message sent when a Cancel Order cancellation cannot occur
     */
    CANCEL_REJECTED_CA_EQUITIES_V1(6508, "Cancel Rejected message sent when a Cancel Order cancellation cannot occur"),

    /**
     * Carried Restatement message used to indicate restoration of a multi-day GTC or GTD order at the start of a new business day
     */
    CARRIED_RESTATEMENT_CA_EQUITIES_V1(6510, "Carried Restatement message used to indicate restoration of a multi-day GTC or GTD order at the start of a new business day"),

    /**
     * Done For Day message representing orders persisted during the current day session to carry over to the next session
     */
    DONE_FOR_DAY_CA_EQUITIES_V1(6511, "Done For Day message representing orders persisted during the current day session to carry over to the next session"),

    /**
     * Trade Cancel or Correct notification that a trade has been busted or corrected
     */
    TRADE_CANCEL_CORRECT_CA_EQUITIES_V1(6512, "Trade Cancel or Correct notification that a trade has been busted or corrected");

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
            case 6501 -> Optional.of(ORDER_ACKNOWLEDGEMENT_CA_EQUITIES_V1);
            case 6502 -> Optional.of(ORDER_REJECTED_CA_EQUITIES_V1);
            case 6503 -> Optional.of(ORDER_MODIFIED_CA_EQUITIES_V1);
            case 6504 -> Optional.of(MODIFY_REJECTED_CA_EQUITIES_V1);
            case 6505 -> Optional.of(ORDER_RESTATED_CA_EQUITIES_V1);
            case 6506 -> Optional.of(ORDER_EXECUTION_CA_EQUITIES_V1);
            case 6507 -> Optional.of(ORDER_CANCELLED_CA_EQUITIES_V1);
            case 6508 -> Optional.of(CANCEL_REJECTED_CA_EQUITIES_V1);
            case 6510 -> Optional.of(CARRIED_RESTATEMENT_CA_EQUITIES_V1);
            case 6511 -> Optional.of(DONE_FOR_DAY_CA_EQUITIES_V1);
            case 6512 -> Optional.of(TRADE_CANCEL_CORRECT_CA_EQUITIES_V1);
            default -> Optional.empty();
        };
    }
}
