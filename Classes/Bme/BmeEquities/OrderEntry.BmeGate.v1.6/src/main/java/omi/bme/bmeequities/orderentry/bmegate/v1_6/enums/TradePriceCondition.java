package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * MMT 3.8
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradePriceCondition {

    /**
     * Plain Vanilla Trade
     */
    PLAIN_VANILLA_TRADE(' ', "Plain Vanilla Trade"),

    /**
     * Non Price Forming Trade Formerly Defined As A Technical Trade Npft
     */
    NON_PRICE_FORMING_TRADE_FORMERLY_DEFINED_AS_A_TECHNICAL_TRADE_NPFT('5', "Non Price Forming Trade Formerly Defined As A Technical Trade Npft"),

    /**
     * Trade not Contributing to the Price Discovery Process (formerly defined as a Technical Trade) "TNCP" to be discontinued as of 1st January 2024
     */
    TRADE_NOT_CONTRIBUTING_TO_PRICE_DISCOVERY_TNCP('6', "Trade not Contributing to the Price Discovery Process (formerly defined as a Technical Trade) \"TNCP\" to be discontinued as of 1st January 2024");

    private final char wire;

    private final String description;

    TradePriceCondition(char wire, String description) {
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
    public static Optional<TradePriceCondition> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(PLAIN_VANILLA_TRADE);
            case '5' -> Optional.of(NON_PRICE_FORMING_TRADE_FORMERLY_DEFINED_AS_A_TECHNICAL_TRADE_NPFT);
            case '6' -> Optional.of(TRADE_NOT_CONTRIBUTING_TO_PRICE_DISCOVERY_TNCP);
            default -> Optional.empty();
        };
    }
}
