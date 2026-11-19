package omi.tmx.tsxalpha.level1.qrtmd.v2_1.enums;

import java.util.Optional;

/**
 * An indicator as to whether the trade occurred at the opening or was the first board lot trade of the day.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpeningTrade {

    /**
     * Yes
     */
    YES('Y', "Yes"),

    /**
     * Default
     */
    NO('N', "Default");

    private final char wire;

    private final String description;

    OpeningTrade(char wire, String description) {
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
    public static Optional<OpeningTrade> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
