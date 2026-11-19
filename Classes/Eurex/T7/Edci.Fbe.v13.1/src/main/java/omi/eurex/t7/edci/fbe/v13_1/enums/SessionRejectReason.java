package omi.eurex.t7.edci.fbe.v13_1.enums;

import java.util.Optional;

/**
 * Defines the SessionRejectReason values.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum SessionRejectReason {

    /**
     * Required Tag Missing
     */
    REQUIRED_TAG_MISSING(0x1L, "Required Tag Missing"),

    /**
     * Value is incorrect (out of range) for this tag
     */
    VALUEISINCORRECT(0x5L, "Value is incorrect (out of range) for this tag"),

    /**
     * Decoding problem
     */
    DECRYPTIONPROBLEM(0x7L, "Decoding problem"),

    /**
     * Invalid TemplateID
     */
    INVALID_MSG_ID(0xBL, "Invalid TemplateID"),

    /**
     * Incorrect NumInGroup count for repeating group
     */
    INCORRECT_NUM_IN_GROUPCOUNT(0x10L, "Incorrect NumInGroup count for repeating group"),

    /**
     * Other
     */
    OTHER(0x63L, "Other"),

    /**
     * Stale request was not forwarded to T7
     */
    EXPOSURE_LIMIT_EXCEEDED(0x65L, "Stale request was not forwarded to T7"),

    /**
     * Service not available
     */
    SERVICE_NOT_AVAILABLE(0x67L, "Service not available"),

    /**
     * Error converting response or broadcast
     */
    OUTBOUNDCONVERSIONERROR(0x69L, "Error converting response or broadcast"),

    /**
     * Heartbeat violation error
     */
    HEARTBEAT_VIOLATION(0x98L, "Heartbeat violation error"),

    /**
     * Internal technical error
     */
    INTERNALTECHNICALERROR(0xC8L, "Internal technical error"),

    /**
     * Validation Error
     */
    VALIDATION_ERROR(0xD2L, "Validation Error"),

    /**
     * Session login limit (per time interval) reached
     */
    SESSION_LOGIN_LIMIT_REACHED(0xD9L, "Session login limit (per time interval) reached"),

    /**
     * Limit of outstanding session/user logins reached (per Business Unit)
     */
    OUTSTANDING_LOGINS_BU_LIMIT_REACHED(0xE2L, "Limit of outstanding session/user logins reached (per Business Unit)"),

    /**
     * Limit of outstanding session/user logins reached (per Session)
     */
    OUTSTANDING_LOGINS_SESSION_LIMIT_REACHED(0xE3L, "Limit of outstanding session/user logins reached (per Session)"),

    /**
     * No Value
     */
    NO_VALUE(0xFFFFFFFFL, "No Value");

    private final long wire;

    private final String description;

    SessionRejectReason(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<SessionRejectReason> fromWire(long wire) {
        if (wire == 1L) {
            return Optional.of(REQUIRED_TAG_MISSING);
        }
        if (wire == 5L) {
            return Optional.of(VALUEISINCORRECT);
        }
        if (wire == 7L) {
            return Optional.of(DECRYPTIONPROBLEM);
        }
        if (wire == 11L) {
            return Optional.of(INVALID_MSG_ID);
        }
        if (wire == 16L) {
            return Optional.of(INCORRECT_NUM_IN_GROUPCOUNT);
        }
        if (wire == 99L) {
            return Optional.of(OTHER);
        }
        if (wire == 101L) {
            return Optional.of(EXPOSURE_LIMIT_EXCEEDED);
        }
        if (wire == 103L) {
            return Optional.of(SERVICE_NOT_AVAILABLE);
        }
        if (wire == 105L) {
            return Optional.of(OUTBOUNDCONVERSIONERROR);
        }
        if (wire == 152L) {
            return Optional.of(HEARTBEAT_VIOLATION);
        }
        if (wire == 200L) {
            return Optional.of(INTERNALTECHNICALERROR);
        }
        if (wire == 210L) {
            return Optional.of(VALIDATION_ERROR);
        }
        if (wire == 217L) {
            return Optional.of(SESSION_LOGIN_LIMIT_REACHED);
        }
        if (wire == 226L) {
            return Optional.of(OUTSTANDING_LOGINS_BU_LIMIT_REACHED);
        }
        if (wire == 227L) {
            return Optional.of(OUTSTANDING_LOGINS_SESSION_LIMIT_REACHED);
        }
        if (wire == 4294967295L) {
            return Optional.of(NO_VALUE);
        }
        return Optional.empty();
    }
}
