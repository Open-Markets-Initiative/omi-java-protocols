package omi.nyse.nyseequities.integratedfeed.xdp.v2_1_g.enums;

import java.util.Optional;

/**
 * The side(s) where Retail Price Improvement orders (RPI orders) exist.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RpiIndicator {

    /**
     * Space means no retail interest (default)
     */
    NO_RETAIL_INTEREST(' ', "Space means no retail interest (default)"),

    /**
     * Retail interest on the bid side
     */
    INTEREST_ON_BID('A', "Retail interest on the bid side"),

    /**
     * Retail interest on the offer side
     */
    INTEREST_ON_OFFER('B', "Retail interest on the offer side"),

    /**
     * Retail interest on the bid and offer sides
     */
    INTEREST_ON_BID_AND_OFFER('C', "Retail interest on the bid and offer sides");

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
            case 'A' -> Optional.of(INTEREST_ON_BID);
            case 'B' -> Optional.of(INTEREST_ON_OFFER);
            case 'C' -> Optional.of(INTEREST_ON_BID_AND_OFFER);
            default -> Optional.empty();
        };
    }
}
