package omi.siac.opra.input.obi.v5_0_i.enums;

import java.util.Optional;

/**
 * Indicates the position of the floating decimal point within the Premium Price field.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PremiumPriceDenominatorCode {

    /**
     * 10
     */
    TEN('A', "10"),

    /**
     * 100
     */
    HUNDRED('B', "100"),

    /**
     * 1,000
     */
    THOUSAND('C', "1,000"),

    /**
     * 10,000
     */
    TEN_THOUSAND('D', "10,000"),

    /**
     * 100,000
     */
    HUNDRED_THOUSAND('E', "100,000"),

    /**
     * 1,000,000
     */
    MILLION('F', "1,000,000"),

    /**
     * 10,000,000
     */
    TEN_MILLION('G', "10,000,000"),

    /**
     * No Fraction
     */
    NO_FRACTION('I', "No Fraction");

    private final char wire;

    private final String description;

    PremiumPriceDenominatorCode(char wire, String description) {
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
    public static Optional<PremiumPriceDenominatorCode> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(TEN);
            case 'B' -> Optional.of(HUNDRED);
            case 'C' -> Optional.of(THOUSAND);
            case 'D' -> Optional.of(TEN_THOUSAND);
            case 'E' -> Optional.of(HUNDRED_THOUSAND);
            case 'F' -> Optional.of(MILLION);
            case 'G' -> Optional.of(TEN_MILLION);
            case 'I' -> Optional.of(NO_FRACTION);
            default -> Optional.empty();
        };
    }
}
