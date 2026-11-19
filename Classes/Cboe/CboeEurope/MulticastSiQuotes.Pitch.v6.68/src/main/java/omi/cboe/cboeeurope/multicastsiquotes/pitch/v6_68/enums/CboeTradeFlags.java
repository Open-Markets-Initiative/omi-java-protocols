package omi.cboe.cboeeurope.multicastsiquotes.pitch.v6_68.enums;

import java.util.Optional;

/**
 * Cboe Trade Flags
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CboeTradeFlags {

    /**
     * The trade was reported to Cboe on time and in the Main Session
     */
    ON_TIME_IN_THE_MAIN_SESSION('4', "The trade was reported to Cboe on time and in the Main Session"),

    /**
     * The trade was reported to Cboe 'late'
     */
    LATE('5', "The trade was reported to Cboe 'late'"),

    /**
     * The trade was reported to Cboe out of the Main Session
     */
    OUT_OF_THE_MAIN_SESSION('6', "The trade was reported to Cboe out of the Main Session"),

    /**
     * The trade was reported to Cboe late and out of the Main Session
     */
    LATE_AND_OUT_OF_THE_MAIN_SESSION('7', "The trade was reported to Cboe late and out of the Main Session"),

    /**
     * The trade was reported to Cboe on time, in the Main Session and trade venue is an ESMA non-recognised 3rd Country venue
     */
    ON_TIME_IN_THE_MAIN_SESSION_3_RD_COUNTRY_VENUE('C', "The trade was reported to Cboe on time, in the Main Session and trade venue is an ESMA non-recognised 3rd Country venue"),

    /**
     * The trade was reported to Cboe 'late' and trade venue is an ESMA non-recognised 3rd Country venue
     */
    LATE_3_RD_COUNTRY_VENUE('D', "The trade was reported to Cboe 'late' and trade venue is an ESMA non-recognised 3rd Country venue"),

    /**
     * The trade was reported to Cboe out of the Main Session and trade venue is an ESMA non-recognised 3rd Country venue
     */
    OUT_OF_THE_MAIN_SESSION_3_RD_COUNTRY_VENUE('E', "The trade was reported to Cboe out of the Main Session and trade venue is an ESMA non-recognised 3rd Country venue"),

    /**
     * The trade was reported to Cboe late, out of the Main Session and trade venue is an ESMA non-recognised 3rd Country venue
     */
    LATE_AND_OUT_OF_THE_MAIN_SESSION_3_RD_COUNTRY_VENUE('F', "The trade was reported to Cboe late, out of the Main Session and trade venue is an ESMA non-recognised 3rd Country venue"),

    /**
     * Uk The Trade Was Reported To Cboe On Time And In The Main Session
     */
    UK_THE_TRADE_WAS_REPORTED_TO_CBOE_ON_TIME_AND_IN_THE_MAIN_SESSION('-', "Uk The Trade Was Reported To Cboe On Time And In The Main Session"),

    /**
     * Uk The Trade Was Reported To Cboe Late
     */
    UK_THE_TRADE_WAS_REPORTED_TO_CBOE_LATE('1', "Uk The Trade Was Reported To Cboe Late"),

    /**
     * Uk The Trade Was Reported To Cboe Out Of The Main Session
     */
    UK_THE_TRADE_WAS_REPORTED_TO_CBOE_OUT_OF_THE_MAIN_SESSION('2', "Uk The Trade Was Reported To Cboe Out Of The Main Session"),

    /**
     * Uk The Trade Was Reported To Cboe Late And Out Of The Main Session
     */
    UK_THE_TRADE_WAS_REPORTED_TO_CBOE_LATE_AND_OUT_OF_THE_MAIN_SESSION('3', "Uk The Trade Was Reported To Cboe Late And Out Of The Main Session"),

    /**
     * Uk The Trade Was An Execution Against Retail Only Liquidity
     */
    UK_THE_TRADE_WAS_AN_EXECUTION_AGAINST_RETAIL_ONLY_LIQUIDITY('G', "Uk The Trade Was An Execution Against Retail Only Liquidity"),

    /**
     * Eu The Trade Was An Execution Against Retail Only Liquidity
     */
    EU_THE_TRADE_WAS_AN_EXECUTION_AGAINST_RETAIL_ONLY_LIQUIDITY('K', "Eu The Trade Was An Execution Against Retail Only Liquidity");

    private final char wire;

    private final String description;

    CboeTradeFlags(char wire, String description) {
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
    public static Optional<CboeTradeFlags> fromWire(char wire) {
        return switch (wire) {
            case '4' -> Optional.of(ON_TIME_IN_THE_MAIN_SESSION);
            case '5' -> Optional.of(LATE);
            case '6' -> Optional.of(OUT_OF_THE_MAIN_SESSION);
            case '7' -> Optional.of(LATE_AND_OUT_OF_THE_MAIN_SESSION);
            case 'C' -> Optional.of(ON_TIME_IN_THE_MAIN_SESSION_3_RD_COUNTRY_VENUE);
            case 'D' -> Optional.of(LATE_3_RD_COUNTRY_VENUE);
            case 'E' -> Optional.of(OUT_OF_THE_MAIN_SESSION_3_RD_COUNTRY_VENUE);
            case 'F' -> Optional.of(LATE_AND_OUT_OF_THE_MAIN_SESSION_3_RD_COUNTRY_VENUE);
            case '-' -> Optional.of(UK_THE_TRADE_WAS_REPORTED_TO_CBOE_ON_TIME_AND_IN_THE_MAIN_SESSION);
            case '1' -> Optional.of(UK_THE_TRADE_WAS_REPORTED_TO_CBOE_LATE);
            case '2' -> Optional.of(UK_THE_TRADE_WAS_REPORTED_TO_CBOE_OUT_OF_THE_MAIN_SESSION);
            case '3' -> Optional.of(UK_THE_TRADE_WAS_REPORTED_TO_CBOE_LATE_AND_OUT_OF_THE_MAIN_SESSION);
            case 'G' -> Optional.of(UK_THE_TRADE_WAS_AN_EXECUTION_AGAINST_RETAIL_ONLY_LIQUIDITY);
            case 'K' -> Optional.of(EU_THE_TRADE_WAS_AN_EXECUTION_AGAINST_RETAIL_ONLY_LIQUIDITY);
            default -> Optional.empty();
        };
    }
}
