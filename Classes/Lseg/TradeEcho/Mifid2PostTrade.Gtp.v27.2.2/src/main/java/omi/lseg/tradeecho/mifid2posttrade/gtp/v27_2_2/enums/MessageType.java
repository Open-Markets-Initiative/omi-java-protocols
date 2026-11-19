package omi.lseg.tradeecho.mifid2posttrade.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Broadcast at the start and end of day on TRADEcho. Session transition is advertised via one system event message for all instruments allocated to the same multicast channel
     */
    SYSTEM_EVENT_MESSAGE((short) 83, "Broadcast at the start and end of day on TRADEcho. Session transition is advertised via one system event message for all instruments allocated to the same multicast channel"),

    /**
     * Used to disseminate a limited set of data for all configured instrument types on the real-time channels
     */
    INSTRUMENT_DIRECTORY_MESSAGE((short) 112, "Used to disseminate a limited set of data for all configured instrument types on the real-time channels"),

    /**
     * Should a specific instrument be subject to individual status change, such as suspension or halt, this will be communicated by the instrument status message
     */
    INSTRUMENT_STATUS_MESSAGE((short) 72, "Should a specific instrument be subject to individual status change, such as suspension or halt, this will be communicated by the instrument status message"),

    /**
     * Contains a set of statistics that are updated frequently, usually as a result of executions
     */
    STATISTICS_MESSAGE((short) 119, "Contains a set of statistics that are updated frequently, usually as a result of executions"),

    /**
     * Sent to report the MiFID compliant details of a privately negotiated trade
     */
    MIFID_II_TRADE_REPORT_MESSAGE((short) 84, "Sent to report the MiFID compliant details of a privately negotiated trade");

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
            case 83 -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 112 -> Optional.of(INSTRUMENT_DIRECTORY_MESSAGE);
            case 72 -> Optional.of(INSTRUMENT_STATUS_MESSAGE);
            case 119 -> Optional.of(STATISTICS_MESSAGE);
            case 84 -> Optional.of(MIFID_II_TRADE_REPORT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
