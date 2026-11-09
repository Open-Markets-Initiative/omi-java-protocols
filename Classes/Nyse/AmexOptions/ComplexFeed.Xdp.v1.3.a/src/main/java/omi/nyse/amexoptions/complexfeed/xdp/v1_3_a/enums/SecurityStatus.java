package omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * SecurityStatus value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityStatus {

    /**
     * Light up a dark series
     */
    LIGHT_UP_A_DARK_SERIES('L', "Light up a dark series"),

    /**
     * Open a dark series
     */
    OPEN_A_DARK_SERIES('N', "Open a dark series"),

    /**
     * Open indication
     */
    OPEN('O', "Open indication"),

    /**
     * Close indication
     */
    CLOSE('X', "Close indication"),

    /**
     * Halt
     */
    HALT('S', "Halt"),

    /**
     * Unhalt
     */
    UNHALT('U', "Unhalt"),

    /**
     * Unhalt a dark series
     */
    UNHALT_A_DARK_SERIES('T', "Unhalt a dark series"),

    /**
     * End of RFQ auction
     */
    END_OF_RFQ_AUCTION('Q', "End of RFQ auction");

    private final char wire;

    private final String description;

    SecurityStatus(char wire, String description) {
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
    public static Optional<SecurityStatus> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(LIGHT_UP_A_DARK_SERIES);
            case 'N' -> Optional.of(OPEN_A_DARK_SERIES);
            case 'O' -> Optional.of(OPEN);
            case 'X' -> Optional.of(CLOSE);
            case 'S' -> Optional.of(HALT);
            case 'U' -> Optional.of(UNHALT);
            case 'T' -> Optional.of(UNHALT_A_DARK_SERIES);
            case 'Q' -> Optional.of(END_OF_RFQ_AUCTION);
            default -> Optional.empty();
        };
    }
}
