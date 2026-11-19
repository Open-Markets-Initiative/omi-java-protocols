package omi.nasdaq.nsmequities.lastsaletradesfilterview.asciiitch.v2_0_2013.enums;

import java.util.Optional;

/**
 * IPO Quotation Release Qualifier.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IpoQuotationReleaseQualifier {

    /**
     * Anticipated quotation release time
     */
    ANTICIPATED('A', "Anticipated quotation release time"),

    /**
     * IPO release canceled/postponed
     */
    CANCELED_POSTPONED('C', "IPO release canceled/postponed");

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
            case 'A' -> Optional.of(ANTICIPATED);
            case 'C' -> Optional.of(CANCELED_POSTPONED);
            default -> Optional.empty();
        };
    }
}
