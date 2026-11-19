package omi.cboe.edgxoptions.multicastdepthofbook.spin.v2_41_66.enums;

import java.util.Optional;

/**
 * G = GTH Opening (C1 Only), O = RTH Opening (C1 Only), H = Halt Re-Opening, V = Volatility Opening.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Opening Auction C 1 Only
     */
    OPENING_AUCTION_C1_ONLY('O', "Opening Auction C 1 Only"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION('C', "Closing Auction"),

    /**
     * Gth Opening C 1 Only
     */
    GTH_OPENING_C1_ONLY('G', "Gth Opening C 1 Only"),

    /**
     * Halt Auction Or Halt Re Opening
     */
    HALT_AUCTION_OR_HALT_RE_OPENING('H', "Halt Auction Or Halt Re Opening"),

    /**
     * Ipo Auction
     */
    IPO_AUCTION('I', "Ipo Auction"),

    /**
     * Cboe Market Close
     */
    CBOE_MARKET_CLOSE('M', "Cboe Market Close"),

    /**
     * Volatility Auction Or Volatility Opening
     */
    VOLATILITY_AUCTION_OR_VOLATILITY_OPENING('V', "Volatility Auction Or Volatility Opening"),

    /**
     * Periodic Auction Byx Only
     */
    PERIODIC_AUCTION_BYX_ONLY('P', "Periodic Auction Byx Only"),

    /**
     * Bats Auction Mechanism Bam Edgx Only Or Aim C 1 Only
     */
    BATS_AUCTION_MECHANISM_BAM_EDGX_ONLY_OR_AIM_C1_ONLY('B', "Bats Auction Mechanism Bam Edgx Only Or Aim C 1 Only"),

    /**
     * Solicitation Auction Mechanism C 1 Only
     */
    SOLICITATION_AUCTION_MECHANISM_C1_ONLY('S', "Solicitation Auction Mechanism C 1 Only"),

    /**
     * Step Up Mechanism Sum
     */
    STEP_UP_MECHANISM_SUM('T', "Step Up Mechanism Sum"),

    /**
     * Sum All Or None
     */
    SUM_ALL_OR_NONE('A', "Sum All Or None");

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
            case 'O' -> Optional.of(OPENING_AUCTION_C1_ONLY);
            case 'C' -> Optional.of(CLOSING_AUCTION);
            case 'G' -> Optional.of(GTH_OPENING_C1_ONLY);
            case 'H' -> Optional.of(HALT_AUCTION_OR_HALT_RE_OPENING);
            case 'I' -> Optional.of(IPO_AUCTION);
            case 'M' -> Optional.of(CBOE_MARKET_CLOSE);
            case 'V' -> Optional.of(VOLATILITY_AUCTION_OR_VOLATILITY_OPENING);
            case 'P' -> Optional.of(PERIODIC_AUCTION_BYX_ONLY);
            case 'B' -> Optional.of(BATS_AUCTION_MECHANISM_BAM_EDGX_ONLY_OR_AIM_C1_ONLY);
            case 'S' -> Optional.of(SOLICITATION_AUCTION_MECHANISM_C1_ONLY);
            case 'T' -> Optional.of(STEP_UP_MECHANISM_SUM);
            case 'A' -> Optional.of(SUM_ALL_OR_NONE);
            default -> Optional.empty();
        };
    }
}
