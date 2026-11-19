package omi.cboe.titaniumconsolidated.oneoptions.spin.v1_0_10.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Login message is the first message sent to the Spin Server by a user's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format of the Login message for the Spin Server is identical to that of the GRP.
     */
    LOGIN_MESSAGE((short) 1, "The Login message is the first message sent to the Spin Server by a user's process after the connection to the Spin Server is established. Failure to login before sending any other message type will result in the connection being dropped by the Spin Server. The format of the Login message for the Spin Server is identical to that of the GRP."),

    /**
     * The Login Response message is sent by the Spin Server to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "The Login Response message is sent by the Spin Server to a user's process in response to a Login message. The status field is used to reflect an accepted login or the reason the session was not accepted. If login fails, the connection will be dropped after the Login Response message is sent."),

    /**
     * The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available.
     */
    SPIN_IMAGE_AVAILABLE_MESSAGE((short) 128, "The Spin Image Available message is sent once per second and indicates through what sequence number a spin is available."),

    /**
     * The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book.
     */
    SPIN_REQUEST_MESSAGE((short) 129, "The Spin Request message is used by a user's process to request transmission of a spin of the unit's order book."),

    /**
     * The Spin Response message is sent in response to a user's Spin Request message indicating whether a spin will be sent.
     */
    SPIN_RESPONSE_MESSAGE((short) 130, "The Spin Response message is sent in response to a user's Spin Request message indicating whether a spin will be sent."),

    /**
     * The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request message was not rejected.
     */
    SPIN_FINISHED_MESSAGE((short) 131, "The Spin Finished message is sent to indicate that all messages for the spin requested have been sent. A Spin Finished message is only sent if a Spin Request message was not rejected."),

    /**
     * The Instrument Definition Request message is used by a user's process to request transmission of this unit's Symbol Mappings.
     */
    INSTRUMENT_DEFINITION_REQUEST_MESSAGE((short) 132, "The Instrument Definition Request message is used by a user's process to request transmission of this unit's Symbol Mappings."),

    /**
     * The Instrument Definition Response message is sent in response to a user's Instrument Definition Request message indicating whether a spin will be sent.
     */
    INSTRUMENT_DEFINITION_RESPONSE_MESSAGE((short) 133, "The Instrument Definition Response message is sent in response to a user's Instrument Definition Request message indicating whether a spin will be sent."),

    /**
     * The Instrument Definition Finished message is sent to indicate that all Symbol Mapping messages for this unit have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request message was not rejected.
     */
    INSTRUMENT_DEFINITION_FINISHED_MESSAGE((short) 134, "The Instrument Definition Finished message is sent to indicate that all Symbol Mapping messages for this unit have been sent. An Instrument Definition Finished message is only sent if an Instrument Definition Request message was not rejected."),

    /**
     * Symbol Mapping messages are sent in response to an Accepted Instrument Definition Request message.
     */
    SYMBOL_MAPPING_MESSAGE((short) 46, "Symbol Mapping messages are sent in response to an Accepted Instrument Definition Request message."),

    /**
     * The Trade Replay Request message is used by a user's process to request transmission of all Trade and Trade Break messages previously emitted by this unit prior to receiving the user's Trade Replay Request message.
     */
    TRADE_REPLAY_REQUEST_MESSAGE((short) 135, "The Trade Replay Request message is used by a user's process to request transmission of all Trade and Trade Break messages previously emitted by this unit prior to receiving the user's Trade Replay Request message."),

    /**
     * The Trade Replay Response message is sent in response to a user's Trade Replay Request message indicating whether a spin will be sent.
     */
    TRADE_REPLAY_RESPONSE_MESSAGE((short) 136, "The Trade Replay Response message is sent in response to a user's Trade Replay Request message indicating whether a spin will be sent."),

    /**
     * The Trade Replay Finished message is sent to indicate that all Trade and Trade Break messages for this unit have been sent. A Trade Replay Finished message is only sent if a Trade Replay Request message was not rejected.
     */
    TRADE_REPLAY_FINISHED_MESSAGE((short) 137, "The Trade Replay Finished message is sent to indicate that all Trade and Trade Break messages for this unit have been sent. A Trade Replay Finished message is only sent if a Trade Replay Request message was not rejected.");

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
            case 46 -> Optional.of(SYMBOL_MAPPING_MESSAGE);
            case 135 -> Optional.of(TRADE_REPLAY_REQUEST_MESSAGE);
            case 136 -> Optional.of(TRADE_REPLAY_RESPONSE_MESSAGE);
            case 137 -> Optional.of(TRADE_REPLAY_FINISHED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
