package omi.lseg.lse.mifid2posttraderecovery.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Type of deferral or enrichment applied.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DeferralEnrichmentType {

    /**
     * Not Applicable No Relevant Enrichment Type
     */
    NOT_APPLICABLE_NO_RELEVANT_ENRICHMENT_TYPE('-', "Not Applicable No Relevant Enrichment Type");

    private final char wire;

    private final String description;

    DeferralEnrichmentType(char wire, String description) {
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
    public static Optional<DeferralEnrichmentType> fromWire(char wire) {
        return wire == '-' ? Optional.of(NOT_APPLICABLE_NO_RELEVANT_ENRICHMENT_TYPE) : Optional.empty();
    }
}
