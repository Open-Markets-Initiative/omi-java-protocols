package omi.eurex.t7.eobi.fbe.v13_0.enums;

import java.util.Optional;

/**
 * Defines the TradeCondition values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TradeCondition {

    /**
     * Implied Trade
     */
    IMPLIED_TRADE(1, "Implied Trade"),

    /**
     * Out of sequence (k)
     */
    OUT_OF_SEQUENCE(107, "Out of sequence (k)"),

    /**
     * Midpoint Price (BB)
     */
    MIDPOINT_PRICE(155, "Midpoint Price (BB)"),

    /**
     * Trading On Terms Of Issue (BC)
     */
    TRADING_ON_TERMS_OF_ISSUE(156, "Trading On Terms Of Issue (BC)"),

    /**
     * Special Auction (SA)
     */
    SPECIAL_AUCTION(596, "Special Auction (SA)"),

    /**
     * Trade At Close (TC)
     */
    TRADE_AT_CLOSE(624, "Trade At Close (TC)"),

    /**
     * Retail (XR)
     */
    RETAIL(743, "Retail (XR)"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    TradeCondition(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<TradeCondition> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(IMPLIED_TRADE);
            case 107 -> Optional.of(OUT_OF_SEQUENCE);
            case 155 -> Optional.of(MIDPOINT_PRICE);
            case 156 -> Optional.of(TRADING_ON_TERMS_OF_ISSUE);
            case 596 -> Optional.of(SPECIAL_AUCTION);
            case 624 -> Optional.of(TRADE_AT_CLOSE);
            case 743 -> Optional.of(RETAIL);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
