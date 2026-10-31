package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * HandleInst
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum HandleInst {

    /**
     * imbalance only (CrossType O and C)
     */
    IMBALANCE_ONLY('I', "imbalance only (CrossType O and C)"),

    /**
     * retail order type 1 (CrossType R)
     */
    RETAIL_ORDER_TYPE_1('O', "retail order type 1 (CrossType R)"),

    /**
     * retail order type 2 (CrossType R)
     */
    RETAIL_ORDER_TYPE_2('T', "retail order type 2 (CrossType R)"),

    /**
     * retail price improvement (CrossType R)
     */
    RETAIL_PRICE_IMPROVEMENT('Q', "retail price improvement (CrossType R)"),

    /**
     * Extended Life + Continuous (CrossType E)
     */
    EXTENDED_LIFE_CONTINUOUS('B', "Extended Life + Continuous (CrossType E)"),

    /**
     * Direct Listing Capital Raise (CrossType H)
     */
    DIRECT_LISTING_CAPITAL_RAISE('D', "Direct Listing Capital Raise (CrossType H)");

    private final char wire;

    private final String description;

    HandleInst(char wire, String description) {
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
    public static Optional<HandleInst> fromWire(char wire) {
        return switch (wire) {
            case 'I' -> Optional.of(IMBALANCE_ONLY);
            case 'O' -> Optional.of(RETAIL_ORDER_TYPE_1);
            case 'T' -> Optional.of(RETAIL_ORDER_TYPE_2);
            case 'Q' -> Optional.of(RETAIL_PRICE_IMPROVEMENT);
            case 'B' -> Optional.of(EXTENDED_LIFE_CONTINUOUS);
            case 'D' -> Optional.of(DIRECT_LISTING_CAPITAL_RAISE);
            default -> Optional.empty();
        };
    }
}
