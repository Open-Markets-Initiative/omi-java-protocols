package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SplitMsg {

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     */
    NO_VALUE((short) 255, "Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order"),

    /**
     * Split Message Delayed
     */
    SPLIT_MESSAGE_DELAYED((short) 0, "Split Message Delayed"),

    /**
     * Out of Order Message Delayed
     */
    OUTOF_ORDER_MESSAGE_DELAYED((short) 1, "Out of Order Message Delayed"),

    /**
     * Complete Message Delayed
     */
    COMPLETE_MESSAGE_DELAYED((short) 2, "Complete Message Delayed");

    private final short wire;

    private final String description;

    SplitMsg(short wire, String description) {
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
    public static Optional<SplitMsg> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(SPLIT_MESSAGE_DELAYED);
            case 1 -> Optional.of(OUTOF_ORDER_MESSAGE_DELAYED);
            case 2 -> Optional.of(COMPLETE_MESSAGE_DELAYED);
            default -> Optional.empty();
        };
    }
}
