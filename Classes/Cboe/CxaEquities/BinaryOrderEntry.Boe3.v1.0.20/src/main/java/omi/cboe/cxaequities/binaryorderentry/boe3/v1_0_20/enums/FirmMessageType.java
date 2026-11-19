package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

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
     * Submission of a new order to Cboe Australia
     */
    NEW_ORDER_AU_EQUITIES_V1(3001, "Submission of a new order to Cboe Australia"),

    /**
     * Submission of a new order to Cboe Australia, with Post Only and multi-day order fields
     */
    NEW_ORDER_AU_EQUITIES_V2(3005, "Submission of a new order to Cboe Australia, with Post Only and multi-day order fields"),

    /**
     * Request to modify an order
     */
    MODIFY_ORDER_AU_EQUITIES_V1(3002, "Request to modify an order"),

    /**
     * Request to modify an order, with ExpireDate for multi-day orders
     */
    MODIFY_ORDER_AU_EQUITIES_V2(3006, "Request to modify an order, with ExpireDate for multi-day orders"),

    /**
     * Request to cancel a single order
     */
    CANCEL_ORDER_AU_EQUITIES_V1(3003, "Request to cancel a single order"),

    /**
     * Request to cancel a group of orders across all of the participant's sessions
     */
    PURGE_ORDERS_AU_EQUITIES_V1(3004, "Request to cancel a group of orders across all of the participant's sessions");

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
            case 3001 -> Optional.of(NEW_ORDER_AU_EQUITIES_V1);
            case 3005 -> Optional.of(NEW_ORDER_AU_EQUITIES_V2);
            case 3002 -> Optional.of(MODIFY_ORDER_AU_EQUITIES_V1);
            case 3006 -> Optional.of(MODIFY_ORDER_AU_EQUITIES_V2);
            case 3003 -> Optional.of(CANCEL_ORDER_AU_EQUITIES_V1);
            case 3004 -> Optional.of(PURGE_ORDERS_AU_EQUITIES_V1);
            default -> Optional.empty();
        };
    }
}
