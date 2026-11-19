package omi.cboe.c2options.complexauction.pitch.v2_2_41.enums;

import java.util.Optional;

/**
 * C = Complex Order Auction (COA) (or Stop Complex Order Auction (SCOA) effective TBD), S = Complex Solicitation Auction Mechanism, B = Complex AIM, O = COA All or None.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionNotificationAuctionType {

    /**
     * Complex Order Auction Coa Or Stop Complex Order Auction Scoa Effective Tbd
     */
    COMPLEX_ORDER_AUCTION_COA_OR_STOP_COMPLEX_ORDER_AUCTION_SCOA_EFFECTIVE_TBD('C', "Complex Order Auction Coa Or Stop Complex Order Auction Scoa Effective Tbd"),

    /**
     * Complex Solicitation Auction Mechanism
     */
    COMPLEX_SOLICITATION_AUCTION_MECHANISM('S', "Complex Solicitation Auction Mechanism"),

    /**
     * Complex Aim
     */
    COMPLEX_AIM('B', "Complex Aim"),

    /**
     * Coa All Or None
     */
    COA_ALL_OR_NONE('O', "Coa All Or None");

    private final char wire;

    private final String description;

    AuctionNotificationAuctionType(char wire, String description) {
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
    public static Optional<AuctionNotificationAuctionType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(COMPLEX_ORDER_AUCTION_COA_OR_STOP_COMPLEX_ORDER_AUCTION_SCOA_EFFECTIVE_TBD);
            case 'S' -> Optional.of(COMPLEX_SOLICITATION_AUCTION_MECHANISM);
            case 'B' -> Optional.of(COMPLEX_AIM);
            case 'O' -> Optional.of(COA_ALL_OR_NONE);
            default -> Optional.empty();
        };
    }
}
