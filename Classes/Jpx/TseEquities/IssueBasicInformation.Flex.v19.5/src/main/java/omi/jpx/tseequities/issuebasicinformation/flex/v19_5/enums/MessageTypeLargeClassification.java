package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Large Classification indicates Message Type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageTypeLargeClassification {

    /**
     * New, Backup or All-Day issue realtime information
     */
    ISSUE_REALTIME_MESSAGE('1', "New, Backup or All-Day issue realtime information"),

    /**
     * Statistics information
     */
    STATISTICS_MESSAGE('2', "Statistics information"),

    /**
     * Index information
     */
    INDEX_MESSAGE('3', "Index information"),

    /**
     * Regular or Special issue basic information
     */
    ISSUE_BASIC_MESSAGE('4', "Regular or Special issue basic information"),

    /**
     * Communication, information and health check control
     */
    CONTROL_MESSAGE('9', "Communication, information and health check control");

    private final char wire;

    private final String description;

    MessageTypeLargeClassification(char wire, String description) {
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
    public static Optional<MessageTypeLargeClassification> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(ISSUE_REALTIME_MESSAGE);
            case '2' -> Optional.of(STATISTICS_MESSAGE);
            case '3' -> Optional.of(INDEX_MESSAGE);
            case '4' -> Optional.of(ISSUE_BASIC_MESSAGE);
            case '9' -> Optional.of(CONTROL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
