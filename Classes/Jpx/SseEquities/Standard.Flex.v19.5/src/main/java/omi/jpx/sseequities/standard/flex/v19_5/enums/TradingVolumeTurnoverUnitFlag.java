package omi.jpx.sseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * The unit of the numerical value to be set in the integral part.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingVolumeTurnoverUnitFlag {

    /**
     * 10^0 = 1
     */
    ONE('0', "10^0 = 1"),

    /**
     * 10^1 = 10
     */
    TEN('1', "10^1 = 10"),

    /**
     * 10^2 = 100
     */
    HUNDRED('2', "10^2 = 100"),

    /**
     * 10^3 = 1000
     */
    THOUSAND('3', "10^3 = 1000"),

    /**
     * 10^4 = 10000
     */
    TEN_THOUSAND('4', "10^4 = 10000"),

    /**
     * 10^5 = 100000
     */
    HUNDRED_THOUSAND('5', "10^5 = 100000"),

    /**
     * 10^6 = 1000000
     */
    MILLION('6', "10^6 = 1000000"),

    /**
     * 10^7 = 10000000
     */
    TEN_MILLION('7', "10^7 = 10000000"),

    /**
     * 10^8 = 100000000
     */
    HUNDRED_MILLION('8', "10^8 = 100000000"),

    /**
     * 10^9 = 1000000000
     */
    BILLION('9', "10^9 = 1000000000"),

    /**
     * Spaces will be set if the numerical part are spaces.
     */
    NO_NUMERICAL_VALUE(' ', "Spaces will be set if the numerical part are spaces.");

    private final char wire;

    private final String description;

    TradingVolumeTurnoverUnitFlag(char wire, String description) {
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
    public static Optional<TradingVolumeTurnoverUnitFlag> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(ONE);
            case '1' -> Optional.of(TEN);
            case '2' -> Optional.of(HUNDRED);
            case '3' -> Optional.of(THOUSAND);
            case '4' -> Optional.of(TEN_THOUSAND);
            case '5' -> Optional.of(HUNDRED_THOUSAND);
            case '6' -> Optional.of(MILLION);
            case '7' -> Optional.of(TEN_MILLION);
            case '8' -> Optional.of(HUNDRED_MILLION);
            case '9' -> Optional.of(BILLION);
            case ' ' -> Optional.of(NO_NUMERICAL_VALUE);
            default -> Optional.empty();
        };
    }
}
