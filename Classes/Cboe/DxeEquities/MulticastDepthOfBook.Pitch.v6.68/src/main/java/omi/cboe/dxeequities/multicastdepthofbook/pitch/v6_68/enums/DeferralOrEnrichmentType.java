package omi.cboe.dxeequities.multicastdepthofbook.pitch.v6_68.enums;

import java.util.Optional;

/**
 * MMT Level 4.2
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DeferralOrEnrichmentType {

    /**
     * Limited Details Trade
     */
    LIMITED_DETAILS_TRADE('1', "Limited Details Trade"),

    /**
     * Daily Aggregated Trade
     */
    DAILY_AGGREGATED_TRADE('2', "Daily Aggregated Trade"),

    /**
     * Volume Omission Trade
     */
    VOLUME_OMISSION_TRADE('3', "Volume Omission Trade"),

    /**
     * Four Weeks Aggregation Trade
     */
    FOUR_WEEKS_AGGREGATION_TRADE('4', "Four Weeks Aggregation Trade"),

    /**
     * Indefinite Aggregation Trade
     */
    INDEFINITE_AGGREGATION_TRADE('5', "Indefinite Aggregation Trade"),

    /**
     * Volume Omission Trade Eligible For Subsequent Enrichment In Aggregated Form
     */
    VOLUME_OMISSION_TRADE_ELIGIBLE_FOR_SUBSEQUENT_ENRICHMENT_IN_AGGREGATED_FORM('6', "Volume Omission Trade Eligible For Subsequent Enrichment In Aggregated Form"),

    /**
     * Full Details Of Earlier Limited Details Trade
     */
    FULL_DETAILS_OF_EARLIER_LIMITED_DETAILS_TRADE('7', "Full Details Of Earlier Limited Details Trade"),

    /**
     * Full Details Of Earlier Daily Aggregated Trade
     */
    FULL_DETAILS_OF_EARLIER_DAILY_AGGREGATED_TRADE('8', "Full Details Of Earlier Daily Aggregated Trade"),

    /**
     * Full Details Of Earlier Volume Omission Trade
     */
    FULL_DETAILS_OF_EARLIER_VOLUME_OMISSION_TRADE('9', "Full Details Of Earlier Volume Omission Trade"),

    /**
     * Full Details Of Four Weeks Aggregation Trade
     */
    FULL_DETAILS_OF_FOUR_WEEKS_AGGREGATION_TRADE('V', "Full Details Of Four Weeks Aggregation Trade"),

    /**
     * Full Details Of Earlier Volume Omission Trade Eligible For Subsequent Enrichment In Aggregated Form
     */
    FULL_DETAILS_OF_EARLIER_VOLUME_OMISSION_TRADE_ELIGIBLE_FOR_SUBSEQUENT_ENRICHMENT_IN_AGGREGATED_FORM('W', "Full Details Of Earlier Volume Omission Trade Eligible For Subsequent Enrichment In Aggregated Form"),

    /**
     * Not Applicable
     */
    NOT_APPLICABLE('-', "Not Applicable");

    private final char wire;

    private final String description;

    DeferralOrEnrichmentType(char wire, String description) {
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
    public static Optional<DeferralOrEnrichmentType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(LIMITED_DETAILS_TRADE);
            case '2' -> Optional.of(DAILY_AGGREGATED_TRADE);
            case '3' -> Optional.of(VOLUME_OMISSION_TRADE);
            case '4' -> Optional.of(FOUR_WEEKS_AGGREGATION_TRADE);
            case '5' -> Optional.of(INDEFINITE_AGGREGATION_TRADE);
            case '6' -> Optional.of(VOLUME_OMISSION_TRADE_ELIGIBLE_FOR_SUBSEQUENT_ENRICHMENT_IN_AGGREGATED_FORM);
            case '7' -> Optional.of(FULL_DETAILS_OF_EARLIER_LIMITED_DETAILS_TRADE);
            case '8' -> Optional.of(FULL_DETAILS_OF_EARLIER_DAILY_AGGREGATED_TRADE);
            case '9' -> Optional.of(FULL_DETAILS_OF_EARLIER_VOLUME_OMISSION_TRADE);
            case 'V' -> Optional.of(FULL_DETAILS_OF_FOUR_WEEKS_AGGREGATION_TRADE);
            case 'W' -> Optional.of(FULL_DETAILS_OF_EARLIER_VOLUME_OMISSION_TRADE_ELIGIBLE_FOR_SUBSEQUENT_ENRICHMENT_IN_AGGREGATED_FORM);
            case '-' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
