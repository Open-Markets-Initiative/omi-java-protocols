package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Defines the MissedMessageReportResponseType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MissedMessageReportResponseType {

    /**
     * Download Complete
     */
    DOWNLOAD_COMPLETE((short) 0, "Download Complete"),

    /**
     * Message Limit Reached
     */
    MESSAGE_LIMIT_REACHED((short) 1, "Message Limit Reached"),

    /**
     * Service Unavailable
     */
    SERVICE_UNAVAILABLE((short) 3, "Service Unavailable");

    private final short wire;

    private final String description;

    MissedMessageReportResponseType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MissedMessageReportResponseType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DOWNLOAD_COMPLETE);
            case 1 -> Optional.of(MESSAGE_LIMIT_REACHED);
            case 3 -> Optional.of(SERVICE_UNAVAILABLE);
            default -> Optional.empty();
        };
    }
}
