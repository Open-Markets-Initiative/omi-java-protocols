package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * LogonMessage
     */
    SESSION_LOGON_MESSAGE(100, "LogonMessage"),

    /**
     * LogonConfMessage
     */
    SESSION_LOGON_CONF_MESSAGE(200, "LogonConfMessage"),

    /**
     * LogoutMessage
     */
    SESSION_LOGOUT_MESSAGE(101, "LogoutMessage"),

    /**
     * LoggedOutMessage
     */
    SESSION_LOGGED_OUT_MESSAGE(201, "LoggedOutMessage"),

    /**
     * HeartbeatMessage
     */
    SESSION_HEARTBEAT_MESSAGE(10, "HeartbeatMessage"),

    /**
     * TestRequestMessage
     */
    SESSION_TEST_REQUEST_MESSAGE(11, "TestRequestMessage"),

    /**
     * ResendRequestMessage
     */
    SESSION_RESEND_REQUEST_MESSAGE(102, "ResendRequestMessage"),

    /**
     * GapFillMessage
     */
    SESSION_GAP_FILL_MESSAGE(202, "GapFillMessage"),

    /**
     * RejectMessage
     */
    REJECT_MESSAGE(210, "RejectMessage"),

    /**
     * PingMessage
     */
    PING_MESSAGE(102, "PingMessage"),

    /**
     * PongMessage
     */
    PONG_MESSAGE(202, "PongMessage"),

    /**
     * InstrumentInfoRequestMessage
     */
    INSTRUMENT_INFO_REQUEST_MESSAGE(103, "InstrumentInfoRequestMessage"),

    /**
     * InstrumentInfoMessage
     */
    INSTRUMENT_INFO_MESSAGE(203, "InstrumentInfoMessage"),

    /**
     * SetAccountMessage
     */
    SET_ACCOUNT_MESSAGE(105, "SetAccountMessage"),

    /**
     * SetTraderMessage
     */
    SET_TRADER_MESSAGE(106, "SetTraderMessage"),

    /**
     * SetAckMessage
     */
    SET_ACK_MESSAGE(205, "SetAckMessage"),

    /**
     * NewOrderMessage
     */
    NEW_ORDER_MESSAGE(110, "NewOrderMessage"),

    /**
     * NewIocOrderMessage
     */
    NEW_IOC_ORDER_MESSAGE(111, "NewIocOrderMessage"),

    /**
     * OrderEnteredMessage
     */
    ORDER_ENTERED_MESSAGE(210, "OrderEnteredMessage"),

    /**
     * ReplaceOrderMessage
     */
    REPLACE_ORDER_MESSAGE(120, "ReplaceOrderMessage"),

    /**
     * ObsoleteStreamOrderMessage
     */
    OBSOLETE_STREAM_ORDER_MESSAGE(121, "ObsoleteStreamOrderMessage"),

    /**
     * OrderRejectMessage
     */
    ORDER_REJECT_MESSAGE(221, "OrderRejectMessage"),

    /**
     * OrderReplacedMessage
     */
    ORDER_REPLACED_MESSAGE(220, "OrderReplacedMessage"),

    /**
     * CancelOrderMessage
     */
    CANCEL_ORDER_MESSAGE(130, "CancelOrderMessage"),

    /**
     * OrderCanceledMessage
     */
    ORDER_CANCELED_MESSAGE(230, "OrderCanceledMessage"),

    /**
     * CancelOrderRejectMessage
     */
    CANCEL_ORDER_REJECT_MESSAGE(233, "CancelOrderRejectMessage"),

    /**
     * MassCancelOrderMessage
     */
    MASS_CANCEL_ORDER_MESSAGE(131, "MassCancelOrderMessage"),

    /**
     * MassCancelOrderAckMessage
     */
    MASS_CANCEL_ORDER_ACK_MESSAGE(231, "MassCancelOrderAckMessage"),

    /**
     * MassCancelOrderRejectMessage
     */
    MASS_CANCEL_ORDER_REJECT_MESSAGE(232, "MassCancelOrderRejectMessage"),

    /**
     * UnlockTradingMessage
     */
    UNLOCK_TRADING_MESSAGE(132, "UnlockTradingMessage"),

    /**
     * UnlockTradingAckMessage
     */
    UNLOCK_TRADING_ACK_MESSAGE(234, "UnlockTradingAckMessage"),

    /**
     * UnlockTradingRejectMessage
     */
    UNLOCK_TRADING_REJECT_MESSAGE(235, "UnlockTradingRejectMessage"),

    /**
     * OrderFilledMessage
     */
    ORDER_FILLED_MESSAGE(240, "OrderFilledMessage"),

    /**
     * SpreadOrderFilledMessage
     */
    SPREAD_ORDER_FILLED_MESSAGE(241, "SpreadOrderFilledMessage"),

    /**
     * LastExecIdRequestMessage
     */
    LAST_EXEC_ID_REQUEST_MESSAGE(150, "LastExecIdRequestMessage"),

    /**
     * LastExecIdMessage
     */
    LAST_EXEC_ID_MESSAGE(250, "LastExecIdMessage"),

    /**
     * EventResendRequestMessage
     */
    EVENT_RESEND_REQUEST_MESSAGE(152, "EventResendRequestMessage"),

    /**
     * EventResendCompleteMessage
     */
    EVENT_RESEND_COMPLETE_MESSAGE(252, "EventResendCompleteMessage"),

    /**
     * EventResendRejectMessage
     */
    EVENT_RESEND_REJECT_MESSAGE(253, "EventResendRejectMessage"),

    /**
     * ResetOptionsFillProtectionMessage
     */
    RESET_OPTIONS_FILL_PROTECTION_MESSAGE(160, "ResetOptionsFillProtectionMessage"),

    /**
     * ResetOptionsFillProtectionAckMessage
     */
    RESET_OPTIONS_FILL_PROTECTION_ACK_MESSAGE(260, "ResetOptionsFillProtectionAckMessage"),

    /**
     * ResetOptionsFillProtectionRejectMessage
     */
    RESET_OPTIONS_FILL_PROTECTION_REJECT_MESSAGE(261, "ResetOptionsFillProtectionRejectMessage");

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
            case 100 -> Optional.of(SESSION_LOGON_MESSAGE);
            case 200 -> Optional.of(SESSION_LOGON_CONF_MESSAGE);
            case 101 -> Optional.of(SESSION_LOGOUT_MESSAGE);
            case 201 -> Optional.of(SESSION_LOGGED_OUT_MESSAGE);
            case 10 -> Optional.of(SESSION_HEARTBEAT_MESSAGE);
            case 11 -> Optional.of(SESSION_TEST_REQUEST_MESSAGE);
            case 102 -> Optional.of(SESSION_RESEND_REQUEST_MESSAGE);
            case 202 -> Optional.of(SESSION_GAP_FILL_MESSAGE);
            case 210 -> Optional.of(REJECT_MESSAGE);
            case 103 -> Optional.of(INSTRUMENT_INFO_REQUEST_MESSAGE);
            case 203 -> Optional.of(INSTRUMENT_INFO_MESSAGE);
            case 105 -> Optional.of(SET_ACCOUNT_MESSAGE);
            case 106 -> Optional.of(SET_TRADER_MESSAGE);
            case 205 -> Optional.of(SET_ACK_MESSAGE);
            case 110 -> Optional.of(NEW_ORDER_MESSAGE);
            case 111 -> Optional.of(NEW_IOC_ORDER_MESSAGE);
            case 120 -> Optional.of(REPLACE_ORDER_MESSAGE);
            case 121 -> Optional.of(OBSOLETE_STREAM_ORDER_MESSAGE);
            case 221 -> Optional.of(ORDER_REJECT_MESSAGE);
            case 220 -> Optional.of(ORDER_REPLACED_MESSAGE);
            case 130 -> Optional.of(CANCEL_ORDER_MESSAGE);
            case 230 -> Optional.of(ORDER_CANCELED_MESSAGE);
            case 233 -> Optional.of(CANCEL_ORDER_REJECT_MESSAGE);
            case 131 -> Optional.of(MASS_CANCEL_ORDER_MESSAGE);
            case 231 -> Optional.of(MASS_CANCEL_ORDER_ACK_MESSAGE);
            case 232 -> Optional.of(MASS_CANCEL_ORDER_REJECT_MESSAGE);
            case 132 -> Optional.of(UNLOCK_TRADING_MESSAGE);
            case 234 -> Optional.of(UNLOCK_TRADING_ACK_MESSAGE);
            case 235 -> Optional.of(UNLOCK_TRADING_REJECT_MESSAGE);
            case 240 -> Optional.of(ORDER_FILLED_MESSAGE);
            case 241 -> Optional.of(SPREAD_ORDER_FILLED_MESSAGE);
            case 150 -> Optional.of(LAST_EXEC_ID_REQUEST_MESSAGE);
            case 250 -> Optional.of(LAST_EXEC_ID_MESSAGE);
            case 152 -> Optional.of(EVENT_RESEND_REQUEST_MESSAGE);
            case 252 -> Optional.of(EVENT_RESEND_COMPLETE_MESSAGE);
            case 253 -> Optional.of(EVENT_RESEND_REJECT_MESSAGE);
            case 160 -> Optional.of(RESET_OPTIONS_FILL_PROTECTION_MESSAGE);
            case 260 -> Optional.of(RESET_OPTIONS_FILL_PROTECTION_ACK_MESSAGE);
            case 261 -> Optional.of(RESET_OPTIONS_FILL_PROTECTION_REJECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
