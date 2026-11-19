package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

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
     * Value Is Incorrect
     */
    VALUEISINCORRECT(0x5L, "Value Is Incorrect"),

    /**
     * Decryption Problem
     */
    DECRYPTIONPROBLEM(0x7L, "Decryption Problem"),

    /**
     * Invalid Msg ID
     */
    INVALID_MSG_ID(0xBL, "Invalid Msg ID"),

    /**
     * Incorrect Num In Group Count
     */
    INCORRECT_NUM_IN_GROUPCOUNT(0x10L, "Incorrect Num In Group Count"),

    /**
     * Other
     */
    OTHER(0x63L, "Other"),

    /**
     * Throttle Limit Exceeded
     */
    THROTTLE_LIMIT_EXCEEDED(0x64L, "Throttle Limit Exceeded"),

    /**
     * Exposure Limit Exceeded
     */
    EXPOSURE_LIMIT_EXCEEDED(0x65L, "Exposure Limit Exceeded"),

    /**
     * Service Temporarily Not Available
     */
    SERVICE_TEMPORARILY_NOT_AVAILABLE(0x66L, "Service Temporarily Not Available"),

    /**
     * Service Not Available
     */
    SERVICE_NOT_AVAILABLE(0x67L, "Service Not Available"),

    /**
     * Result Of Transaction Unknown
     */
    RESULT_OF_TRANSACTION_UNKNOWN(0x68L, "Result Of Transaction Unknown"),

    /**
     * Outbound Conversion Error
     */
    OUTBOUNDCONVERSIONERROR(0x69L, "Outbound Conversion Error"),

    /**
     * Heartbeat Violation
     */
    HEARTBEAT_VIOLATION(0x98L, "Heartbeat Violation"),

    /**
     * Internal Technical Error
     */
    INTERNALTECHNICALERROR(0xC8L, "Internal Technical Error"),

    /**
     * Validation Error
     */
    VALIDATION_ERROR(0xD2L, "Validation Error"),

    /**
     * User Already Logged In
     */
    USER_ALREADY_LOGGED_IN(0xD3L, "User Already Logged In"),

    /**
     * Order Not Found
     */
    ORDER_NOT_FOUND(0x2710L, "Order Not Found"),

    /**
     * Price Not Reasonable
     */
    PRICE_NOT_REASONABLE(0x2711L, "Price Not Reasonable"),

    /**
     * Client Order ID Not Unique
     */
    CLIENT_ORDER_ID_NOT_UNIQUE(0x2712L, "Client Order ID Not Unique"),

    /**
     * BU Book Order Limit Exceeded
     */
    BU_BOOK_ORDER_LIMIT_EXCEEDED(0x2714L, "BU Book Order Limit Exceeded"),

    /**
     * Session Book Order Limit Exceeded
     */
    SESSION_BOOK_ORDER_LIMIT_EXCEEDED(0x2715L, "Session Book Order Limit Exceeded"),

    /**
     * Activity Timestamp Not Matched.
     */
    ACTIVITY_TIMESTAMP_NOT_MATCHED(0x2716L, "Activity Timestamp Not Matched."),

    /**
     * Price is out of LPP range.
     */
    PRICE_NOT_IN_LPP_RANGE(0x2718L, "Price is out of LPP range."),

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
        if (wire == 10004L) {
            return Optional.of(BU_BOOK_ORDER_LIMIT_EXCEEDED);
        }
        if (wire == 10005L) {
            return Optional.of(SESSION_BOOK_ORDER_LIMIT_EXCEEDED);
        }
        if (wire == 10006L) {
            return Optional.of(ACTIVITY_TIMESTAMP_NOT_MATCHED);
        }
        if (wire == 10008L) {
            return Optional.of(PRICE_NOT_IN_LPP_RANGE);
        }
        if (wire == 4294967295L) {
            return Optional.of(NO_VALUE);
        }
        return Optional.empty();
    }
}
