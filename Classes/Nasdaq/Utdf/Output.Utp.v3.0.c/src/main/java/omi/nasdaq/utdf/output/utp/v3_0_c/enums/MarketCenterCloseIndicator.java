package omi.nasdaq.utdf.output.utp.v3_0_c.enums;

import java.util.Optional;

/**
 * Market Center Close Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCenterCloseIndicator {

    /**
     * Market Center Closing Price Is Based On Transaction With M Sale Condition Modifier
     */
    MARKET_CENTER_CLOSING_PRICE_IS_BASED_ON_TRANSACTION_WITH_M_SALE_CONDITION_MODIFIER('M', "Market Center Closing Price Is Based On Transaction With M Sale Condition Modifier"),

    /**
     * Market Center Closing Price Is Not Based On A Transaction With An M Sale Condition Modifier
     */
    MARKET_CENTER_CLOSING_PRICE_IS_NOT_BASED_ON_A_TRANSACTION_WITH_AN_M_SALE_CONDITION_MODIFIER(' ', "Market Center Closing Price Is Not Based On A Transaction With An M Sale Condition Modifier");

    private final char wire;

    private final String description;

    MarketCenterCloseIndicator(char wire, String description) {
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
    public static Optional<MarketCenterCloseIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'M' -> Optional.of(MARKET_CENTER_CLOSING_PRICE_IS_BASED_ON_TRANSACTION_WITH_M_SALE_CONDITION_MODIFIER);
            case ' ' -> Optional.of(MARKET_CENTER_CLOSING_PRICE_IS_NOT_BASED_ON_A_TRANSACTION_WITH_AN_M_SALE_CONDITION_MODIFIER);
            default -> Optional.empty();
        };
    }
}
