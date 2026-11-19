package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * shortSaleDetail
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSaleDetail {

    /**
     * NoPriceTest
     */
    NO_PRICE_TEST(' ', "NoPriceTest"),

    /**
     * IntradayPriceDrop
     */
    INTRADAY_PRICE_DROP('A', "IntradayPriceDrop"),

    /**
     * RemainsFromPriorDay
     */
    REMAINS_FROM_PRIOR_DAY('C', "RemainsFromPriorDay"),

    /**
     * Deactivated
     */
    DEACTIVATED('D', "Deactivated"),

    /**
     * NotAvailable
     */
    NOT_AVAILABLE('N', "NotAvailable");

    private final char wire;

    private final String description;

    ShortSaleDetail(char wire, String description) {
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
    public static Optional<ShortSaleDetail> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_PRICE_TEST);
            case 'A' -> Optional.of(INTRADAY_PRICE_DROP);
            case 'C' -> Optional.of(REMAINS_FROM_PRIOR_DAY);
            case 'D' -> Optional.of(DEACTIVATED);
            case 'N' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
