package omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * Settlement related conditions.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond1 {

    /**
     * Regular Sale
     */
    REGULAR_SALE('@', "Regular Sale"),

    /**
     * Cash Texas Only
     */
    CASH_TEXAS_ONLY('C', "Cash Texas Only");

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
            case 'C' -> Optional.of(CASH_TEXAS_ONLY);
            default -> Optional.empty();
        };
    }
}
