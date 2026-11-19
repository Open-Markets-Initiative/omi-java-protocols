package omi.cme.globex.sessionmgmt.sbe.v0_2.enums;

import java.util.Optional;

/**
 * Defines the TemplateId values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

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
