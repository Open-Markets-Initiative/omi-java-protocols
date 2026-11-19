package omi.aquis.aquisstockexchange.replay.amd.v1_2_3.enums;

import java.util.Optional;

/**
 * Message type identifier
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * If a recipient wishes to use the message replay service, they must first be authenticated by sending a Login message to the relevant replay server.
     */
    LOGIN_MESSAGE((short) 13, "If a recipient wishes to use the message replay service, they must first be authenticated by sending a Login message to the relevant replay server."),

    /**
     * The recipient sends a Replay Request message to request a particular message or range of messages from the replay server.
     */
    REPLAY_REQUEST_MESSAGE((short) 14, "The recipient sends a Replay Request message to request a particular message or range of messages from the replay server."),

    /**
     * AQSE will send a Replay Response message to the recipient to acknowledge a successful Login or to report problems with a Resend Request.
     */
    REPLAY_RESPONSE_MESSAGE((short) 15, "AQSE will send a Replay Response message to the recipient to acknowledge a successful Login or to report problems with a Resend Request.");

    private final short wire;

    private final String description;

    MsgType(short wire, String description) {
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
    public static Optional<MsgType> fromWire(short wire) {
        return switch (wire) {
            case 13 -> Optional.of(LOGIN_MESSAGE);
            case 14 -> Optional.of(REPLAY_REQUEST_MESSAGE);
            case 15 -> Optional.of(REPLAY_RESPONSE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
