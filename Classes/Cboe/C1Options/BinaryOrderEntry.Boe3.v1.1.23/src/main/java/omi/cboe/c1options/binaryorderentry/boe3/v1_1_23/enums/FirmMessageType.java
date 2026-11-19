package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.enums;

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
     * Submission of a new simple (single leg) order to Cboe
     */
    NEW_ORDER_MESSAGE(2001, "Submission of a new simple (single leg) order to Cboe"),

    /**
     * Submission of a new simple (single leg) order to Cboe
     */
    NEW_ORDER_SHORT_MESSAGE(2002, "Submission of a new simple (single leg) order to Cboe"),

    /**
     * A New Order Cross message contains the details for both the agency (initiating) and contra ide(s) of a cross order
     */
    NEW_ORDER_CROSS_MESSAGE(2003, "A New Order Cross message contains the details for both the agency (initiating) and contra ide(s) of a cross order"),

    /**
     * A New Complex Instrument message is used to request that the system create a complex strategy.
     */
    NEW_COMPLEX_INSTRUMENT_MESSAGE(2005, "A New Complex Instrument message is used to request that the system create a complex strategy."),

    /**
     * A New Complex Order message contains the details required to enter an order on a complex instrument created with previously entered New Complex Instrument message request
     */
    NEW_COMPLEX_ORDER_MESSAGE(2006, "A New Complex Order message contains the details required to enter an order on a complex instrument created with previously entered New Complex Instrument message request"),

    /**
     * A New Complex Order message contains the details required to enter an order on a complex instrument created with previously entered New Complex Instrument message request
     */
    NEW_COMPLEX_ORDER_V2_MESSAGE(2023, "A New Complex Order message contains the details required to enter an order on a complex instrument created with previously entered New Complex Instrument message request"),

    /**
     * A New Complex Order message contains the details required to enter an order on a complex instrument created with previously entered New Complex Instrument message request
     */
    NEW_COMPLEX_ORDER_SHORT_MESSAGE(2007, "A New Complex Order message contains the details required to enter an order on a complex instrument created with previously entered New Complex Instrument message request"),

    /**
     * A New Order Cross Multileg message contains the details for both the agency (initiating) and contra side(s) of a cross order
     */
    NEW_ORDER_CROSS_MULTILEG_MESSAGE(2008, "A New Order Cross Multileg message contains the details for both the agency (initiating) and contra side(s) of a cross order"),

    /**
     * Request to cancel a single order
     */
    CANCEL_ORDER_MESSAGE(2010, "Request to cancel a single order"),

    /**
     * MassCancelOrderMessage
     */
    MASS_CANCEL_ORDER_MESSAGE(2015, "MassCancelOrderMessage"),

    /**
     * Request to modify an order
     */
    MODIFY_ORDER_MESSAGE(2011, "Request to modify an order"),

    /**
     * Request to enter or update one or more quotes
     */
    QUOTE_UPDATE_MESSAGE(2012, "Request to enter or update one or more quotes"),

    /**
     * QuRequest to enter or update one or more quotes
     */
    QUOTE_UPDATE_SHORT_MESSAGE(2013, "QuRequest to enter or update one or more quotes"),

    /**
     * Request to enter or update one or more quotes for quotable complex options
     */
    COMPLEX_QUOTE_UPDATE_MESSAGE(2017, "Request to enter or update one or more quotes for quotable complex options"),

    /**
     * A shorter version of Complex Quote Update messages which restricts the information which can be presented
     */
    COMPLEX_QUOTE_UPDATE_SHORT_MESSAGE(2018, "A shorter version of Complex Quote Update messages which restricts the information which can be presented"),

    /**
     * Request to cancel a group of orders across all the firm’s sessions
     */
    PURGE_ORDERS_V2_MESSAGE(2021, "Request to cancel a group of orders across all the firm\u2019s sessions"),

    /**
     * Reset or release Firm, Risk Root, or Custom Group ID level lockout conditions resulting from risk profile trips or self-imposed lockouts issued via Cancel Order or Purge Orders messages
     */
    RESET_RISK_MESSAGE(2014, "Reset or release Firm, Risk Root, or Custom Group ID level lockout conditions resulting from risk profile trips or self-imposed lockouts issued via Cancel Order or Purge Orders messages"),

    /**
     * TPHs are encouraged to use Floor Trade Confirmation messages to respond to Floor Trade Notification messages if they agree with the terms of the trade
     */
    FLOOR_TRADE_CONFIRMATION_MESSAGE(2020, "TPHs are encouraged to use Floor Trade Confirmation messages to respond to Floor Trade Notification messages if they agree with the terms of the trade"),

    /**
     * TPHs having in-person Market Makers on the Cboe trading floor can enter their version of a floor trade using the Add Floor Trade message
     */
    ADD_FLOOR_TRADE_MESSAGE(2019, "TPHs having in-person Market Makers on the Cboe trading floor can enter their version of a floor trade using the Add Floor Trade message"),

    /**
     * TPHs with in-person Market Makers on the Cboe trading floor can request the deletion of a floor trade using the Delete Floor Trade message type
     */
    DELETE_FLOOR_TRADE_MESSAGE(2022, "TPHs with in-person Market Makers on the Cboe trading floor can request the deletion of a floor trade using the Delete Floor Trade message type");

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
            case 2001 -> Optional.of(NEW_ORDER_MESSAGE);
            case 2002 -> Optional.of(NEW_ORDER_SHORT_MESSAGE);
            case 2003 -> Optional.of(NEW_ORDER_CROSS_MESSAGE);
            case 2005 -> Optional.of(NEW_COMPLEX_INSTRUMENT_MESSAGE);
            case 2006 -> Optional.of(NEW_COMPLEX_ORDER_MESSAGE);
            case 2023 -> Optional.of(NEW_COMPLEX_ORDER_V2_MESSAGE);
            case 2007 -> Optional.of(NEW_COMPLEX_ORDER_SHORT_MESSAGE);
            case 2008 -> Optional.of(NEW_ORDER_CROSS_MULTILEG_MESSAGE);
            case 2010 -> Optional.of(CANCEL_ORDER_MESSAGE);
            case 2015 -> Optional.of(MASS_CANCEL_ORDER_MESSAGE);
            case 2011 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 2012 -> Optional.of(QUOTE_UPDATE_MESSAGE);
            case 2013 -> Optional.of(QUOTE_UPDATE_SHORT_MESSAGE);
            case 2017 -> Optional.of(COMPLEX_QUOTE_UPDATE_MESSAGE);
            case 2018 -> Optional.of(COMPLEX_QUOTE_UPDATE_SHORT_MESSAGE);
            case 2021 -> Optional.of(PURGE_ORDERS_V2_MESSAGE);
            case 2014 -> Optional.of(RESET_RISK_MESSAGE);
            case 2020 -> Optional.of(FLOOR_TRADE_CONFIRMATION_MESSAGE);
            case 2019 -> Optional.of(ADD_FLOOR_TRADE_MESSAGE);
            case 2022 -> Optional.of(DELETE_FLOOR_TRADE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
