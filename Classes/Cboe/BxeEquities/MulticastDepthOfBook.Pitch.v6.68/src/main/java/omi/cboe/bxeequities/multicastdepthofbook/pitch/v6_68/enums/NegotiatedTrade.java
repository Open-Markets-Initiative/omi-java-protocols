package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_68.enums;

import java.util.Optional;

/**
 * MMT Levels 3.2
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NegotiatedTrade {

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
     * Negotiated Trade Where None Of The Above Apply
     */
    NEGOTIATED_TRADE_WHERE_NONE_OF_THE_ABOVE_APPLY('N', "Negotiated Trade Where None Of The Above Apply"),

    /**
     * Pre Trade Transparency Waiver For Illiquid Instrument On An Si
     */
    PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT_ON_AN_SI('4', "Pre Trade Transparency Waiver For Illiquid Instrument On An Si"),

    /**
     * Pre Trade Transparency Waiver For Above Standard Market Size On An Si
     */
    PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ABOVE_STANDARD_MARKET_SIZE_ON_AN_SI('5', "Pre Trade Transparency Waiver For Above Standard Market Size On An Si"),

    /**
     * Pre Trade Transparency Waivers For Illiquid Instrument On An Si And Above Standard Market Size On An Si
     */
    PRE_TRADE_TRANSPARENCY_WAIVERS_FOR_ILLIQUID_INSTRUMENT_ON_AN_SI_AND_ABOVE_STANDARD_MARKET_SIZE_ON_AN_SI('6', "Pre Trade Transparency Waivers For Illiquid Instrument On An Si And Above Standard Market Size On An Si"),

    /**
     * Not Specified
     */
    NOT_SPECIFIED('-', "Not Specified"),

    /**
     * Ntls Negotiated Trade Larger Than Lis Brought Onto A Venue
     */
    NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_BROUGHT_ONTO_A_VENUE('7', "Ntls Negotiated Trade Larger Than Lis Brought Onto A Venue"),

    /**
     * Netw Negotiated Trade With Pre Trade Transparency Waiver
     */
    NETW_NEGOTIATED_TRADE_WITH_PRE_TRADE_TRANSPARENCY_WAIVER('8', "Netw Negotiated Trade With Pre Trade Transparency Waiver"),

    /**
     * Nliq Negotiated Trade In Liquid Finan Ntls Negotiated Trade Larger Than Lis Cial Instruments Brought Onto A Venue
     */
    NLIQ_NEGOTIATED_TRADE_IN_LIQUID_FINAN_NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_CIAL_INSTRUMENTS_BROUGHT_ONTO_A_VENUE('9', "Nliq Negotiated Trade In Liquid Finan Ntls Negotiated Trade Larger Than Lis Cial Instruments Brought Onto A Venue"),

    /**
     * Oilq Negotiated Trade In Illiquid Finan Ntls Negotiated Trade Larger Than Lis Cial Instruments Brought Onto A Venue
     */
    OILQ_NEGOTIATED_TRADE_IN_ILLIQUID_FINAN_NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_CIAL_INSTRUMENTS_BROUGHT_ONTO_A_VENUE('a', "Oilq Negotiated Trade In Illiquid Finan Ntls Negotiated Trade Larger Than Lis Cial Instruments Brought Onto A Venue"),

    /**
     * Pric Negotiated Trade Subject To Con Ntls Negotiated Trade Larger Than Lis Ditions Other Than The Current Market Brought Onto A Venue Price
     */
    PRIC_NEGOTIATED_TRADE_SUBJECT_TO_CON_NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_DITIONS_OTHER_THAN_THE_CURRENT_MARKET_BROUGHT_ONTO_A_VENUE_PRICE('b', "Pric Negotiated Trade Subject To Con Ntls Negotiated Trade Larger Than Lis Ditions Other Than The Current Market Brought Onto A Venue Price"),

    /**
     * Netw Negotiated Trade With Pre Ntls Negotiated Trade Larger Than Lis Trade Transparency Waiver Brought Onto A Venue
     */
    NETW_NEGOTIATED_TRADE_WITH_PRE_NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_TRADE_TRANSPARENCY_WAIVER_BROUGHT_ONTO_A_VENUE('c', "Netw Negotiated Trade With Pre Ntls Negotiated Trade Larger Than Lis Trade Transparency Waiver Brought Onto A Venue");

    private final char wire;

    private final String description;

    NegotiatedTrade(char wire, String description) {
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
    public static Optional<NegotiatedTrade> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(NEGOTIATED_TRADE_IN_LIQUID_FINANCIAL_INSTRUMENTS);
            case '2' -> Optional.of(NEGOTIATED_TRADE_IN_ILLIQUID_FINANCIAL_INSTRUMENTS);
            case '3' -> Optional.of(NEGOTIATED_TRADE_SUBJECT_TO_CONDITIONS_OTHER_THAN_THE_CURRENT_MARKET_PRICE);
            case 'N' -> Optional.of(NEGOTIATED_TRADE_WHERE_NONE_OF_THE_ABOVE_APPLY);
            case '4' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT_ON_AN_SI);
            case '5' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ABOVE_STANDARD_MARKET_SIZE_ON_AN_SI);
            case '6' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVERS_FOR_ILLIQUID_INSTRUMENT_ON_AN_SI_AND_ABOVE_STANDARD_MARKET_SIZE_ON_AN_SI);
            case '-' -> Optional.of(NOT_SPECIFIED);
            case '7' -> Optional.of(NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_BROUGHT_ONTO_A_VENUE);
            case '8' -> Optional.of(NETW_NEGOTIATED_TRADE_WITH_PRE_TRADE_TRANSPARENCY_WAIVER);
            case '9' -> Optional.of(NLIQ_NEGOTIATED_TRADE_IN_LIQUID_FINAN_NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_CIAL_INSTRUMENTS_BROUGHT_ONTO_A_VENUE);
            case 'a' -> Optional.of(OILQ_NEGOTIATED_TRADE_IN_ILLIQUID_FINAN_NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_CIAL_INSTRUMENTS_BROUGHT_ONTO_A_VENUE);
            case 'b' -> Optional.of(PRIC_NEGOTIATED_TRADE_SUBJECT_TO_CON_NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_DITIONS_OTHER_THAN_THE_CURRENT_MARKET_BROUGHT_ONTO_A_VENUE_PRICE);
            case 'c' -> Optional.of(NETW_NEGOTIATED_TRADE_WITH_PRE_NTLS_NEGOTIATED_TRADE_LARGER_THAN_LIS_TRADE_TRANSPARENCY_WAIVER_BROUGHT_ONTO_A_VENUE);
            default -> Optional.empty();
        };
    }
}
