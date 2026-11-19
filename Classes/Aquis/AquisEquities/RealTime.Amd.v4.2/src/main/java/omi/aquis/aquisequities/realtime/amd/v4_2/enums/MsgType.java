package omi.aquis.aquisequities.realtime.amd.v4_2.enums;

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
     * The bundle start and end messages are published when a group of messages is generated within the same sequencer cycle. MD Bundle Start is sent at the beginning of the cycle, before any associated messages are published.
     */
    MD_BUNDLE_START_MESSAGE((short) 34, "The bundle start and end messages are published when a group of messages is generated within the same sequencer cycle. MD Bundle Start is sent at the beginning of the cycle, before any associated messages are published."),

    /**
     * Md Bundle End is sent at the conclusion of the bundle to indicate that all messages generated during the sequencer cycle have now been published.
     */
    MD_BUNDLE_END_MESSAGE((short) 35, "Md Bundle End is sent at the conclusion of the bundle to indicate that all messages generated during the sequencer cycle have now been published."),

    /**
     * The Order Add message is published when order quantity is posted to the order book for a particular security.
     */
    ORDER_ADD_MESSAGE((short) 2, "The Order Add message is published when order quantity is posted to the order book for a particular security."),

    /**
     * The Order Cancel message is published when a visible order is removed from the book.
     */
    ORDER_CANCEL_MESSAGE((short) 3, "The Order Cancel message is published when a visible order is removed from the book."),

    /**
     * The Order Modify message is published when a visible order is modified by the client (change of price and/or quantity).
     */
    ORDER_MODIFY_MESSAGE((short) 4, "The Order Modify message is published when a visible order is modified by the client (change of price and/or quantity)."),

    /**
     * Whenever an order trades, partially or fully, a Trade message is published.
     */
    TRADE_MESSAGE((short) 5, "Whenever an order trades, partially or fully, a Trade message is published."),

    /**
     * If a trade has been declared erroneous by Aquis then a Trade Bust message is published.
     */
    TRADE_BUST_MESSAGE((short) 6, "If a trade has been declared erroneous by Aquis then a Trade Bust message is published."),

    /**
     * A series of Tick Table Data messages are published pre-market to specify the dynamic tick tables and static ticks that apply to the securities traded on Aquis.
     */
    TICK_TABLE_DATA_MESSAGE((short) 7, "A series of Tick Table Data messages are published pre-market to specify the dynamic tick tables and static ticks that apply to the securities traded on Aquis."),

    /**
     * A series of Security Definition messages are published pre-market to identify the securities traded on Aquis (those relevant to the particular feed e.g. Euronext securities).
     */
    SECURITY_DEFINITION_MESSAGE((short) 8, "A series of Security Definition messages are published pre-market to identify the securities traded on Aquis (those relevant to the particular feed e.g. Euronext securities)."),

    /**
     * The Security Status message is published when the trading status of a security changes or when there is a change to the status of the market on Aquis to which the security belongs.
     */
    SECURITY_STATUS_MESSAGE((short) 9, "The Security Status message is published when the trading status of a security changes or when there is a change to the status of the market on Aquis to which the security belongs."),

    /**
     * During the AoD this message is used to publish the indicative price and indicative matched volume.
     */
    AOD_UPDATE_MESSAGE((short) 17, "During the AoD this message is used to publish the indicative price and indicative matched volume."),

    /**
     * During the MaC this message is used to publish the indicative price from the buy and sell order totals.
     */
    MAC_UPDATE_MESSAGE((short) 16, "During the MaC this message is used to publish the indicative price from the buy and sell order totals.");

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
            case 34 -> Optional.of(MD_BUNDLE_START_MESSAGE);
            case 35 -> Optional.of(MD_BUNDLE_END_MESSAGE);
            case 2 -> Optional.of(ORDER_ADD_MESSAGE);
            case 3 -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 4 -> Optional.of(ORDER_MODIFY_MESSAGE);
            case 5 -> Optional.of(TRADE_MESSAGE);
            case 6 -> Optional.of(TRADE_BUST_MESSAGE);
            case 7 -> Optional.of(TICK_TABLE_DATA_MESSAGE);
            case 8 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 9 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 17 -> Optional.of(AOD_UPDATE_MESSAGE);
            case 16 -> Optional.of(MAC_UPDATE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
