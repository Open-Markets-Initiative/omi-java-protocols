package omi.nasdaq.nsmequities.qbbo.itch.v2_1.enums;

import java.util.Optional;

/**
 * Denotes the IPO release qualifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IpoQuotationReleaseQualifier {

    /**
     * This value would be used when Nasdaq Market Operations initially enters the IPO instrument for release.
     */
    ANTICIPATED_QUOTATION_RELEASE_TIME('A', "This value would be used when Nasdaq Market Operations initially enters the IPO instrument for release."),

    /**
     * This value would be used when Nasdaq Market Operations cancels or postpones the release of the IPO instrument.
     */
    IPO_RELEASE_CANCELED_POSTPONED('C', "This value would be used when Nasdaq Market Operations cancels or postpones the release of the IPO instrument.");

    private final char wire;

    private final String description;

    IpoQuotationReleaseQualifier(char wire, String description) {
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
    public static Optional<IpoQuotationReleaseQualifier> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ANTICIPATED_QUOTATION_RELEASE_TIME);
            case 'C' -> Optional.of(IPO_RELEASE_CANCELED_POSTPONED);
            default -> Optional.empty();
        };
    }
}
