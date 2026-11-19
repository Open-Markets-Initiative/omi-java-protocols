package omi.ice.icefutures.mdf.impact.v1_1_51.enums;

import java.util.Optional;

/**
 * Special field type
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum SpecialFieldId {

    /**
     * Eris Futures Price
     */
    ALT_PRICE((byte) 1, "Eris Futures Price"),

    /**
     * High Eris Futures Price
     */
    ALT_HIGH_PRICE((byte) 2, "High Eris Futures Price"),

    /**
     * Low Eris Futures Price
     */
    ALT_LOW_PRICE((byte) 3, "Low Eris Futures Price"),

    /**
     * Volume-weighted Average Eris Futures Price
     */
    ALT_VWAP((byte) 4, "Volume-weighted Average Eris Futures Price"),

    /**
     * Last Trade Eris Futures Price
     */
    ALT_LAST_TRADE_PRICE((byte) 5, "Last Trade Eris Futures Price"),

    /**
     * Order is All-Or-None
     */
    AON((byte) 6, "Order is All-Or-None"),

    /**
     * The sum of all daily distributions. Daily Distribution on a given day is equal to the latest UKXCD value (published the business day prior) subtracted from the prior value of UKXCD. Daily Distributions (t) = Distribution Index (t) - Distribution Index (t-1) NumDecimals will be 2.
     */
    ACCRUED_DISTRIBUTION((byte) 18, "The sum of all daily distributions. Daily Distribution on a given day is equal to the latest UKXCD value (published the business day prior) subtracted from the prior value of UKXCD. Daily Distributions (t) = Distribution Index (t) - Distribution Index (t-1) NumDecimals will be 2."),

    /**
     * The sum of all daily funding values. Daily Funding is calculated on a given day using the following formula: Daily Funding(t) = Index Close (t-1) * Funding Rate (t-1) * (Funding Days (t) / Annualization Factor) NumDecimals will be 6
     */
    ACCRUED_FUNDING((byte) 19, "The sum of all daily funding values. Daily Funding is calculated on a given day using the following formula: Daily Funding(t) = Index Close (t-1) * Funding Rate (t-1) * (Funding Days (t) / Annualization Factor) NumDecimals will be 6"),

    /**
     * The number of periods used to annualize a return
     */
    ANNUALIZATION_FACTOR((byte) 20, "The number of periods used to annualize a return"),

    /**
     * This is a weighting factor determined for each expiry calculated daily
     */
    TRF_DAYS_TO_MATURITY((byte) 21, "This is a weighting factor determined for each expiry calculated daily"),

    /**
     * If the TPL hold is scheduled to end early this will contain the number of seconds remaining for the hold period
     */
    SECONDS_TO_END_TPL_HOLD((byte) 22, "If the TPL hold is scheduled to end early this will contain the number of seconds remaining for the hold period");

    private final byte wire;

    private final String description;

    SpecialFieldId(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<SpecialFieldId> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(ALT_PRICE);
            case 2 -> Optional.of(ALT_HIGH_PRICE);
            case 3 -> Optional.of(ALT_LOW_PRICE);
            case 4 -> Optional.of(ALT_VWAP);
            case 5 -> Optional.of(ALT_LAST_TRADE_PRICE);
            case 6 -> Optional.of(AON);
            case 18 -> Optional.of(ACCRUED_DISTRIBUTION);
            case 19 -> Optional.of(ACCRUED_FUNDING);
            case 20 -> Optional.of(ANNUALIZATION_FACTOR);
            case 21 -> Optional.of(TRF_DAYS_TO_MATURITY);
            case 22 -> Optional.of(SECONDS_TO_END_TPL_HOLD);
            default -> Optional.empty();
        };
    }
}
