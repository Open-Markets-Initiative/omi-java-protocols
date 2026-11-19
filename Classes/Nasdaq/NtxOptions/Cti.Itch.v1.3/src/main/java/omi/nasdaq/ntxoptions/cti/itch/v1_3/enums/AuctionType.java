package omi.nasdaq.ntxoptions.cti.itch.v1_3.enums;

import java.util.Optional;

/**
 * Auction Type for trades resulting from an auction. Blank for Manual Trades, Trade Corrections and Cancels.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Simple Order PIXL/PRISM
     */
    SIMPLE_ORDER_PIXL_PRISM('P', "Simple Order PIXL/PRISM"),

    /**
     * Opening
     */
    OPENING('O', "Opening"),

    /**
     * Market Exhaust
     */
    MARKET_EXHAUST('E', "Market Exhaust"),

    /**
     * No Auction
     */
    NO_AUCTION(' ', "No Auction");

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
            case 'P' -> Optional.of(SIMPLE_ORDER_PIXL_PRISM);
            case 'O' -> Optional.of(OPENING);
            case 'E' -> Optional.of(MARKET_EXHAUST);
            case ' ' -> Optional.of(NO_AUCTION);
            default -> Optional.empty();
        };
    }
}
