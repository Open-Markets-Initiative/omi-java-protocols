package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Settlement Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Category1 {

    /**
     * Regular Settlement
     */
    REGULAR_SETTLEMENT(' ', "Regular Settlement"),

    /**
     * Cash Trade Same Day Clearing
     */
    CASH_TRADE_SAME_DAY_CLEARING('C', "Cash Trade Same Day Clearing"),

    /**
     * Reserved
     */
    RESERVED('N', "Reserved"),

    /**
     * Seller
     */
    SELLER('R', "Seller");

    private final char wire;

    private final String description;

    Category1(char wire, String description) {
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
    public static Optional<Category1> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR_SETTLEMENT);
            case 'C' -> Optional.of(CASH_TRADE_SAME_DAY_CLEARING);
            case 'N' -> Optional.of(RESERVED);
            case 'R' -> Optional.of(SELLER);
            default -> Optional.empty();
        };
    }
}
