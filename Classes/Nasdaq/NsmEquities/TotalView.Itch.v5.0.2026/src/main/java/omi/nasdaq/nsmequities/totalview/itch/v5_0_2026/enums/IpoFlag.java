package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.enums;

import java.util.Optional;

/**
 * Indicates if the NASDAQ security is set up for IPO release
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IpoFlag {

    /**
     * Nasdaq listed instrument is set up as a new IPO security
     */
    SET_UP_FOR_IPO_RELEASE('Y', "Nasdaq listed instrument is set up as a new IPO security"),

    /**
     * Nasdaq listed instrument is not set up as a new IPO security
     */
    NOT_SET_UP_FOR_IPO_RELEASE('N', "Nasdaq listed instrument is not set up as a new IPO security"),

    /**
     * Nasdaq listed instrument is a non-IPO new listed security
     */
    NON_IPO_NEW_LISTED_SECURITY('Z', "Nasdaq listed instrument is a non-IPO new listed security"),

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available");

    private final char wire;

    private final String description;

    IpoFlag(char wire, String description) {
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
    public static Optional<IpoFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(SET_UP_FOR_IPO_RELEASE);
            case 'N' -> Optional.of(NOT_SET_UP_FOR_IPO_RELEASE);
            case 'Z' -> Optional.of(NON_IPO_NEW_LISTED_SECURITY);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
