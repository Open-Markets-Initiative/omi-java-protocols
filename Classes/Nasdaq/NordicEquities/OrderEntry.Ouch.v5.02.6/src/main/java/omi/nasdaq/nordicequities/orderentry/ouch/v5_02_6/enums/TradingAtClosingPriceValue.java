package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.enums;

import java.util.Optional;

/**
 * Whether the order participates in trading at closing price
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingAtClosingPriceValue {

    /**
     * Participate In Trading At Closing Price
     */
    PARTICIPATE_IN_TRADING_AT_CLOSING_PRICE('Y', "Participate In Trading At Closing Price"),

    /**
     * Do Not Participate In Trading At Closing Price
     */
    DO_NOT_PARTICIPATE_IN_TRADING_AT_CLOSING_PRICE('N', "Do Not Participate In Trading At Closing Price");

    private final char wire;

    private final String description;

    TradingAtClosingPriceValue(char wire, String description) {
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
    public static Optional<TradingAtClosingPriceValue> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(PARTICIPATE_IN_TRADING_AT_CLOSING_PRICE);
            case 'N' -> Optional.of(DO_NOT_PARTICIPATE_IN_TRADING_AT_CLOSING_PRICE);
            default -> Optional.empty();
        };
    }
}
