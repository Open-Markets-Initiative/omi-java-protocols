package omi.nasdaq.nsmequities.drop.asciidrop.v2_3.enums;

import java.util.Optional;

/**
 * For cancel messages, the cancel reason value.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelReason {

    /**
     * U = User cancel
     */
    USER_CANCEL('U', "U = User cancel"),

    /**
     * I = IOC cancel
     */
    IOC_CANCEL('I', "I = IOC cancel"),

    /**
     * T = Timeout
     */
    TIMEOUT('T', "T = Timeout"),

    /**
     * S = Supervisory cancel
     */
    SUPERVISORY_CANCEL('S', "S = Supervisory cancel"),

    /**
     * D = Regulatory cancel
     */
    REGULATORY_CANCEL('D', "D = Regulatory cancel"),

    /**
     * Q = Self Match Prevention
     */
    SELF_MATCH_PREVENTION('Q', "Q = Self Match Prevention"),

    /**
     * Z = System cancel
     */
    SYSTEM_CANCEL('Z', "Z = System cancel"),

    /**
     * C = Cross cancel
     */
    CROSS_CANCEL('C', "C = Cross cancel");

    private final char wire;

    private final String description;

    CancelReason(char wire, String description) {
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
    public static Optional<CancelReason> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(USER_CANCEL);
            case 'I' -> Optional.of(IOC_CANCEL);
            case 'T' -> Optional.of(TIMEOUT);
            case 'S' -> Optional.of(SUPERVISORY_CANCEL);
            case 'D' -> Optional.of(REGULATORY_CANCEL);
            case 'Q' -> Optional.of(SELF_MATCH_PREVENTION);
            case 'Z' -> Optional.of(SYSTEM_CANCEL);
            case 'C' -> Optional.of(CROSS_CANCEL);
            default -> Optional.empty();
        };
    }
}
