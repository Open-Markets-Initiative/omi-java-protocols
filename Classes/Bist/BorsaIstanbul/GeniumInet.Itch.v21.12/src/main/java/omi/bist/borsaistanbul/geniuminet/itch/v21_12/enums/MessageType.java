package omi.bist.borsaistanbul.geniuminet.itch.v21_12.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Sent every second for which at least one ITCH message is being generated. Contains the number of seconds since the start of 1970-01-01 00:00:00 UTC, also called Unix Time.
     */
    SECONDS_MESSAGE('T', "Sent every second for which at least one ITCH message is being generated. Contains the number of seconds since the start of 1970-01-01 00:00:00 UTC, also called Unix Time."),

    /**
     * At the start of each trading day, Order book directory messages are disseminated for all active securities, including halted securities. Intra-day transmissions may occur when new order books are added or updates to existing order books occur.
     */
    ORDER_BOOK_DIRECTORY('R', "At the start of each trading day, Order book directory messages are disseminated for all active securities, including halted securities. Intra-day transmissions may occur when new order books are added or updates to existing order books occur."),

    /**
     * Provides a mapping between a combination order book and one of the combination leg order books. One message is generated per leg that the combination consists of.
     */
    COMBINATION_ORDER_BOOK_LEG('M', "Provides a mapping between a combination order book and one of the combination leg order books. One message is generated per leg that the combination consists of."),

    /**
     * Contains information on a tick size for a price range. Together, all Tick Size messages with the same order book ID form a complete Tick Size Table.
     */
    TICK_SIZE_TABLE_ENTRY('L', "Contains information on a tick size for a price range. Together, all Tick Size messages with the same order book ID form a complete Tick Size Table."),

    /**
     * Indicates the short sell rules of an order book. Sent for order books which might have short sell allowing prior to the start of system. If an order book is absent from this message, clients should assume that the order book has no short selling rules at the start-of-day reference data messages. If short sell rules change during the day for an order book, this message will be re-sent for that order book.
     */
    SHORT_SELL_STATUS('V', "Indicates the short sell rules of an order book. Sent for order books which might have short sell allowing prior to the start of system. If an order book is absent from this message, clients should assume that the order book has no short selling rules at the start-of-day reference data messages. If short sell rules change during the day for an order book, this message will be re-sent for that order book."),

    /**
     * Used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "Used to signal a market or data feed handler event."),

    /**
     * Relays information on order book state changes.
     */
    ORDER_BOOK_STATE_MESSAGE('O', "Relays information on order book state changes."),

    /**
     * Indicates that a new order has been accepted by the Genium INET Trading system and was added to the displayable book. Generated for unattributed orders. The message includes an Order ID that is unique per order book and side.
     */
    ADD_ORDER_NO_MPID_ATTRIBUTION('A', "Indicates that a new order has been accepted by the Genium INET Trading system and was added to the displayable book. Generated for unattributed orders. The message includes an Order ID that is unique per order book and side."),

    /**
     * Note: This message is not used, it remains in the ITCH specification for future reference and is not applicable for BIST markets. Would be generated for attributed orders and quotations entered into the Genium INET Trading system.
     */
    ADD_ORDER_WITH_MPID_ATTRIBUTION('F', "Note: This message is not used, it remains in the ITCH specification for future reference and is not applicable for BIST markets. Would be generated for attributed orders and quotations entered into the Genium INET Trading system."),

    /**
     * Sent whenever an order on the book is executed in whole or in part. Modify Order messages always include the Order ID, Order book ID and Side of the Add Order to which the update applies.
     */
    ORDER_EXECUTED_MESSAGE('E', "Sent whenever an order on the book is executed in whole or in part. Modify Order messages always include the Order ID, Order book ID and Side of the Add Order to which the update applies."),

    /**
     * Sent in the relatively rare event that an order on the book is executed in whole or in part with a price different than the initial display price. Combination orders on the book that execute will always be represented by this message, with the Printable flag set to N; leg trades are published with the Trade message and are printable.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "Sent in the relatively rare event that an order on the book is executed in whole or in part with a price different than the initial display price. Combination orders on the book that execute will always be represented by this message, with the Printable flag set to N; leg trades are published with the Trade message and are printable."),

    /**
     * Note: This message is not used, it remains in the ITCH specification for future reference and is not applicable for BIST markets. A replace of an existing order would be represented by an Order Delete Message followed by an Order Add Message but the original order ID would remain. This message would be sent whenever an order on the book has been cancel-replaced. The Side and Order book ID remain the same as the original order.
     */
    ORDER_REPLACE_MESSAGE('U', "Note: This message is not used, it remains in the ITCH specification for future reference and is not applicable for BIST markets. A replace of an existing order would be represented by an Order Delete Message followed by an Order Add Message but the original order ID would remain. This message would be sent whenever an order on the book has been cancel-replaced. The Side and Order book ID remain the same as the original order."),

    /**
     * Sent whenever an order on the book is being deleted. There will be no remaining quantity, so the order should be removed from the book. Normally, no Order Delete message is sent when an order is completely filled.
     */
    ORDER_DELETE_MESSAGE('D', "Sent whenever an order on the book is being deleted. There will be no remaining quantity, so the order should be removed from the book. Normally, no Order Delete message is sent when an order is completely filled."),

    /**
     * Sent whenever an order book is flushed. All remaining orders are no longer accessible and should be removed from the book. Markets by order dissemination may be disabled during auctions by configuration; in such cases every existing order of the order book is removed by this message immediately prior to the auction. Owners of these orders must not interpret this as order cancellations, and should use the private order flow to determine the state of their orders.
     */
    ORDER_BOOK_FLUSH_MESSAGE('Y', "Sent whenever an order book is flushed. All remaining orders are no longer accessible and should be removed from the book. Markets by order dissemination may be disabled during auctions by configuration; in such cases every existing order of the order book is removed by this message immediately prior to the auction. Owners of these orders must not interpret this as order cancellations, and should use the private order flow to determine the state of their orders."),

    /**
     * Designed to provide execution details for normal match events involving non-displayable order types. Also used to publish individual cross trades. Since no Add Order Message is generated when a non-displayed order is initially received, the Order Executed message cannot be used for all matches; the Trade Message reports a match for a non-displayable order in the book. Trade Messages should be included in trade tickers as well as volume and other market statistics.
     */
    TRADE_MESSAGE('P', "Designed to provide execution details for normal match events involving non-displayable order types. Also used to publish individual cross trades. Since no Add Order Message is generated when a non-displayed order is initially received, the Order Executed message cannot be used for all matches; the Trade Message reports a match for a non-displayable order in the book. Trade Messages should be included in trade tickers as well as volume and other market statistics."),

    /**
     * Used when auctions occur. Provides the changes in equilibrium price. Markets by order dissemination may be disabled during auctions by configuration.
     */
    EQUILIBRIUM_PRICE_UPDATE('Z', "Used when auctions occur. Provides the changes in equilibrium price. Markets by order dissemination may be disabled during auctions by configuration.");

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
            case 'T' -> Optional.of(SECONDS_MESSAGE);
            case 'R' -> Optional.of(ORDER_BOOK_DIRECTORY);
            case 'M' -> Optional.of(COMBINATION_ORDER_BOOK_LEG);
            case 'L' -> Optional.of(TICK_SIZE_TABLE_ENTRY);
            case 'V' -> Optional.of(SHORT_SELL_STATUS);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'O' -> Optional.of(ORDER_BOOK_STATE_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_NO_MPID_ATTRIBUTION);
            case 'F' -> Optional.of(ADD_ORDER_WITH_MPID_ATTRIBUTION);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'Y' -> Optional.of(ORDER_BOOK_FLUSH_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'Z' -> Optional.of(EQUILIBRIUM_PRICE_UPDATE);
            default -> Optional.empty();
        };
    }
}
