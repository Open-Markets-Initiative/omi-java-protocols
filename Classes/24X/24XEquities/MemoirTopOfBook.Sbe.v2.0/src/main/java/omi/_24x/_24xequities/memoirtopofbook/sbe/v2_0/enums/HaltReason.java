package omi._24x._24xequities.memoirtopofbook.sbe.v2_0.enums;

import java.util.Optional;

/**
 * HaltReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum HaltReason {

    /**
     * Unknown
     */
    UNKNOWN((short) 0, "Unknown"),

    /**
     * Admin
     */
    ADMIN((short) 1, "Admin"),

    /**
     * AdditionalInfoRequested
     */
    ADDITIONAL_INFO_REQUESTED((short) 2, "AdditionalInfoRequested"),

    /**
     * RegulatoryConcern
     */
    REGULATORY_CONCERN((short) 3, "RegulatoryConcern"),

    /**
     * NewsReleased
     */
    NEWS_RELEASED((short) 4, "NewsReleased"),

    /**
     * MergerEffective
     */
    MERGER_EFFECTIVE((short) 5, "MergerEffective"),

    /**
     * ETFComponentPricesNotAvailable
     */
    ETF_COMPONENT_PRICES_NOT_AVAILABLE((short) 6, "ETFComponentPricesNotAvailable"),

    /**
     * OrderImbalance
     */
    ORDER_IMBALANCE((short) 7, "OrderImbalance"),

    /**
     * LULDTradingPause
     */
    LULD_TRADING_PAUSE((short) 8, "LULDTradingPause"),

    /**
     * CorporateAction
     */
    CORPORATE_ACTION((short) 9, "CorporateAction"),

    /**
     * NewSecurityOffering
     */
    NEW_SECURITY_OFFERING((short) 10, "NewSecurityOffering"),

    /**
     * NewsPending
     */
    NEWS_PENDING((short) 11, "NewsPending"),

    /**
     * IntradayIndicativeValueNotAvailable
     */
    INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE((short) 12, "IntradayIndicativeValueNotAvailable"),

    /**
     * Operational
     */
    OPERATIONAL((short) 13, "Operational"),

    /**
     * SubPennyTrading
     */
    SUB_PENNY_TRADING((short) 14, "SubPennyTrading"),

    /**
     * MarketWideCircuitBreakerLevel1
     */
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_1((short) 15, "MarketWideCircuitBreakerLevel1"),

    /**
     * MarketWideCircuitBreakerLevel2
     */
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_2((short) 16, "MarketWideCircuitBreakerLevel2"),

    /**
     * MarketWideCircuitBreakerLevel3
     */
    MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3((short) 17, "MarketWideCircuitBreakerLevel3");

    private final short wire;

    private final String description;

    HaltReason(short wire, String description) {
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
    public static Optional<HaltReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNKNOWN);
            case 1 -> Optional.of(ADMIN);
            case 2 -> Optional.of(ADDITIONAL_INFO_REQUESTED);
            case 3 -> Optional.of(REGULATORY_CONCERN);
            case 4 -> Optional.of(NEWS_RELEASED);
            case 5 -> Optional.of(MERGER_EFFECTIVE);
            case 6 -> Optional.of(ETF_COMPONENT_PRICES_NOT_AVAILABLE);
            case 7 -> Optional.of(ORDER_IMBALANCE);
            case 8 -> Optional.of(LULD_TRADING_PAUSE);
            case 9 -> Optional.of(CORPORATE_ACTION);
            case 10 -> Optional.of(NEW_SECURITY_OFFERING);
            case 11 -> Optional.of(NEWS_PENDING);
            case 12 -> Optional.of(INTRADAY_INDICATIVE_VALUE_NOT_AVAILABLE);
            case 13 -> Optional.of(OPERATIONAL);
            case 14 -> Optional.of(SUB_PENNY_TRADING);
            case 15 -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_1);
            case 16 -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_2);
            case 17 -> Optional.of(MARKET_WIDE_CIRCUIT_BREAKER_LEVEL_3);
            default -> Optional.empty();
        };
    }
}
