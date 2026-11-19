package omi.siac.cqs.snapshot.cta.v1_0.enums;

import java.util.Optional;

/**
 * Snapshot message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SnapshotMessageType {

    /**
     * Line Integrity Message
     */
    LINE_INTEGRITY_MESSAGE('T', "Line Integrity Message"),

    /**
     * Market Wide Circuit Breaker Decline Level Status Snapshot Message
     */
    MARKET_WIDE_CIRCUIT_BREAKER_DECLINE_LEVEL_STATUS_SNAPSHOT_MESSAGE('K', "Market Wide Circuit Breaker Decline Level Status Snapshot Message"),

    /**
     * Consolidated Snapshot Message
     */
    CONSOLIDATED_SNAPSHOT_MESSAGE('C', "Consolidated Snapshot Message"),

    /**
     * Participant Snapshot Message
     */
    PARTICIPANT_SNAPSHOT_MESSAGE('P', "Participant Snapshot Message"),

    /**
     * Finra Snapshot Message
     */
    FINRA_SNAPSHOT_MESSAGE('F', "Finra Snapshot Message");

    private final char wire;

    private final String description;

    SnapshotMessageType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<SnapshotMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(LINE_INTEGRITY_MESSAGE);
            case 'K' -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_DECLINE_LEVEL_STATUS_SNAPSHOT_MESSAGE);
            case 'C' -> Optional.of(CONSOLIDATED_SNAPSHOT_MESSAGE);
            case 'P' -> Optional.of(PARTICIPANT_SNAPSHOT_MESSAGE);
            case 'F' -> Optional.of(FINRA_SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
