package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Risk Control Type enum
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RiskControlType {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE((short) 0, "Not Applicable"),

    /**
     * Single Order Max Qty
     */
    SINGLE_ORDER_MAX_QTY((short) 1, "Single Order Max Qty"),

    /**
     * Single Order Max Notional Value
     */
    SINGLE_ORDER_MAX_NOTIONAL_VALUE((short) 2, "Single Order Max Notional Value"),

    /**
     * Gross Credit – Executed
     */
    GROSS_CREDIT_EXECUTED((short) 3, "Gross Credit \u2013 Executed"),

    /**
     * Gross Credit – Open
     */
    GROSS_CREDIT_OPEN((short) 4, "Gross Credit \u2013 Open"),

    /**
     * Gross Credit – Open + Executed
     */
    GROSS_CREDIT_OPEN_PLUS_EXECUTED((short) 5, "Gross Credit \u2013 Open + Executed"),

    /**
     * Maximum Duplicative Orders
     */
    MAXIMUM_DUPLICATIVE_ORDERS((short) 6, "Maximum Duplicative Orders"),

    /**
     * Reserved for future use
     */
    RESERVED((short) 7, "Reserved for future use"),

    /**
     * Activity-based – Rolling Transaction
     */
    ACTIVITY_ROLLING_TRANSACTION((short) 8, "Activity-based \u2013 Rolling Transaction"),

    /**
     * Activity-based – Rolling Volume
     */
    ACTIVITY_ROLLING_VOLUME((short) 9, "Activity-based \u2013 Rolling Volume"),

    /**
     * Activity-based – Rolling Percentage
     */
    ACTIVITY_ROLLING_PERCENTAGE((short) 10, "Activity-based \u2013 Rolling Percentage"),

    /**
     * Activity-based – Global Risk Mitigation Protection for Transaction/Volume/Percentage
     */
    ACTIVITY_GLOBAL_RISK_MITIGATION((short) 11, "Activity-based \u2013 Global Risk Mitigation Protection for Transaction/Volume/Percentage"),

    /**
     * Reserved for future use
     */
    RESERVED_2((short) 12, "Reserved for future use"),

    /**
     * Reject Market Orders (except MOO &amp; MOC)
     */
    REJECT_MARKET_ORDERS((short) 13, "Reject Market Orders (except MOO & MOC)"),

    /**
     * Reject MOO &amp; MOC
     */
    REJECT_MOO_AND_MOC((short) 14, "Reject MOO & MOC"),

    /**
     * Not available
     */
    NOT_AVAILABLE_15((short) 15, "Not available"),

    /**
     * Not available
     */
    NOT_AVAILABLE_16((short) 16, "Not available"),

    /**
     * Reject Early Trading Session designation
     */
    REJECT_EARLY_TRADING_SESSION((short) 17, "Reject Early Trading Session designation"),

    /**
     * Reject Late Trading Session designation
     */
    REJECT_LATE_TRADING_SESSION((short) 18, "Reject Late Trading Session designation"),

    /**
     * Reject Restricted Symbol
     */
    REJECT_RESTRICTED_SYMBOL((short) 19, "Reject Restricted Symbol"),

    /**
     * Reject Sell Short for Symbol
     */
    REJECT_SELL_SHORT_FOR_SYMBOL((short) 20, "Reject Sell Short for Symbol"),

    /**
     * Reject Sell Short Exempt for Symbol
     */
    REJECT_SELL_SHORT_EXEMPT_FOR_SYMBOL((short) 21, "Reject Sell Short Exempt for Symbol"),

    /**
     * Single Order Maximum Quantity as Percentage of Symbol ADV
     */
    SINGLE_ORDER_MAX_QTY_PCT_ADV((short) 22, "Single Order Maximum Quantity as Percentage of Symbol ADV"),

    /**
     * Limit Order Price Protection Equities - Custom Limits
     */
    LOPP_EQUITIES_CUSTOM_LIMITS((short) 23, "Limit Order Price Protection Equities - Custom Limits"),

    /**
     * Limit Order Price Protection Equities - Early/Late Trading Multiplier
     */
    LOPP_EQUITIES_EARLY_LATE_MULTIPLIER((short) 24, "Limit Order Price Protection Equities - Early/Late Trading Multiplier"),

    /**
     * Limit Order Price Protection Equities - Closing Only Multiplier
     */
    LOPP_EQUITIES_CLOSING_ONLY_MULTIPLIER((short) 25, "Limit Order Price Protection Equities - Closing Only Multiplier"),

    /**
     * Limit Order Price Protection Options - Single Leg Custom Limits
     */
    LOPP_OPTIONS_SINGLE_LEG_CUSTOM_LIMITS((short) 26, "Limit Order Price Protection Options - Single Leg Custom Limits"),

    /**
     * Limit Order Price Protection Options - Complex Custom Limits
     */
    LOPP_OPTIONS_COMPLEX_CUSTOM_LIMITS((short) 27, "Limit Order Price Protection Options - Complex Custom Limits"),

    /**
     * Require LocateBroker on Sell Short and Sell Short Exempt orders
     */
    REQUIRE_LOCATE_BROKER((short) 28, "Require LocateBroker on Sell Short and Sell Short Exempt orders"),

    /**
     * Order Rate Threshold – Max Orders across All Symbols
     */
    ORDER_RATE_THRESHOLD((short) 29, "Order Rate Threshold \u2013 Max Orders across All Symbols"),

    /**
     * Reject ISO IOC
     */
    REJECT_ISOIOC((short) 30, "Reject ISO IOC"),

    /**
     * Reject ISO Day
     */
    REJECT_ISO_DAY((short) 31, "Reject ISO Day");

    private final short wire;

    private final String description;

    RiskControlType(short wire, String description) {
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
    public static Optional<RiskControlType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(SINGLE_ORDER_MAX_QTY);
            case 2 -> Optional.of(SINGLE_ORDER_MAX_NOTIONAL_VALUE);
            case 3 -> Optional.of(GROSS_CREDIT_EXECUTED);
            case 4 -> Optional.of(GROSS_CREDIT_OPEN);
            case 5 -> Optional.of(GROSS_CREDIT_OPEN_PLUS_EXECUTED);
            case 6 -> Optional.of(MAXIMUM_DUPLICATIVE_ORDERS);
            case 7 -> Optional.of(RESERVED);
            case 8 -> Optional.of(ACTIVITY_ROLLING_TRANSACTION);
            case 9 -> Optional.of(ACTIVITY_ROLLING_VOLUME);
            case 10 -> Optional.of(ACTIVITY_ROLLING_PERCENTAGE);
            case 11 -> Optional.of(ACTIVITY_GLOBAL_RISK_MITIGATION);
            case 12 -> Optional.of(RESERVED_2);
            case 13 -> Optional.of(REJECT_MARKET_ORDERS);
            case 14 -> Optional.of(REJECT_MOO_AND_MOC);
            case 15 -> Optional.of(NOT_AVAILABLE_15);
            case 16 -> Optional.of(NOT_AVAILABLE_16);
            case 17 -> Optional.of(REJECT_EARLY_TRADING_SESSION);
            case 18 -> Optional.of(REJECT_LATE_TRADING_SESSION);
            case 19 -> Optional.of(REJECT_RESTRICTED_SYMBOL);
            case 20 -> Optional.of(REJECT_SELL_SHORT_FOR_SYMBOL);
            case 21 -> Optional.of(REJECT_SELL_SHORT_EXEMPT_FOR_SYMBOL);
            case 22 -> Optional.of(SINGLE_ORDER_MAX_QTY_PCT_ADV);
            case 23 -> Optional.of(LOPP_EQUITIES_CUSTOM_LIMITS);
            case 24 -> Optional.of(LOPP_EQUITIES_EARLY_LATE_MULTIPLIER);
            case 25 -> Optional.of(LOPP_EQUITIES_CLOSING_ONLY_MULTIPLIER);
            case 26 -> Optional.of(LOPP_OPTIONS_SINGLE_LEG_CUSTOM_LIMITS);
            case 27 -> Optional.of(LOPP_OPTIONS_COMPLEX_CUSTOM_LIMITS);
            case 28 -> Optional.of(REQUIRE_LOCATE_BROKER);
            case 29 -> Optional.of(ORDER_RATE_THRESHOLD);
            case 30 -> Optional.of(REJECT_ISOIOC);
            case 31 -> Optional.of(REJECT_ISO_DAY);
            default -> Optional.empty();
        };
    }
}
