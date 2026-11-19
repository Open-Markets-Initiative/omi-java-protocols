package omi.cboe.cboeeurope.tradereporting.boe.v2_0_40.enums;

import java.util.Optional;

/**
 * Indicates the acceptance or otherwise of a Quote or QuoteCancel message. 0 = Accepted in response to a Quote message 1 = Cancelled in response to a QuoteCancel message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Status {

    /**
     * Accepted in response to a Quote message
     */
    ACCEPTED_IN_RESPONSE_TO_A_QUOTE_MESSAGE('0', "Accepted in response to a Quote message"),

    /**
     * Cancelled in response to a QuoteCancel message
     */
    CANCELLED_IN_RESPONSE_TO_A_QUOTE_CANCEL('1', "Cancelled in response to a QuoteCancel message");

    private final char wire;

    private final String description;

    Status(char wire, String description) {
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
    public static Optional<Status> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(ACCEPTED_IN_RESPONSE_TO_A_QUOTE_MESSAGE);
            case '1' -> Optional.of(CANCELLED_IN_RESPONSE_TO_A_QUOTE_CANCEL);
            default -> Optional.empty();
        };
    }
}
