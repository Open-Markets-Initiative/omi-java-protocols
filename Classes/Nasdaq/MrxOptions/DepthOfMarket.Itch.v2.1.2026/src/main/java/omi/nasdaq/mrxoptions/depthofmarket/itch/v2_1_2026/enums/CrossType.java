package omi.nasdaq.mrxoptions.depthofmarket.itch.v2_1_2026.enums;

import java.util.Optional;

/**
 * Cross Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Block Auction
     */
    BLOCK_AUCTION('B', "Block Auction"),

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Re-Opening Auction
     */
    RE_OPENING_AUCTION('R', "Re-Opening Auction"),

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
    FLEX_AUCTION('X', "Flex Auction"),

    /**
     * None
     */
    NONE('N', "None"),

    /**
     * Complex Exposure Auction
     */
    COMPLEX_EXPOSURE_AUCTION('E', "Complex Exposure Auction");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BLOCK_AUCTION);
            case 'O' -> Optional.of(OPENING_AUCTION);
            case 'R' -> Optional.of(RE_OPENING_AUCTION);
            case 'P' -> Optional.of(PRICE_IMPROVEMENT_AUCTION);
            case 'C' -> Optional.of(FACILITATION);
            case 'S' -> Optional.of(SOLICITATION);
            case 'X' -> Optional.of(FLEX_AUCTION);
            case 'N' -> Optional.of(NONE);
            case 'E' -> Optional.of(COMPLEX_EXPOSURE_AUCTION);
            default -> Optional.empty();
        };
    }
}
