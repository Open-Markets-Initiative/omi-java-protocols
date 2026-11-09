package omi.nyse.amexequities.integratedfeed.pillar.v2_5_g.enums;

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
     * In case of a failure and recovery of a Matching Engine or an Pillar Publisher, the publisher may send a full state refresh for every symbol affected. This unrequested refresh is preceded by a Symbol Clear message. The client should react to receipt of a Symbol Clear message by clearing all state information for the specified symbol in anticipation of receiving a full state refresh.
     */
    SYMBOL_CLEAR_MESSAGE(32, "In case of a failure and recovery of a Matching Engine or an Pillar Publisher, the publisher may send a full state refresh for every symbol affected. This unrequested refresh is preceded by a Symbol Clear message. The client should react to receipt of a Symbol Clear message by clearing all state information for the specified symbol in anticipation of receiving a full state refresh."),

    /**
     * This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc.
     */
    SECURITY_STATUS_MESSAGE(34, "This message informs clients of changes in the status of a specific security, such as Trading Halts, Short Sale Restriction state changes, etc."),

    /**
     * An Add Order message is published when a new visible order has been received and added to the book.
     */
    ADD_ORDER_MESSAGE(100, "An Add Order message is published when a new visible order has been received and added to the book."),

    /**
     * A Modify Order message is sent when the price or volume of an order is changed.
     */
    MODIFY_ORDER_MESSAGE(101, "A Modify Order message is sent when the price or volume of an order is changed."),

    /**
     * A Delete Order message is published when an order is taken off of the book.
     */
    DELETE_ORDER_MESSAGE(102, "A Delete Order message is published when an order is taken off of the book."),

    /**
     * An Order Execution message is sent when an order is partially or fully executed.
     */
    ORDER_EXECUTION_MESSAGE(103, "An Order Execution message is sent when an order is partially or fully executed."),

    /**
     * A Replace Order message is published when a cancel/replace order is received and executed.
     */
    REPLACE_ORDER_MESSAGE(104, "A Replace Order message is published when a cancel/replace order is received and executed."),

    /**
     * Imbalance messages are published once a second during auctions to update price and volume information.
     */
    IMBALANCE_MESSAGE(105, "Imbalance messages are published once a second during auctions to update price and volume information."),

    /**
     * The Add Order Refresh message can be sent in either of two contexts: refresh response or symbol refresh.
     */
    ADD_ORDER_REFRESH_MESSAGE(106, "The Add Order Refresh message can be sent in either of two contexts: refresh response or symbol refresh."),

    /**
     * A Non Displayed Trade message is sent as a result of a match between two non-displayed orders.
     */
    NON_DISPLAYED_TRADE_MESSAGE(110, "A Non Displayed Trade message is sent as a result of a match between two non-displayed orders."),

    /**
     * A Cross Trade message is published on completion of a crossing auction.
     */
    CROSS_TRADE_MESSAGE(111, "A Cross Trade message is published on completion of a crossing auction."),

    /**
     * In the event that an earlier trade has been reported in error, a Trade Cancel message is sent.
     */
    TRADE_CANCEL_MESSAGE(112, "In the event that an earlier trade has been reported in error, a Trade Cancel message is sent."),

    /**
     * In the event that an earlier Cross Trade has been reported in error, a Cross Correction message is sent.
     */
    CROSS_CORRECTION_MESSAGE(113, "In the event that an earlier Cross Trade has been reported in error, a Cross Correction message is sent."),

    /**
     * Published when RPI interest is added or removed between the best bid and best offer price.
     */
    RETAIL_PRICE_IMPROVEMENT_MESSAGE(114, "Published when RPI interest is added or removed between the best bid and best offer price.");

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
            case 32 -> Optional.of(SYMBOL_CLEAR_MESSAGE);
            case 34 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 100 -> Optional.of(ADD_ORDER_MESSAGE);
            case 101 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 102 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 103 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 104 -> Optional.of(REPLACE_ORDER_MESSAGE);
            case 105 -> Optional.of(IMBALANCE_MESSAGE);
            case 106 -> Optional.of(ADD_ORDER_REFRESH_MESSAGE);
            case 110 -> Optional.of(NON_DISPLAYED_TRADE_MESSAGE);
            case 111 -> Optional.of(CROSS_TRADE_MESSAGE);
            case 112 -> Optional.of(TRADE_CANCEL_MESSAGE);
            case 113 -> Optional.of(CROSS_CORRECTION_MESSAGE);
            case 114 -> Optional.of(RETAIL_PRICE_IMPROVEMENT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
