package omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

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
    REFRESH_COMPLETE_MESSAGE(203, "This message is published to mark the end of a refresh.");

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
            case 70 -> Optional.of(INDEX_DEFINITION_MESSAGE);
            case 71 -> Optional.of(INDEX_DATA_MESSAGE);
            case 203 -> Optional.of(REFRESH_COMPLETE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
