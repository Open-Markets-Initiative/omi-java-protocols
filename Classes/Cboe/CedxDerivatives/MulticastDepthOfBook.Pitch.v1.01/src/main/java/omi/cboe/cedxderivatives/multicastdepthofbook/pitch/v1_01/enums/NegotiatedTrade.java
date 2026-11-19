package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.enums;

import java.util.Optional;

/**
 * MMT Level 3.2
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
    NOT_SPECIFIED('-', "Not Specified");

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
            default -> Optional.empty();
        };
    }
}
