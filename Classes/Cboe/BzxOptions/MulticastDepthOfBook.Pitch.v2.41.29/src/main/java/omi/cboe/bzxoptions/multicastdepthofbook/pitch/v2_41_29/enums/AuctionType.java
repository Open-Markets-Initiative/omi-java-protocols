package omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_29.enums;

import java.util.Optional;

/**
 * Auction Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Halt Re Opening
     */
    HALT_RE_OPENING('H', "Halt Re Opening"),

    /**
     * Volatility Opening
     */
    VOLATILITY_OPENING('V', "Volatility Opening"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('C', "Closing Auction"),

    /**
     * Ipo Auction
     */
    IPO_AUCTION('I', "Ipo Auction"),

    /**
     * Cboe Market Close
     */
    CBOE_MARKET_CLOSE('M', "Cboe Market Close");

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
            case 'H' -> Optional.of(HALT_RE_OPENING);
            case 'V' -> Optional.of(VOLATILITY_OPENING);
            case 'C' -> Optional.of(CLOSING_AUCTION);
            case 'I' -> Optional.of(IPO_AUCTION);
            case 'M' -> Optional.of(CBOE_MARKET_CLOSE);
            default -> Optional.empty();
        };
    }
}
