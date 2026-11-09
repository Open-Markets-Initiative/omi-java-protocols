package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Identifies the market condition of a quote for a security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketCondition {

    /**
     * Normal Auction Market
     */
    NORMAL_AUCTION_MARKET(' ', "Normal Auction Market"),

    /**
     * Crossed Market
     */
    CROSSED_MARKET('A', "Crossed Market"),

    /**
     * Locked Market
     */
    LOCKED_MARKET('B', "Locked Market");

    private final char wire;

    private final String description;

    MarketCondition(char wire, String description) {
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
    public static Optional<MarketCondition> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NORMAL_AUCTION_MARKET);
            case 'A' -> Optional.of(CROSSED_MARKET);
            case 'B' -> Optional.of(LOCKED_MARKET);
            default -> Optional.empty();
        };
    }
}
