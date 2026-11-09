package omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.enums;

import java.util.Optional;

/**
 * Auction Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('C', "Closing Auction"),

    /**
     * Halt Auction
     */
    HALT_AUCTION('H', "Halt Auction"),

    /**
     * Ipo Auction
     */
    IPO_AUCTION('I', "Ipo Auction"),

    /**
     * Cboe Market Close
     */
    CBOE_MARKET_CLOSE('M', "Cboe Market Close"),

    /**
     * Volatility Auction
     */
    VOLATILITY_AUCTION('V', "Volatility Auction"),

    /**
     * Periodic Auction
     */
    PERIODIC_AUCTION('P', "Periodic Auction");

    private final char wire;

    private final String description;

    AuctionType(char wire, String description) {
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
    public static Optional<AuctionType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'C' -> Optional.of(CLOSING_AUCTION);
            case 'H' -> Optional.of(HALT_AUCTION);
            case 'I' -> Optional.of(IPO_AUCTION);
            case 'M' -> Optional.of(CBOE_MARKET_CLOSE);
            case 'V' -> Optional.of(VOLATILITY_AUCTION);
            case 'P' -> Optional.of(PERIODIC_AUCTION);
            default -> Optional.empty();
        };
    }
}
