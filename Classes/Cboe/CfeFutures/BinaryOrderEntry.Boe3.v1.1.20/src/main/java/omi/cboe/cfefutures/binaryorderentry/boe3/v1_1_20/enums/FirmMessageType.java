package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

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
     * New order futures message
     */
    NEW_ORDER(1008, "New order futures message"),

    /**
     * New order option on futures message
     */
    NEW_ORDER_OPTION(1009, "New order option on futures message"),

    /**
     * Request to modify an order
     */
    MODIFY_ORDER(1002, "Request to modify an order"),

    /**
     * Request to cancel a single order or quote
     */
    CANCEL_ORDER(1003, "Request to cancel a single order or quote"),

    /**
     * A Mass Cancel Order message is a request to cancel a group of orders or quotes
     */
    MASS_CANCEL_ORDER(1004, "A Mass Cancel Order message is a request to cancel a group of orders or quotes"),

    /**
     * Request to cancel a group of orders or quotes across all the TPH's sessions for that port’s matching unit
     */
    PURGE_ORDERS(1005, "Request to cancel a group of orders or quotes across all the TPH's sessions for that port\u2019s matching unit"),

    /**
     * Request to enter or update one or more quotes
     */
    QUOTE_UPDATE(1006, "Request to enter or update one or more quotes"),

    /**
     * Request to enter or update one or more option quotes
     */
    QUOTE_UPDATE_OPTION(1010, "Request to enter or update one or more option quotes"),

    /**
     * Reset or release Firm/EFID, Product, or Custom Group Id level lockout conditions resulting from risk profile trips or self-imposed lockouts issued viaMass Cancel Order or Purge Orders messages
     */
    RESET_RISK(1007, "Reset or release Firm/EFID, Product, or Custom Group Id level lockout conditions resulting from risk profile trips or self-imposed lockouts issued viaMass Cancel Order or Purge Orders messages"),

    /**
     * A New Complex Instrument message is used to request that the system create a complex strategy
     */
    NEW_COMPLEX_INSTRUMENT_OPTION(1011, "A New Complex Instrument message is used to request that the system create a complex strategy");

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
            case 1008 -> Optional.of(NEW_ORDER);
            case 1009 -> Optional.of(NEW_ORDER_OPTION);
            case 1002 -> Optional.of(MODIFY_ORDER);
            case 1003 -> Optional.of(CANCEL_ORDER);
            case 1004 -> Optional.of(MASS_CANCEL_ORDER);
            case 1005 -> Optional.of(PURGE_ORDERS);
            case 1006 -> Optional.of(QUOTE_UPDATE);
            case 1010 -> Optional.of(QUOTE_UPDATE_OPTION);
            case 1007 -> Optional.of(RESET_RISK);
            case 1011 -> Optional.of(NEW_COMPLEX_INSTRUMENT_OPTION);
            default -> Optional.empty();
        };
    }
}
