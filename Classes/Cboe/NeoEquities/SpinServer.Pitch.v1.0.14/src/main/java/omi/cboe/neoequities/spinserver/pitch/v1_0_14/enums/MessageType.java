package omi.cboe.neoequities.spinserver.pitch.v1_0_14.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The first message the Member process sends to the Spin Server after connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format is identical to the GRP Login message.
     */
    LOGIN_MESSAGE((short) 1, "The first message the Member process sends to the Spin Server after connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format is identical to the GRP Login message."),

    /**
     * Sent by the Spin Server to a Member's process in response to a Login message. The Status field reflects an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "Sent by the Spin Server to a Member's process in response to a Login message. The Status field reflects an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent."),

    /**
     * Sent once per second and indicates through what sequence number a spin is available.
     */
    SPIN_IMAGE_AVAILABLE_MESSAGE((short) 128, "Sent once per second and indicates through what sequence number a spin is available."),

    /**
     * Used by a Member's process to request transmission of a spin of the unit's order book.
     */
    SPIN_REQUEST_MESSAGE((short) 129, "Used by a Member's process to request transmission of a spin of the unit's order book."),

    /**
     * Sent in response to a Member's Spin Request message indicating whether a spin will be sent.
     */
    SPIN_RESPONSE_MESSAGE((short) 130, "Sent in response to a Member's Spin Request message indicating whether a spin will be sent."),

    /**
     * Indicates that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the Member's copy of the book to make it current.
     */
    SPIN_FINISHED_MESSAGE((short) 131, "Indicates that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request was not rejected. Upon receipt of a Spin Finished message, any buffered multicast messages should be applied to the Member's copy of the book to make it current."),

    /**
     * Used by a Member's process to request transmission of this unit's Instrument Directory messages.
     */
    INSTRUMENT_DEFINITION_REQUEST_MESSAGE((short) 132, "Used by a Member's process to request transmission of this unit's Instrument Directory messages."),

    /**
     * Indicates whether a spin will be sent in response to a Member's Instrument Definition Request message.
     */
    INSTRUMENT_DEFINITION_RESPONSE_MESSAGE((short) 133, "Indicates whether a spin will be sent in response to a Member's Instrument Definition Request message."),

    /**
     * Indicates that all messages for the spin requested have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request was not rejected.
     */
    INSTRUMENT_DEFINITION_FINISHED_MESSAGE((short) 134, "Indicates that all messages for the spin requested have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request was not rejected."),

    /**
     * Used by a Member's process to request transmission of this unit's Trade, Trade Break, and Trade Correction messages. Note Order Executed messages will be converted to Trade messages.
     */
    TRADE_REPLAY_REQUEST_MESSAGE((short) 135, "Used by a Member's process to request transmission of this unit's Trade, Trade Break, and Trade Correction messages. Note Order Executed messages will be converted to Trade messages."),

    /**
     * Indicates whether a spin will be sent in response to a Member's Trade Replay Request message.
     */
    TRADE_REPLAY_RESPONSE_MESSAGE((short) 136, "Indicates whether a spin will be sent in response to a Member's Trade Replay Request message."),

    /**
     * Indicates that all messages for the spin requested have been sent. A Trade Replay Finished message is only sent if a Trade Replay Request message was not rejected.
     */
    TRADE_REPLAY_FINISHED_MESSAGE((short) 137, "Indicates that all messages for the spin requested have been sent. A Trade Replay Finished message is only sent if a Trade Replay Request message was not rejected.");

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
            case 132 -> Optional.of(INSTRUMENT_DEFINITION_REQUEST_MESSAGE);
            case 133 -> Optional.of(INSTRUMENT_DEFINITION_RESPONSE_MESSAGE);
            case 134 -> Optional.of(INSTRUMENT_DEFINITION_FINISHED_MESSAGE);
            case 135 -> Optional.of(TRADE_REPLAY_REQUEST_MESSAGE);
            case 136 -> Optional.of(TRADE_REPLAY_RESPONSE_MESSAGE);
            case 137 -> Optional.of(TRADE_REPLAY_FINISHED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
