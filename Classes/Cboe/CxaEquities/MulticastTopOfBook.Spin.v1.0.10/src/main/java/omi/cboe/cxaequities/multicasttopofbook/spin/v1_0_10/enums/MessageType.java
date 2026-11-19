package omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * First message sent to the Spin Server by the client process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. Identical format to the GRP Login message.
     */
    LOGIN_MESSAGE((short) 1, "First message sent to the Spin Server by the client process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. Identical format to the GRP Login message."),

    /**
     * Sent by the Spin Server to the client process in response to a Login message. The Status field reflects an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "Sent by the Spin Server to the client process in response to a Login message. The Status field reflects an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent."),

    /**
     * Sent once per second by the Spin Server, indicating through what sequence number a spin is available.
     */
    SPIN_IMAGE_AVAILABLE_MESSAGE((short) 128, "Sent once per second by the Spin Server, indicating through what sequence number a spin is available."),

    /**
     * Used by a client's process to request transmission of a spin of the unit's order book.
     */
    SPIN_REQUEST_MESSAGE((short) 129, "Used by a client's process to request transmission of a spin of the unit's order book."),

    /**
     * Sent by the Spin Server in response to a client's Spin Request message indicating whether a spin will be sent.
     */
    SPIN_RESPONSE_MESSAGE((short) 130, "Sent by the Spin Server in response to a client's Spin Request message indicating whether a spin will be sent."),

    /**
     * Sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected. Upon receipt, any buffered multicast messages should be applied to the client's copy of the book to make it current.
     */
    SPIN_FINISHED_MESSAGE((short) 131, "Sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected. Upon receipt, any buffered multicast messages should be applied to the client's copy of the book to make it current."),

    /**
     * Indicates the current trading status of a security. Included in a spin response so the client can populate trading state for each symbol.
     */
    TRADING_STATUS_MESSAGE((short) 59, "Indicates the current trading status of a security. Included in a spin response so the client can populate trading state for each symbol."),

    /**
     * Carries the current inside price and quantity for a single side of a symbol. Included in a spin response so the client can populate the top-of-book state.
     */
    SINGLE_SIDE_UPDATE_MESSAGE((short) 228, "Carries the current inside price and quantity for a single side of a symbol. Included in a spin response so the client can populate the top-of-book state."),

    /**
     * Carries the current inside prices and quantities for both sides of a symbol. Included in a spin response so the client can populate the top-of-book state.
     */
    TWO_SIDE_UPDATE_MESSAGE((short) 229, "Carries the current inside prices and quantities for both sides of a symbol. Included in a spin response so the client can populate the top-of-book state."),

    /**
     * Carries the latest calculated market value for a specified symbol. Included in a spin response so the client can populate the latest index, iNAV, or closing price value.
     */
    CALCULATED_VALUE_MESSAGE((short) 227, "Carries the latest calculated market value for a specified symbol. Included in a spin response so the client can populate the latest index, iNAV, or closing price value.");

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
            case 59 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 228 -> Optional.of(SINGLE_SIDE_UPDATE_MESSAGE);
            case 229 -> Optional.of(TWO_SIDE_UPDATE_MESSAGE);
            case 227 -> Optional.of(CALCULATED_VALUE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
