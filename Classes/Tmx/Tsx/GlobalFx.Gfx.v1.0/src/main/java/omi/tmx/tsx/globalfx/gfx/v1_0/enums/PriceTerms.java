package omi.tmx.tsx.globalfx.gfx.v1_0.enums;

import java.util.Optional;

/**
 * Which currency the Tier Size is in and which way the prices are quoted. The section 3.3 example leaves it zero in every tier, though section 3 states only D and I
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceTerms {

    /**
     * Tier Size is in Currency 1 and prices are in units of Currency 2 per Currency 1
     */
    DIRECT_TERMS('D', "Tier Size is in Currency 1 and prices are in units of Currency 2 per Currency 1"),

    /**
     * Tier Size is in Currency 2 and prices are in units of Currency 1 per Currency 2
     */
    INVERTED_TERMS('I', "Tier Size is in Currency 2 and prices are in units of Currency 1 per Currency 2");

    private final char wire;

    private final String description;

    PriceTerms(char wire, String description) {
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
    public static Optional<PriceTerms> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(DIRECT_TERMS);
            case 'I' -> Optional.of(INVERTED_TERMS);
            default -> Optional.empty();
        };
    }
}
