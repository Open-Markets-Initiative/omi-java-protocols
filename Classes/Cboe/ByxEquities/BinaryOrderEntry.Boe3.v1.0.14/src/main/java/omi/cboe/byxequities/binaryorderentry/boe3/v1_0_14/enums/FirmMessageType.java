package omi.cboe.byxequities.binaryorderentry.boe3.v1_0_14.enums;

import java.util.Optional;

/**
 * type of message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum FirmMessageType {

    /**
     * A Login Request message must be sent as the first message upon connection
     */
    LOGIN_REQUEST_MESSAGE(1, "A Login Request message must be sent as the first message upon connection"),

    /**
     * A Login Request message must be sent as the first message upon connection
     */
    LOGOUT_REQUEST_MESSAGE(2, "A Login Request message must be sent as the first message upon connection"),

    /**
     * Client Heartbeat
     */
    CLIENT_HEARTBEAT_MESSAGE(3, "Client Heartbeat"),

    /**
     * Submission of a new order to Cboe
     */
    NEW_ORDER_US_EQUITIES_V1(4001, "Submission of a new order to Cboe"),

    /**
     * Submission of a new order to Cboe
     */
    NEW_ORDER_SHORT_US_EQUITIES_V1(4006, "Submission of a new order to Cboe"),

    /**
     * Request to cancel a single order
     */
    CANCEL_ORDER_US_EQUITIES_V1(4003, "Request to cancel a single order"),

    /**
     * Request to modify an order
     */
    MODIFY_ORDER_US_EQUITIES_V1(4002, "Request to modify an order"),

    /**
     * Request to cancel a group of orders across all of the firm's sessions
     */
    PURGE_ORDERS_US_EQUITIES_V1(4005, "Request to cancel a group of orders across all of the firm's sessions"),

    /**
     * Reset or release Firm, Symbol, or Risk Group ID level lockout conditions resulting from risk profile trips or self-imposed lockouts issued via Purge Orders messages
     */
    RESET_RISK_US_EQUITIES_V1(4004, "Reset or release Firm, Symbol, or Risk Group ID level lockout conditions resulting from risk profile trips or self-imposed lockouts issued via Purge Orders messages");

    private final int wire;

    private final String description;

    FirmMessageType(int wire, String description) {
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
    public static Optional<FirmMessageType> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(LOGIN_REQUEST_MESSAGE);
            case 2 -> Optional.of(LOGOUT_REQUEST_MESSAGE);
            case 3 -> Optional.of(CLIENT_HEARTBEAT_MESSAGE);
            case 4001 -> Optional.of(NEW_ORDER_US_EQUITIES_V1);
            case 4006 -> Optional.of(NEW_ORDER_SHORT_US_EQUITIES_V1);
            case 4003 -> Optional.of(CANCEL_ORDER_US_EQUITIES_V1);
            case 4002 -> Optional.of(MODIFY_ORDER_US_EQUITIES_V1);
            case 4005 -> Optional.of(PURGE_ORDERS_US_EQUITIES_V1);
            case 4004 -> Optional.of(RESET_RISK_US_EQUITIES_V1);
            default -> Optional.empty();
        };
    }
}
