package omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * This message is sent every second for which at least one TotalView-ITCH 3.0 message is being generated.
     */
    SECONDS_MESSAGE('T', "This message is sent every second for which at least one TotalView-ITCH 3.0 message is being generated."),

    /**
     * This message is sent every millisecond for which at least one TotalView-ITCH 3.0 message is being generated.
     */
    MILLISECONDS_MESSAGE('M', "This message is sent every millisecond for which at least one TotalView-ITCH 3.0 message is being generated."),

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * At the start of each trading day, NASDAQ disseminates stock directory messages for all active symbols in Single Book.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, NASDAQ disseminates stock directory messages for all active symbols in Single Book."),

    /**
     * NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * At the start of each trading day, NASDAQ disseminates a spin of market participant position messages. Throughout the day, NASDAQ will send out this message only if NASDAQ Operations changes the status of a market participant firm in an issue.
     */
    MARKET_PARTICIPANT_POSITION_MESSAGE('L', "At the start of each trading day, NASDAQ disseminates a spin of market participant position messages. Throughout the day, NASDAQ will send out this message only if NASDAQ Operations changes the status of a market participant firm in an issue."),

    /**
     * An Add Order Message indicates that a new order has been accepted by the NASDAQ system and was added to the displayable book. This message will be generated for unattributed orders in the NASDAQ Single Book system.
     */
    ADD_ORDER_MESSAGE('A', "An Add Order Message indicates that a new order has been accepted by the NASDAQ system and was added to the displayable book. This message will be generated for unattributed orders in the NASDAQ Single Book system."),

    /**
     * This message will be generated for attributed orders and quotations entered into the NASDAQ Single Book system.
     */
    ADD_ORDER_WITH_MPID_MESSAGE('F', "This message will be generated for attributed orders and quotations entered into the NASDAQ Single Book system."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part.
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever an order on the book is executed in whole or in part."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price."),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation.
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation."),

    /**
     * This message is sent whenever an order on the book is being cancelled. All remaining shares are no longer accessible so the order should be removed from the book.
     */
    ORDER_DELETE_MESSAGE('D', "This message is sent whenever an order on the book is being cancelled. All remaining shares are no longer accessible so the order should be removed from the book."),

    /**
     * The Trade Message is designed to provide execution details for normal match events involving non-displayable order types.
     */
    TRADE_MESSAGE('P', "The Trade Message is designed to provide execution details for normal match events involving non-displayable order types."),

    /**
     * Cross Trade message indicates that NASDAQ has completed its cross process for a specific security.
     */
    CROSS_TRADE_MESSAGE('Q', "Cross Trade message indicates that NASDAQ has completed its cross process for a specific security."),

    /**
     * The Broken Trade Message is sent whenever an execution on NASDAQ is broken.
     */
    BROKEN_TRADE_MESSAGE('B', "The Broken Trade Message is sent whenever an execution on NASDAQ is broken."),

    /**
     * NOII data is disseminated at 5-second intervals in the minutes leading up to the NASDAQ Opening Cross, NASDAQ Closing Cross, and NASDAQ IPO/Halt Cross.
     */
    NET_ORDER_IMBALANCE_INDICATOR_MESSAGE('I', "NOII data is disseminated at 5-second intervals in the minutes leading up to the NASDAQ Opening Cross, NASDAQ Closing Cross, and NASDAQ IPO/Halt Cross.");

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
            case 'M' -> Optional.of(MILLISECONDS_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'L' -> Optional.of(MARKET_PARTICIPANT_POSITION_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'F' -> Optional.of(ADD_ORDER_WITH_MPID_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'Q' -> Optional.of(CROSS_TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'I' -> Optional.of(NET_ORDER_IMBALANCE_INDICATOR_MESSAGE);
            default -> Optional.empty();
        };
    }
}
