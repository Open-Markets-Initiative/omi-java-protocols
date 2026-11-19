package omi.cboe.cxjequities.multicastdepthofbook.spin.v1_0_6.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * First message sent to the Spin Server by a participant's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. Identical format to the GRP Login message.
     */
    LOGIN_MESSAGE((short) 1, "First message sent to the Spin Server by a participant's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. Identical format to the GRP Login message."),

    /**
     * Sent by the Spin Server to a participant's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "Sent by the Spin Server to a participant's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent."),

    /**
     * Sent once per second and indicates through what sequence number a spin is available.
     */
    SPIN_IMAGE_AVAILABLE_MESSAGE((short) 128, "Sent once per second and indicates through what sequence number a spin is available."),

    /**
     * Used by a participant's process to request transmission of a spin of the unit's order book.
     */
    SPIN_REQUEST_MESSAGE((short) 129, "Used by a participant's process to request transmission of a spin of the unit's order book."),

    /**
     * Sent in response to a participant's Spin Request message indicating whether a spin will be sent.
     */
    SPIN_RESPONSE_MESSAGE((short) 130, "Sent in response to a participant's Spin Request message indicating whether a spin will be sent."),

    /**
     * Sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected.
     */
    SPIN_FINISHED_MESSAGE((short) 131, "Sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected."),

    /**
     * Used to indicate the current trading status of a security. A Trading Status message will be sent whenever trading status changes for a security.
     */
    TRADING_STATUS_MESSAGE((short) 80, "Used to indicate the current trading status of a security. A Trading Status message will be sent whenever trading status changes for a security."),

    /**
     * Represents a newly accepted order on the Cboe Japan book. It includes a day-specific Order Id assigned by Cboe Japan to the order.
     */
    ADD_ORDER_MESSAGE((short) 81, "Represents a newly accepted order on the Cboe Japan book. It includes a day-specific Order Id assigned by Cboe Japan to the order.");

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
            case 128 -> Optional.of(SPIN_IMAGE_AVAILABLE_MESSAGE);
            case 129 -> Optional.of(SPIN_REQUEST_MESSAGE);
            case 130 -> Optional.of(SPIN_RESPONSE_MESSAGE);
            case 131 -> Optional.of(SPIN_FINISHED_MESSAGE);
            case 80 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 81 -> Optional.of(ADD_ORDER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
