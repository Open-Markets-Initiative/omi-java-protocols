package omi.imperative.intelligentcross.depthofbook.aspen.v1_11.enums;

import java.util.Optional;

/**
 * Code identifying message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * This message appears on all quote channels and indicates the beginning of a spin message cycle
     */
    MARKET_EVENT_MESSAGE('A', "This message appears on all quote channels and indicates the beginning of a spin message cycle"),

    /**
     * Symbol Information
     */
    SYMBOL_INFORMATION_MESSAGE('B', "Symbol Information"),

    /**
     * Symbol State
     */
    SYMBOL_STATE_MESSAGE('C', "Symbol State"),

    /**
     * New Order Add
     */
    NEW_ORDER_ADD_MESSAGE('D', "New Order Add"),

    /**
     * Order Partial Cancel
     */
    ORDER_PARTIAL_CANCEL_MESSAGE('F', "Order Partial Cancel"),

    /**
     * Order Cancel All
     */
    ORDER_CANCEL_ALL_MESSAGE('G', "Order Cancel All"),

    /**
     * Order Updated
     */
    ORDER_UPDATED_MESSAGE('H', "Order Updated"),

    /**
     * Sent when a visible order is executed
     */
    ORDER_EXECUTED_MESSAGE('J', "Sent when a visible order is executed"),

    /**
     * Sent when a hidden order is executed
     */
    TRADE_MESSAGE('K', "Sent when a hidden order is executed"),

    /**
     * Trade Break
     */
    TRADE_BREAK_MESSAGE('M', "Trade Break");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(MARKET_EVENT_MESSAGE);
            case 'B' -> Optional.of(SYMBOL_INFORMATION_MESSAGE);
            case 'C' -> Optional.of(SYMBOL_STATE_MESSAGE);
            case 'D' -> Optional.of(NEW_ORDER_ADD_MESSAGE);
            case 'F' -> Optional.of(ORDER_PARTIAL_CANCEL_MESSAGE);
            case 'G' -> Optional.of(ORDER_CANCEL_ALL_MESSAGE);
            case 'H' -> Optional.of(ORDER_UPDATED_MESSAGE);
            case 'J' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'K' -> Optional.of(TRADE_MESSAGE);
            case 'M' -> Optional.of(TRADE_BREAK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
