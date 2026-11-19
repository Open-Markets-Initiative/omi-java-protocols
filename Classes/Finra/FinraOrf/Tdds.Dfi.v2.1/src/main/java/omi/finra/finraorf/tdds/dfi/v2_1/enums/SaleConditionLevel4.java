package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * This field is used to denote the sale condition associated with a trade transaction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SaleConditionLevel4 {

    /**
     * Odd Lot Trade
     */
    ODD_LOT_TRADE('I', "Odd Lot Trade"),

    /**
     * Prior Reference Price
     */
    PRIOR_REFERENCE_PRICE('P', "Prior Reference Price"),

    /**
     * Average Price Trade
     */
    AVERAGE_PRICE_TRADE('W', "Average Price Trade"),

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available");

    private final char wire;

    private final String description;

    SaleConditionLevel4(char wire, String description) {
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
    public static Optional<SaleConditionLevel4> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(ODD_LOT_TRADE);
            case 'P' -> Optional.of(PRIOR_REFERENCE_PRICE);
            case 'W' -> Optional.of(AVERAGE_PRICE_TRADE);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
