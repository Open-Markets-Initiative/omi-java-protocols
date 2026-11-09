package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Used for Settlement Type information
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CorrectedSettlementType {

    /**
     * Regular Settlement
     */
    REGULAR_SETTLEMENT('@', "Regular Settlement"),

    /**
     * Cash Settlement
     */
    CASH_SETTLEMENT('C', "Cash Settlement"),

    /**
     * Next Day Settlement
     */
    NEXT_DAY_SETTLEMENT('N', "Next Day Settlement"),

    /**
     * Seller Settlement
     */
    SELLER_SETTLEMENT('R', "Seller Settlement");

    private final char wire;

    private final String description;

    CorrectedSettlementType(char wire, String description) {
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
    public static Optional<CorrectedSettlementType> fromWire(char wire) {
        return switch (wire) {
            case '@' -> Optional.of(REGULAR_SETTLEMENT);
            case 'C' -> Optional.of(CASH_SETTLEMENT);
            case 'N' -> Optional.of(NEXT_DAY_SETTLEMENT);
            case 'R' -> Optional.of(SELLER_SETTLEMENT);
            default -> Optional.empty();
        };
    }
}
