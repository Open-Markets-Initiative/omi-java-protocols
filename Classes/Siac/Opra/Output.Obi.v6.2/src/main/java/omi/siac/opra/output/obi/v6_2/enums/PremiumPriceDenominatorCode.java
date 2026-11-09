package omi.siac.opra.output.obi.v6_2.enums;

import java.util.Optional;

/**
 * Represents the first price paid for an option during the trading day.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PremiumPriceDenominatorCode {

    /**
     * Ten
     */
    TEN('A', "Ten"),

    /**
     * Hundred
     */
    HUNDRED('B', "Hundred"),

    /**
     * Thousand
     */
    THOUSAND('C', "Thousand"),

    /**
     * Ten Thousand
     */
    TEN_THOUSAND('D', "Ten Thousand"),

    /**
     * Hundred Thousand
     */
    HUNDRED_THOUSAND('E', "Hundred Thousand"),

    /**
     * Million
     */
    MILLION('F', "Million"),

    /**
     * Ten Million
     */
    TEN_MILLION('G', "Ten Million"),

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
