package omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.enums;

import java.util.Optional;

/**
 * AuctionType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Unknown
     */
    UNKNOWN(' ', "Unknown"),

    /**
     * Opening
     */
    OPENING('O', "Opening"),

    /**
     * Closing
     */
    CLOSING('C', "Closing"),

    /**
     * Halt
     */
    HALT('H', "Halt"),

    /**
     * IPO
     */
    IPO('I', "IPO"),

    /**
     * Pause
     */
    PAUSE('P', "Pause");

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
            case ' ' -> Optional.of(UNKNOWN);
            case 'O' -> Optional.of(OPENING);
            case 'C' -> Optional.of(CLOSING);
            case 'H' -> Optional.of(HALT);
            case 'I' -> Optional.of(IPO);
            case 'P' -> Optional.of(PAUSE);
            default -> Optional.empty();
        };
    }
}
