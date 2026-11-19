package omi.cboe.bxeequities.multicastdepthofbook.pitch.v6_24.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Time
     */
    TIME_MESSAGE((short) 32, "Time"),

    /**
     * Unit Clear
     */
    UNIT_CLEAR_MESSAGE((short) 151, "Unit Clear"),

    /**
     * Add Order — Long
     */
    ADD_ORDER_LONG_MESSAGE((short) 64, "Add Order \u2014 Long"),

    /**
     * Add Order — Short
     */
    ADD_ORDER_SHORT_MESSAGE((short) 34, "Add Order \u2014 Short"),

    /**
     * Add Order — Expanded
     */
    ADD_ORDER_EXPANDED_MESSAGE((short) 47, "Add Order \u2014 Expanded"),

    /**
     * Order Executed
     */
    ORDER_EXECUTED_MESSAGE((short) 35, "Order Executed"),

    /**
     * Order Executed at Price/Size
     */
    ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE((short) 36, "Order Executed at Price/Size"),

    /**
     * Reduce Size — Long
     */
    REDUCE_SIZE_LONG_MESSAGE((short) 37, "Reduce Size \u2014 Long"),

    /**
     * Reduce Size — Short
     */
    REDUCE_SIZE_SHORT_MESSAGE((short) 38, "Reduce Size \u2014 Short"),

    /**
     * Modify Order — Long
     */
    MODIFY_ORDER_LONG_MESSAGE((short) 39, "Modify Order \u2014 Long"),

    /**
     * Modify Order — Short
     */
    MODIFY_ORDER_SHORT_MESSAGE((short) 40, "Modify Order \u2014 Short"),

    /**
     * Delete Order
     */
    DELETE_ORDER_MESSAGE((short) 41, "Delete Order"),

    /**
     * Trade — Long
     */
    TRADE_LONG_MESSAGE((short) 65, "Trade \u2014 Long"),

    /**
     * Trade — Short
     */
    TRADE_SHORT_MESSAGE((short) 43, "Trade \u2014 Short"),

    /**
     * Trade — Extended
     */
    TRADE_EXTENDED_MESSAGE((short) 50, "Trade \u2014 Extended"),

    /**
     * Trade — Unknown Symbol
     */
    TRADE_UNKNOWN_SYMBOL_MESSAGE((short) 53, "Trade \u2014 Unknown Symbol"),

    /**
     * End of Session
     */
    END_OF_SESSION_MESSAGE((short) 45, "End of Session"),

    /**
     * Transaction Begin
     */
    TRANSACTION_BEGIN_MESSAGE((short) 188, "Transaction Begin"),

    /**
     * Transaction End
     */
    TRANSACTION_END_MESSAGE((short) 189, "Transaction End"),

    /**
     * Trading Status
     */
    TRADING_STATUS_MESSAGE((short) 49, "Trading Status"),

    /**
     * Statistics Message
     */
    STATISTICS_MESSAGE((short) 52, "Statistics Message"),

    /**
     * Auction Update Message
     */
    AUCTION_UPDATE_MESSAGE((short) 172, "Auction Update Message"),

    /**
     * Auction Summary Message
     */
    AUCTION_SUMMARY_MESSAGE((short) 150, "Auction Summary Message");

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
            case 32 -> Optional.of(TIME_MESSAGE);
            case 151 -> Optional.of(UNIT_CLEAR_MESSAGE);
            case 64 -> Optional.of(ADD_ORDER_LONG_MESSAGE);
            case 34 -> Optional.of(ADD_ORDER_SHORT_MESSAGE);
            case 47 -> Optional.of(ADD_ORDER_EXPANDED_MESSAGE);
            case 35 -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 36 -> Optional.of(ORDER_EXECUTED_AT_PRICE_SIZE_MESSAGE);
            case 37 -> Optional.of(REDUCE_SIZE_LONG_MESSAGE);
            case 38 -> Optional.of(REDUCE_SIZE_SHORT_MESSAGE);
            case 39 -> Optional.of(MODIFY_ORDER_LONG_MESSAGE);
            case 40 -> Optional.of(MODIFY_ORDER_SHORT_MESSAGE);
            case 41 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 65 -> Optional.of(TRADE_LONG_MESSAGE);
            case 43 -> Optional.of(TRADE_SHORT_MESSAGE);
            case 50 -> Optional.of(TRADE_EXTENDED_MESSAGE);
            case 53 -> Optional.of(TRADE_UNKNOWN_SYMBOL_MESSAGE);
            case 45 -> Optional.of(END_OF_SESSION_MESSAGE);
            case 188 -> Optional.of(TRANSACTION_BEGIN_MESSAGE);
            case 189 -> Optional.of(TRANSACTION_END_MESSAGE);
            case 49 -> Optional.of(TRADING_STATUS_MESSAGE);
            case 52 -> Optional.of(STATISTICS_MESSAGE);
            case 172 -> Optional.of(AUCTION_UPDATE_MESSAGE);
            case 150 -> Optional.of(AUCTION_SUMMARY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
