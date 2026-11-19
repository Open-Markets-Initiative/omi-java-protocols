package omi.nasdaq.mrxoptions.orderfeed.itch.v2_1.enums;

import java.util.Optional;

/**
 * Auction Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Block Auction
     */
    BLOCK_AUCTION('B', "Block Auction"),

    /**
     * Opening
     */
    OPENING('O', "Opening"),

    /**
     * Reopening
     */
    REOPENING('R', "Reopening"),

    /**
     * Order Exposure
     */
    ORDER_EXPOSURE('I', "Order Exposure"),

    /**
     * Price Improvement Auction
     */
    PRICE_IMPROVEMENT_AUCTION('P', "Price Improvement Auction"),

    /**
     * Facilitation
     */
    FACILITATION('C', "Facilitation"),

    /**
     * Solicitation
     */
    SOLICITATION('S', "Solicitation"),

    /**
     * Flex Auction
     */
    FLEX_AUCTION('X', "Flex Auction");

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
            case 'B' -> Optional.of(BLOCK_AUCTION);
            case 'O' -> Optional.of(OPENING);
            case 'R' -> Optional.of(REOPENING);
            case 'I' -> Optional.of(ORDER_EXPOSURE);
            case 'P' -> Optional.of(PRICE_IMPROVEMENT_AUCTION);
            case 'C' -> Optional.of(FACILITATION);
            case 'S' -> Optional.of(SOLICITATION);
            case 'X' -> Optional.of(FLEX_AUCTION);
            default -> Optional.empty();
        };
    }
}
