package omi.nyse.nyseequities.openbook.ultra.v2_1_b.enums;

import java.util.Optional;

/**
 * The reason why the request was rejected.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectReason {

    /**
     * Request Accepted
     */
    REQUEST_ACCEPTED('0', "Request Accepted"),

    /**
     * Rejected Due To Permissions
     */
    REJECTED_DUE_TO_PERMISSIONS('1', "Rejected Due To Permissions"),

    /**
     * Invalid Sequence Range Eg Low High
     */
    INVALID_SEQUENCE_RANGE_EG_LOW_HIGH('2', "Invalid Sequence Range Eg Low High"),

    /**
     * Exceeded Max Sequence Range 1000
     */
    EXCEEDED_MAX_SEQUENCE_RANGE_1000('3', "Exceeded Max Sequence Range 1000"),

    /**
     * Exceeded Max Retrans Requests In A Day
     */
    EXCEEDED_MAX_RETRANS_REQUESTS_IN_A_DAY('4', "Exceeded Max Retrans Requests In A Day"),

    /**
     * Exceeded Max Refresh Requests In A Day
     */
    EXCEEDED_MAX_REFRESH_REQUESTS_IN_A_DAY('5', "Exceeded Max Refresh Requests In A Day"),

    /**
     * Rejected Requested Seqnum 1000000 Packets In The Past Use Refresh To Recover Current State If Necessary
     */
    REJECTED_REQUESTED_SEQNUM_1000000_PACKETS_IN_THE_PAST_USE_REFRESH_TO_RECOVER_CURRENT_STATE_IF_NECESSARY('6', "Rejected Requested Seqnum 1000000 Packets In The Past Use Refresh To Recover Current State If Necessary");

    private final char wire;

    private final String description;

    RejectReason(char wire, String description) {
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
    public static Optional<RejectReason> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(REQUEST_ACCEPTED);
            case '1' -> Optional.of(REJECTED_DUE_TO_PERMISSIONS);
            case '2' -> Optional.of(INVALID_SEQUENCE_RANGE_EG_LOW_HIGH);
            case '3' -> Optional.of(EXCEEDED_MAX_SEQUENCE_RANGE_1000);
            case '4' -> Optional.of(EXCEEDED_MAX_RETRANS_REQUESTS_IN_A_DAY);
            case '5' -> Optional.of(EXCEEDED_MAX_REFRESH_REQUESTS_IN_A_DAY);
            case '6' -> Optional.of(REJECTED_REQUESTED_SEQNUM_1000000_PACKETS_IN_THE_PAST_USE_REFRESH_TO_RECOVER_CURRENT_STATE_IF_NECESSARY);
            default -> Optional.empty();
        };
    }
}
