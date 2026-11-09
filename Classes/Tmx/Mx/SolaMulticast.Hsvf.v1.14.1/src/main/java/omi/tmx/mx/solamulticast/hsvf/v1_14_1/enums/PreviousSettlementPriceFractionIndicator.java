package omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums;

import java.util.Optional;

/**
 * Defines number of decimal places or fraction positions
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PreviousSettlementPriceFractionIndicator {

    /**
     * 1/1
     */
    WHOLE('0', "1/1"),

    /**
     * 1/10
     */
    TEN('1', "1/10"),

    /**
     * 1/100
     */
    HUNDRED('2', "1/100"),

    /**
     * 1/1,000
     */
    THOUSAND('3', "1/1,000"),

    /**
     * 1/10,000
     */
    TEN_THOUSAND('4', "1/10,000"),

    /**
     * 1/100,000
     */
    HUNDRED_THOUSAND('5', "1/100,000"),

    /**
     * 1/1,000,000
     */
    MILLION('6', "1/1,000,000"),

    /**
     * 1/10,000,000
     */
    TEN_MILLION('7', "1/10,000,000"),

    /**
     * 1/100,000,000
     */
    HUNDRED_MILLION('8', "1/100,000,000"),

    /**
     * 1/1,000,000,000
     */
    BILLION('9', "1/1,000,000,000"),

    /**
     * -1/1
     */
    NEGATIVE_WHOLE('A', "-1/1"),

    /**
     * -1/10
     */
    NEGATIVE_TEN('B', "-1/10"),

    /**
     * -1/100
     */
    NEGATIVE_HUNDRED('C', "-1/100"),

    /**
     * -1/1,000
     */
    NEGATIVE_THOUSAND('D', "-1/1,000"),

    /**
     * -1/10,000
     */
    NEGATIVE_TEN_THOUSAND('E', "-1/10,000"),

    /**
     * -1/100,000
     */
    NEGATIVE_HUNDRED_THOUSAND('F', "-1/100,000"),

    /**
     * -1/1,000,000
     */
    NEGATIVE_MILLION('G', "-1/1,000,000"),

    /**
     * 10
     */
    TIMES_TEN('Z', "10"),

    /**
     * 100
     */
    TIMES_HUNDRED('Y', "100"),

    /**
     * 1,000
     */
    TIMES_THOUSAND('X', "1,000"),

    /**
     * 10,000
     */
    TIMES_TEN_THOUSAND('W', "10,000"),

    /**
     * 100,000
     */
    TIMES_HUNDRED_THOUSAND('V', "100,000"),

    /**
     * 1,000,000
     */
    TIMES_MILLION('U', "1,000,000"),

    /**
     * Empty
     */
    EMPTY(' ', "Empty");

    private final char wire;

    private final String description;

    PreviousSettlementPriceFractionIndicator(char wire, String description) {
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
    public static Optional<PreviousSettlementPriceFractionIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(WHOLE);
            case '1' -> Optional.of(TEN);
            case '2' -> Optional.of(HUNDRED);
            case '3' -> Optional.of(THOUSAND);
            case '4' -> Optional.of(TEN_THOUSAND);
            case '5' -> Optional.of(HUNDRED_THOUSAND);
            case '6' -> Optional.of(MILLION);
            case '7' -> Optional.of(TEN_MILLION);
            case '8' -> Optional.of(HUNDRED_MILLION);
            case '9' -> Optional.of(BILLION);
            case 'A' -> Optional.of(NEGATIVE_WHOLE);
            case 'B' -> Optional.of(NEGATIVE_TEN);
            case 'C' -> Optional.of(NEGATIVE_HUNDRED);
            case 'D' -> Optional.of(NEGATIVE_THOUSAND);
            case 'E' -> Optional.of(NEGATIVE_TEN_THOUSAND);
            case 'F' -> Optional.of(NEGATIVE_HUNDRED_THOUSAND);
            case 'G' -> Optional.of(NEGATIVE_MILLION);
            case 'Z' -> Optional.of(TIMES_TEN);
            case 'Y' -> Optional.of(TIMES_HUNDRED);
            case 'X' -> Optional.of(TIMES_THOUSAND);
            case 'W' -> Optional.of(TIMES_TEN_THOUSAND);
            case 'V' -> Optional.of(TIMES_HUNDRED_THOUSAND);
            case 'U' -> Optional.of(TIMES_MILLION);
            case ' ' -> Optional.of(EMPTY);
            default -> Optional.empty();
        };
    }
}
