package omi.koscom.mdcsrealtime.koscom.exture.v1_20.enums;

import java.util.Optional;

/**
 * 0:Weighted Avg Price,1:Quotation,2:No Trade.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuotationCategory {

    /**
     * Weighted Average Price
     */
    WEIGHTED_AVERAGE_PRICE('0', "Weighted Average Price"),

    /**
     * Quotation
     */
    QUOTATION('1', "Quotation"),

    /**
     * No Trade
     */
    NO_TRADE('2', "No Trade");

    private final char wire;

    private final String description;

    QuotationCategory(char wire, String description) {
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
    public static Optional<QuotationCategory> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(WEIGHTED_AVERAGE_PRICE);
            case '1' -> Optional.of(QUOTATION);
            case '2' -> Optional.of(NO_TRADE);
            default -> Optional.empty();
        };
    }
}
