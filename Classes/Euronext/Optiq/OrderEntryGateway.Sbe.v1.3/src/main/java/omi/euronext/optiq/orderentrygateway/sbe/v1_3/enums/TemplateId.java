package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * NewOrderMessage
     */
    NEW_ORDER_MESSAGE(1, "NewOrderMessage"),

    /**
     * AckMessage
     */
    ACK_MESSAGE(3, "AckMessage"),

    /**
     * FillMessage
     */
    FILL_MESSAGE(4, "FillMessage"),

    /**
     * KillMessage
     */
    KILL_MESSAGE(5, "KillMessage"),

    /**
     * CancelReplaceMessage
     */
    CANCEL_REPLACE_MESSAGE(6, "CancelReplaceMessage"),

    /**
     * RejectMessage
     */
    REJECT_MESSAGE(7, "RejectMessage"),

    /**
     * QuotesMessage
     */
    QUOTES_MESSAGE(8, "QuotesMessage"),

    /**
     * QuoteAckMessage
     */
    QUOTE_ACK_MESSAGE(9, "QuoteAckMessage"),

    /**
     * QuoteRequestMessage
     */
    QUOTE_REQUEST_MESSAGE(10, "QuoteRequestMessage"),

    /**
     * CancelRequestMessage
     */
    CANCEL_REQUEST_MESSAGE(12, "CancelRequestMessage"),

    /**
     * MassCancelMessage
     */
    MASS_CANCEL_MESSAGE(13, "MassCancelMessage"),

    /**
     * MassCancelAckMessage
     */
    MASS_CANCEL_ACK_MESSAGE(14, "MassCancelAckMessage"),

    /**
     * OpenOrderRequestMessage
     */
    OPEN_ORDER_REQUEST_MESSAGE(15, "OpenOrderRequestMessage"),

    /**
     * OwnershipRequestAckMessage
     */
    OWNERSHIP_REQUEST_ACK_MESSAGE(17, "OwnershipRequestAckMessage"),

    /**
     * OwnershipRequestMessage
     */
    OWNERSHIP_REQUEST_MESSAGE(18, "OwnershipRequestMessage"),

    /**
     * TradeBustNotificationMessage
     */
    TRADE_BUST_NOTIFICATION_MESSAGE(19, "TradeBustNotificationMessage"),

    /**
     * CollarBreachConfirmationMessage
     */
    COLLAR_BREACH_CONFIRMATION_MESSAGE(20, "CollarBreachConfirmationMessage"),

    /**
     * PriceInputMessage
     */
    PRICE_INPUT_MESSAGE(28, "PriceInputMessage"),

    /**
     * LiquidityProviderCommandMessage
     */
    LIQUIDITY_PROVIDER_COMMAND_MESSAGE(32, "LiquidityProviderCommandMessage"),

    /**
     * AskForQuoteMessage
     */
    ASK_FOR_QUOTE_MESSAGE(33, "AskForQuoteMessage"),

    /**
     * RequestForExecutionMessage
     */
    REQUEST_FOR_EXECUTION_MESSAGE(34, "RequestForExecutionMessage"),

    /**
     * RFQNotificationMessage
     */
    RFQ_NOTIFICATION_MESSAGE(35, "RFQNotificationMessage"),

    /**
     * RFQMatchingStatusMessage
     */
    RFQ_MATCHING_STATUS_MESSAGE(36, "RFQMatchingStatusMessage"),

    /**
     * UserNotificationMessage
     */
    USER_NOTIFICATION_MESSAGE(39, "UserNotificationMessage"),

    /**
     * DeclarationEntryMessage
     */
    DECLARATION_ENTRY_MESSAGE(40, "DeclarationEntryMessage"),

    /**
     * DeclarationEntryAckMessage
     */
    DECLARATION_ENTRY_ACK_MESSAGE(41, "DeclarationEntryAckMessage"),

    /**
     * DeclarationNoticeMessage
     */
    DECLARATION_NOTICE_MESSAGE(42, "DeclarationNoticeMessage"),

    /**
     * DeclarationCancelAndRefusalMessage
     */
    DECLARATION_CANCEL_AND_REFUSAL_MESSAGE(43, "DeclarationCancelAndRefusalMessage"),

    /**
     * FundPriceInputMessage
     */
    FUND_PRICE_INPUT_MESSAGE(44, "FundPriceInputMessage"),

    /**
     * FundPriceInputAckMessage
     */
    FUND_PRICE_INPUT_ACK_MESSAGE(45, "FundPriceInputAckMessage"),

    /**
     * DeclarationEntryRejectMessage
     */
    DECLARATION_ENTRY_REJECT_MESSAGE(46, "DeclarationEntryRejectMessage"),

    /**
     * InstrumentSynchronizationListMessage
     */
    INSTRUMENT_SYNCHRONIZATION_LIST_MESSAGE(50, "InstrumentSynchronizationListMessage"),

    /**
     * SynchronizationTimeMessage
     */
    SYNCHRONIZATION_TIME_MESSAGE(51, "SynchronizationTimeMessage"),

    /**
     * LogonMessage
     */
    LOGON_MESSAGE(100, "LogonMessage"),

    /**
     * LogonAckMessage
     */
    LOGON_ACK_MESSAGE(101, "LogonAckMessage"),

    /**
     * LogonRejectMessage
     */
    LOGON_REJECT_MESSAGE(102, "LogonRejectMessage"),

    /**
     * LogoutMessage
     */
    LOGOUT_MESSAGE(103, "LogoutMessage"),

    /**
     * HeartbeatMessage
     */
    HEARTBEAT_MESSAGE(106, "HeartbeatMessage"),

    /**
     * TestRequestMessage
     */
    TEST_REQUEST_MESSAGE(107, "TestRequestMessage"),

    /**
     * TechnicalRejectMessage
     */
    TECHNICAL_REJECT_MESSAGE(108, "TechnicalRejectMessage");

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
            case 1 -> Optional.of(NEW_ORDER_MESSAGE);
            case 3 -> Optional.of(ACK_MESSAGE);
            case 4 -> Optional.of(FILL_MESSAGE);
            case 5 -> Optional.of(KILL_MESSAGE);
            case 6 -> Optional.of(CANCEL_REPLACE_MESSAGE);
            case 7 -> Optional.of(REJECT_MESSAGE);
            case 8 -> Optional.of(QUOTES_MESSAGE);
            case 9 -> Optional.of(QUOTE_ACK_MESSAGE);
            case 10 -> Optional.of(QUOTE_REQUEST_MESSAGE);
            case 12 -> Optional.of(CANCEL_REQUEST_MESSAGE);
            case 13 -> Optional.of(MASS_CANCEL_MESSAGE);
            case 14 -> Optional.of(MASS_CANCEL_ACK_MESSAGE);
            case 15 -> Optional.of(OPEN_ORDER_REQUEST_MESSAGE);
            case 17 -> Optional.of(OWNERSHIP_REQUEST_ACK_MESSAGE);
            case 18 -> Optional.of(OWNERSHIP_REQUEST_MESSAGE);
            case 19 -> Optional.of(TRADE_BUST_NOTIFICATION_MESSAGE);
            case 20 -> Optional.of(COLLAR_BREACH_CONFIRMATION_MESSAGE);
            case 28 -> Optional.of(PRICE_INPUT_MESSAGE);
            case 32 -> Optional.of(LIQUIDITY_PROVIDER_COMMAND_MESSAGE);
            case 33 -> Optional.of(ASK_FOR_QUOTE_MESSAGE);
            case 34 -> Optional.of(REQUEST_FOR_EXECUTION_MESSAGE);
            case 35 -> Optional.of(RFQ_NOTIFICATION_MESSAGE);
            case 36 -> Optional.of(RFQ_MATCHING_STATUS_MESSAGE);
            case 39 -> Optional.of(USER_NOTIFICATION_MESSAGE);
            case 40 -> Optional.of(DECLARATION_ENTRY_MESSAGE);
            case 41 -> Optional.of(DECLARATION_ENTRY_ACK_MESSAGE);
            case 42 -> Optional.of(DECLARATION_NOTICE_MESSAGE);
            case 43 -> Optional.of(DECLARATION_CANCEL_AND_REFUSAL_MESSAGE);
            case 44 -> Optional.of(FUND_PRICE_INPUT_MESSAGE);
            case 45 -> Optional.of(FUND_PRICE_INPUT_ACK_MESSAGE);
            case 46 -> Optional.of(DECLARATION_ENTRY_REJECT_MESSAGE);
            case 50 -> Optional.of(INSTRUMENT_SYNCHRONIZATION_LIST_MESSAGE);
            case 51 -> Optional.of(SYNCHRONIZATION_TIME_MESSAGE);
            case 100 -> Optional.of(LOGON_MESSAGE);
            case 101 -> Optional.of(LOGON_ACK_MESSAGE);
            case 102 -> Optional.of(LOGON_REJECT_MESSAGE);
            case 103 -> Optional.of(LOGOUT_MESSAGE);
            case 106 -> Optional.of(HEARTBEAT_MESSAGE);
            case 107 -> Optional.of(TEST_REQUEST_MESSAGE);
            case 108 -> Optional.of(TECHNICAL_REJECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
