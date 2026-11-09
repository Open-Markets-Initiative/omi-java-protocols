package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.enums;

import java.util.Optional;

/**
 * The side(s) where Retail Price Improvement orders (RPI orders) exist.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RpiIndicator {

    /**
     * No retail interest
     */
    NO_RETAIL_INTEREST(' ', "No retail interest"),

    /**
     * Retail interest on the bid side
     */
    RETAIL_INTEREST_ON_THE_BID_SIDE('A', "Retail interest on the bid side"),

    /**
     * Retail interest on the offer side
     */
    RETAIL_INTEREST_ON_THE_OFFER_SIDE('B', "Retail interest on the offer side"),

    /**
     * Retail interest on the bid and offer sides
     */
    RETAIL_INTEREST_ON_THE_BID_AND_OFFER_SIDES('C', "Retail interest on the bid and offer sides");

    private final char wire;

    private final String description;

    RpiIndicator(char wire, String description) {
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
    public static Optional<RpiIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_RETAIL_INTEREST);
            case 'A' -> Optional.of(RETAIL_INTEREST_ON_THE_BID_SIDE);
            case 'B' -> Optional.of(RETAIL_INTEREST_ON_THE_OFFER_SIDE);
            case 'C' -> Optional.of(RETAIL_INTEREST_ON_THE_BID_AND_OFFER_SIDES);
            default -> Optional.empty();
        };
    }
}
