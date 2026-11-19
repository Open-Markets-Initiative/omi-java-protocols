package omi.nasdaq.iseoptions.orderfeed.itch.v2_1.enums;

import java.util.Optional;

/**
 * Open Close Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenCloseIndicator {

    /**
     * Opens Position
     */
    OPENS_POSITION('O', "Opens Position"),

    /**
     * Closes Position
     */
    CLOSES_POSITION('C', "Closes Position"),

    /**
     * N/A
     */
    NA(' ', "N/A");

    private final char wire;

    private final String description;

    OpenCloseIndicator(char wire, String description) {
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
    public static Optional<OpenCloseIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPENS_POSITION);
            case 'C' -> Optional.of(CLOSES_POSITION);
            case ' ' -> Optional.of(NA);
            default -> Optional.empty();
        };
    }
}
