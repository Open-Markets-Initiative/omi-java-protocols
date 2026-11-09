package omi.eurex.t7.eti.fbe.v10_0.enums;

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
     * Decryption problem
     */
    DECRYPTIONPROBLEM(0x7L, "Decryption problem"),

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
     * Throttle limit exceeded
     */
    THROTTLE_LIMIT_EXCEEDED(0x64L, "Throttle limit exceeded"),

    /**
     * Stale request was not forwarded to T7
     */
    EXPOSURE_LIMIT_EXCEEDED(0x65L, "Stale request was not forwarded to T7"),

    /**
     * Service temporarily not available
     */
    SERVICE_TEMPORARILY_NOT_AVAILABLE(0x66L, "Service temporarily not available"),

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
     * User already logged in
     */
    USER_ALREADY_LOGGED_IN(0xD3L, "User already logged in"),

    /**
     * Gateway is standby
     */
    GATEWAY_IS_STANDBY(0xD8L, "Gateway is standby"),

    /**
     * Session login limit (per time interval) reached
     */
    SESSION_LOGIN_LIMIT_REACHED(0xD9L, "Session login limit (per time interval) reached"),

    /**
     * User Entitlement Data time out
     */
    USER_ENTITLEMENT_DATA_TIMEOUT(0xDFL, "User Entitlement Data time out"),

    /**
     * Session limit reached (per PS Gateway and Business Unit)
     */
    PS_GATEWAY_SESSION_LIMIT_REACHED(0xE0L, "Session limit reached (per PS Gateway and Business Unit)"),

    /**
     * User login tries limit (per time interval) reached
     */
    USER_LOGIN_LIMIT_REACHED(0xE1L, "User login tries limit (per time interval) reached"),

    /**
     * Limit of outstanding session/user logins reached (per Business Unit)
     */
    OUTSTANDING_LOGINS_BU_LIMIT_REACHED(0xE2L, "Limit of outstanding session/user logins reached (per Business Unit)"),

    /**
     * Limit of outstanding session/user logins reached (per Session)
     */
    OUTSTANDING_LOGINS_SESSION_LIMIT_REACHED(0xE3L, "Limit of outstanding session/user logins reached (per Session)"),

    /**
     * Order not found
     */
    ORDER_NOT_FOUND(0x2710L, "Order not found"),

    /**
     * Price not reasonable
     */
    PRICE_NOT_REASONABLE(0x2711L, "Price not reasonable"),

    /**
     * Duplicate Order (ClOrdID)
     */
    CLIENT_ORDER_ID_NOT_UNIQUE(0x2712L, "Duplicate Order (ClOrdID)"),

    /**
     * another quote activation request is pending for the same Product / Instrument Type / SessionID
     */
    QUOTE_ACTIVATION_IN_PROGRESS(0x2713L, "another quote activation request is pending for the same Product / Instrument Type / SessionID"),

    /**
     * Stop buy price not reasonable
     */
    STOP_BID_PRICE_NOT_REASONABLE(0x2716L, "Stop buy price not reasonable"),

    /**
     * Stop sell price not reasonable
     */
    STOP_ASK_PRICE_NOT_REASONABLE(0x2717L, "Stop sell price not reasonable"),

    /**
     * GFD order is not executable on current business day
     */
    ORDER_NOT_EXECUTABLE_WITHIN_VALIDITY(0x2718L, "GFD order is not executable on current business day"),

    /**
     * Throttle limit for creation of complex instrument exceeded
     */
    CREATE_CI_THROTTLE_EXCEEDED(0x271AL, "Throttle limit for creation of complex instrument exceeded"),

    /**
     * Order maintenance not allowed in current state
     */
    TRANSACTION_NOT_ALLOWED_IN_CURRENT_STATE(0x271BL, "Order maintenance not allowed in current state"),

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
        if (wire == 100L) {
            return Optional.of(THROTTLE_LIMIT_EXCEEDED);
        }
        if (wire == 101L) {
            return Optional.of(EXPOSURE_LIMIT_EXCEEDED);
        }
        if (wire == 102L) {
            return Optional.of(SERVICE_TEMPORARILY_NOT_AVAILABLE);
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
        if (wire == 211L) {
            return Optional.of(USER_ALREADY_LOGGED_IN);
        }
        if (wire == 216L) {
            return Optional.of(GATEWAY_IS_STANDBY);
        }
        if (wire == 217L) {
            return Optional.of(SESSION_LOGIN_LIMIT_REACHED);
        }
        if (wire == 223L) {
            return Optional.of(USER_ENTITLEMENT_DATA_TIMEOUT);
        }
        if (wire == 224L) {
            return Optional.of(PS_GATEWAY_SESSION_LIMIT_REACHED);
        }
        if (wire == 225L) {
            return Optional.of(USER_LOGIN_LIMIT_REACHED);
        }
        if (wire == 226L) {
            return Optional.of(OUTSTANDING_LOGINS_BU_LIMIT_REACHED);
        }
        if (wire == 227L) {
            return Optional.of(OUTSTANDING_LOGINS_SESSION_LIMIT_REACHED);
        }
        if (wire == 10000L) {
            return Optional.of(ORDER_NOT_FOUND);
        }
        if (wire == 10001L) {
            return Optional.of(PRICE_NOT_REASONABLE);
        }
        if (wire == 10002L) {
            return Optional.of(CLIENT_ORDER_ID_NOT_UNIQUE);
        }
        if (wire == 10003L) {
            return Optional.of(QUOTE_ACTIVATION_IN_PROGRESS);
        }
        if (wire == 10006L) {
            return Optional.of(STOP_BID_PRICE_NOT_REASONABLE);
        }
        if (wire == 10007L) {
            return Optional.of(STOP_ASK_PRICE_NOT_REASONABLE);
        }
        if (wire == 10008L) {
            return Optional.of(ORDER_NOT_EXECUTABLE_WITHIN_VALIDITY);
        }
        if (wire == 10010L) {
            return Optional.of(CREATE_CI_THROTTLE_EXCEEDED);
        }
        if (wire == 10011L) {
            return Optional.of(TRANSACTION_NOT_ALLOWED_IN_CURRENT_STATE);
        }
        if (wire == 4294967295L) {
            return Optional.of(NO_VALUE);
        }
        return Optional.empty();
    }
}
