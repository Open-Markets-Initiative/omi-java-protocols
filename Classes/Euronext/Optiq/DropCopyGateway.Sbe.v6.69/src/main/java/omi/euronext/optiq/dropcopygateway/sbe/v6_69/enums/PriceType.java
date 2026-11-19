package omi.euronext.optiq.dropcopygateway.sbe.v6_69.enums;

import java.util.Optional;

/**
 * priceType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceType {

    /**
     * Official_Daily
     */
    OFFICIAL_DAILY((short) 2, "Official_Daily"),

    /**
     * Official_Market_Close
     */
    OFFICIAL_MARKET_CLOSE((short) 4, "Official_Market_Close"),

    /**
     * Official_Expiry
     */
    OFFICIAL_EXPIRY((short) 6, "Official_Expiry"),

    /**
     * Provisional_Intraday
     */
    PROVISIONAL_INTRADAY((short) 7, "Provisional_Intraday"),

    /**
     * Official_Intraday
     */
    OFFICIAL_INTRADAY((short) 8, "Official_Intraday"),

    /**
     * Official_YDSP
     */
    OFFICIAL_YDSP((short) 9, "Official_YDSP"),

    /**
     * NAV_for_the_instruments_eligible_to_the_NAV_Trading_Facility
     */
    NA_VFORTHEINSTRUMENTSELIGIBLETOTHE_NAV_TRADING_FACILITY((short) 10, "NAV_for_the_instruments_eligible_to_the_NAV_Trading_Facility"),

    /**
     * Adjusted_Closing_Price
     */
    ADJUSTED_CLOSING_PRICE((short) 12, "Adjusted_Closing_Price"),

    /**
     * Subscription_Price
     */
    SUBSCRIPTION_PRICE((short) 13, "Subscription_Price"),

    /**
     * Indicative_Matching_Price
     */
    INDICATIVE_MATCHING_PRICE((short) 14, "Indicative_Matching_Price"),

    /**
     * Min_Price_Out_of_Session_Trades
     */
    MIN_PRICE_OUTOF_SESSION_TRADES((short) 19, "Min_Price_Out_of_Session_Trades"),

    /**
     * Max_Price_Out_of_Session_Trades
     */
    MAX_PRICE_OUTOF_SESSION_TRADES((short) 20, "Max_Price_Out_of_Session_Trades"),

    /**
     * Min_Price_Out_of_Session_Block_Trades
     */
    MIN_PRICE_OUTOF_SESSION_BLOCK_TRADES((short) 21, "Min_Price_Out_of_Session_Block_Trades"),

    /**
     * Max_Price_Out_of_Session_Block_Trades
     */
    MAX_PRICE_OUTOF_SESSION_BLOCK_TRADES((short) 22, "Max_Price_Out_of_Session_Block_Trades"),

    /**
     * Valuation_Price
     */
    VALUATION_PRICE((short) 23, "Valuation_Price"),

    /**
     * Fund_Subscription
     */
    FUND_SUBSCRIPTION((short) 24, "Fund_Subscription"),

    /**
     * Fund_Redemption
     */
    FUND_REDEMPTION((short) 25, "Fund_Redemption"),

    /**
     * Uncrossing_Price
     */
    UNCROSSING_PRICE((short) 26, "Uncrossing_Price"),

    /**
     * Last_Traded_Price
     */
    LAST_TRADED_PRICE((short) 27, "Last_Traded_Price"),

    /**
     * AIP
     */
    AIP((short) 28, "AIP"),

    /**
     * Net_Asset_Value
     */
    NET_ASSET_VALUE((short) 30, "Net_Asset_Value"),

    /**
     * External_Reference_Price
     */
    EXTERNAL_REFERENCE_PRICE((short) 31, "External_Reference_Price"),

    /**
     * Closing_Price
     */
    CLOSING_PRICE((short) 33, "Closing_Price"),

    /**
     * Life_Time_Lowest_Price
     */
    LIFE_TIME_LOWEST_PRICE((short) 34, "Life_Time_Lowest_Price"),

    /**
     * Life_Time_Highest_Price
     */
    LIFE_TIME_HIGHEST_PRICE((short) 35, "Life_Time_Highest_Price"),

    /**
     * Daily_Lowest_Price
     */
    DAILY_LOWEST_PRICE((short) 36, "Daily_Lowest_Price"),

    /**
     * Daily_Highest_Price
     */
    DAILY_HIGHEST_PRICE((short) 37, "Daily_Highest_Price"),

    /**
     * Breached_Dynamic_Collar
     */
    BREACHED_DYNAMIC_COLLAR((short) 38, "Breached_Dynamic_Collar"),

    /**
     * Breached_Static_Collar
     */
    BREACHED_STATIC_COLLAR((short) 39, "Breached_Static_Collar"),

    /**
     * Life_Time_Contract_Highest_Price
     */
    LIFE_TIME_CONTRACT_HIGHEST_PRICE((short) 41, "Life_Time_Contract_Highest_Price"),

    /**
     * Life_Time_Contract_Lowest_Price
     */
    LIFE_TIME_CONTRACT_LOWEST_PRICE((short) 42, "Life_Time_Contract_Lowest_Price");

    private final short wire;

    private final String description;

    PriceType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<PriceType> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(OFFICIAL_DAILY);
            case 4 -> Optional.of(OFFICIAL_MARKET_CLOSE);
            case 6 -> Optional.of(OFFICIAL_EXPIRY);
            case 7 -> Optional.of(PROVISIONAL_INTRADAY);
            case 8 -> Optional.of(OFFICIAL_INTRADAY);
            case 9 -> Optional.of(OFFICIAL_YDSP);
            case 10 -> Optional.of(NA_VFORTHEINSTRUMENTSELIGIBLETOTHE_NAV_TRADING_FACILITY);
            case 12 -> Optional.of(ADJUSTED_CLOSING_PRICE);
            case 13 -> Optional.of(SUBSCRIPTION_PRICE);
            case 14 -> Optional.of(INDICATIVE_MATCHING_PRICE);
            case 19 -> Optional.of(MIN_PRICE_OUTOF_SESSION_TRADES);
            case 20 -> Optional.of(MAX_PRICE_OUTOF_SESSION_TRADES);
            case 21 -> Optional.of(MIN_PRICE_OUTOF_SESSION_BLOCK_TRADES);
            case 22 -> Optional.of(MAX_PRICE_OUTOF_SESSION_BLOCK_TRADES);
            case 23 -> Optional.of(VALUATION_PRICE);
            case 24 -> Optional.of(FUND_SUBSCRIPTION);
            case 25 -> Optional.of(FUND_REDEMPTION);
            case 26 -> Optional.of(UNCROSSING_PRICE);
            case 27 -> Optional.of(LAST_TRADED_PRICE);
            case 28 -> Optional.of(AIP);
            case 30 -> Optional.of(NET_ASSET_VALUE);
            case 31 -> Optional.of(EXTERNAL_REFERENCE_PRICE);
            case 33 -> Optional.of(CLOSING_PRICE);
            case 34 -> Optional.of(LIFE_TIME_LOWEST_PRICE);
            case 35 -> Optional.of(LIFE_TIME_HIGHEST_PRICE);
            case 36 -> Optional.of(DAILY_LOWEST_PRICE);
            case 37 -> Optional.of(DAILY_HIGHEST_PRICE);
            case 38 -> Optional.of(BREACHED_DYNAMIC_COLLAR);
            case 39 -> Optional.of(BREACHED_STATIC_COLLAR);
            case 41 -> Optional.of(LIFE_TIME_CONTRACT_HIGHEST_PRICE);
            case 42 -> Optional.of(LIFE_TIME_CONTRACT_LOWEST_PRICE);
            default -> Optional.empty();
        };
    }
}
