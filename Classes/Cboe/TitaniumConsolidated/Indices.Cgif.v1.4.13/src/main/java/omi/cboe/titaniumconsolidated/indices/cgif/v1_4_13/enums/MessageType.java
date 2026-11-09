package omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.enums;

import java.util.Optional;

/**
 * FIX-compliant market data message type. May be shared across templates.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Shared by Contributor Value, Index Summary, Index Value, and Index Value With Status messages. Body determined by Template ID.
     */
    MARKET_DATA_INCREMENTAL_REFRESH('X', "Shared by Contributor Value, Index Summary, Index Value, and Index Value With Status messages. Body determined by Template ID."),

    /**
     * Index Definition Message.
     */
    INDEX_DEFINITION('D', "Index Definition Message."),

    /**
     * Heartbeat Message.
     */
    HEARTBEAT('0', "Heartbeat Message.");

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
            case 'X' -> Optional.of(MARKET_DATA_INCREMENTAL_REFRESH);
            case 'D' -> Optional.of(INDEX_DEFINITION);
            case '0' -> Optional.of(HEARTBEAT);
            default -> Optional.empty();
        };
    }
}
