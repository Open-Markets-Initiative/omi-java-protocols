package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Identifies the instrument type relevant to the quote
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentType {

    /**
     * Cta Eligible Equity
     */
    CTA_ELIGIBLE_EQUITY('0', "Cta Eligible Equity"),

    /**
     * Local Issue
     */
    LOCAL_ISSUE('1', "Local Issue"),

    /**
     * Corporate Bond
     */
    CORPORATE_BOND('2', "Corporate Bond"),

    /**
     * Government Bond
     */
    GOVERNMENT_BOND('3', "Government Bond");

    private final char wire;

    private final String description;

    InstrumentType(char wire, String description) {
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
    public static Optional<InstrumentType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(CTA_ELIGIBLE_EQUITY);
            case '1' -> Optional.of(LOCAL_ISSUE);
            case '2' -> Optional.of(CORPORATE_BOND);
            case '3' -> Optional.of(GOVERNMENT_BOND);
            default -> Optional.empty();
        };
    }
}
