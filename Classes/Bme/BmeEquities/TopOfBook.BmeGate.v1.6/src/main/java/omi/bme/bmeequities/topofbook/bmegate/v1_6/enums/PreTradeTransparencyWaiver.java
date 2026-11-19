package omi.bme.bmeequities.topofbook.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Pre-trade transparency waiver
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PreTradeTransparencyWaiver {

    /**
     * Negotiated Trade In Liquid Financial Instruments Nliq
     */
    NEGOTIATED_TRADE_IN_LIQUID_FINANCIAL_INSTRUMENTS_NLIQ('0', "Negotiated Trade In Liquid Financial Instruments Nliq"),

    /**
     * Negotiated Trade In Illiquid Financial Instruments Oilq
     */
    NEGOTIATED_TRADE_IN_ILLIQUID_FINANCIAL_INSTRUMENTS_OILQ('1', "Negotiated Trade In Illiquid Financial Instruments Oilq"),

    /**
     * Negotiated Trade Subject to Conditions Other Than The Current Market Price "PRIC"
     */
    NEGOTIATED_TRADE_OTHER_THAN_CURRENT_MARKET_PRICE_PRIC('2', "Negotiated Trade Subject to Conditions Other Than The Current Market Price \"PRIC\"");

    private final char wire;

    private final String description;

    PreTradeTransparencyWaiver(char wire, String description) {
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
    public static Optional<PreTradeTransparencyWaiver> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NEGOTIATED_TRADE_IN_LIQUID_FINANCIAL_INSTRUMENTS_NLIQ);
            case '1' -> Optional.of(NEGOTIATED_TRADE_IN_ILLIQUID_FINANCIAL_INSTRUMENTS_OILQ);
            case '2' -> Optional.of(NEGOTIATED_TRADE_OTHER_THAN_CURRENT_MARKET_PRICE_PRIC);
            default -> Optional.empty();
        };
    }
}
