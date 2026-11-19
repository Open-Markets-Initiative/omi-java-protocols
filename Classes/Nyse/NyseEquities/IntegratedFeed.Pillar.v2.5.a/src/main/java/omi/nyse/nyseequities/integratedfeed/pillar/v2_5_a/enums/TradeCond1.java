package omi.nyse.nyseequities.integratedfeed.pillar.v2_5_a.enums;

import java.util.Optional;

/**
 * TradeCond1 value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond1 {

    /**
     * Regular Sale
     */
    REGULAR_SALE('@', "Regular Sale"),

    /**
     * Cash
     */
    CASH('C', "Cash"),

    /**
     * Next Day Trade
     */
    NEXT_DAY_TRADE('N', "Next Day Trade");

    private final char wire;

    private final String description;

    TradeCond1(char wire, String description) {
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
    public static Optional<TradeCond1> fromWire(char wire) {
        return switch (wire) {
            case '@' -> Optional.of(REGULAR_SALE);
            case 'C' -> Optional.of(CASH);
            case 'N' -> Optional.of(NEXT_DAY_TRADE);
            default -> Optional.empty();
        };
    }
}
