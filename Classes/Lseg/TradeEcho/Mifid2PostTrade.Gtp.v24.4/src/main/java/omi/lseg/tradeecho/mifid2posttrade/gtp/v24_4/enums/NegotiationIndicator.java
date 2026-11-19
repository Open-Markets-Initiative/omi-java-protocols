package omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Negotiation Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NegotiationIndicator {

    /**
     * Negotiated Trade In Liquid Financial Instruments
     */
    NEGOTIATED_TRADE_IN_LIQUID_FINANCIAL_INSTRUMENTS('1', "Negotiated Trade In Liquid Financial Instruments"),

    /**
     * Negotiated Trade In Illiquid Financial Instruments
     */
    NEGOTIATED_TRADE_IN_ILLIQUID_FINANCIAL_INSTRUMENTS('2', "Negotiated Trade In Illiquid Financial Instruments"),

    /**
     * Negotiated Trade Subject To Conditions Other Than The Current Market Price
     */
    NEGOTIATED_TRADE_SUBJECT_TO_CONDITIONS_OTHER_THAN_THE_CURRENT_MARKET_PRICE('3', "Negotiated Trade Subject To Conditions Other Than The Current Market Price"),

    /**
     * Negotiated Trade Larger Than Lis Brought Onto A Venue
     */
    NEGOTIATED_TRADE_LARGER_THAN_LIS_BROUGHT_ONTO_A_VENUE('7', "Negotiated Trade Larger Than Lis Brought Onto A Venue"),

    /**
     * Negotiated Trade With Pre Trade Transparency Waiver
     */
    NEGOTIATED_TRADE_WITH_PRE_TRADE_TRANSPARENCY_WAIVER('8', "Negotiated Trade With Pre Trade Transparency Waiver"),

    /**
     * Not A Negotiated Trade
     */
    NOT_A_NEGOTIATED_TRADE('-', "Not A Negotiated Trade");

    private final char wire;

    private final String description;

    NegotiationIndicator(char wire, String description) {
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
    public static Optional<NegotiationIndicator> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(NEGOTIATED_TRADE_IN_LIQUID_FINANCIAL_INSTRUMENTS);
            case '2' -> Optional.of(NEGOTIATED_TRADE_IN_ILLIQUID_FINANCIAL_INSTRUMENTS);
            case '3' -> Optional.of(NEGOTIATED_TRADE_SUBJECT_TO_CONDITIONS_OTHER_THAN_THE_CURRENT_MARKET_PRICE);
            case '7' -> Optional.of(NEGOTIATED_TRADE_LARGER_THAN_LIS_BROUGHT_ONTO_A_VENUE);
            case '8' -> Optional.of(NEGOTIATED_TRADE_WITH_PRE_TRADE_TRANSPARENCY_WAIVER);
            case '-' -> Optional.of(NOT_A_NEGOTIATED_TRADE);
            default -> Optional.empty();
        };
    }
}
