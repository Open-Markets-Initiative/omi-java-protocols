package omi.bme.bmefixedincome.topofbook5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Data field code
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DataCode {

    /**
     * Average Price
     */
    AVERAGE_PRICE('D', "Average Price"),

    /**
     * Previous forward price
     */
    PREVIOUS_FORWARD_PRICE('d', "Previous forward price"),

    /**
     * Published cash amount
     */
    PUBLISHED_CASH_AMOUNT('E', "Published cash amount"),

    /**
     * Order modality cash amount
     */
    ORDER_MODALITY_CASH_AMOUNT('e', "Order modality cash amount"),

    /**
     * End of session indicator
     */
    END_OF_SESSION_INDICATOR('f', "End of session indicator"),

    /**
     * First
     */
    FIRST('G', "First"),

    /**
     * High
     */
    HIGH('H', "High"),

    /**
     * Maximum Bid
     */
    MAXIMUM_BID('h', "Maximum Bid"),

    /**
     * Not published volume
     */
    NOT_PUBLISHED_VOLUME('J', "Not published volume"),

    /**
     * Last
     */
    LAST('M', "Last"),

    /**
     * Number of trades
     */
    NUMBER_OF_TRADES('N', "Number of trades"),

    /**
     * Previous Closing Price
     */
    PREVIOUS_CLOSING_PRICE('Q', "Previous Closing Price"),

    /**
     * Opening volatility
     */
    OPENING_VOLATILITY('R', "Opening volatility"),

    /**
     * Published volume
     */
    PUBLISHED_VOLUME('V', "Published volume"),

    /**
     * Published volume order modality
     */
    PUBLISHED_VOLUME_ORDER_MODALITY('v', "Published volume order modality"),

    /**
     * Volume of Last trade
     */
    VOLUME_OF_LAST_TRADE('W', "Volume of Last trade"),

    /**
     * Low
     */
    LOW('Z', "Low"),

    /**
     * Minimum Ask
     */
    MINIMUM_ASK('z', "Minimum Ask"),

    /**
     * Closing price
     */
    CLOSING_PRICE('j', "Closing price"),

    /**
     * Closing yield
     */
    CLOSING_YIELD('k', "Closing yield"),

    /**
     * Volatility
     */
    VOLATILITY('l', "Volatility"),

    /**
     * Delta
     */
    DELTA('m', "Delta"),

    /**
     * Forward price
     */
    FORWARD_PRICE('n', "Forward price");

    private final char wire;

    private final String description;

    DataCode(char wire, String description) {
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
    public static Optional<DataCode> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(AVERAGE_PRICE);
            case 'd' -> Optional.of(PREVIOUS_FORWARD_PRICE);
            case 'E' -> Optional.of(PUBLISHED_CASH_AMOUNT);
            case 'e' -> Optional.of(ORDER_MODALITY_CASH_AMOUNT);
            case 'f' -> Optional.of(END_OF_SESSION_INDICATOR);
            case 'G' -> Optional.of(FIRST);
            case 'H' -> Optional.of(HIGH);
            case 'h' -> Optional.of(MAXIMUM_BID);
            case 'J' -> Optional.of(NOT_PUBLISHED_VOLUME);
            case 'M' -> Optional.of(LAST);
            case 'N' -> Optional.of(NUMBER_OF_TRADES);
            case 'Q' -> Optional.of(PREVIOUS_CLOSING_PRICE);
            case 'R' -> Optional.of(OPENING_VOLATILITY);
            case 'V' -> Optional.of(PUBLISHED_VOLUME);
            case 'v' -> Optional.of(PUBLISHED_VOLUME_ORDER_MODALITY);
            case 'W' -> Optional.of(VOLUME_OF_LAST_TRADE);
            case 'Z' -> Optional.of(LOW);
            case 'z' -> Optional.of(MINIMUM_ASK);
            case 'j' -> Optional.of(CLOSING_PRICE);
            case 'k' -> Optional.of(CLOSING_YIELD);
            case 'l' -> Optional.of(VOLATILITY);
            case 'm' -> Optional.of(DELTA);
            case 'n' -> Optional.of(FORWARD_PRICE);
            default -> Optional.empty();
        };
    }
}
