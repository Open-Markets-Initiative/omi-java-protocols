package omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.enums;

import java.util.Optional;

/**
 * Message type identifier
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * The Heartbeat message carries no data; it is simply a message header with msgType of 1.
     */
    HEARTBEAT_MESSAGE((short) 1, "The Heartbeat message carries no data; it is simply a message header with msgType of 1."),

    /**
     * The Order Add message is published when order quantity is posted to the order book for a particular security. This message is only applicable to continuous trading.
     */
    ORDER_ADD_MESSAGE((short) 2, "The Order Add message is published when order quantity is posted to the order book for a particular security. This message is only applicable to continuous trading."),

    /**
     * The Order Cancel message is published when a visible order is removed from the book. This message is only applicable to continuous trading.
     */
    ORDER_CANCEL_MESSAGE((short) 3, "The Order Cancel message is published when a visible order is removed from the book. This message is only applicable to continuous trading."),

    /**
     * The Order Modify message is published when a visible order is modified by the client (change of price and/or quantity). The order reference number remains the same on order modification. This message is only applicable to continuous trading.
     */
    ORDER_MODIFY_MESSAGE((short) 4, "The Order Modify message is published when a visible order is modified by the client (change of price and/or quantity). The order reference number remains the same on order modification. This message is only applicable to continuous trading."),

    /**
     * The Quote Add/Replace message is published when a quote is available for a particular security.
     */
    QUOTE_ADD_REPLACE_MESSAGE((short) 20, "The Quote Add/Replace message is published when a quote is available for a particular security."),

    /**
     * The Quote Cancel message is published when a quote is removed for a particular security. The quote may have been cancelled by the trading Member or by the Aquis support team or the market may have closed.
     */
    QUOTE_CANCEL_MESSAGE((short) 21, "The Quote Cancel message is published when a quote is removed for a particular security. The quote may have been cancelled by the trading Member or by the Aquis support team or the market may have closed."),

    /**
     * Whenever an order trades, partially or fully, a Trade message is published.
     */
    TRADE_MESSAGE((short) 5, "Whenever an order trades, partially or fully, a Trade message is published."),

    /**
     * Whenever a new trade report is submitted to AQSE, a Trade Report message is published.
     */
    TRADE_REPORT_MESSAGE((short) 25, "Whenever a new trade report is submitted to AQSE, a Trade Report message is published."),

    /**
     * Whenever a previously published trade report is modified, a Trade Report Modify message is published. Members can modify trades for up to five business days from the day on which the trade was reported.
     */
    TRADE_REPORT_MODIFY_MESSAGE((short) 26, "Whenever a previously published trade report is modified, a Trade Report Modify message is published. Members can modify trades for up to five business days from the day on which the trade was reported."),

    /**
     * Whenever a previously published trade report is cancelled, a Trade Report Cancel message is published. Members can cancel trades for up to five business days from the day on which the trade was reported.
     */
    TRADE_REPORT_CANCEL_MESSAGE((short) 27, "Whenever a previously published trade report is cancelled, a Trade Report Cancel message is published. Members can cancel trades for up to five business days from the day on which the trade was reported."),

    /**
     * If a trade has been declared erroneous by AQSE then a Trade Bust message is published. This message is only applicable to order generated trades.
     */
    TRADE_BUST_MESSAGE((short) 6, "If a trade has been declared erroneous by AQSE then a Trade Bust message is published. This message is only applicable to order generated trades."),

    /**
     * The Security Statistics message is published to disseminate the opening and closing prices of a security.
     */
    SECURITY_STATISTICS_MESSAGE((short) 22, "The Security Statistics message is published to disseminate the opening and closing prices of a security."),

    /**
     * A series of Trader Definition messages are published pre-market to identify the quote originators.
     */
    TRADER_DEFINITION_MESSAGE((short) 23, "A series of Trader Definition messages are published pre-market to identify the quote originators."),

    /**
     * A series of Tick Table Data messages are published pre-market to specify the dynamic tick tables and static ticks that apply to the securities traded on AQSE.
     */
    TICK_TABLE_DATA_MESSAGE((short) 7, "A series of Tick Table Data messages are published pre-market to specify the dynamic tick tables and static ticks that apply to the securities traded on AQSE."),

    /**
     * A series of Security Definition messages are published pre-market to identify the securities traded on AQSE (those relevant to the particular feed e.g. Euronext securities).
     */
    SECURITY_DEFINITION_MESSAGE((short) 8, "A series of Security Definition messages are published pre-market to identify the securities traded on AQSE (those relevant to the particular feed e.g. Euronext securities)."),

    /**
     * The Security Status message is published when the trading status of a security changes or when there is a change to the status of the market on AQSE to which the security belongs.
     */
    SECURITY_STATUS_MESSAGE((short) 9, "The Security Status message is published when the trading status of a security changes or when there is a change to the status of the market on AQSE to which the security belongs."),

    /**
     * During the AoD this message is used to publish the indicative price and indicative matched volume. The first AoD update message signals the start of an auction.
     */
    AOD_UPDATE_MESSAGE((short) 17, "During the AoD this message is used to publish the indicative price and indicative matched volume. The first AoD update message signals the start of an auction.");

    private final short wire;

    private final String description;

    MsgType(short wire, String description) {
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
    public static Optional<MsgType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(HEARTBEAT_MESSAGE);
            case 2 -> Optional.of(ORDER_ADD_MESSAGE);
            case 3 -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 4 -> Optional.of(ORDER_MODIFY_MESSAGE);
            case 20 -> Optional.of(QUOTE_ADD_REPLACE_MESSAGE);
            case 21 -> Optional.of(QUOTE_CANCEL_MESSAGE);
            case 5 -> Optional.of(TRADE_MESSAGE);
            case 25 -> Optional.of(TRADE_REPORT_MESSAGE);
            case 26 -> Optional.of(TRADE_REPORT_MODIFY_MESSAGE);
            case 27 -> Optional.of(TRADE_REPORT_CANCEL_MESSAGE);
            case 6 -> Optional.of(TRADE_BUST_MESSAGE);
            case 22 -> Optional.of(SECURITY_STATISTICS_MESSAGE);
            case 23 -> Optional.of(TRADER_DEFINITION_MESSAGE);
            case 7 -> Optional.of(TICK_TABLE_DATA_MESSAGE);
            case 8 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 9 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 17 -> Optional.of(AOD_UPDATE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
