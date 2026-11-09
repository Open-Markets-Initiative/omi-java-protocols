package omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.enums;

import java.util.Optional;

/**
 * Auction type value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Opening Auction
     */
    OPENING('O', "Opening Auction"),

    /**
     * Closing Auction
     */
    CLOSING('C', "Closing Auction"),

    /**
     * Halt Auction
     */
    HALT('H', "Halt Auction"),

    /**
     * IPO Auction
     */
    IPO('I', "IPO Auction"),

    /**
     * Cboe Market Close
     */
    CLOSE('M', "Cboe Market Close"),

    /**
     * Step-Up Mechanism
     */
    SUM('T', "Step-Up Mechanism"),

    /**
     * Bats Auction Mechanism
     */
    BAM('B', "Bats Auction Mechanism");

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
            case 'O' -> Optional.of(OPENING);
            case 'C' -> Optional.of(CLOSING);
            case 'H' -> Optional.of(HALT);
            case 'I' -> Optional.of(IPO);
            case 'M' -> Optional.of(CLOSE);
            case 'T' -> Optional.of(SUM);
            case 'B' -> Optional.of(BAM);
            default -> Optional.empty();
        };
    }
}
