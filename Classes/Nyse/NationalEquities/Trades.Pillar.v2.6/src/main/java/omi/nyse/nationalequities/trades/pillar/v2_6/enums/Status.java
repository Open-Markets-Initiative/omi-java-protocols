package omi.nyse.nationalequities.trades.pillar.v2_6.enums;

import java.util.Optional;

/**
 * The reason why the request was rejected.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Status {

    /**
     * Message Was Accepted
     */
    MESSAGE_WAS_ACCEPTED('0', "Message Was Accepted"),

    /**
     * Rejected Due To An Invalid Source Id
     */
    REJECTED_DUE_TO_AN_INVALID_SOURCE_ID('1', "Rejected Due To An Invalid Source Id"),

    /**
     * Rejected Due To Maximum Sequence Range See Threshold Limits
     */
    REJECTED_DUE_TO_MAXIMUM_SEQUENCE_RANGE_SEE_THRESHOLD_LIMITS('3', "Rejected Due To Maximum Sequence Range See Threshold Limits"),

    /**
     * Rejected Due To Maximum Request In A Day
     */
    REJECTED_DUE_TO_MAXIMUM_REQUEST_IN_A_DAY('4', "Rejected Due To Maximum Request In A Day"),

    /**
     * Rejected Due To Maximum Number Of Refresh Requests In A Day
     */
    REJECTED_DUE_TO_MAXIMUM_NUMBER_OF_REFRESH_REQUESTS_IN_A_DAY('5', "Rejected Due To Maximum Number Of Refresh Requests In A Day"),

    /**
     * Rejected Request Message Seq Num Ttl Time To Live Is Too Old Use Refresh To Recover Current State If Necessary
     */
    REJECTED_REQUEST_MESSAGE_SEQ_NUM_TTL_TIME_TO_LIVE_IS_TOO_OLD_USE_REFRESH_TO_RECOVER_CURRENT_STATE_IF_NECESSARY('6', "Rejected Request Message Seq Num Ttl Time To Live Is Too Old Use Refresh To Recover Current State If Necessary"),

    /**
     * Rejected Due To An Invalid Channel Id
     */
    REJECTED_DUE_TO_AN_INVALID_CHANNEL_ID('7', "Rejected Due To An Invalid Channel Id"),

    /**
     * Rejected Due To An Invalid Product Id
     */
    REJECTED_DUE_TO_AN_INVALID_PRODUCT_ID('8', "Rejected Due To An Invalid Product Id"),

    /**
     * Rejected Due To 1 Invalid Msg Type Or 2 Mismatch Between Msg Type And Msg Size
     */
    REJECTED_DUE_TO_1_INVALID_MSG_TYPE_OR_2_MISMATCH_BETWEEN_MSG_TYPE_AND_MSG_SIZE('9', "Rejected Due To 1 Invalid Msg Type Or 2 Mismatch Between Msg Type And Msg Size");

    private final char wire;

    private final String description;

    Status(char wire, String description) {
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
    public static Optional<Status> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(MESSAGE_WAS_ACCEPTED);
            case '1' -> Optional.of(REJECTED_DUE_TO_AN_INVALID_SOURCE_ID);
            case '3' -> Optional.of(REJECTED_DUE_TO_MAXIMUM_SEQUENCE_RANGE_SEE_THRESHOLD_LIMITS);
            case '4' -> Optional.of(REJECTED_DUE_TO_MAXIMUM_REQUEST_IN_A_DAY);
            case '5' -> Optional.of(REJECTED_DUE_TO_MAXIMUM_NUMBER_OF_REFRESH_REQUESTS_IN_A_DAY);
            case '6' -> Optional.of(REJECTED_REQUEST_MESSAGE_SEQ_NUM_TTL_TIME_TO_LIVE_IS_TOO_OLD_USE_REFRESH_TO_RECOVER_CURRENT_STATE_IF_NECESSARY);
            case '7' -> Optional.of(REJECTED_DUE_TO_AN_INVALID_CHANNEL_ID);
            case '8' -> Optional.of(REJECTED_DUE_TO_AN_INVALID_PRODUCT_ID);
            case '9' -> Optional.of(REJECTED_DUE_TO_1_INVALID_MSG_TYPE_OR_2_MISMATCH_BETWEEN_MSG_TYPE_AND_MSG_SIZE);
            default -> Optional.empty();
        };
    }
}
