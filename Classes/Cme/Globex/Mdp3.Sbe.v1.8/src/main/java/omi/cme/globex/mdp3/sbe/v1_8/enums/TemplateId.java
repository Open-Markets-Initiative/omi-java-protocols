package omi.cme.globex.mdp3.sbe.v1_8.enums;

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
     * MDInstrumentDefinitionFuture
     */
    MD_INSTRUMENT_DEFINITION_FUTURE(27, "MDInstrumentDefinitionFuture"),

    /**
     * MDInstrumentDefinitionSpread
     */
    MD_INSTRUMENT_DEFINITION_SPREAD(29, "MDInstrumentDefinitionSpread"),

    /**
     * SecurityStatus
     */
    SECURITY_STATUS(30, "SecurityStatus"),

    /**
     * MDIncrementalRefreshBook
     */
    MD_INCREMENTAL_REFRESH_BOOK(32, "MDIncrementalRefreshBook"),

    /**
     * MDIncrementalRefreshDailyStatistics
     */
    MD_INCREMENTAL_REFRESH_DAILY_STATISTICS(33, "MDIncrementalRefreshDailyStatistics"),

    /**
     * MDIncrementalRefreshLimitsBanding
     */
    MD_INCREMENTAL_REFRESH_LIMITS_BANDING(34, "MDIncrementalRefreshLimitsBanding"),

    /**
     * MDIncrementalRefreshSessionStatistics
     */
    MD_INCREMENTAL_REFRESH_SESSION_STATISTICS(35, "MDIncrementalRefreshSessionStatistics"),

    /**
     * MDIncrementalRefreshTrade
     */
    MD_INCREMENTAL_REFRESH_TRADE(36, "MDIncrementalRefreshTrade"),

    /**
     * MDIncrementalRefreshVolume
     */
    MD_INCREMENTAL_REFRESH_VOLUME(37, "MDIncrementalRefreshVolume"),

    /**
     * SnapshotFullRefresh
     */
    SNAPSHOT_FULL_REFRESH(38, "SnapshotFullRefresh"),

    /**
     * QuoteRequest
     */
    QUOTE_REQUEST(39, "QuoteRequest"),

    /**
     * MDInstrumentDefinitionOption
     */
    MD_INSTRUMENT_DEFINITION_OPTION(41, "MDInstrumentDefinitionOption"),

    /**
     * MDIncrementalRefreshTradeSummary
     */
    MD_INCREMENTAL_REFRESH_TRADE_SUMMARY(42, "MDIncrementalRefreshTradeSummary"),

    /**
     * MDIncrementalRefreshOrderBook
     */
    MD_INCREMENTAL_REFRESH_ORDER_BOOK(43, "MDIncrementalRefreshOrderBook"),

    /**
     * SnapshotFullRefreshOrderBook
     */
    SNAPSHOT_FULL_REFRESH_ORDER_BOOK(44, "SnapshotFullRefreshOrderBook"),

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
            case 27 -> Optional.of(MD_INSTRUMENT_DEFINITION_FUTURE);
            case 29 -> Optional.of(MD_INSTRUMENT_DEFINITION_SPREAD);
            case 30 -> Optional.of(SECURITY_STATUS);
            case 32 -> Optional.of(MD_INCREMENTAL_REFRESH_BOOK);
            case 33 -> Optional.of(MD_INCREMENTAL_REFRESH_DAILY_STATISTICS);
            case 34 -> Optional.of(MD_INCREMENTAL_REFRESH_LIMITS_BANDING);
            case 35 -> Optional.of(MD_INCREMENTAL_REFRESH_SESSION_STATISTICS);
            case 36 -> Optional.of(MD_INCREMENTAL_REFRESH_TRADE);
            case 37 -> Optional.of(MD_INCREMENTAL_REFRESH_VOLUME);
            case 38 -> Optional.of(SNAPSHOT_FULL_REFRESH);
            case 39 -> Optional.of(QUOTE_REQUEST);
            case 41 -> Optional.of(MD_INSTRUMENT_DEFINITION_OPTION);
            case 42 -> Optional.of(MD_INCREMENTAL_REFRESH_TRADE_SUMMARY);
            case 43 -> Optional.of(MD_INCREMENTAL_REFRESH_ORDER_BOOK);
            case 44 -> Optional.of(SNAPSHOT_FULL_REFRESH_ORDER_BOOK);
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
