package omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.enums;

import java.util.Optional;

/**
 * The reason why the request was rejected.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Status {

    /**
     * Message was accepted
     */
    MESSAGE_WAS_ACCEPTED('0', "Message was accepted"),

    /**
     * Rejected due to an Invalid Source ID
     */
    REJECTED_DUE_TO_AN_INVALID_SOURCE_ID('1', "Rejected due to an Invalid Source ID"),

    /**
     * Rejected due to invalid sequence range
     */
    INVALID_SEQUENCE_RANGE('2', "Rejected due to invalid sequence range"),

    /**
     * Rejected due to maximum sequence range (see threshold limits)
     */
    MAXIMUM_SEQUENCE_RANGE('3', "Rejected due to maximum sequence range (see threshold limits)"),

    /**
     * Rejected due to maximum request in a day
     */
    MAXIMUM_REQUEST_IN_A_DAY('4', "Rejected due to maximum request in a day"),

    /**
     * Rejected due to maximum number of refresh requests in a day
     */
    MAXIMUM_REFRESH_REQUESTS_IN_A_DAY('5', "Rejected due to maximum number of refresh requests in a day"),

    /**
     * Rejected. Request message SeqNum TTL (Time to live) is too old. Use refresh to recover current state if necessary.
     */
    OLD_SEQ_NUM_TTL('6', "Rejected. Request message SeqNum TTL (Time to live) is too old. Use refresh to recover current state if necessary."),

    /**
     * Rejected due to an Invalid Channel ID
     */
    INVALID_CHANNEL_ID('7', "Rejected due to an Invalid Channel ID"),

    /**
     * Rejected due to an Invalid Product ID
     */
    INVALID_PRODUCT_ID('8', "Rejected due to an Invalid Product ID"),

    /**
     * Rejected due to: 1) Invalid MsgType, or 2) Mismatch between MsgType and MsgSize
     */
    INVALID_MSG_TYPE_OR_MSG_SIZE_MISMATCH('9', "Rejected due to: 1) Invalid MsgType, or 2) Mismatch between MsgType and MsgSize");

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
            case '2' -> Optional.of(INVALID_SEQUENCE_RANGE);
            case '3' -> Optional.of(MAXIMUM_SEQUENCE_RANGE);
            case '4' -> Optional.of(MAXIMUM_REQUEST_IN_A_DAY);
            case '5' -> Optional.of(MAXIMUM_REFRESH_REQUESTS_IN_A_DAY);
            case '6' -> Optional.of(OLD_SEQ_NUM_TTL);
            case '7' -> Optional.of(INVALID_CHANNEL_ID);
            case '8' -> Optional.of(INVALID_PRODUCT_ID);
            case '9' -> Optional.of(INVALID_MSG_TYPE_OR_MSG_SIZE_MISMATCH);
            default -> Optional.empty();
        };
    }
}
