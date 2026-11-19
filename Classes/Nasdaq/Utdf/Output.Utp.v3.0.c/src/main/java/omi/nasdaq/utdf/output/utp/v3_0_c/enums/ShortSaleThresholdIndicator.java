package omi.nasdaq.utdf.output.utp.v3_0_c.enums;

import java.util.Optional;

/**
 * Short Sale Threshold Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSaleThresholdIndicator {

    /**
     * Issue Is Restricted Under Sec Rule 203 B 3
     */
    ISSUE_IS_RESTRICTED_UNDER_SEC_RULE_203B3('Y', "Issue Is Restricted Under Sec Rule 203 B 3"),

    /**
     * Issue Is Not Restricted
     */
    ISSUE_IS_NOT_RESTRICTED('N', "Issue Is Not Restricted"),

    /**
     * Threshold Indicator Not Available
     */
    THRESHOLD_INDICATOR_NOT_AVAILABLE(' ', "Threshold Indicator Not Available");

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
            case 'Y' -> Optional.of(ISSUE_IS_RESTRICTED_UNDER_SEC_RULE_203B3);
            case 'N' -> Optional.of(ISSUE_IS_NOT_RESTRICTED);
            case ' ' -> Optional.of(THRESHOLD_INDICATOR_NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
