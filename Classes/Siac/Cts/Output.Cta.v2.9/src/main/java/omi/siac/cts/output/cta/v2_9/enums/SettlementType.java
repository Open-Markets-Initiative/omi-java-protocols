package omi.siac.cts.output.cta.v2_9.enums;

import java.util.Optional;

/**
 * Category 1: Settlement Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementType {

    /**
     * Regular Settlement
     */
    REGULAR_SETTLEMENT(' ', "Regular Settlement"),

    /**
     * Same Day Clearing
     */
    CASH_TRADE('C', "Same Day Clearing"),

    /**
     * Next Day Clearing
     */
    NEXT_DAY_TRADE('N', "Next Day Clearing"),

    /**
     * Seller
     */
    SELLER('R', "Seller");

    private final char wire;

    private final String description;

    SettlementType(char wire, String description) {
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
    public static Optional<SettlementType> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR_SETTLEMENT);
            case 'C' -> Optional.of(CASH_TRADE);
            case 'N' -> Optional.of(NEXT_DAY_TRADE);
            case 'R' -> Optional.of(SELLER);
            default -> Optional.empty();
        };
    }
}
