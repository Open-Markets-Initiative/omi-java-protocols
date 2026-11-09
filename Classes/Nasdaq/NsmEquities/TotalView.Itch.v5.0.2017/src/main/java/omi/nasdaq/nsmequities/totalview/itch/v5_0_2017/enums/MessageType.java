package omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Reflects the number of seconds past midnight that the Timestamp message was generated.
     */
    SYSTEM_EVENT_MESSAGE('S', "Reflects the number of seconds past midnight that the Timestamp message was generated."),

    /**
     * Market data redistributors should process this message to populate the Financial Status Indicator (required display field) and the Market Category (recommended display field) for NASDAQ-listed issues.
     */
    STOCK_DIRECTORY_MESSAGE('R', "Market data redistributors should process this message to populate the Financial Status Indicator (required display field) and the Market Category (recommended display field) for NASDAQ-listed issues."),

    /**
     * NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * NASDAQ processes orders based on the most Reg SHO Restriction status value.
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "NASDAQ processes orders based on the most Reg SHO Restriction status value."),

    /**
     * Throughout the day, NASDAQ will send out this message only if NASDAQ Operations changes the status of a market participant firm in an issue.
     */
    MARKET_PARTICIPANT_POSITION_MESSAGE('L', "Throughout the day, NASDAQ will send out this message only if NASDAQ Operations changes the status of a market participant firm in an issue."),

    /**
     * Informs data recipients what the daily MWCB breach points are set to for the current trading day.
     */
    MWCB_DECLINE_LEVEL_MESSAGE('V', "Informs data recipients what the daily MWCB breach points are set to for the current trading day."),

    /**
     * Informs data recipients when a MWCB has breached one of the established levels
     */
    MWCB_STATUS_LEVEL_MESSAGE('W', "Informs data recipients when a MWCB has breached one of the established levels"),

    /**
     * Indicates the anticipated IPO quotation release time of a security.
     */
    IPO_QUOTING_PERIOD_UPDATE('K', "Indicates the anticipated IPO quotation release time of a security."),

    /**
     * Indicates the auction collar thresholds within which a paused security can reopen following a LULD Trading Pause
     */
    LULD_AUCTION_COLLAR_MESSAGE('J', "Indicates the auction collar thresholds within which a paused security can reopen following a LULD Trading Pause"),

    /**
     * This message will be generated for unattributed orders accepted by the Nasdaq system.
     */
    ADD_ORDER_NO_MPID_ATTRIBUTION_MESSAGE('A', "This message will be generated for unattributed orders accepted by the Nasdaq system."),

    /**
     * This message will be generated for attributed orders and quotations accepted by the NASDAQ system.
     */
    ADD_ORDER_WITH_MPID_ATTRIBUTION_MESSAGE('F', "This message will be generated for attributed orders and quotations accepted by the NASDAQ system."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part. It is possible to receive several Order Executed Messages for the same order reference number if that order is executed in several parts. The multiple Order Executed Messages on the same order are cumulative.
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever an order on the book is executed in whole or in part. It is possible to receive several Order Executed Messages for the same order reference number if that order is executed in several parts. The multiple Order Executed Messages on the same order are cumulative."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price. Since the execution price is different than the display price of the original Add Order, NASDAQ includes a price field within this execution message.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price. Since the execution price is different than the display price of the original Add Order, NASDAQ includes a price field within this execution message."),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation.
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation."),

    /**
     * This message is sent whenever an order on the book is being cancelled. All remaining shares are no longer accessible so the order must be removed from the book.
     */
    ORDER_DELETE_MESSAGE('D', "This message is sent whenever an order on the book is being cancelled. All remaining shares are no longer accessible so the order must be removed from the book."),

    /**
     * This message is sent whenever an order on the book has been cancel-replaced. All remaining shares from the original order are no longer accessible, and must be removed. The new order details are provided for the replacement, along with a new order reference number which will be used henceforth. Since the side, stock symbol and attribution (if any) cannot be changed by an Order Replace event, these fields are not included in the message. Firms should retain the side, stock symbol and MPID from the original Add Order message.
     */
    ORDER_REPLACE_MESSAGE('U', "This message is sent whenever an order on the book has been cancel-replaced. All remaining shares from the original order are no longer accessible, and must be removed. The new order details are provided for the replacement, along with a new order reference number which will be used henceforth. Since the side, stock symbol and attribution (if any) cannot be changed by an Order Replace event, these fields are not included in the message. Firms should retain the side, stock symbol and MPID from the original Add Order message."),

    /**
     * Trade Messages should be included in NASDAQ time-and-sales displays as well as volume and other market statistics. Since Trade Messages do not affect the book, however, they may be ignored by firms just looking to build and track the NASDAQ execution system display.
     */
    NON_CROSS_TRADE_MESSAGE('P', "Trade Messages should be included in NASDAQ time-and-sales displays as well as volume and other market statistics. Since Trade Messages do not affect the book, however, they may be ignored by firms just looking to build and track the NASDAQ execution system display."),

    /**
     * Cross Trade message indicates that NASDAQ has completed its cross process for a specific security. NASDAQ sends out a Cross Trade message for all active issues in the system following the Opening, Closing and EMC cross events. Firms may use the Cross Trade message to determine when the cross for each security has been completed. (Note: For the halted / paused securities, firms should use the Trading Action message to determine when an issue has been released for trading.)
     */
    CROSS_TRADE_MESSAGE('Q', "Cross Trade message indicates that NASDAQ has completed its cross process for a specific security. NASDAQ sends out a Cross Trade message for all active issues in the system following the Opening, Closing and EMC cross events. Firms may use the Cross Trade message to determine when the cross for each security has been completed. (Note: For the halted / paused securities, firms should use the Trading Action message to determine when an issue has been released for trading.)"),

    /**
     * Firms that use the ITCH feed to create time-and-sales displays or calculate market statistics should be prepared to process the broken trade message. If a firm is only using the ITCH feed to build a book, however, it may ignore these messages as they have no impact on the current book.
     */
    BROKEN_TRADE_MESSAGE('B', "Firms that use the ITCH feed to create time-and-sales displays or calculate market statistics should be prepared to process the broken trade message. If a firm is only using the ITCH feed to build a book, however, it may ignore these messages as they have no impact on the current book."),

    /**
     * NASDAQ disseminates NOII data at 5-second intervals in the minutes leading up to the NASDAQ Opening Cross and NASDAQ Closing Cross
     */
    NET_ORDER_IMBALANCE_INDICATOR_MESSAGE('I', "NASDAQ disseminates NOII data at 5-second intervals in the minutes leading up to the NASDAQ Opening Cross and NASDAQ Closing Cross"),

    /**
     * Identifies a retail interest indication of the Bid, Ask or both the Bid and Ask for NASDAQ-listed securities.
     */
    RETAIL_INTEREST_MESSAGE('N', "Identifies a retail interest indication of the Bid, Ask or both the Bid and Ask for NASDAQ-listed securities.");

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
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE);
            case 'L' -> Optional.of(MARKET_PARTICIPANT_POSITION_MESSAGE);
            case 'V' -> Optional.of(MWCB_DECLINE_LEVEL_MESSAGE);
            case 'W' -> Optional.of(MWCB_STATUS_LEVEL_MESSAGE);
            case 'K' -> Optional.of(IPO_QUOTING_PERIOD_UPDATE);
            case 'J' -> Optional.of(LULD_AUCTION_COLLAR_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_NO_MPID_ATTRIBUTION_MESSAGE);
            case 'F' -> Optional.of(ADD_ORDER_WITH_MPID_ATTRIBUTION_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'P' -> Optional.of(NON_CROSS_TRADE_MESSAGE);
            case 'Q' -> Optional.of(CROSS_TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'I' -> Optional.of(NET_ORDER_IMBALANCE_INDICATOR_MESSAGE);
            case 'N' -> Optional.of(RETAIL_INTEREST_MESSAGE);
            default -> Optional.empty();
        };
    }
}
