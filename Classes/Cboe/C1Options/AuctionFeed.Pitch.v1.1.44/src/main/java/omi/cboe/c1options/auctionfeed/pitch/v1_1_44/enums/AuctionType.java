package omi.cboe.c1options.auctionfeed.pitch.v1_1_44.enums;

import java.util.Optional;

/**
 * B = AIM, S = Solicitation Auction Mechanism, T = Step Up Mechanism (SUM), A = SUM All or None.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Aim
     */
    AIM('B', "Aim"),

    /**
     * Solicitation Auction Mechanism
     */
    SOLICITATION_AUCTION_MECHANISM('S', "Solicitation Auction Mechanism"),

    /**
     * Step Up Mechanism Sum
     */
    STEP_UP_MECHANISM_SUM('T', "Step Up Mechanism Sum"),

    /**
     * Sum All Or None
     */
    SUM_ALL_OR_NONE('A', "Sum All Or None"),

    /**
     * Gth Opening
     */
    GTH_OPENING('G', "Gth Opening"),

    /**
     * Rth Opening
     */
    RTH_OPENING('O', "Rth Opening"),

    /**
     * Halt Re Opening
     */
    HALT_RE_OPENING('H', "Halt Re Opening"),

    /**
     * Volatility Opening
     */
    VOLATILITY_OPENING('V', "Volatility Opening");

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
            case 'B' -> Optional.of(AIM);
            case 'S' -> Optional.of(SOLICITATION_AUCTION_MECHANISM);
            case 'T' -> Optional.of(STEP_UP_MECHANISM_SUM);
            case 'A' -> Optional.of(SUM_ALL_OR_NONE);
            case 'G' -> Optional.of(GTH_OPENING);
            case 'O' -> Optional.of(RTH_OPENING);
            case 'H' -> Optional.of(HALT_RE_OPENING);
            case 'V' -> Optional.of(VOLATILITY_OPENING);
            default -> Optional.empty();
        };
    }
}
