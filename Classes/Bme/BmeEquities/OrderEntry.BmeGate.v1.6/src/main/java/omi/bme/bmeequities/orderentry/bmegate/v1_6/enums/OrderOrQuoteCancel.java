package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Cancellation of orders and/or quotes indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderOrQuoteCancel {

    /**
     * Orders Only
     */
    ORDERS_ONLY('N', "Orders Only"),

    /**
     * Quotes Only
     */
    QUOTES_ONLY('Q', "Quotes Only"),

    /**
     * Total Cancellation Orders And Quotes
     */
    TOTAL_CANCELLATION_ORDERS_AND_QUOTES('T', "Total Cancellation Orders And Quotes");

    private final char wire;

    private final String description;

    OrderOrQuoteCancel(char wire, String description) {
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
    public static Optional<OrderOrQuoteCancel> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(ORDERS_ONLY);
            case 'Q' -> Optional.of(QUOTES_ONLY);
            case 'T' -> Optional.of(TOTAL_CANCELLATION_ORDERS_AND_QUOTES);
            default -> Optional.empty();
        };
    }
}
