package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Success or failure code from a Logon Request
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LogonResponseCode {

    /**
     * Logon Success
     */
    SUCCESS((short) 0, "Logon Success"),

    /**
     * Incorrect Sender Comp Id
     */
    INCORRECT_SENDER_COMP((short) 1, "Incorrect Sender Comp Id"),

    /**
     * Incorrect Session Id
     */
    INCORRECT_SESSION((short) 2, "Incorrect Session Id"),

    /**
     * The sequence number requested is larger than the largest known sequence, or is less than 0
     */
    INVALID_NEXT_SEQUENCE((short) 3, "The sequence number requested is larger than the largest known sequence, or is less than 0"),

    /**
     * The RAKE server is configured incorrectly for the login request specified
     */
    INVALID_CONFIGURATION((short) 4, "The RAKE server is configured incorrectly for the login request specified"),

    /**
     * Incorrect security token
     */
    INCORRECT_TOKEN((short) 5, "Incorrect security token");

    private final short wire;

    private final String description;

    LogonResponseCode(short wire, String description) {
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
    public static Optional<LogonResponseCode> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SUCCESS);
            case 1 -> Optional.of(INCORRECT_SENDER_COMP);
            case 2 -> Optional.of(INCORRECT_SESSION);
            case 3 -> Optional.of(INVALID_NEXT_SEQUENCE);
            case 4 -> Optional.of(INVALID_CONFIGURATION);
            case 5 -> Optional.of(INCORRECT_TOKEN);
            default -> Optional.empty();
        };
    }
}
