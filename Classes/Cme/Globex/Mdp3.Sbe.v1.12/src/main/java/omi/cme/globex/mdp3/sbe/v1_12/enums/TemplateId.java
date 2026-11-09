package omi.cme.globex.mdp3.sbe.v1_12.enums;

import java.util.Optional;

/**
 * Defines the TemplateId values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * ChannelReset
     */
    CHANNEL_RESET(4, "ChannelReset"),

    /**
     * AdminHeartbeat
     */
    ADMIN_HEARTBEAT(12, "AdminHeartbeat"),

    /**
     * AdminLogin
     */
    ADMIN_LOGIN(15, "AdminLogin"),

    /**
     * AdminLogout
     */
    ADMIN_LOGOUT(16, "AdminLogout"),

    /**
     * SecurityStatus
     */
    SECURITY_STATUS(30, "SecurityStatus"),

    /**
     * MDIncrementalRefreshVolume
     */
    MD_INCREMENTAL_REFRESH_VOLUME(37, "MDIncrementalRefreshVolume"),

    /**
     * QuoteRequest
     */
    QUOTE_REQUEST(39, "QuoteRequest"),

    /**
     * MDIncrementalRefreshBook
     */
    MD_INCREMENTAL_REFRESH_BOOK(46, "MDIncrementalRefreshBook"),

    /**
     * MDIncrementalRefreshOrderBook
     */
    MD_INCREMENTAL_REFRESH_ORDER_BOOK(47, "MDIncrementalRefreshOrderBook"),

    /**
     * MDIncrementalRefreshTradeSummary
     */
    MD_INCREMENTAL_REFRESH_TRADE_SUMMARY(48, "MDIncrementalRefreshTradeSummary"),

    /**
     * MDIncrementalRefreshDailyStatistics
     */
    MD_INCREMENTAL_REFRESH_DAILY_STATISTICS(49, "MDIncrementalRefreshDailyStatistics"),

    /**
     * MDIncrementalRefreshLimitsBanding
     */
    MD_INCREMENTAL_REFRESH_LIMITS_BANDING(50, "MDIncrementalRefreshLimitsBanding"),

    /**
     * MDIncrementalRefreshSessionStatistics
     */
    MD_INCREMENTAL_REFRESH_SESSION_STATISTICS(51, "MDIncrementalRefreshSessionStatistics"),

    /**
     * SnapshotFullRefresh
     */
    SNAPSHOT_FULL_REFRESH(52, "SnapshotFullRefresh"),

    /**
     * SnapshotFullRefreshOrderBook
     */
    SNAPSHOT_FULL_REFRESH_ORDER_BOOK(53, "SnapshotFullRefreshOrderBook"),

    /**
     * MDInstrumentDefinitionFuture
     */
    MD_INSTRUMENT_DEFINITION_FUTURE(54, "MDInstrumentDefinitionFuture"),

    /**
     * MDInstrumentDefinitionOption
     */
    MD_INSTRUMENT_DEFINITION_OPTION(55, "MDInstrumentDefinitionOption"),

    /**
     * MDInstrumentDefinitionSpread
     */
    MD_INSTRUMENT_DEFINITION_SPREAD(56, "MDInstrumentDefinitionSpread"),

    /**
     * MDInstrumentDefinitionFixedIncome
     */
    MD_INSTRUMENT_DEFINITION_FIXED_INCOME(57, "MDInstrumentDefinitionFixedIncome"),

    /**
     * MDInstrumentDefinitionRepo
     */
    MD_INSTRUMENT_DEFINITION_REPO(58, "MDInstrumentDefinitionRepo"),

    /**
     * SnapshotRefreshTopOrders
     */
    SNAPSHOT_REFRESH_TOP_ORDERS(59, "SnapshotRefreshTopOrders"),

    /**
     * SecurityStatusWorkup
     */
    SECURITY_STATUS_WORKUP(60, "SecurityStatusWorkup"),

    /**
     * SnapshotFullRefreshTCP
     */
    SNAPSHOT_FULL_REFRESH_TCP(61, "SnapshotFullRefreshTCP"),

    /**
     * CollateralMarketValue
     */
    COLLATERAL_MARKET_VALUE(62, "CollateralMarketValue"),

    /**
     * MDInstrumentDefinitionFX
     */
    MD_INSTRUMENT_DEFINITION_FX(63, "MDInstrumentDefinitionFX"),

    /**
     * MDIncrementalRefreshBookLongQty
     */
    MD_INCREMENTAL_REFRESH_BOOK_LONG_QTY(64, "MDIncrementalRefreshBookLongQty"),

    /**
     * MDIncrementalRefreshTradeSummaryLongQty
     */
    MD_INCREMENTAL_REFRESH_TRADE_SUMMARY_LONG_QTY(65, "MDIncrementalRefreshTradeSummaryLongQty"),

    /**
     * MDIncrementalRefreshVolumeLongQty
     */
    MD_INCREMENTAL_REFRESH_VOLUME_LONG_QTY(66, "MDIncrementalRefreshVolumeLongQty"),

    /**
     * MDIncrementalRefreshSessionStatisticsLongQty
     */
    MD_INCREMENTAL_REFRESH_SESSION_STATISTICS_LONG_QTY(67, "MDIncrementalRefreshSessionStatisticsLongQty"),

    /**
     * SnapshotFullRefreshTCPLongQty
     */
    SNAPSHOT_FULL_REFRESH_TCP_LONG_QTY(68, "SnapshotFullRefreshTCPLongQty"),

    /**
     * SnapshotFullRefreshLongQty
     */
    SNAPSHOT_FULL_REFRESH_LONG_QTY(69, "SnapshotFullRefreshLongQty"),

    /**
     * Negotiate
     */
    NEGOTIATE(200, "Negotiate"),

    /**
     * NegotiationReject
     */
    NEGOTIATION_REJECT(201, "NegotiationReject"),

    /**
     * NegotiationResponse
     */
    NEGOTIATION_RESPONSE(202, "NegotiationResponse"),

    /**
     * Terminate
     */
    TERMINATE(203, "Terminate"),

    /**
     * MarketDataRequest
     */
    MARKET_DATA_REQUEST(205, "MarketDataRequest"),

    /**
     * RequestAck
     */
    REQUEST_ACK(206, "RequestAck"),

    /**
     * RequestReject
     */
    REQUEST_REJECT(207, "RequestReject"),

    /**
     * SecurityListRequest
     */
    SECURITY_LIST_REQUEST(208, "SecurityListRequest"),

    /**
     * SecurityStatusRequest
     */
    SECURITY_STATUS_REQUEST(209, "SecurityStatusRequest"),

    /**
     * SubscriberHeartbeat
     */
    SUBSCRIBER_HEARTBEAT(210, "SubscriberHeartbeat");

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
            case 4 -> Optional.of(CHANNEL_RESET);
            case 12 -> Optional.of(ADMIN_HEARTBEAT);
            case 15 -> Optional.of(ADMIN_LOGIN);
            case 16 -> Optional.of(ADMIN_LOGOUT);
            case 30 -> Optional.of(SECURITY_STATUS);
            case 37 -> Optional.of(MD_INCREMENTAL_REFRESH_VOLUME);
            case 39 -> Optional.of(QUOTE_REQUEST);
            case 46 -> Optional.of(MD_INCREMENTAL_REFRESH_BOOK);
            case 47 -> Optional.of(MD_INCREMENTAL_REFRESH_ORDER_BOOK);
            case 48 -> Optional.of(MD_INCREMENTAL_REFRESH_TRADE_SUMMARY);
            case 49 -> Optional.of(MD_INCREMENTAL_REFRESH_DAILY_STATISTICS);
            case 50 -> Optional.of(MD_INCREMENTAL_REFRESH_LIMITS_BANDING);
            case 51 -> Optional.of(MD_INCREMENTAL_REFRESH_SESSION_STATISTICS);
            case 52 -> Optional.of(SNAPSHOT_FULL_REFRESH);
            case 53 -> Optional.of(SNAPSHOT_FULL_REFRESH_ORDER_BOOK);
            case 54 -> Optional.of(MD_INSTRUMENT_DEFINITION_FUTURE);
            case 55 -> Optional.of(MD_INSTRUMENT_DEFINITION_OPTION);
            case 56 -> Optional.of(MD_INSTRUMENT_DEFINITION_SPREAD);
            case 57 -> Optional.of(MD_INSTRUMENT_DEFINITION_FIXED_INCOME);
            case 58 -> Optional.of(MD_INSTRUMENT_DEFINITION_REPO);
            case 59 -> Optional.of(SNAPSHOT_REFRESH_TOP_ORDERS);
            case 60 -> Optional.of(SECURITY_STATUS_WORKUP);
            case 61 -> Optional.of(SNAPSHOT_FULL_REFRESH_TCP);
            case 62 -> Optional.of(COLLATERAL_MARKET_VALUE);
            case 63 -> Optional.of(MD_INSTRUMENT_DEFINITION_FX);
            case 64 -> Optional.of(MD_INCREMENTAL_REFRESH_BOOK_LONG_QTY);
            case 65 -> Optional.of(MD_INCREMENTAL_REFRESH_TRADE_SUMMARY_LONG_QTY);
            case 66 -> Optional.of(MD_INCREMENTAL_REFRESH_VOLUME_LONG_QTY);
            case 67 -> Optional.of(MD_INCREMENTAL_REFRESH_SESSION_STATISTICS_LONG_QTY);
            case 68 -> Optional.of(SNAPSHOT_FULL_REFRESH_TCP_LONG_QTY);
            case 69 -> Optional.of(SNAPSHOT_FULL_REFRESH_LONG_QTY);
            case 200 -> Optional.of(NEGOTIATE);
            case 201 -> Optional.of(NEGOTIATION_REJECT);
            case 202 -> Optional.of(NEGOTIATION_RESPONSE);
            case 203 -> Optional.of(TERMINATE);
            case 205 -> Optional.of(MARKET_DATA_REQUEST);
            case 206 -> Optional.of(REQUEST_ACK);
            case 207 -> Optional.of(REQUEST_REJECT);
            case 208 -> Optional.of(SECURITY_LIST_REQUEST);
            case 209 -> Optional.of(SECURITY_STATUS_REQUEST);
            case 210 -> Optional.of(SUBSCRIBER_HEARTBEAT);
            default -> Optional.empty();
        };
    }
}
