package omi.bme.meff.topofbook5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Post-deferral publication type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PostDeferralPublicationType {

    /**
     * Not Applicable No Relevant Deferral Or Enrichment Type
     */
    NOT_APPLICABLE_NO_RELEVANT_DEFERRAL_OR_ENRICHMENT_TYPE(' ', "Not Applicable No Relevant Deferral Or Enrichment Type"),

    /**
     * Full Details Of Earlier Daily Aggregated Trade Datf
     */
    FULL_DETAILS_OF_EARLIER_DAILY_AGGREGATED_TRADE_DATF('8', "Full Details Of Earlier Daily Aggregated Trade Datf");

    private final char wire;

    private final String description;

    PostDeferralPublicationType(char wire, String description) {
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
    public static Optional<PostDeferralPublicationType> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE_NO_RELEVANT_DEFERRAL_OR_ENRICHMENT_TYPE);
            case '8' -> Optional.of(FULL_DETAILS_OF_EARLIER_DAILY_AGGREGATED_TRADE_DATF);
            default -> Optional.empty();
        };
    }
}
