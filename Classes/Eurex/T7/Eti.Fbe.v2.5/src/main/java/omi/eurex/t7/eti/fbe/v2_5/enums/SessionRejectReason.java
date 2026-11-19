package omi.eurex.t7.eti.fbe.v2_5.enums;

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
     * Exposure limit exceeded
     */
    EXPOSURE_LIMIT_EXCEEDED(0x65L, "Exposure limit exceeded"),

    /**
     * Service temporarily not available
     */
    SERVICE_TEMPORARILY_NOT_AVAILABLE(0x66L, "Service temporarily not available"),

    /**
     * Service not available
     */
    SERVICE_NOT_AVAILABLE(0x67L, "Service not available"),

    /**
     * Result of transaction unknown
     */
    RESULT_OF_TRANSACTION_UNKNOWN(0x68L, "Result of transaction unknown"),

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
     * Book Order limit exceeded on BU level
     */
    BU_BOOK_ORDER_LIMIT_EXCEEDED(0x2714L, "Book Order limit exceeded on BU level"),

    /**
     * Book Order limit exceeded on Session level
     */
    SESSION_BOOK_ORDER_LIMIT_EXCEEDED(0x2715L, "Book Order limit exceeded on Session level"),

    /**
     * Throttle limit for creation of complex instrument exceeded
     */
    CREATE_CI_THROTTLE_EXCEEDED(0x271AL, "Throttle limit for creation of complex instrument exceeded"),

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
        if (wire == 104L) {
            return Optional.of(RESULT_OF_TRANSACTION_UNKNOWN);
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
        if (wire == 10004L) {
            return Optional.of(BU_BOOK_ORDER_LIMIT_EXCEEDED);
        }
        if (wire == 10005L) {
            return Optional.of(SESSION_BOOK_ORDER_LIMIT_EXCEEDED);
        }
        if (wire == 10010L) {
            return Optional.of(CREATE_CI_THROTTLE_EXCEEDED);
        }
        if (wire == 4294967295L) {
            return Optional.of(NO_VALUE);
        }
        return Optional.empty();
    }
}
