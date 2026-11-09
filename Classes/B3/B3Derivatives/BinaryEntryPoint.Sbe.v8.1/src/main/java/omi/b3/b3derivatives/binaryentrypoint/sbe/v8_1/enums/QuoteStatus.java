package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * quoteStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteStatus {

    /**
     * EXPIRED
     */
    EXPIRED((short) 7, "EXPIRED"),

    /**
     * ACCEPTED
     */
    ACCEPTED((short) 0, "ACCEPTED"),

    /**
     * REJECTED
     */
    REJECTED((short) 5, "REJECTED"),

    /**
     * QUOTE_NOT_FOUND
     */
    QUOTE_NOT_FOUND((short) 9, "QUOTE_NOT_FOUND"),

    /**
     * PENDING
     */
    PENDING((short) 10, "PENDING"),

    /**
     * PASS
     */
    PASS((short) 11, "PASS"),

    /**
     * CANCELED
     */
    CANCELED((short) 17, "CANCELED");

    private final short wire;

    private final String description;

    QuoteStatus(short wire, String description) {
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
    public static Optional<QuoteStatus> fromWire(short wire) {
        return switch (wire) {
            case 7 -> Optional.of(EXPIRED);
            case 0 -> Optional.of(ACCEPTED);
            case 5 -> Optional.of(REJECTED);
            case 9 -> Optional.of(QUOTE_NOT_FOUND);
            case 10 -> Optional.of(PENDING);
            case 11 -> Optional.of(PASS);
            case 17 -> Optional.of(CANCELED);
            default -> Optional.empty();
        };
    }
}
