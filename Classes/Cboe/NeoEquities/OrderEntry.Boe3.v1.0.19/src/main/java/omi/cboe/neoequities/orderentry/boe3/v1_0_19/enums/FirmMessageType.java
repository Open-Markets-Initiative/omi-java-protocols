package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

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
     * New order message for Cboe Canada Equities
     */
    NEW_ORDER_CA_EQUITIES_V1(6001, "New order message for Cboe Canada Equities"),

    /**
     * New order V2 message for Cboe Canada Equities, adds PegDifference
     */
    NEW_ORDER_CA_EQUITIES_V2(6006, "New order V2 message for Cboe Canada Equities, adds PegDifference"),

    /**
     * Request to modify an existing order
     */
    MODIFY_ORDER_CA_EQUITIES_V1(6002, "Request to modify an existing order"),

    /**
     * Request to cancel a single order
     */
    CANCEL_ORDER_CA_EQUITIES_V1(6003, "Request to cancel a single order"),

    /**
     * New Order Cross message for pre-arranged two-sided trades
     */
    NEW_ORDER_CROSS_CA_EQUITIES_V1(6004, "New Order Cross message for pre-arranged two-sided trades"),

    /**
     * New Order Cross V2 message with Anonymous flag
     */
    NEW_ORDER_CROSS_CA_EQUITIES_V2(6005, "New Order Cross V2 message with Anonymous flag");

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
            case 6001 -> Optional.of(NEW_ORDER_CA_EQUITIES_V1);
            case 6006 -> Optional.of(NEW_ORDER_CA_EQUITIES_V2);
            case 6002 -> Optional.of(MODIFY_ORDER_CA_EQUITIES_V1);
            case 6003 -> Optional.of(CANCEL_ORDER_CA_EQUITIES_V1);
            case 6004 -> Optional.of(NEW_ORDER_CROSS_CA_EQUITIES_V1);
            case 6005 -> Optional.of(NEW_ORDER_CROSS_CA_EQUITIES_V2);
            default -> Optional.empty();
        };
    }
}
