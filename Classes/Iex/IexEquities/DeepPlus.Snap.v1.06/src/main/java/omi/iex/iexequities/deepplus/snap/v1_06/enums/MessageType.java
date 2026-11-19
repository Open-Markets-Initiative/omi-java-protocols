package omi.iex.iexequities.deepplus.snap.v1_06.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The Snapshot Request message is sent from the client to the Deep Plus Snap server to authenticate and request a Snapshot Response
     */
    SNAPSHOT_REQUEST_MESSAGE('r', "The Snapshot Request message is sent from the client to the Deep Plus Snap server to authenticate and request a Snapshot Response"),

    /**
     * Sent by the Deep Plus Snap server to the client when a Snapshot Request is rejected
     */
    ERROR_RESPONSE_MESSAGE('e', "Sent by the Deep Plus Snap server to the client when a Snapshot Request is rejected"),

    /**
     * First message of a Snapshot Response sent from the Deep Plus Snap server when a Snapshot Request is successful
     */
    SNAPSHOT_START_MESSAGE('s', "First message of a Snapshot Response sent from the Deep Plus Snap server when a Snapshot Request is successful"),

    /**
     * Carries one complete Deep Plus feed message wrapped with an IexTp header providing Deep Plus feed sequencing and timing information
     */
    SNAPSHOT_DATA_MESSAGE('d', "Carries one complete Deep Plus feed message wrapped with an IexTp header providing Deep Plus feed sequencing and timing information"),

    /**
     * Final message of a Snapshot Response, carries the sequence number at which the snapshot was created
     */
    SNAPSHOT_END_MESSAGE('x', "Final message of a Snapshot Response, carries the sequence number at which the snapshot was created");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'r' -> Optional.of(SNAPSHOT_REQUEST_MESSAGE);
            case 'e' -> Optional.of(ERROR_RESPONSE_MESSAGE);
            case 's' -> Optional.of(SNAPSHOT_START_MESSAGE);
            case 'd' -> Optional.of(SNAPSHOT_DATA_MESSAGE);
            case 'x' -> Optional.of(SNAPSHOT_END_MESSAGE);
            default -> Optional.empty();
        };
    }
}
