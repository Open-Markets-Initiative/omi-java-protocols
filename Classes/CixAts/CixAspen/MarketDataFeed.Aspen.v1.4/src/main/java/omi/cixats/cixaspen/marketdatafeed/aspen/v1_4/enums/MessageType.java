package omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.enums;

import java.util.Optional;

/**
 * Code identifying message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Transitions in the overall session state
     */
    MARKET_EVENT_MESSAGE('A', "Transitions in the overall session state"),

    /**
     * Reference data for each symbol that may be traded
     */
    SYMBOL_INFORMATION_MESSAGE('B', "Reference data for each symbol that may be traded"),

    /**
     * Individual symbol trading state (halts)
     */
    SYMBOL_STATE_MESSAGE('C', "Individual symbol trading state (halts)"),

    /**
     * A new resting order added to the book
     */
    NEW_ORDER_ADD_MESSAGE('D', "A new resting order added to the book"),

    /**
     * Part of a resting order is canceled
     */
    ORDER_PARTIAL_CANCEL_MESSAGE('F', "Part of a resting order is canceled"),

    /**
     * Sent when the order is canceled in its entirety
     */
    ORDER_CANCEL_ALL_MESSAGE('G', "Sent when the order is canceled in its entirety"),

    /**
     * Sent when an order is executed
     */
    ORDER_EXECUTED_MESSAGE('J', "Sent when an order is executed"),

    /**
     * Sent when a hidden order is executed
     */
    TRADE_MESSAGE('K', "Sent when a hidden order is executed"),

    /**
     * Sent whenever an execution on CIX ATS is cancelled
     */
    TRADE_CANCEL_MESSAGE('L', "Sent whenever an execution on CIX ATS is cancelled"),

    /**
     * Sent whenever an execution on CIX ATS is amended
     */
    TRADE_CORRECT_MESSAGE('M', "Sent whenever an execution on CIX ATS is amended");

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
            case 'J' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'K' -> Optional.of(TRADE_MESSAGE);
            case 'L' -> Optional.of(TRADE_CANCEL_MESSAGE);
            case 'M' -> Optional.of(TRADE_CORRECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
