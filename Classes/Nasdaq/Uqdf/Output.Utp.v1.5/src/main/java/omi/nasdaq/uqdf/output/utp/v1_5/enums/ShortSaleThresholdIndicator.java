package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Short Sale Threshold Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSaleThresholdIndicator {

    /**
     * Issue is restricted
     */
    ISSUE_IS_RESTRICTED('Y', "Issue is restricted"),

    /**
     * Issue is not restricted
     */
    ISSUE_IS_NOT_RESTRICTED('N', "Issue is not restricted"),

    /**
     * not available
     */
    NOT_AVAILABLE(' ', "not available");

    private final char wire;

    private final String description;

    ShortSaleThresholdIndicator(char wire, String description) {
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
    public static Optional<ShortSaleThresholdIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(ISSUE_IS_RESTRICTED);
            case 'N' -> Optional.of(ISSUE_IS_NOT_RESTRICTED);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
