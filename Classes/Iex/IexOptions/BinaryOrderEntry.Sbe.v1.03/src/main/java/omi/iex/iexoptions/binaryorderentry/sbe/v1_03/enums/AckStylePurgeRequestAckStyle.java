package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * ackStyle
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AckStylePurgeRequestAckStyle {

    /**
     * Send a single Purge Acknowledgement on the Purge Session once all cancels have been processed.
     */
    SINGLE_ACK((short) 0, "Send a single Purge Acknowledgement on the Purge Session once all cancels have been processed."),

    /**
     * Send a single Purge Acknowledgement on the Purge Session once all cancels have been processed. Separately, send a Purge Acknowledgment to each Market Maker Quoting Session with this MPID on this Trading Ring once all cancels have been processed.
     */
    SINGLE_ACK_WITH_MMQS((short) 1, "Send a single Purge Acknowledgement on the Purge Session once all cancels have been processed. Separately, send a Purge Acknowledgment to each Market Maker Quoting Session with this MPID on this Trading Ring once all cancels have been processed.");

    private final short wire;

    private final String description;

    AckStylePurgeRequestAckStyle(short wire, String description) {
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
    public static Optional<AckStylePurgeRequestAckStyle> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SINGLE_ACK);
            case 1 -> Optional.of(SINGLE_ACK_WITH_MMQS);
            default -> Optional.empty();
        };
    }
}
