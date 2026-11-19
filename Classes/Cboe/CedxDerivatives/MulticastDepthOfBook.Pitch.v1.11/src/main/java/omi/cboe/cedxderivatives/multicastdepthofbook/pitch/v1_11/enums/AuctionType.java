package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.enums;

import java.util.Optional;

/**
 * O = Regular Opening
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Opening Auction
     */
    OPENING_AUCTION('O', "Opening Auction"),

    /**
     * Aim
     */
    AIM('B', "Aim"),

    /**
     * C Rfq
     */
    C_RFQ('C', "C Rfq");

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
            case 'B' -> Optional.of(AIM);
            case 'C' -> Optional.of(C_RFQ);
            default -> Optional.empty();
        };
    }
}
