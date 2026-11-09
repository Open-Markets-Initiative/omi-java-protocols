package omi.nyse.arcaequities.integratedfeedrefresh.pillar.v2_5_g.enums;

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
     * For high-volume feeds, this message is sent at the start of every second during periods of active data publication. The client can concatenate the SourceTime field with the SourceTimeNS field in subsequent market data messages to get full 8-byte Matching Engine event timestamps.
     */
    SOURCE_TIME_REFERENCE_MESSAGE(2, "For high-volume feeds, this message is sent at the start of every second during periods of active data publication. The client can concatenate the SourceTime field with the SourceTimeNS field in subsequent market data messages to get full 8-byte Matching Engine event timestamps."),

    /**
     * This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or Pillar Publisher failover. It provides referential data for a single specified symbol.
     */
    SYMBOL_INDEX_MAPPING_MESSAGE(3, "This message is published over the real-time data channels at system startup or in the context of a refresh sequence after a Matching Engine or Pillar Publisher failover. It provides referential data for a single specified symbol."),

    /**
     * This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc.
     */
    SECURITY_STATUS_MESSAGE(34, "This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc."),

    /**
     * The first message in each packet of refresh messages published over the Refresh multicast channels is of this type.
     */
    REFRESH_HEADER_MESSAGE(35, "The first message in each packet of refresh messages published over the Refresh multicast channels is of this type."),

    /**
     * Imbalance messages are published once a second during auctions to update price and volume information.
     */
    IMBALANCE_MESSAGE(105, "Imbalance messages are published once a second during auctions to update price and volume information."),

    /**
     * The Add Order Refresh message can be sent in either of two contexts: refresh response or symbol refresh.
     */
    ADD_ORDER_REFRESH_MESSAGE(106, "The Add Order Refresh message can be sent in either of two contexts: refresh response or symbol refresh.");

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
            case 2 -> Optional.of(SOURCE_TIME_REFERENCE_MESSAGE);
            case 3 -> Optional.of(SYMBOL_INDEX_MAPPING_MESSAGE);
            case 34 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 35 -> Optional.of(REFRESH_HEADER_MESSAGE);
            case 105 -> Optional.of(IMBALANCE_MESSAGE);
            case 106 -> Optional.of(ADD_ORDER_REFRESH_MESSAGE);
            default -> Optional.empty();
        };
    }
}
