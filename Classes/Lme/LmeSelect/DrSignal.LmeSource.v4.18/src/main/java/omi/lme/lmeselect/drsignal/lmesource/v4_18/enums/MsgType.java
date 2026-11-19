package omi.lme.lmeselect.drsignal.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Type of message, selecting the payload that follows the message header
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * Sent on each multicast channel at start of day, and intraday in case of a disaster recovery. The client must ignore the sequence number of the Sequence Reset message itself and set the next expected sequence number to NewSeqNo, clear all cached data for all instruments and subscribe to the refresh channels to receive the current state of the market.
     */
    SEQUENCE_RESET_MESSAGE(100, "Sent on each multicast channel at start of day, and intraday in case of a disaster recovery. The client must ignore the sequence number of the Sequence Reset message itself and set the next expected sequence number to NewSeqNo, clear all cached data for all instruments and subscribe to the refresh channels to receive the current state of the market."),

    /**
     * Sent on a dedicated multicast channel whenever a site failover is triggered intraday, periodically within the heartbeat interval until the end of the business day. DRStatus 1 indicates the DR process has been activated, upon which clients should clear all cached market data; DRStatus 2 indicates the failover finished and clients can rebuild from the refresh service.
     */
    DISASTER_RECOVERY_SIGNAL_MESSAGE(105, "Sent on a dedicated multicast channel whenever a site failover is triggered intraday, periodically within the heartbeat interval until the end of the business day. DRStatus 1 indicates the DR process has been activated, upon which clients should clear all cached market data; DRStatus 2 indicates the failover finished and clients can rebuild from the refresh service.");

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
            default -> Optional.empty();
        };
    }
}
