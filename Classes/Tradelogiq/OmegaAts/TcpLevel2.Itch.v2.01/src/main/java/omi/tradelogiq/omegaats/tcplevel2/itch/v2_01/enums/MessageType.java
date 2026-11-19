package omi.tradelogiq.omegaats.tcplevel2.itch.v2_01.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * At the start of each trading day, Tradelogiq disseminates stock directory messages for all supported securities.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, Tradelogiq disseminates stock directory messages for all supported securities."),

    /**
     * Extended Stock Directory messages carry the additional reference data of bonds, debentures, rights, notes and warrants.
     */
    EXTENDED_STOCK_DIRECTORY_MESSAGE('r', "Extended Stock Directory messages carry the additional reference data of bonds, debentures, rights, notes and warrants."),

    /**
     * Tradelogiq uses this administrative message to indicate the current trading status of a security.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Tradelogiq uses this administrative message to indicate the current trading status of a security."),

    /**
     * An Add Order Message indicates that a new order has been accepted by Omega ATS or Lynx ATS and was added to the visible order book.
     */
    ADD_ORDER_MESSAGE('A', "An Add Order Message indicates that a new order has been accepted by Omega ATS or Lynx ATS and was added to the visible order book."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part.
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever an order on the book is executed in whole or in part."),

    /**
     * This message is sent whenever an order on the book is executed at a display price different from the original.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent whenever an order on the book is executed at a display price different from the original."),

    /**
     * This message is sent whenever an order on the book is being cancelled.
     */
    ORDER_DELETE_MESSAGE('D', "This message is sent whenever an order on the book is being cancelled."),

    /**
     * This message is sent whenever an order on the book has been cancelled and replaced.
     */
    ORDER_REPLACE_MESSAGE('U', "This message is sent whenever an order on the book has been cancelled and replaced."),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation.
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation."),

    /**
     * The Trade Message is designed to provide execution details for normal match events involving non-displayed order types.
     */
    TRADE_MESSAGE('P', "The Trade Message is designed to provide execution details for normal match events involving non-displayed order types."),

    /**
     * Cross trades are only accepted on Omega ATS.
     */
    CROSS_TRADE_MESSAGE('Q', "Cross trades are only accepted on Omega ATS."),

    /**
     * The Trade Bust message is sent whenever an execution on Omega ATS or Lynx ATS is cancelled.
     */
    TRADE_BUST_MESSAGE('B', "The Trade Bust message is sent whenever an execution on Omega ATS or Lynx ATS is cancelled."),

    /**
     * The Trade Amend/Correction message is sent whenever an execution on Omega ATS or Lynx ATS is amended.
     */
    TRADE_AMEND_MESSAGE('M', "The Trade Amend/Correction message is sent whenever an execution on Omega ATS or Lynx ATS is amended.");

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
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'r' -> Optional.of(EXTENDED_STOCK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'Q' -> Optional.of(CROSS_TRADE_MESSAGE);
            case 'B' -> Optional.of(TRADE_BUST_MESSAGE);
            case 'M' -> Optional.of(TRADE_AMEND_MESSAGE);
            default -> Optional.empty();
        };
    }
}
