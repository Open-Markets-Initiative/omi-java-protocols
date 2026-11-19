package omi.eurex.t7.eobi.fbe.v8_0.enums;

import java.util.Optional;

/**
 * Defines the TradeCondition values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeCondition {

    /**
     * Implied Trade
     */
    IMPLIED_TRADE((short) 1, "Implied Trade"),

    /**
     * Final Price of Session (V)
     */
    SPECIAL_AUCTION_PRICE((short) 86, "Final Price of Session (V)"),

    /**
     * Out of sequence
     */
    OUT_OF_SEQUENCE((short) 107, "Out of sequence"),

    /**
     * Systematic Internalizer (AZ)
     */
    SYSTEMATIC_INTERNALIZER((short) 153, "Systematic Internalizer (AZ)"),

    /**
     * Midpoint price (BB)
     */
    MIDPOINT_PRICE((short) 155, "Midpoint price (BB)"),

    /**
     * Traded Before Issue Date (BC)
     */
    TRADED_BEFORE_ISSUE_DATE((short) 156, "Traded Before Issue Date (BC)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradeCondition(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<TradeCondition> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(IMPLIED_TRADE);
            case 86 -> Optional.of(SPECIAL_AUCTION_PRICE);
            case 107 -> Optional.of(OUT_OF_SEQUENCE);
            case 153 -> Optional.of(SYSTEMATIC_INTERNALIZER);
            case 155 -> Optional.of(MIDPOINT_PRICE);
            case 156 -> Optional.of(TRADED_BEFORE_ISSUE_DATE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
