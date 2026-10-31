package omi.nasdaq.psxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Indicates if the NASDAQ security is set up for IPO release. This field is intended to help NASDAQ market participant firms comply with FINRA Rule 5131(b).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IpoFlag {

    /**
     * Set up for IPO release
     */
    YES('Y', "Set up for IPO release"),

    /**
     * Not set up for IPO release
     */
    NO('N', "Not set up for IPO release"),

    /**
     * Not available
     */
    NA(' ', "Not available");

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
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            case ' ' -> Optional.of(NA);
            default -> Optional.empty();
        };
    }
}
