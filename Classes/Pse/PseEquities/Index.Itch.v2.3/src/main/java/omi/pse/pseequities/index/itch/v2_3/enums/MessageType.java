package omi.pse.pseequities.index.itch.v2_3.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Time Stamp - Seconds Message.
     */
    TIME_STAMP_SECONDS_MESSAGE('T', "Time Stamp - Seconds Message."),

    /**
     * System Event Message.
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Message."),

    /**
     * Orderbook Directory Message.
     */
    ORDERBOOK_DIRECTORY_MESSAGE('R', "Orderbook Directory Message."),

    /**
     * Index Member Directory Message.
     */
    INDEX_MEMBER_DIRECTORY_MESSAGE('Y', "Index Member Directory Message."),

    /**
     * Index Value Message.
     */
    INDEX_VALUE_MESSAGE('Z', "Index Value Message.");

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
            case 'T' -> Optional.of(TIME_STAMP_SECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'R' -> Optional.of(ORDERBOOK_DIRECTORY_MESSAGE);
            case 'Y' -> Optional.of(INDEX_MEMBER_DIRECTORY_MESSAGE);
            case 'Z' -> Optional.of(INDEX_VALUE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
