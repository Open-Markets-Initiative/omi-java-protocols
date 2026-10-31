package omi.nasdaq.nsmequities.qbbo.itch.v2_1.enums;

import java.util.Optional;

/**
 * Indicates if the Nasdaq security is set up for IPO release.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IpoFlag {

    /**
     * Nasdaq listed instrument is set up as a new IPO security
     */
    IPO_SECURITY('Y', "Nasdaq listed instrument is set up as a new IPO security"),

    /**
     * Nasdaq listed instrument is not set up as a new IPO security
     */
    NOT_IPO_SECURITY('N', "Nasdaq listed instrument is not set up as a new IPO security"),

    /**
     * Nasdaq listed instrument is a non-IPO new listed security
     */
    NON_IPO_NEW_LISTED_SECURITY('Z', "Nasdaq listed instrument is a non-IPO new listed security"),

    /**
     * Not available
     */
    NOT_AVAILABLE(' ', "Not available");

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
            case 'Y' -> Optional.of(IPO_SECURITY);
            case 'N' -> Optional.of(NOT_IPO_SECURITY);
            case 'Z' -> Optional.of(NON_IPO_NEW_LISTED_SECURITY);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
