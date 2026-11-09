package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Higher-level protocol message type code identifying the payload that follows. Interpretation is protocol-specific.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Client-specified limit order.
     */
    LIMIT_ORDER_MESSAGE((short) 76, "Client-specified limit order."),

    /**
     * Client-specified market order.
     */
    MARKET_ORDER_MESSAGE((short) 65, "Client-specified market order."),

    /**
     * Cancel all outstanding shares of an order.
     */
    CANCEL_ORDER_MESSAGE((short) 67, "Cancel all outstanding shares of an order."),

    /**
     * Request to modify an existing order without losing book priority.
     */
    MODIFY_ORDER_MESSAGE((short) 77, "Request to modify an existing order without losing book priority."),

    /**
     * Replace an existing order with a new order, always losing priority.
     */
    REPLACE_ORDER_MESSAGE((short) 82, "Replace an existing order with a new order, always losing priority."),

    /**
     * Cancels all resting orders matching the specified scope and optional filters.
     */
    MASS_CANCEL_MESSAGE((short) 86, "Cancels all resting orders matching the specified scope and optional filters."),

    /**
     * Market-wide status representing the overall state of the trading session.
     */
    TRADING_SESSION_STATUS_MESSAGE((short) 105, "Market-wide status representing the overall state of the trading session."),

    /**
     * Symbol definition containing instrument details and trading parameters. A DefineSymbol will be followed by a SymbolStatus message establishing the initial trading state for the symbol. Clients must treat a symbol as operationally HALTED while awaiting the accompanying SymbolStatus.
     */
    DEFINE_SYMBOL_MESSAGE((short) 115, "Symbol definition containing instrument details and trading parameters. A DefineSymbol will be followed by a SymbolStatus message establishing the initial trading state for the symbol. Clients must treat a symbol as operationally HALTED while awaiting the accompanying SymbolStatus."),

    /**
     * Symbol-specific trading status representing the current state and restrictions for an individual security. A SymbolStatus is sent for every symbol, including those that open in the TRADING state. Clients must treat a symbol as operationally HALTED while awaiting the first SymbolStatus. Subsequent SymbolStatus messages are sent whenever the trading state or short-sale restriction changes.
     */
    SYMBOL_STATUS_MESSAGE((short) 121, "Symbol-specific trading status representing the current state and restrictions for an individual security. A SymbolStatus is sent for every symbol, including those that open in the TRADING state. Clients must treat a symbol as operationally HALTED while awaiting the first SymbolStatus. Subsequent SymbolStatus messages are sent whenever the trading state or short-sale restriction changes."),

    /**
     * Acknowledges acceptance of a submitted LimitOrder.
     */
    LIMIT_ORDER_ACCEPTED_MESSAGE((short) 73, "Acknowledges acceptance of a submitted LimitOrder."),

    /**
     * The submitted limit order has been rejected by the Exchange.
     */
    LIMIT_ORDER_REJECTED_MESSAGE((short) 85, "The submitted limit order has been rejected by the Exchange."),

    /**
     * Acknowledges acceptance of a submitted MarketOrder.
     */
    MARKET_ORDER_ACCEPTED_MESSAGE((short) 68, "Acknowledges acceptance of a submitted MarketOrder."),

    /**
     * The submitted market order has been rejected by the Exchange.
     */
    MARKET_ORDER_REJECTED_MESSAGE((short) 84, "The submitted market order has been rejected by the Exchange."),

    /**
     * This order has been canceled. No shares are left on the Exchange. The Member will receive this message in response to a CancelOrder message, as well as unsolicited messages from the Exchange for various reasons.
     */
    ORDER_CANCELED_MESSAGE((short) 88, "This order has been canceled. No shares are left on the Exchange. The Member will receive this message in response to a CancelOrder message, as well as unsolicited messages from the Exchange for various reasons."),

    /**
     * The requested CancelOrder has been rejected.
     */
    CANCEL_REJECTED_MESSAGE((short) 87, "The requested CancelOrder has been rejected."),

    /**
     * An order has been modified.
     */
    ORDER_MODIFIED_MESSAGE((short) 89, "An order has been modified."),

    /**
     * The requested ModifyOrder has been rejected.
     */
    MODIFY_REJECTED_MESSAGE((short) 78, "The requested ModifyOrder has been rejected."),

    /**
     * Replace an existing order with a new order.
     */
    ORDER_REPLACED_MESSAGE((short) 74, "Replace an existing order with a new order."),

    /**
     * The requested ReplaceOrder has been rejected.
     */
    REPLACE_REJECTED_MESSAGE((short) 75, "The requested ReplaceOrder has been rejected."),

    /**
     * An order has executed.
     */
    ORDER_EXECUTED_MESSAGE((short) 69, "An order has executed."),

    /**
     * Informational message from the Exchange. Sent when the Exchange performs work on the Member's order, such as repricing after entry or a reserve replenishment. For a replenishment, the OrderId refers to the new displayed portion of the order. For a repricing, the OrderId is the new OrderId for the entire order. This message is informational.
     */
    ORDER_RESTATED_MESSAGE((short) 70, "Informational message from the Exchange. Sent when the Exchange performs work on the Member's order, such as repricing after entry or a reserve replenishment. For a replenishment, the OrderId refers to the new displayed portion of the order. For a repricing, the OrderId is the new OrderId for the entire order. This message is informational."),

    /**
     * Notification that a self-match was detected and prevented according to the order's self-match prevention instructions. The message reports the quantity that would have executed, the quantity that was canceled, and the remaining quantity still active on the book.
     */
    SELF_MATCH_PREVENTED_MESSAGE((short) 90, "Notification that a self-match was detected and prevented according to the order's self-match prevention instructions. The message reports the quantity that would have executed, the quantity that was canceled, and the remaining quantity still active on the book."),

    /**
     * The Mass Cancel has been accepted and is being processed.
     */
    MASS_CANCEL_ACCEPTED_MESSAGE((short) 79, "The Mass Cancel has been accepted and is being processed."),

    /**
     * The Mass Cancel has been rejected.
     */
    MASS_CANCEL_REJECTED_MESSAGE((short) 80, "The Mass Cancel has been rejected."),

    /**
     * Confirms sweep completion. Sent after all affected orders have been canceled.
     */
    MASS_CANCEL_RESULT_MESSAGE((short) 81, "Confirms sweep completion. Sent after all affected orders have been canceled.");

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
            case 76 -> Optional.of(LIMIT_ORDER_MESSAGE);
            case 65 -> Optional.of(MARKET_ORDER_MESSAGE);
            case 67 -> Optional.of(CANCEL_ORDER_MESSAGE);
            case 77 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 82 -> Optional.of(REPLACE_ORDER_MESSAGE);
            case 86 -> Optional.of(MASS_CANCEL_MESSAGE);
            case 105 -> Optional.of(TRADING_SESSION_STATUS_MESSAGE);
            case 115 -> Optional.of(DEFINE_SYMBOL_MESSAGE);
            case 121 -> Optional.of(SYMBOL_STATUS_MESSAGE);
            case 73 -> Optional.of(LIMIT_ORDER_ACCEPTED_MESSAGE);
            case 85 -> Optional.of(LIMIT_ORDER_REJECTED_MESSAGE);
            case 68 -> Optional.of(MARKET_ORDER_ACCEPTED_MESSAGE);
            case 84 -> Optional.of(MARKET_ORDER_REJECTED_MESSAGE);
            case 88 -> Optional.of(ORDER_CANCELED_MESSAGE);
            case 87 -> Optional.of(CANCEL_REJECTED_MESSAGE);
            case 89 -> Optional.of(ORDER_MODIFIED_MESSAGE);
            case 78 -> Optional.of(MODIFY_REJECTED_MESSAGE);
            case 74 -> Optional.of(ORDER_REPLACED_MESSAGE);
            case 75 -> Optional.of(REPLACE_REJECTED_MESSAGE);
            case 69 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 70 -> Optional.of(ORDER_RESTATED_MESSAGE);
            case 90 -> Optional.of(SELF_MATCH_PREVENTED_MESSAGE);
            case 79 -> Optional.of(MASS_CANCEL_ACCEPTED_MESSAGE);
            case 80 -> Optional.of(MASS_CANCEL_REJECTED_MESSAGE);
            case 81 -> Optional.of(MASS_CANCEL_RESULT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
