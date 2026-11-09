package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.enums;

import java.util.Optional;

/**
 * The power of ten dividing the price fields in this message.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceScaleCode {

    /**
     * No Division
     */
    NO_DIVISION('0', "No Division"),

    /**
     * Ten
     */
    TEN('1', "Ten"),

    /**
     * One Hundred
     */
    ONE_HUNDRED('2', "One Hundred"),

    /**
     * One Thousand
     */
    ONE_THOUSAND('3', "One Thousand"),

    /**
     * Ten Thousand
     */
    TEN_THOUSAND('4', "Ten Thousand"),

    /**
     * One Hundred Thousand
     */
    ONE_HUNDRED_THOUSAND('5', "One Hundred Thousand"),

    /**
     * One Million
     */
    ONE_MILLION('6', "One Million");

    private final char wire;

    private final String description;

    PriceScaleCode(char wire, String description) {
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
    public static Optional<PriceScaleCode> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_DIVISION);
            case '1' -> Optional.of(TEN);
            case '2' -> Optional.of(ONE_HUNDRED);
            case '3' -> Optional.of(ONE_THOUSAND);
            case '4' -> Optional.of(TEN_THOUSAND);
            case '5' -> Optional.of(ONE_HUNDRED_THOUSAND);
            case '6' -> Optional.of(ONE_MILLION);
            default -> Optional.empty();
        };
    }
}
