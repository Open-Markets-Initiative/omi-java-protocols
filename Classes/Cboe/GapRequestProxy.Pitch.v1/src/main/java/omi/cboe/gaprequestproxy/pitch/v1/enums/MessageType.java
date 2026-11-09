package omi.cboe.gaprequestproxy.pitch.v1.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Login message is the first message sent to the Gap Request Proxy by a user's process after the connection is established. Failure to login before sending any other message type will result in the connection being dropped by the Gap Request Proxy.
     */
    LOGIN_MESSAGE((short) 1, "The Login message is the first message sent to the Gap Request Proxy by a user's process after the connection is established. Failure to login before sending any other message type will result in the connection being dropped by the Gap Request Proxy."),

    /**
     * The Login Response message is sent by the Gap Request Proxy to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "The Login Response message is sent by the Gap Request Proxy to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent."),

    /**
     * The Gap Request message is used by a user's process to request retransmission of a sequenced message (or messages) by one of Cboe's gap servers.
     */
    GAP_REQUEST_MESSAGE((short) 3, "The Gap Request message is used by a user's process to request retransmission of a sequenced message (or messages) by one of Cboe's gap servers."),

    /**
     * The Gap Response message is sent by the Gap Request Proxy in response to a Gap Request message. The Unit and Sequence fields will match the values supplied in the Gap Request message. A Gap Response message, with a Status of Accepted or reason for failure, will be sent for each Gap Request message received by the Gap Request Proxy.
     */
    GAP_RESPONSE_MESSAGE((short) 4, "The Gap Response message is sent by the Gap Request Proxy in response to a Gap Request message. The Unit and Sequence fields will match the values supplied in the Gap Request message. A Gap Response message, with a Status of Accepted or reason for failure, will be sent for each Gap Request message received by the Gap Request Proxy.");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LOGIN_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 3 -> Optional.of(GAP_REQUEST_MESSAGE);
            case 4 -> Optional.of(GAP_RESPONSE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
