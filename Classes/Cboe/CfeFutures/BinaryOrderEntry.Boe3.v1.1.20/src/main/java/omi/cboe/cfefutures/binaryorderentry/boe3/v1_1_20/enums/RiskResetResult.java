package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Result of risk rest
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RiskResetResult {

    /**
     * Ignored
     */
    IGNORED(' ', "Ignored"),

    /**
     * Success
     */
    SUCCESS('Y', "Success"),

    /**
     * Rejected Exceeds Firm Reset Limit
     */
    REJECTED_EXCEEDS_FIRM_RESET_LIMIT('F', "Rejected Exceeds Firm Reset Limit"),

    /**
     * Rejected Exceeds Custom Group Id
     */
    REJECTED_EXCEEDS_CUSTOM_GROUP_ID('C', "Rejected Exceeds Custom Group Id"),

    /**
     * Rejected Empty Reset Risk Field
     */
    REJECTED_EMPTY_RESET_RISK_FIELD('E', "Rejected Empty Reset Risk Field"),

    /**
     * Rejected Incorrect Data Center
     */
    REJECTED_INCORRECT_DATA_CENTER('I', "Rejected Incorrect Data Center"),

    /**
     * Rejected Exceeds Product Level Reset
     */
    REJECTED_EXCEEDS_PRODUCT_LEVEL_RESET('S', "Rejected Exceeds Product Level Reset"),

    /**
     * Rejected Invalid Risk Root
     */
    REJECTED_INVALID_RISK_ROOT('U', "Rejected Invalid Risk Root"),

    /**
     * Rejected Invalid Efid Clearing Firm
     */
    REJECTED_INVALID_EFID_CLEARING_FIRM('c', "Rejected Invalid Efid Clearing Firm"),

    /**
     * Rejected In Replay
     */
    REJECTED_IN_REPLAY('y', "Rejected In Replay"),

    /**
     * Custom Group Id Lockout Reset
     */
    CUSTOM_GROUP_ID_LOCKOUT_RESET('D', "Custom Group Id Lockout Reset");

    private final char wire;

    private final String description;

    RiskResetResult(char wire, String description) {
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
    public static Optional<RiskResetResult> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(IGNORED);
            case 'Y' -> Optional.of(SUCCESS);
            case 'F' -> Optional.of(REJECTED_EXCEEDS_FIRM_RESET_LIMIT);
            case 'C' -> Optional.of(REJECTED_EXCEEDS_CUSTOM_GROUP_ID);
            case 'E' -> Optional.of(REJECTED_EMPTY_RESET_RISK_FIELD);
            case 'I' -> Optional.of(REJECTED_INCORRECT_DATA_CENTER);
            case 'S' -> Optional.of(REJECTED_EXCEEDS_PRODUCT_LEVEL_RESET);
            case 'U' -> Optional.of(REJECTED_INVALID_RISK_ROOT);
            case 'c' -> Optional.of(REJECTED_INVALID_EFID_CLEARING_FIRM);
            case 'y' -> Optional.of(REJECTED_IN_REPLAY);
            case 'D' -> Optional.of(CUSTOM_GROUP_ID_LOCKOUT_RESET);
            default -> Optional.empty();
        };
    }
}
