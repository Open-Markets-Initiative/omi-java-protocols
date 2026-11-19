package omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Simple Instrument Definition
     */
    SIMPLE_INSTRUMENT_DEFINITION_MESSAGE((short) 1, "Simple Instrument Definition"),

    /**
     * Complex Instrument Definition
     */
    COMPLEX_INSTRUMENT_DEFINITION_MESSAGE((short) 17, "Complex Instrument Definition"),

    /**
     * Complex Instrument Definition (deprecated)
     */
    COMPLEX_INSTRUMENT_DEFINITION_DEPRECATED_MESSAGE((short) 2, "Complex Instrument Definition (deprecated)"),

    /**
     * System State
     */
    SYSTEM_STATE_MESSAGE((short) 3, "System State"),

    /**
     * Instrument Trading Status Notification
     */
    INSTRUMENT_TRADING_STATUS_NOTIFICATION_MESSAGE((short) 4, "Instrument Trading Status Notification"),

    /**
     * Anticipated Opening Price
     */
    ANTICIPATED_OPENING_PRICE_MESSAGE((short) 5, "Anticipated Opening Price"),

    /**
     * Settlement Price Update
     */
    SETTLEMENT_PRICE_UPDATE_MESSAGE((short) 6, "Settlement Price Update"),

    /**
     * Open Interest Update
     */
    OPEN_INTEREST_UPDATE_MESSAGE((short) 7, "Open Interest Update"),

    /**
     * Total Volume Update
     */
    TOTAL_VOLUME_UPDATE_MESSAGE((short) 8, "Total Volume Update"),

    /**
     * Instrument Clear Message
     */
    INSTRUMENT_CLEAR_MESSAGE((short) 9, "Instrument Clear Message"),

    /**
     * Add Order Message
     */
    ADD_ORDER_MESSAGE((short) 10, "Add Order Message"),

    /**
     * Modify Order Message
     */
    MODIFY_ORDER_MESSAGE((short) 11, "Modify Order Message"),

    /**
     * Delete Order Message
     */
    DELETE_ORDER_MESSAGE((short) 12, "Delete Order Message"),

    /**
     * Order Execution Message
     */
    ORDER_EXECUTION_MESSAGE((short) 13, "Order Execution Message"),

    /**
     * Trade Cancel Message
     */
    TRADE_CANCEL_MESSAGE((short) 14, "Trade Cancel Message");

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
            case 1 -> Optional.of(SIMPLE_INSTRUMENT_DEFINITION_MESSAGE);
            case 17 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_MESSAGE);
            case 2 -> Optional.of(COMPLEX_INSTRUMENT_DEFINITION_DEPRECATED_MESSAGE);
            case 3 -> Optional.of(SYSTEM_STATE_MESSAGE);
            case 4 -> Optional.of(INSTRUMENT_TRADING_STATUS_NOTIFICATION_MESSAGE);
            case 5 -> Optional.of(ANTICIPATED_OPENING_PRICE_MESSAGE);
            case 6 -> Optional.of(SETTLEMENT_PRICE_UPDATE_MESSAGE);
            case 7 -> Optional.of(OPEN_INTEREST_UPDATE_MESSAGE);
            case 8 -> Optional.of(TOTAL_VOLUME_UPDATE_MESSAGE);
            case 9 -> Optional.of(INSTRUMENT_CLEAR_MESSAGE);
            case 10 -> Optional.of(ADD_ORDER_MESSAGE);
            case 11 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 12 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 13 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 14 -> Optional.of(TRADE_CANCEL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
