package omi.nyse.arcaequities.depthfeedretransmission.pillar.v1_1.enums;

import java.util.Optional;

/**
 * The type of this message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * This message is sent to reset the Message Sequence Number at start of day, or in response to failures.
     */
    SEQUENCE_NUMBER_RESET_MESSAGE(1, "This message is sent to reset the Message Sequence Number at start of day, or in response to failures."),

    /**
     * This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or Pillar Publisher failover. It provides referential data for a single specified symbol.
     */
    SYMBOL_INDEX_MAPPING_MESSAGE(3, "This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or Pillar Publisher failover. It provides referential data for a single specified symbol."),

    /**
     * In case of a failure and recovery of a Matching Engine or an Pillar Publisher, the publisher may send a full state refresh for every symbol affected. This unrequested refresh is preceded by a Symbol Clear message. The client should react to receipt of a Symbol Clear message by clearing all state information for the specified symbol in anticipation of receiving a full state refresh.
     */
    SYMBOL_CLEAR_MESSAGE(32, "In case of a failure and recovery of a Matching Engine or an Pillar Publisher, the publisher may send a full state refresh for every symbol affected. This unrequested refresh is preceded by a Symbol Clear message. The client should react to receipt of a Symbol Clear message by clearing all state information for the specified symbol in anticipation of receiving a full state refresh."),

    /**
     * This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc.
     */
    SECURITY_STATUS_MESSAGE(34, "This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc."),

    /**
     * This message will be sent over the Retransmission multicast channels to inform clients of unavailability of a range of messages (or part of a range) for which they may have requested a retransmission.
     */
    MESSAGE_UNAVAILABLE_MESSAGE(31, "This message will be sent over the Retransmission multicast channels to inform clients of unavailability of a range of messages (or part of a range) for which they may have requested a retransmission."),

    /**
     * The Delta Message is published each time there is a change to the aggregate limit-order book quantity across the ten best price points on the buy and/or sell side for NYSE Group.
     */
    DELTA_MESSAGE(115, "The Delta Message is published each time there is a change to the aggregate limit-order book quantity across the ten best price points on the buy and/or sell side for NYSE Group."),

    /**
     * Imbalance messages are published once a second during auctions to update price and volume information.
     */
    IMBALANCE_MESSAGE(105, "Imbalance messages are published once a second during auctions to update price and volume information.");

    private final int wire;

    private final String description;

    MessageType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<MessageType> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            case 3 -> Optional.of(SYMBOL_INDEX_MAPPING_MESSAGE);
            case 32 -> Optional.of(SYMBOL_CLEAR_MESSAGE);
            case 34 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 31 -> Optional.of(MESSAGE_UNAVAILABLE_MESSAGE);
            case 115 -> Optional.of(DELTA_MESSAGE);
            case 105 -> Optional.of(IMBALANCE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
