package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Auction type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AuctionOrigin {

    /**
     * No Auction
     */
    NO_AUCTION((short) 0, "No Auction"),

    /**
     * Manual Auction
     */
    MANUAL_AUCTION((short) 100, "Manual Auction"),

    /**
     * Opening Auction Is Extended
     */
    OPENING_AUCTION_IS_EXTENDED((short) 101, "Opening Auction Is Extended"),

    /**
     * Closing Auction Is Extended
     */
    CLOSING_AUCTION_IS_EXTENDED((short) 102, "Closing Auction Is Extended"),

    /**
     * Volatility Auction
     */
    VOLATILITY_AUCTION((short) 103, "Volatility Auction"),

    /**
     * Other
     */
    OTHER((short) 200, "Other");

    private final short wire;

    private final String description;

    AuctionOrigin(short wire, String description) {
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
    public static Optional<AuctionOrigin> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_AUCTION);
            case 100 -> Optional.of(MANUAL_AUCTION);
            case 101 -> Optional.of(OPENING_AUCTION_IS_EXTENDED);
            case 102 -> Optional.of(CLOSING_AUCTION_IS_EXTENDED);
            case 103 -> Optional.of(VOLATILITY_AUCTION);
            case 200 -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
