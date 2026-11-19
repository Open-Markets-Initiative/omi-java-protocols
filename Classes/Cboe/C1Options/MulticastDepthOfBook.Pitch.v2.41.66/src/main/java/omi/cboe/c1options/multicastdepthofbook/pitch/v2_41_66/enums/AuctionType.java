package omi.cboe.c1options.multicastdepthofbook.pitch.v2_41_66.enums;

import java.util.Optional;

/**
 * G = GTH Opening (C1 Only), O = RTH Opening (C1 Only), H = Halt Re-Opening, V = Volatility Opening.
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
     * Gth Opening
     */
    GTH_OPENING('G', "Gth Opening"),

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
     * Volitility Auction
     */
    VOLITILITY_AUCTION('V', "Volitility Auction"),

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
            case 'G' -> Optional.of(GTH_OPENING);
            case 'H' -> Optional.of(HALT_AUCTION);
            case 'I' -> Optional.of(IPO_AUCTION);
            case 'M' -> Optional.of(CBOE_MARKET_CLOSE);
            case 'V' -> Optional.of(VOLITILITY_AUCTION);
            case 'P' -> Optional.of(PERIODIC_AUCTION);
            default -> Optional.empty();
        };
    }
}
