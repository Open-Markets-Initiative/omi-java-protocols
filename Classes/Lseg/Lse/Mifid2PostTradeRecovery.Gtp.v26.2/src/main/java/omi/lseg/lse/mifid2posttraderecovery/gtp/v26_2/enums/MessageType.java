package omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Used by the client to log in to the replay or recovery channel.
     */
    LOGIN_REQUEST_MESSAGE((short) 1, "Used by the client to log in to the replay or recovery channel."),

    /**
     * Used by the client to request data on the recovery channel.
     */
    RECOVERY_REQUEST_MESSAGE((short) 129, "Used by the client to request data on the recovery channel."),

    /**
     * Used by the server to accept or reject a login request to the replay or recovery channel.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "Used by the server to accept or reject a login request to the replay or recovery channel."),

    /**
     * Used by the server to respond to a snapshot request on the Snapshot channel.
     */
    RECOVERY_RESPONSE_MESSAGE((short) 130, "Used by the server to respond to a snapshot request on the Snapshot channel."),

    /**
     * Used by the server to indicate the successful completion of servicing a message replay or a recovery request.
     */
    REPLAY_AND_RECOVERY_COMPLETE_MESSAGE((short) 131, "Used by the server to indicate the successful completion of servicing a message replay or a recovery request."),

    /**
     * Sent to indicate the start and end of the day.
     */
    SYSTEM_EVENT_MESSAGE((short) 83, "Sent to indicate the start and end of the day."),

    /**
     * Used to communicate scheduled and unscheduled session changes. When sent in the recovery channel, used to indicate the current trading status of an instrument.
     */
    INSTRUMENT_STATUS_MESSAGE((short) 72, "Used to communicate scheduled and unscheduled session changes. When sent in the recovery channel, used to indicate the current trading status of an instrument."),

    /**
     * Sent to represent different types of MiFID compliant trades published by markets.
     */
    MIFID_II_TRADE_MESSAGE((short) 81, "Sent to represent different types of MiFID compliant trades published by markets."),

    /**
     * Used to disseminate reference data information of equity instruments.
     */
    INSTRUMENT_DIRECTORY_EQUITIES_MESSAGE((short) 82, "Used to disseminate reference data information of equity instruments."),

    /**
     * A snapshot of an instrument's statistics that is used for recovery.
     */
    STATISTICS_SNAPSHOT_MESSAGE((short) 107, "A snapshot of an instrument's statistics that is used for recovery.");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LOGIN_REQUEST_MESSAGE);
            case 129 -> Optional.of(RECOVERY_REQUEST_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 130 -> Optional.of(RECOVERY_RESPONSE_MESSAGE);
            case 131 -> Optional.of(REPLAY_AND_RECOVERY_COMPLETE_MESSAGE);
            case 83 -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 72 -> Optional.of(INSTRUMENT_STATUS_MESSAGE);
            case 81 -> Optional.of(MIFID_II_TRADE_MESSAGE);
            case 82 -> Optional.of(INSTRUMENT_DIRECTORY_EQUITIES_MESSAGE);
            case 107 -> Optional.of(STATISTICS_SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
