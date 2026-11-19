package omi.nasdaq.iseoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * See Auction Type Field
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Block Order Auction
     */
    BLOCK_ORDER_AUCTION('B', "Block Order Auction"),

    /**
     * Complex Exposure Auction
     */
    COMPLEX_EXPOSURE_AUCTION('E', "Complex Exposure Auction"),

    /**
     * Simple Exposure Order
     */
    SIMPLE_EXPOSURE_ORDER('F', "Simple Exposure Order"),

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Flex Auction
     */
    FLEX_AUCTION('X', "Flex Auction"),

    /**
     * PIM/PIXL Auction
     */
    PIM_PIXL_AUCTION('P', "PIM/PIXL Auction"),

    /**
     * Facilitation Auction
     */
    FACILITATION_AUCTION('H', "Facilitation Auction"),

    /**
     * Solicitation Auction
     */
    SOLICITATION_AUCTION('S', "Solicitation Auction"),

    /**
     * Order is neither an initiation nor a response to an Auction
     */
    NONE('N', "Order is neither an initiation nor a response to an Auction");

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
            case 'B' -> Optional.of(BLOCK_ORDER_AUCTION);
            case 'E' -> Optional.of(COMPLEX_EXPOSURE_AUCTION);
            case 'F' -> Optional.of(SIMPLE_EXPOSURE_ORDER);
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'X' -> Optional.of(FLEX_AUCTION);
            case 'P' -> Optional.of(PIM_PIXL_AUCTION);
            case 'H' -> Optional.of(FACILITATION_AUCTION);
            case 'S' -> Optional.of(SOLICITATION_AUCTION);
            case 'N' -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
