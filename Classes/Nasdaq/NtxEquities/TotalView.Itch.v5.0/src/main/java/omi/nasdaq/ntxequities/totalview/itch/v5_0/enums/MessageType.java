package omi.nasdaq.ntxequities.totalview.itch.v5_0.enums;

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
     * At the start of each trading day, Nasdaq Texas disseminates stock directory messages for all active symbols in the Nasdaq Texas execution system.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, Nasdaq Texas disseminates stock directory messages for all active symbols in the Nasdaq Texas execution system."),

    /**
     * Nasdaq Texas uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Nasdaq Texas uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * In February 2011, the Securities and Exchange Commission (SEC) implemented changes to Rule 201 of the Regulation SHO (Reg SHO).
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "In February 2011, the Securities and Exchange Commission (SEC) implemented changes to Rule 201 of the Regulation SHO (Reg SHO)."),

    /**
     * At the start of each trading day, Nasdaq Texas disseminates a spin of market participant position messages.
     */
    MARKET_PARTICIPANT_POSITION_MESSAGE('L', "At the start of each trading day, Nasdaq Texas disseminates a spin of market participant position messages."),

    /**
     * Informs data recipients what the daily MWCB breach points are set to for the current trading day.
     */
    MWCB_DECLINE_LEVEL_MESSAGE('V', "Informs data recipients what the daily MWCB breach points are set to for the current trading day."),

    /**
     * Informs data recipients when a MWCB has breached one of the established levels
     */
    MWCB_STATUS_MESSAGE('W', "Informs data recipients when a MWCB has breached one of the established levels"),

    /**
     * Indicates the auction collar thresholds within which a paused security can reopen following a LULD Trading Pause
     */
    LULD_AUCTION_COLLAR_MESSAGE('J', "Indicates the auction collar thresholds within which a paused security can reopen following a LULD Trading Pause"),

    /**
     * The Exchange uses this message to indicate the current Operational Status of a security to the trading community.
     */
    OPERATIONAL_HALT_MESSAGE('h', "The Exchange uses this message to indicate the current Operational Status of a security to the trading community."),

    /**
     * This message will be generated for unattributed orders accepted by the Nasdaq Texas system.
     */
    ADD_ORDER_NO_MPID_ATTRIBUTION_MESSAGE('A', "This message will be generated for unattributed orders accepted by the Nasdaq Texas system."),

    /**
     * This message will be generated for attributed orders and quotations accepted by the Nasdaq Texas system.
     */
    ADD_ORDER_MPID_ATTRIBUTION_MESSAGE('F', "This message will be generated for attributed orders and quotations accepted by the Nasdaq Texas system."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part.
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever an order on the book is executed in whole or in part."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price."),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation"),

    /**
     * This message is sent whenever an order on the book is being cancelled. All remaining shares are no longer accessible so the order must be removed from the book.
     */
    ORDER_DELETE_MESSAGE('D', "This message is sent whenever an order on the book is being cancelled. All remaining shares are no longer accessible so the order must be removed from the book."),

    /**
     * This message is sent whenever an order on the book has been cancel-replaced.
     */
    ORDER_REPLACE_MESSAGE('U', "This message is sent whenever an order on the book has been cancel-replaced."),

    /**
     * The Trade Message is designed to provide execution details for normal match events involving non-displayable order types.
     */
    NON_CROSS_TRADE_MESSAGE('P', "The Trade Message is designed to provide execution details for normal match events involving non-displayable order types."),

    /**
     * Cross Trade message indicates that Nasdaq Texas has completed its cross process for a specific security.
     */
    CROSS_TRADE_MESSAGE('Q', "Cross Trade message indicates that Nasdaq Texas has completed its cross process for a specific security."),

    /**
     * The Broken Trade Message is sent whenever an execution on Nasdaq Texas is broken.
     */
    BROKEN_TRADE_MESSAGE('B', "The Broken Trade Message is sent whenever an execution on Nasdaq Texas is broken."),

    /**
     * Nasdaq Texas disseminates NOII data at 5-second intervals in the minutes leading up to the Nasdaq Opening Cross and Nasdaq Closing Cross.
     */
    NET_ORDER_IMBALANCE_INDICATOR_MESSAGE('I', "Nasdaq Texas disseminates NOII data at 5-second intervals in the minutes leading up to the Nasdaq Opening Cross and Nasdaq Closing Cross."),

    /**
     * Indicates price improving interest of the Bid, Ask or both the Bid and Ask for a security.
     */
    RETAIL_INTEREST_MESSAGE('N', "Indicates price improving interest of the Bid, Ask or both the Bid and Ask for a security.");

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
            case 'W' -> Optional.of(MWCB_STATUS_MESSAGE);
            case 'J' -> Optional.of(LULD_AUCTION_COLLAR_MESSAGE);
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_NO_MPID_ATTRIBUTION_MESSAGE);
            case 'F' -> Optional.of(ADD_ORDER_MPID_ATTRIBUTION_MESSAGE);
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
