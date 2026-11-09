package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the trading status applicable to the transaction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityStatus {

    /**
     * Security Status Not Applicable
     */
    SECURITY_STATUS_NOT_APPLICABLE(' ', "Security Status Not Applicable"),

    /**
     * Reserved
     */
    RESERVED_1('1', "Reserved"),

    /**
     * Trading Halt
     */
    TRADING_HALT('2', "Trading Halt"),

    /**
     * Resume
     */
    RESUME('3', "Resume"),

    /**
     * Reserved
     */
    RESERVED_4('4', "Reserved"),

    /**
     * Price Indication
     */
    PRICE_INDICATION('5', "Price Indication"),

    /**
     * Trading Range Indication
     */
    TRADING_RANGE_INDICATION('6', "Trading Range Indication"),

    /**
     * Market Imbalance Buy
     */
    MARKET_IMBALANCE_BUY('7', "Market Imbalance Buy"),

    /**
     * Market Imbalance Sell
     */
    MARKET_IMBALANCE_SELL('8', "Market Imbalance Sell"),

    /**
     * Closing Imbalance Buy
     */
    CLOSING_IMBALANCE_BUY('9', "Closing Imbalance Buy"),

    /**
     * Closing Imbalance Sell
     */
    CLOSING_IMBALANCE_SELL('A', "Closing Imbalance Sell"),

    /**
     * Reserved
     */
    RESERVED_B('B', "Reserved"),

    /**
     * No Market Imbalance
     */
    NO_MARKET_IMBALANCE('C', "No Market Imbalance"),

    /**
     * No Closing Imbalance
     */
    NO_CLOSING_IMBALANCE('D', "No Closing Imbalance"),

    /**
     * Short Sale Restriction
     */
    SHORT_SALE_RESTRICTION('E', "Short Sale Restriction"),

    /**
     * Limit Up Limit Down
     */
    LIMIT_UP_LIMIT_DOWN('F', "Limit Up Limit Down");

    private final char wire;

    private final String description;

    SecurityStatus(char wire, String description) {
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
    public static Optional<SecurityStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(SECURITY_STATUS_NOT_APPLICABLE);
            case '1' -> Optional.of(RESERVED_1);
            case '2' -> Optional.of(TRADING_HALT);
            case '3' -> Optional.of(RESUME);
            case '4' -> Optional.of(RESERVED_4);
            case '5' -> Optional.of(PRICE_INDICATION);
            case '6' -> Optional.of(TRADING_RANGE_INDICATION);
            case '7' -> Optional.of(MARKET_IMBALANCE_BUY);
            case '8' -> Optional.of(MARKET_IMBALANCE_SELL);
            case '9' -> Optional.of(CLOSING_IMBALANCE_BUY);
            case 'A' -> Optional.of(CLOSING_IMBALANCE_SELL);
            case 'B' -> Optional.of(RESERVED_B);
            case 'C' -> Optional.of(NO_MARKET_IMBALANCE);
            case 'D' -> Optional.of(NO_CLOSING_IMBALANCE);
            case 'E' -> Optional.of(SHORT_SALE_RESTRICTION);
            case 'F' -> Optional.of(LIMIT_UP_LIMIT_DOWN);
            default -> Optional.empty();
        };
    }
}
