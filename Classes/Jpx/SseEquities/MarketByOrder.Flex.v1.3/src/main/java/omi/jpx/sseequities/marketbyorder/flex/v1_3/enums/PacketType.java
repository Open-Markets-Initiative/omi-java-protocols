package omi.jpx.sseequities.marketbyorder.flex.v1_3.enums;

import java.util.Optional;

/**
 * First byte of the Tcp packet identifying the packet type used as dispatch key
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PacketType {

    /**
     * Tcp login request selecting retransmission, sent by the user. One of the two Packet Type codes the document gives the 18 byte Login Request.
     */
    LOGIN_REQUEST_RETRANSMISSION_MESSAGE('R', "Tcp login request selecting retransmission, sent by the user. One of the two Packet Type codes the document gives the 18 byte Login Request."),

    /**
     * Tcp login request selecting snapshot, sent by the user. Same layout as the retransmission request; Number of System Reboots, Sequence Number and Requested Message Count are all set to 0.
     */
    LOGIN_REQUEST_SNAPSHOT_MESSAGE('L', "Tcp login request selecting snapshot, sent by the user. Same layout as the retransmission request; Number of System Reboots, Sequence Number and Requested Message Count are all set to 0."),

    /**
     * Tcp login response accepting the request. Result Code carries A.
     */
    LOGIN_RESULT_ACCEPTED_MESSAGE('A', "Tcp login response accepting the request. Result Code carries A."),

    /**
     * Tcp login response rejecting the request. Same layout as the accepted response; Result Code carries the reason the request failed.
     */
    LOGIN_RESULT_REJECTED_MESSAGE('J', "Tcp login response rejecting the request. Same layout as the accepted response; Result Code carries the reason the request failed."),

    /**
     * Tcp message response carrying tag data including their packet headers in response to a retransmission or snapshot request.
     */
    MESSAGE_RESPONSE_MESSAGE('S', "Tcp message response carrying tag data including their packet headers in response to a retransmission or snapshot request."),

    /**
     * Tcp end of message marker terminating a retransmission or snapshot session.
     */
    END_OF_MESSAGE_MESSAGE('G', "Tcp end of message marker terminating a retransmission or snapshot session.");

    private final char wire;

    private final String description;

    PacketType(char wire, String description) {
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
    public static Optional<PacketType> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(LOGIN_REQUEST_RETRANSMISSION_MESSAGE);
            case 'L' -> Optional.of(LOGIN_REQUEST_SNAPSHOT_MESSAGE);
            case 'A' -> Optional.of(LOGIN_RESULT_ACCEPTED_MESSAGE);
            case 'J' -> Optional.of(LOGIN_RESULT_REJECTED_MESSAGE);
            case 'S' -> Optional.of(MESSAGE_RESPONSE_MESSAGE);
            case 'G' -> Optional.of(END_OF_MESSAGE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
