package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * This field is used to denote the sale condition associated with a trade transaction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SaleConditionLevel {

    /**
     * Regular Trade
     */
    REGULAR_TRADE('@', "Regular Trade"),

    /**
     * Cash Trade
     */
    CASH_TRADE('C', "Cash Trade"),

    /**
     * Next Day
     */
    NEXT_DAY('N', "Next Day"),

    /**
     * Seller
     */
    SELLER('R', "Seller");

    private final char wire;

    private final String description;

    SaleConditionLevel(char wire, String description) {
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
    public static Optional<SaleConditionLevel> fromWire(char wire) {
        return switch (wire) {
            case '@' -> Optional.of(REGULAR_TRADE);
            case 'C' -> Optional.of(CASH_TRADE);
            case 'N' -> Optional.of(NEXT_DAY);
            case 'R' -> Optional.of(SELLER);
            default -> Optional.empty();
        };
    }
}
