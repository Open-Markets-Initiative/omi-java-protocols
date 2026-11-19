package omi.memx.memxequities.commonheader.tcp.v1_2.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Memx Tcp Heartbeat
     */
    HEARTBEAT((short) 0, "Memx Tcp Heartbeat"),

    /**
     * Memx Tcp Login Request
     */
    LOGIN_REQUEST((short) 100, "Memx Tcp Login Request"),

    /**
     * Memx Tcp Replay Request
     */
    REPLAY_REQUEST((short) 101, "Memx Tcp Replay Request"),

    /**
     * Memx Tcp Replay All Request
     */
    REPLAY_ALL_REQUEST((short) 102, "Memx Tcp Replay All Request"),

    /**
     * Memx Tcp Stream Request
     */
    STREAM_REQUEST((short) 103, "Memx Tcp Stream Request"),

    /**
     * Memx Tcp Unsequenced Message
     */
    UNSEQUENCED_MESSAGE((short) 104, "Memx Tcp Unsequenced Message"),

    /**
     * Memx Tcp Login Accepted Message
     */
    LOGIN_ACCEPTED((short) 1, "Memx Tcp Login Accepted Message"),

    /**
     * Memx Tcp Login Rejected Message
     */
    LOGIN_REJECTED((short) 2, "Memx Tcp Login Rejected Message"),

    /**
     * Memx Tcp Start of Session Message
     */
    START_OF_SESSION((short) 3, "Memx Tcp Start of Session Message"),

    /**
     * Memx Tcp End of Session Message
     */
    END_OF_SESSION((short) 4, "Memx Tcp End of Session Message"),

    /**
     * Memx Tcp Replay Begin Message
     */
    REPLAY_BEGIN((short) 5, "Memx Tcp Replay Begin Message"),

    /**
     * Memx Tcp Replay Rejected Message
     */
    REPLAY_REJECTED((short) 6, "Memx Tcp Replay Rejected Message"),

    /**
     * Memx Tcp Replay Complete Message
     */
    REPLAY_COMPLETE((short) 7, "Memx Tcp Replay Complete Message"),

    /**
     * Memx Tcp Stream Begin Message
     */
    STREAM_BEGIN((short) 8, "Memx Tcp Stream Begin Message"),

    /**
     * Memx Tcp Stream Rejected Message
     */
    STREAM_REJECTED((short) 9, "Memx Tcp Stream Rejected Message"),

    /**
     * Memx Tcp Stream Complete Message
     */
    STREAM_COMPLETE((short) 10, "Memx Tcp Stream Complete Message"),

    /**
     * Memx Tcp Sequenced Message
     */
    SEQUENCED_MESSAGE((short) 11, "Memx Tcp Sequenced Message");

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
            case 0 -> Optional.of(HEARTBEAT);
            case 100 -> Optional.of(LOGIN_REQUEST);
            case 101 -> Optional.of(REPLAY_REQUEST);
            case 102 -> Optional.of(REPLAY_ALL_REQUEST);
            case 103 -> Optional.of(STREAM_REQUEST);
            case 104 -> Optional.of(UNSEQUENCED_MESSAGE);
            case 1 -> Optional.of(LOGIN_ACCEPTED);
            case 2 -> Optional.of(LOGIN_REJECTED);
            case 3 -> Optional.of(START_OF_SESSION);
            case 4 -> Optional.of(END_OF_SESSION);
            case 5 -> Optional.of(REPLAY_BEGIN);
            case 6 -> Optional.of(REPLAY_REJECTED);
            case 7 -> Optional.of(REPLAY_COMPLETE);
            case 8 -> Optional.of(STREAM_BEGIN);
            case 9 -> Optional.of(STREAM_REJECTED);
            case 10 -> Optional.of(STREAM_COMPLETE);
            case 11 -> Optional.of(SEQUENCED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
