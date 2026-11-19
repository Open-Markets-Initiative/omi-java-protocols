package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the MassActionReason values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassActionReason {

    /**
     * No Special Reason
     */
    NO_SPECIAL_REASON((short) 0, "No Special Reason"),

    /**
     * Stop Trading
     */
    STOP_TRADING((short) 1, "Stop Trading"),

    /**
     * Emergency
     */
    EMERGENCY((short) 2, "Emergency"),

    /**
     * Market Maker Parameters
     */
    MARKET_MAKER_PROTECTION((short) 3, "Market Maker Parameters"),

    /**
     * Stop Button Activated
     */
    STOP_BUTTON_ACTIVATED((short) 4, "Stop Button Activated"),

    /**
     * Business Unit Suspended
     */
    BUSSINESS_UNIT_SUSPENDED((short) 5, "Business Unit Suspended"),

    /**
     * Session Loss
     */
    SESSION_LOSS((short) 6, "Session Loss"),

    /**
     * RRM: Collateral
     */
    COLLATERAL_RRM((short) 7, "RRM: Collateral"),

    /**
     * Price Band Shrink
     */
    PRICE_BAND_SHRINK((short) 8, "Price Band Shrink"),

    /**
     * Orders Worse Than Close Price
     */
    ORDERS_WORSE_THAN_CLOSE_PRICE((short) 9, "Orders Worse Than Close Price"),

    /**
     * Product State Halt
     */
    PRODUCT_STATE_HALT((short) 105, "Product State Halt"),

    /**
     * Product State Holiday
     */
    PRODUCT_STATE_HOLIDAY((short) 106, "Product State Holiday"),

    /**
     * Instrument Suspended
     */
    INSTRUMENT_SUSPENDED((short) 107, "Instrument Suspended"),

    /**
     * Complex Instrument Deletion
     */
    COMPLEX_INSTRUMENT_DELETION((short) 109, "Complex Instrument Deletion"),

    /**
     * Volatility Interruption
     */
    VOLATILITY_INTERRUPTION((short) 110, "Volatility Interruption"),

    /**
     * Product Temporarily Not Tradable
     */
    PRODUCTTEMPORARILYNOTTRADABLE((short) 111, "Product Temporarily Not Tradable"),

    /**
     * Product State Closing
     */
    PRODUCT_STATE_CLOSING((short) 114, "Product State Closing"),

    /**
     * Product State EOD
     */
    PRODUCT_STATE_EOD((short) 115, "Product State EOD"),

    /**
     * RRM : Regulatory
     */
    COOLINGOFF((short) 116, "RRM : Regulatory"),

    /**
     * RRM : MWPL
     */
    MWPLRRM((short) 117, "RRM : MWPL"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    MassActionReason(short wire, String description) {
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
    public static Optional<MassActionReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_SPECIAL_REASON);
            case 1 -> Optional.of(STOP_TRADING);
            case 2 -> Optional.of(EMERGENCY);
            case 3 -> Optional.of(MARKET_MAKER_PROTECTION);
            case 4 -> Optional.of(STOP_BUTTON_ACTIVATED);
            case 5 -> Optional.of(BUSSINESS_UNIT_SUSPENDED);
            case 6 -> Optional.of(SESSION_LOSS);
            case 7 -> Optional.of(COLLATERAL_RRM);
            case 8 -> Optional.of(PRICE_BAND_SHRINK);
            case 9 -> Optional.of(ORDERS_WORSE_THAN_CLOSE_PRICE);
            case 105 -> Optional.of(PRODUCT_STATE_HALT);
            case 106 -> Optional.of(PRODUCT_STATE_HOLIDAY);
            case 107 -> Optional.of(INSTRUMENT_SUSPENDED);
            case 109 -> Optional.of(COMPLEX_INSTRUMENT_DELETION);
            case 110 -> Optional.of(VOLATILITY_INTERRUPTION);
            case 111 -> Optional.of(PRODUCTTEMPORARILYNOTTRADABLE);
            case 114 -> Optional.of(PRODUCT_STATE_CLOSING);
            case 115 -> Optional.of(PRODUCT_STATE_EOD);
            case 116 -> Optional.of(COOLINGOFF);
            case 117 -> Optional.of(MWPLRRM);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
