package omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.enums;

import java.util.Optional;

/**
 * &lt;space&gt; = Ignored; exceeds 1 reset per 100 milliseconds
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RiskResetResult {

    /**
     * Ignored
     */
    IGNORED(' ', "Ignored"),

    /**
     * Rejected Exceeds Custom Group Id Limit
     */
    REJECTED_EXCEEDS_CUSTOM_GROUP_ID_LIMIT('C', "Rejected Exceeds Custom Group Id Limit"),

    /**
     * Rejected Automatic Risk Resets Are Disabled
     */
    REJECTED_AUTOMATIC_RISK_RESETS_ARE_DISABLED('D', "Rejected Automatic Risk Resets Are Disabled"),

    /**
     * Rejected Empty Reset Risk Field
     */
    REJECTED_EMPTY_RESET_RISK_FIELD('E', "Rejected Empty Reset Risk Field"),

    /**
     * Rejected Exceeds Firm Reset Limit
     */
    REJECTED_EXCEEDS_FIRM_RESET_LIMIT('F', "Rejected Exceeds Firm Reset Limit"),

    /**
     * Rejected Incorrect Data Center
     */
    REJECTED_INCORRECT_DATA_CENTER('I', "Rejected Incorrect Data Center"),

    /**
     * Rejected Invalid Matching Unit
     */
    REJECTED_INVALID_MATCHING_UNIT('M', "Rejected Invalid Matching Unit"),

    /**
     * Rejected Exceeds Risk Root Reset Limit
     */
    REJECTED_EXCEEDS_RISK_ROOT_RESET_LIMIT('S', "Rejected Exceeds Risk Root Reset Limit"),

    /**
     * Rejected Invalid Risk Root
     */
    REJECTED_INVALID_RISK_ROOT('U', "Rejected Invalid Risk Root"),

    /**
     * Success
     */
    SUCCESS('Y', "Success"),

    /**
     * Rejected Invalid Efid Clearing Firm
     */
    REJECTED_INVALID_EFID_CLEARING_FIRM('c', "Rejected Invalid Efid Clearing Firm"),

    /**
     * Rejected In Replay
     */
    REJECTED_IN_REPLAY('y', "Rejected In Replay");

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
            case 'C' -> Optional.of(REJECTED_EXCEEDS_CUSTOM_GROUP_ID_LIMIT);
            case 'D' -> Optional.of(REJECTED_AUTOMATIC_RISK_RESETS_ARE_DISABLED);
            case 'E' -> Optional.of(REJECTED_EMPTY_RESET_RISK_FIELD);
            case 'F' -> Optional.of(REJECTED_EXCEEDS_FIRM_RESET_LIMIT);
            case 'I' -> Optional.of(REJECTED_INCORRECT_DATA_CENTER);
            case 'M' -> Optional.of(REJECTED_INVALID_MATCHING_UNIT);
            case 'S' -> Optional.of(REJECTED_EXCEEDS_RISK_ROOT_RESET_LIMIT);
            case 'U' -> Optional.of(REJECTED_INVALID_RISK_ROOT);
            case 'Y' -> Optional.of(SUCCESS);
            case 'c' -> Optional.of(REJECTED_INVALID_EFID_CLEARING_FIRM);
            case 'y' -> Optional.of(REJECTED_IN_REPLAY);
            default -> Optional.empty();
        };
    }
}
