package omi.jpx.tseequities.tostnet.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the flag for identifying ToSTNeT market.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketIdentificationFlag {

    /**
     * Single Issue Transaction
     */
    SINGLE_ISSUE_TRANSACTION('1', "Single Issue Transaction"),

    /**
     * Basket Transaction
     */
    BASKET_TRANSACTION('2', "Basket Transaction"),

    /**
     * Closing Price Transaction
     */
    CLOSING_PRICE_TRANSACTION('3', "Closing Price Transaction");

    private final char wire;

    private final String description;

    MarketIdentificationFlag(char wire, String description) {
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
    public static Optional<MarketIdentificationFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(SINGLE_ISSUE_TRANSACTION);
            case '2' -> Optional.of(BASKET_TRANSACTION);
            case '3' -> Optional.of(CLOSING_PRICE_TRANSACTION);
            default -> Optional.empty();
        };
    }
}
