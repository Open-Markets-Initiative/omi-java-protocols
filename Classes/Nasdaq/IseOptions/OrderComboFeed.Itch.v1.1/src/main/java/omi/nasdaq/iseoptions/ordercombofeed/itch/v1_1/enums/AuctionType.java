package omi.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

import java.util.Optional;

/**
 * ‘E’ = Exposure ‘C’ = Facilitation ‘S’ = Solicitation ‘P’ = PIM
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionType {

    /**
     * Exposure
     */
    EXPOSURE('E', "Exposure"),

    /**
     * Facilitation
     */
    FACILITATION('C', "Facilitation"),

    /**
     * Solicitation
     */
    SOLICITATION('S', "Solicitation"),

    /**
     * PIM
     */
    PIM('P', "PIM");

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
            case 'E' -> Optional.of(EXPOSURE);
            case 'C' -> Optional.of(FACILITATION);
            case 'S' -> Optional.of(SOLICITATION);
            case 'P' -> Optional.of(PIM);
            default -> Optional.empty();
        };
    }
}
