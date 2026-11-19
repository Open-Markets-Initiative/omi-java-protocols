package omi.moex.spectra.optinfoincremental.simba.v9_12_0.enums;

import java.util.Optional;

/**
 * Message template identifier
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * HeartbeatMessage
     */
    HEARTBEAT_MESSAGE(1, "HeartbeatMessage"),

    /**
     * SequenceResetMessage
     */
    SEQUENCE_RESET_MESSAGE(2, "SequenceResetMessage"),

    /**
     * BestPricesMessage
     */
    BEST_PRICES_MESSAGE(14, "BestPricesMessage"),

    /**
     * EmptyBookMessage
     */
    EMPTY_BOOK_MESSAGE(4, "EmptyBookMessage"),

    /**
     * OrderUpdateMessage
     */
    ORDER_UPDATE_MESSAGE(15, "OrderUpdateMessage"),

    /**
     * OrderExecutionMessage
     */
    ORDER_EXECUTION_MESSAGE(16, "OrderExecutionMessage"),

    /**
     * OrderBookSnapshotMessage
     */
    ORDER_BOOK_SNAPSHOT_MESSAGE(17, "OrderBookSnapshotMessage"),

    /**
     * SecurityDefinitionMessage
     */
    SECURITY_DEFINITION_MESSAGE(29, "SecurityDefinitionMessage"),

    /**
     * SecurityStatusMessage
     */
    SECURITY_STATUS_MESSAGE(28, "SecurityStatusMessage"),

    /**
     * SecurityDefinitionUpdateReportMessage
     */
    SECURITY_DEFINITION_UPDATE_REPORT_MESSAGE(10, "SecurityDefinitionUpdateReportMessage"),

    /**
     * TradingSessionStatusMessage
     */
    TRADING_SESSION_STATUS_MESSAGE(26, "TradingSessionStatusMessage"),

    /**
     * DiscreteAuctionMessage
     */
    DISCRETE_AUCTION_MESSAGE(24, "DiscreteAuctionMessage"),

    /**
     * SecurityMassStatusMessage
     */
    SECURITY_MASS_STATUS_MESSAGE(19, "SecurityMassStatusMessage"),

    /**
     * SecurityGroupStatusMessage
     */
    SECURITY_GROUP_STATUS_MESSAGE(22, "SecurityGroupStatusMessage"),

    /**
     * LogonMessage
     */
    LOGON_MESSAGE(1000, "LogonMessage"),

    /**
     * LogoutMessage
     */
    LOGOUT_MESSAGE(1001, "LogoutMessage"),

    /**
     * MarketDataRequestMessage
     */
    MARKET_DATA_REQUEST_MESSAGE(1002, "MarketDataRequestMessage"),

    /**
     * MarketDataDummyMessage
     */
    MARKET_DATA_DUMMY_MESSAGE(1003, "MarketDataDummyMessage");

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
            case 1 -> Optional.of(HEARTBEAT_MESSAGE);
            case 2 -> Optional.of(SEQUENCE_RESET_MESSAGE);
            case 14 -> Optional.of(BEST_PRICES_MESSAGE);
            case 4 -> Optional.of(EMPTY_BOOK_MESSAGE);
            case 15 -> Optional.of(ORDER_UPDATE_MESSAGE);
            case 16 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 17 -> Optional.of(ORDER_BOOK_SNAPSHOT_MESSAGE);
            case 29 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 28 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 10 -> Optional.of(SECURITY_DEFINITION_UPDATE_REPORT_MESSAGE);
            case 26 -> Optional.of(TRADING_SESSION_STATUS_MESSAGE);
            case 24 -> Optional.of(DISCRETE_AUCTION_MESSAGE);
            case 19 -> Optional.of(SECURITY_MASS_STATUS_MESSAGE);
            case 22 -> Optional.of(SECURITY_GROUP_STATUS_MESSAGE);
            case 1000 -> Optional.of(LOGON_MESSAGE);
            case 1001 -> Optional.of(LOGOUT_MESSAGE);
            case 1002 -> Optional.of(MARKET_DATA_REQUEST_MESSAGE);
            case 1003 -> Optional.of(MARKET_DATA_DUMMY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
