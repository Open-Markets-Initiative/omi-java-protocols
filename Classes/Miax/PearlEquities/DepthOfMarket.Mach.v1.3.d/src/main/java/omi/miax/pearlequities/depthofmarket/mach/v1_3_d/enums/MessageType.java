package omi.miax.pearlequities.depthofmarket.mach.v1_3_d.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * This message is used to disseminate the "seconds" part of the timestamp that is applicable to all messages that are sent in the current second.
     */
    SYSTEM_TIME_MESSAGE((short) 49, "This message is used to disseminate the \"seconds\" part of the timestamp that is applicable to all messages that are sent in the current second."),

    /**
     * This is the message format that will be used to disseminate all security symbols traded on MIAX Pearl Equities for the current trading session. The Symbol ID sent in this message will be disseminated in Depth of Market messages.
     */
    SYMBOL_UPDATE_MESSAGE((short) 1, "This is the message format that will be used to disseminate all security symbols traded on MIAX Pearl Equities for the current trading session. The Symbol ID sent in this message will be disseminated in Depth of Market messages."),

    /**
     * This is the message format that will be used to notify firms of the state changes of the system. This is a notification that applies to all symbols on the feed.
     */
    SYSTEM_STATE_MESSAGE((short) 83, "This is the message format that will be used to notify firms of the state changes of the system. This is a notification that applies to all symbols on the feed."),

    /**
     * This message is used to notify firms of changes to the trading status of a particular security.
     */
    SECURITY_TRADING_STATUS_NOTIFICATION_MESSAGE((short) 4, "This message is used to notify firms of changes to the trading status of a particular security."),

    /**
     * This message format is used to indicate that the MIAX Pearl Equities book for a symbol has been cleared of all orders.
     */
    SYMBOL_CLEAR_MESSAGE((short) 5, "This message format is used to indicate that the MIAX Pearl Equities book for a symbol has been cleared of all orders."),

    /**
     * This is the message format that will be used when a displayed order is received and added to MIAX Pearl Equities book. It includes an Order ID that is unique to the order across the exchange and across trading days.
     */
    ADD_ORDER_MESSAGE((short) 20, "This is the message format that will be used when a displayed order is received and added to MIAX Pearl Equities book. It includes an Order ID that is unique to the order across the exchange and across trading days."),

    /**
     * This message format is used to publish price/size changes for an existing displayed order on MIAX Pearl Equities book.
     */
    MODIFY_ORDER_MESSAGE((short) 21, "This message format is used to publish price/size changes for an existing displayed order on MIAX Pearl Equities book."),

    /**
     * This message format is used to indicate that a displayed order has been removed from the MIAX Pearl Equities book.
     */
    DELETE_ORDER_MESSAGE((short) 23, "This message format is used to indicate that a displayed order has been removed from the MIAX Pearl Equities book."),

    /**
     * This message format is used when a displayed order on the book executes in whole or in part. The execution is identified by a unique Trade ID that is unique across the exchange for the trading day. Subsequent partial executions of the order would be published with the same Order ID but different Trade ID.
     */
    ORDER_EXECUTION_MESSAGE((short) 24, "This message format is used when a displayed order on the book executes in whole or in part. The execution is identified by a unique Trade ID that is unique across the exchange for the trading day. Subsequent partial executions of the order would be published with the same Order ID but different Trade ID."),

    /**
     * This message format is used to publish trade executions for orders not displayed on the book. Executions for orders routed and executed in another trading center and trade corrections are also published using this message.
     */
    TRADE_MESSAGE((short) 10, "This message format is used to publish trade executions for orders not displayed on the book. Executions for orders routed and executed in another trading center and trade corrections are also published using this message."),

    /**
     * This message format is used to publish cancellation of a trade which was previously published via an Order Execution Message or a Trade Message.
     */
    TRADE_CANCEL_MESSAGE((short) 11, "This message format is used to publish cancellation of a trade which was previously published via an Order Execution Message or a Trade Message.");

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
            case 49 -> Optional.of(SYSTEM_TIME_MESSAGE);
            case 1 -> Optional.of(SYMBOL_UPDATE_MESSAGE);
            case 83 -> Optional.of(SYSTEM_STATE_MESSAGE);
            case 4 -> Optional.of(SECURITY_TRADING_STATUS_NOTIFICATION_MESSAGE);
            case 5 -> Optional.of(SYMBOL_CLEAR_MESSAGE);
            case 20 -> Optional.of(ADD_ORDER_MESSAGE);
            case 21 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 23 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 24 -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 10 -> Optional.of(TRADE_MESSAGE);
            case 11 -> Optional.of(TRADE_CANCEL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
