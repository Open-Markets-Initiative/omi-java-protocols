package omi.cboe.c1options.complex.pitch.v2_1_18.enums;

import java.util.Optional;

/**
 * Auction Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Complex Auction
     */
    COMPLEX_AUCTION('C', "Complex Auction"),

    /**
     * Complex Solicitation Auction
     */
    COMPLEX_SOLICITATION_AUCTION('S', "Complex Solicitation Auction"),

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
            case 'C' -> Optional.of(COMPLEX_AUCTION);
            case 'S' -> Optional.of(COMPLEX_SOLICITATION_AUCTION);
            case 'B' -> Optional.of(COMPLEX_AIM);
            case 'O' -> Optional.of(COA_ALL_OR_NONE);
            default -> Optional.empty();
        };
    }
}
