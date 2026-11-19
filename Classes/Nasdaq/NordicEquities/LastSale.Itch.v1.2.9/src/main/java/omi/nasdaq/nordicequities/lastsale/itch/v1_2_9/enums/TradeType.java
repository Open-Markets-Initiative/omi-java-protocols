package omi.nasdaq.nordicequities.lastsale.itch.v1_2_9.enums;

import java.util.Optional;

/**
 * Type of negotiated trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeType {

    /**
     * Standard Trade
     */
    STANDARD_TRADE('1', "Standard Trade"),

    /**
     * Non Standard Settlement
     */
    NON_STANDARD_SETTLEMENT('2', "Non Standard Settlement"),

    /**
     * Exchange Granted Trade
     */
    EXCHANGE_GRANTED_TRADE('3', "Exchange Granted Trade"),

    /**
     * Portfolio Trade
     */
    PORTFOLIO_TRADE('5', "Portfolio Trade"),

    /**
     * Volume Weighted Average Price Trade
     */
    VOLUME_WEIGHTED_AVERAGE_PRICE_TRADE('6', "Volume Weighted Average Price Trade"),

    /**
     * Pre Opening Trade
     */
    PRE_OPENING_TRADE('8', "Pre Opening Trade"),

    /**
     * Standard Routed Trade
     */
    STANDARD_ROUTED_TRADE('D', "Standard Routed Trade"),

    /**
     * Standard Routed Dark Trade
     */
    STANDARD_ROUTED_DARK_TRADE('E', "Standard Routed Dark Trade"),

    /**
     * Standard Dark Trade
     */
    STANDARD_DARK_TRADE('F', "Standard Dark Trade"),

    /**
     * Standard Auction On Demand Trade
     */
    STANDARD_AUCTION_ON_DEMAND_TRADE('G', "Standard Auction On Demand Trade"),

    /**
     * Standard Trade At Closing Trade
     */
    STANDARD_TRADE_AT_CLOSING_TRADE('H', "Standard Trade At Closing Trade"),

    /**
     * Contingent Trade
     */
    CONTINGENT_TRADE('I', "Contingent Trade"),

    /**
     * Otc Standard Trade
     */
    OTC_STANDARD_TRADE('9', "Otc Standard Trade"),

    /**
     * Otc Non Standard Trade
     */
    OTC_NON_STANDARD_TRADE('A', "Otc Non Standard Trade"),

    /**
     * Si Standard Trade
     */
    SI_STANDARD_TRADE('B', "Si Standard Trade"),

    /**
     * Si Non Standard Trade
     */
    SI_NON_STANDARD_TRADE('C', "Si Non Standard Trade"),

    /**
     * Otc Loan Payment
     */
    OTC_LOAN_PAYMENT('O', "Otc Loan Payment"),

    /**
     * Otc Primary Transaction
     */
    OTC_PRIMARY_TRANSACTION('P', "Otc Primary Transaction");

    private final char wire;

    private final String description;

    TradeType(char wire, String description) {
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
    public static Optional<TradeType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(STANDARD_TRADE);
            case '2' -> Optional.of(NON_STANDARD_SETTLEMENT);
            case '3' -> Optional.of(EXCHANGE_GRANTED_TRADE);
            case '5' -> Optional.of(PORTFOLIO_TRADE);
            case '6' -> Optional.of(VOLUME_WEIGHTED_AVERAGE_PRICE_TRADE);
            case '8' -> Optional.of(PRE_OPENING_TRADE);
            case 'D' -> Optional.of(STANDARD_ROUTED_TRADE);
            case 'E' -> Optional.of(STANDARD_ROUTED_DARK_TRADE);
            case 'F' -> Optional.of(STANDARD_DARK_TRADE);
            case 'G' -> Optional.of(STANDARD_AUCTION_ON_DEMAND_TRADE);
            case 'H' -> Optional.of(STANDARD_TRADE_AT_CLOSING_TRADE);
            case 'I' -> Optional.of(CONTINGENT_TRADE);
            case '9' -> Optional.of(OTC_STANDARD_TRADE);
            case 'A' -> Optional.of(OTC_NON_STANDARD_TRADE);
            case 'B' -> Optional.of(SI_STANDARD_TRADE);
            case 'C' -> Optional.of(SI_NON_STANDARD_TRADE);
            case 'O' -> Optional.of(OTC_LOAN_PAYMENT);
            case 'P' -> Optional.of(OTC_PRIMARY_TRANSACTION);
            default -> Optional.empty();
        };
    }
}
