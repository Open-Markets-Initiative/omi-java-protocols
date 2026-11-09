package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * Identifier of the message type
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * LogonMessage
     */
    LOGON_MESSAGE(1, "LogonMessage"),

    /**
     * LogonConfMessage
     */
    LOGON_CONF_MESSAGE(2, "LogonConfMessage"),

    /**
     * LogoutMessage
     */
    LOGOUT_MESSAGE(4, "LogoutMessage"),

    /**
     * LoggedOutMessage
     */
    LOGGED_OUT_MESSAGE(5, "LoggedOutMessage"),

    /**
     * HeartbeatMessage
     */
    HEARTBEAT_MESSAGE(10, "HeartbeatMessage"),

    /**
     * TestRequestMessage
     */
    TEST_REQUEST_MESSAGE(11, "TestRequestMessage"),

    /**
     * ResendRequestMessage
     */
    RESEND_REQUEST_MESSAGE(20, "ResendRequestMessage"),

    /**
     * GapFillMessage
     */
    GAP_FILL_MESSAGE(21, "GapFillMessage"),

    /**
     * RejectMessage
     */
    REJECT_MESSAGE(30, "RejectMessage"),

    /**
     * NewOrderRequestMessage
     */
    NEW_ORDER_REQUEST_MESSAGE(100, "NewOrderRequestMessage"),

    /**
     * AmendOrderRequestMessage
     */
    AMEND_ORDER_REQUEST_MESSAGE(110, "AmendOrderRequestMessage"),

    /**
     * CancelOrderRequestMessage
     */
    CANCEL_ORDER_REQUEST_MESSAGE(120, "CancelOrderRequestMessage"),

    /**
     * MassQuoteRequestMessage
     */
    MASS_QUOTE_REQUEST_MESSAGE(130, "MassQuoteRequestMessage"),

    /**
     * MassCancelRequestMessage
     */
    MASS_CANCEL_REQUEST_MESSAGE(140, "MassCancelRequestMessage"),

    /**
     * MassQuoteCancelRequestMessage
     */
    MASS_QUOTE_CANCEL_REQUEST_MESSAGE(145, "MassQuoteCancelRequestMessage"),

    /**
     * NewOrderResponseMessage
     */
    NEW_ORDER_RESPONSE_MESSAGE(200, "NewOrderResponseMessage"),

    /**
     * NewOrderRejectMessage
     */
    NEW_ORDER_REJECT_MESSAGE(202, "NewOrderRejectMessage"),

    /**
     * AmendOrderResponseMessage
     */
    AMEND_ORDER_RESPONSE_MESSAGE(210, "AmendOrderResponseMessage"),

    /**
     * AmendOrderRejectMessage
     */
    AMEND_ORDER_REJECT_MESSAGE(212, "AmendOrderRejectMessage"),

    /**
     * CancelOrderResponseMessage
     */
    CANCEL_ORDER_RESPONSE_MESSAGE(220, "CancelOrderResponseMessage"),

    /**
     * CancelOrderRejectMessage
     */
    CANCEL_ORDER_REJECT_MESSAGE(222, "CancelOrderRejectMessage"),

    /**
     * MassQuoteResponseMessage
     */
    MASS_QUOTE_RESPONSE_MESSAGE(230, "MassQuoteResponseMessage"),

    /**
     * MassQuoteRejectMessage
     */
    MASS_QUOTE_REJECT_MESSAGE(232, "MassQuoteRejectMessage"),

    /**
     * MassCancelResponseMessage
     */
    MASS_CANCEL_RESPONSE_MESSAGE(240, "MassCancelResponseMessage"),

    /**
     * MassCancelRejectMessage
     */
    MASS_CANCEL_REJECT_MESSAGE(242, "MassCancelRejectMessage"),

    /**
     * OrderFilledMessage
     */
    ORDER_FILLED_MESSAGE(300, "OrderFilledMessage"),

    /**
     * OrdersCanceledMessage
     */
    ORDERS_CANCELED_MESSAGE(310, "OrdersCanceledMessage"),

    /**
     * OrderPlacedMessage
     */
    ORDER_PLACED_MESSAGE(312, "OrderPlacedMessage"),

    /**
     * MassQuoteOrdersPlacedMessage
     */
    MASS_QUOTE_ORDERS_PLACED_MESSAGE(314, "MassQuoteOrdersPlacedMessage"),

    /**
     * MassQuoteMmpTriggeredMessage
     */
    MASS_QUOTE_MMP_TRIGGERED_MESSAGE(320, "MassQuoteMmpTriggeredMessage"),

    /**
     * OrdersMmpTriggeredMessage
     */
    ORDERS_MMP_TRIGGERED_MESSAGE(322, "OrdersMmpTriggeredMessage"),

    /**
     * MassQuoteMmpUnfrozenMessage
     */
    MASS_QUOTE_MMP_UNFROZEN_MESSAGE(324, "MassQuoteMmpUnfrozenMessage"),

    /**
     * OrdersMmpUnfrozenMessage
     */
    ORDERS_MMP_UNFROZEN_MESSAGE(326, "OrdersMmpUnfrozenMessage");

    private final int wire;

    private final String description;

    TemplateId(int wire, String description) {
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
    public static Optional<TemplateId> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(LOGON_MESSAGE);
            case 2 -> Optional.of(LOGON_CONF_MESSAGE);
            case 4 -> Optional.of(LOGOUT_MESSAGE);
            case 5 -> Optional.of(LOGGED_OUT_MESSAGE);
            case 10 -> Optional.of(HEARTBEAT_MESSAGE);
            case 11 -> Optional.of(TEST_REQUEST_MESSAGE);
            case 20 -> Optional.of(RESEND_REQUEST_MESSAGE);
            case 21 -> Optional.of(GAP_FILL_MESSAGE);
            case 30 -> Optional.of(REJECT_MESSAGE);
            case 100 -> Optional.of(NEW_ORDER_REQUEST_MESSAGE);
            case 110 -> Optional.of(AMEND_ORDER_REQUEST_MESSAGE);
            case 120 -> Optional.of(CANCEL_ORDER_REQUEST_MESSAGE);
            case 130 -> Optional.of(MASS_QUOTE_REQUEST_MESSAGE);
            case 140 -> Optional.of(MASS_CANCEL_REQUEST_MESSAGE);
            case 145 -> Optional.of(MASS_QUOTE_CANCEL_REQUEST_MESSAGE);
            case 200 -> Optional.of(NEW_ORDER_RESPONSE_MESSAGE);
            case 202 -> Optional.of(NEW_ORDER_REJECT_MESSAGE);
            case 210 -> Optional.of(AMEND_ORDER_RESPONSE_MESSAGE);
            case 212 -> Optional.of(AMEND_ORDER_REJECT_MESSAGE);
            case 220 -> Optional.of(CANCEL_ORDER_RESPONSE_MESSAGE);
            case 222 -> Optional.of(CANCEL_ORDER_REJECT_MESSAGE);
            case 230 -> Optional.of(MASS_QUOTE_RESPONSE_MESSAGE);
            case 232 -> Optional.of(MASS_QUOTE_REJECT_MESSAGE);
            case 240 -> Optional.of(MASS_CANCEL_RESPONSE_MESSAGE);
            case 242 -> Optional.of(MASS_CANCEL_REJECT_MESSAGE);
            case 300 -> Optional.of(ORDER_FILLED_MESSAGE);
            case 310 -> Optional.of(ORDERS_CANCELED_MESSAGE);
            case 312 -> Optional.of(ORDER_PLACED_MESSAGE);
            case 314 -> Optional.of(MASS_QUOTE_ORDERS_PLACED_MESSAGE);
            case 320 -> Optional.of(MASS_QUOTE_MMP_TRIGGERED_MESSAGE);
            case 322 -> Optional.of(ORDERS_MMP_TRIGGERED_MESSAGE);
            case 324 -> Optional.of(MASS_QUOTE_MMP_UNFROZEN_MESSAGE);
            case 326 -> Optional.of(ORDERS_MMP_UNFROZEN_MESSAGE);
            default -> Optional.empty();
        };
    }
}
