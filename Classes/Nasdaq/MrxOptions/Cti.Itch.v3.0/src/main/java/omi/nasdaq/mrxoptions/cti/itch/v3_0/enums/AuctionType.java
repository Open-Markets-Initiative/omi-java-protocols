package omi.nasdaq.mrxoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * Auction Type for trades resulting from an auction. Blank for Manual Trades.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Simple Order PIXL/PRISM/PIM
     */
    SIMPLE_ORDER_PIXL_PRISM_PIM('P', "Simple Order PIXL/PRISM/PIM"),

    /**
     * Complex Order PIXL/PIM
     */
    COMPLEX_ORDER_PIXL_PIM('Q', "Complex Order PIXL/PIM"),

    /**
     * Opening
     */
    OPENING('O', "Opening"),

    /**
     * Complex Order Live Auction (COLA)/ISE Exposure Auction (CAO)
     */
    COMPLEX_ORDER_LIVE_AUCTION('C', "Complex Order Live Auction (COLA)/ISE Exposure Auction (CAO)"),

    /**
     * Simple Order Solicitation
     */
    SIMPLE_ORDER_SOLICITATION('S', "Simple Order Solicitation"),

    /**
     * Complex Order Solicitation
     */
    COMPLEX_ORDER_SOLICITATION('R', "Complex Order Solicitation"),

    /**
     * Simple Facilitation
     */
    SIMPLE_FACILITATION('F', "Simple Facilitation"),

    /**
     * Complex Facilitation
     */
    COMPLEX_FACILITATION('G', "Complex Facilitation"),

    /**
     * Block
     */
    BLOCK('B', "Block"),

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
            case 'P' -> Optional.of(SIMPLE_ORDER_PIXL_PRISM_PIM);
            case 'Q' -> Optional.of(COMPLEX_ORDER_PIXL_PIM);
            case 'O' -> Optional.of(OPENING);
            case 'C' -> Optional.of(COMPLEX_ORDER_LIVE_AUCTION);
            case 'S' -> Optional.of(SIMPLE_ORDER_SOLICITATION);
            case 'R' -> Optional.of(COMPLEX_ORDER_SOLICITATION);
            case 'F' -> Optional.of(SIMPLE_FACILITATION);
            case 'G' -> Optional.of(COMPLEX_FACILITATION);
            case 'B' -> Optional.of(BLOCK);
            case ' ' -> Optional.of(NO_AUCTION);
            default -> Optional.empty();
        };
    }
}
