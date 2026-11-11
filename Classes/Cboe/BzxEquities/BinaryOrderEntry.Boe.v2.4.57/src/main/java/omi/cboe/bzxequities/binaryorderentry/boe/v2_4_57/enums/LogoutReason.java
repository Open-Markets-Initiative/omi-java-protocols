package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * The reason why the Logout message was sent. U=User Requested E=End of Day A=Administrative !=Protocol Violation
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LogoutReason {

    /**
     * User Requested
     */
    USER_REQUESTED('U', "User Requested"),

    /**
     * End of Day
     */
    END_OF_DAY('E', "End of Day"),

    /**
     * Administrative
     */
    ADMINISTRATIVE('A', "Administrative"),

    /**
     * Protocol Violation
     */
    PROTOCOL_VIOLATION('!', "Protocol Violation");

    private final char wire;

    private final String description;

    LogoutReason(char wire, String description) {
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
    public static Optional<LogoutReason> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'E' -> Optional.of(END_OF_DAY);
            case 'A' -> Optional.of(ADMINISTRATIVE);
            case '!' -> Optional.of(PROTOCOL_VIOLATION);
            default -> Optional.empty();
        };
    }
}
