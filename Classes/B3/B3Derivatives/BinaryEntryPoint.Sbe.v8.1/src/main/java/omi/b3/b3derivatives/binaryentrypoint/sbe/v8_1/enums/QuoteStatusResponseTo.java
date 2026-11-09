package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * quoteStatusResponseTo
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteStatusResponseTo {

    /**
     * QUOTE
     */
    QUOTE('0', "QUOTE"),

    /**
     * QUOTE_REQUEST
     */
    QUOTE_REQUEST('1', "QUOTE_REQUEST"),

    /**
     * QUOTE_CANCEL
     */
    QUOTE_CANCEL('2', "QUOTE_CANCEL"),

    /**
     * QUOTE_REQUEST_REJECT
     */
    QUOTE_REQUEST_REJECT('3', "QUOTE_REQUEST_REJECT"),

    /**
     * quoteStatusResponseTo
     */
    NO_VALUE('0', "quoteStatusResponseTo");

    private final char wire;

    private final String description;

    QuoteStatusResponseTo(char wire, String description) {
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
    public static Optional<QuoteStatusResponseTo> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(QUOTE);
            case '1' -> Optional.of(QUOTE_REQUEST);
            case '2' -> Optional.of(QUOTE_CANCEL);
            case '3' -> Optional.of(QUOTE_REQUEST_REJECT);
            default -> Optional.empty();
        };
    }
}
