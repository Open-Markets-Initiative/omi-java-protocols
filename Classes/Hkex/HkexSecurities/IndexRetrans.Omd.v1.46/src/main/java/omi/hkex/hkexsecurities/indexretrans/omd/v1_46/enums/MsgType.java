package omi.hkex.hkexsecurities.indexretrans.omd.v1_46.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * The Sequence Reset message is sent on each multicast channel at start of day. It may also be sent when there is a need for the rectification of stock reference data before market open.
     */
    SEQUENCE_RESET_MESSAGE(100, "The Sequence Reset message is sent on each multicast channel at start of day. It may also be sent when there is a need for the rectification of stock reference data before market open."),

    /**
     * The Disaster Recovery (DR) Signal message is sent on a dedicated multicast channel whenever a site failover scenario is triggered.
     */
    DISASTER_RECOVERY_SIGNAL_MESSAGE(105, "The Disaster Recovery (DR) Signal message is sent on a dedicated multicast channel whenever a site failover scenario is triggered."),

    /**
     * The Index Definition message contains the static referential data for the given index and is generated at the start of the business day. May be re-disseminated during trading hours.
     */
    INDEX_DEFINITION_MESSAGE(70, "The Index Definition message contains the static referential data for the given index and is generated at the start of the business day. May be re-disseminated during trading hours."),

    /**
     * The Index Data message contains all the real-time data for a given index. Fields may be populated with null values to indicate when an update is not provided.
     */
    INDEX_DATA_MESSAGE(71, "The Index Data message contains all the real-time data for a given index. Fields may be populated with null values to indicate when an update is not provided."),

    /**
     * This message is published to mark the end of a refresh.
     */
    REFRESH_COMPLETE_MESSAGE(203, "This message is published to mark the end of a refresh."),

    /**
     * The Logon message enables client authentication. Not required for multicast channels; only used for retransmission requests.
     */
    LOGON_MESSAGE(101, "The Logon message enables client authentication. Not required for multicast channels; only used for retransmission requests."),

    /**
     * Response to a Logon request indicating session status.
     */
    LOGON_RESPONSE_MESSAGE(102, "Response to a Logon request indicating session status."),

    /**
     * Client-initiated request to retransmit a range of messages from a specific multicast channel.
     */
    RETRANSMISSION_REQUEST_MESSAGE(201, "Client-initiated request to retransmit a range of messages from a specific multicast channel."),

    /**
     * Server response to a Retransmission Request indicating whether the range can be resent.
     */
    RETRANSMISSION_RESPONSE_MESSAGE(202, "Server response to a Retransmission Request indicating whether the range can be resent.");

    private final int wire;

    private final String description;

    MsgType(int wire, String description) {
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
    public static Optional<MsgType> fromWire(int wire) {
        return switch (wire) {
            case 100 -> Optional.of(SEQUENCE_RESET_MESSAGE);
            case 105 -> Optional.of(DISASTER_RECOVERY_SIGNAL_MESSAGE);
            case 70 -> Optional.of(INDEX_DEFINITION_MESSAGE);
            case 71 -> Optional.of(INDEX_DATA_MESSAGE);
            case 203 -> Optional.of(REFRESH_COMPLETE_MESSAGE);
            case 101 -> Optional.of(LOGON_MESSAGE);
            case 102 -> Optional.of(LOGON_RESPONSE_MESSAGE);
            case 201 -> Optional.of(RETRANSMISSION_REQUEST_MESSAGE);
            case 202 -> Optional.of(RETRANSMISSION_RESPONSE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
