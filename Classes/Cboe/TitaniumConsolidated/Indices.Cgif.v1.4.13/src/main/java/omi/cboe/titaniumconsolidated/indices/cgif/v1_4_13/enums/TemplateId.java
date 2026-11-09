package omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.enums;

import java.util.Optional;

/**
 * Template identifier used for decoding the message structure.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * Heartbeat / line integrity message transmitted every 5 seconds. Contains only the standard message header (MessageType "0").
     */
    HEARTBEAT_MESSAGE((short) 16, "Heartbeat / line integrity message transmitted every 5 seconds. Contains only the standard message header (MessageType \"0\")."),

    /**
     * Index Value message containing values associated with a calculated index. May include Index Value, Bid, and Ask MDEntries.
     */
    INDEX_VALUE_MESSAGE((short) 22, "Index Value message containing values associated with a calculated index. May include Index Value, Bid, and Ask MDEntries."),

    /**
     * Contributor Value message containing values associated with a given symbol or index, transmitted when received by Cboe.
     */
    CONTRIBUTOR_VALUE_MESSAGE((short) 23, "Contributor Value message containing values associated with a given symbol or index, transmitted when received by Cboe."),

    /**
     * Index Summary message containing values associated with start or end of day. Includes an effective business date for reference.
     */
    INDEX_SUMMARY_MESSAGE((short) 24, "Index Summary message containing values associated with start or end of day. Includes an effective business date for reference."),

    /**
     * Index Value With Status message contains the values associated with a calculated index along with a status describing whether the value is indicative or not. Valid entry types include close and settlement markers.
     */
    INDEX_VALUE_WITH_STATUS_MESSAGE((short) 25, "Index Value With Status message contains the values associated with a calculated index along with a status describing whether the value is indicative or not. Valid entry types include close and settlement markers."),

    /**
     * Index Definition message published for every index within each cycle. Contains index information including current status, channel name, current trading date, data source, and description. Published on the Cboe Global Indices Definition Feed (CGIDF).
     */
    INDEX_DEFINITION_MESSAGE((short) 26, "Index Definition message published for every index within each cycle. Contains index information including current status, channel name, current trading date, data source, and description. Published on the Cboe Global Indices Definition Feed (CGIDF).");

    private final short wire;

    private final String description;

    TemplateId(short wire, String description) {
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
    public static Optional<TemplateId> fromWire(short wire) {
        return switch (wire) {
            case 16 -> Optional.of(HEARTBEAT_MESSAGE);
            case 22 -> Optional.of(INDEX_VALUE_MESSAGE);
            case 23 -> Optional.of(CONTRIBUTOR_VALUE_MESSAGE);
            case 24 -> Optional.of(INDEX_SUMMARY_MESSAGE);
            case 25 -> Optional.of(INDEX_VALUE_WITH_STATUS_MESSAGE);
            case 26 -> Optional.of(INDEX_DEFINITION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
