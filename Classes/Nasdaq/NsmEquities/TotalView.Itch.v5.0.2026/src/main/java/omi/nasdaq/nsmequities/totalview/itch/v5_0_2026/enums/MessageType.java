package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event"),

    /**
     * Market data redistributors should process this message to populate the Financial Status Indicator (required display field) and the Market Category (recommended display field) for NASDAQ-listed issues.
     */
    STOCK_DIRECTORY_MESSAGE('R', "Market data redistributors should process this message to populate the Financial Status Indicator (required display field) and the Market Category (recommended display field) for NASDAQ-listed issues."),

    /**
     * Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community"),

    /**
     * Nasdaq processes orders based on the most Reg SHO Restriction status value
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "Nasdaq processes orders based on the most Reg SHO Restriction status value"),

    /**
     * Nasdaq will send out this message only if Nasdaq Operations changes the status of a market participant firm in an issue
     */
    MARKET_PARTICIPANT_POSITION_MESSAGE('L', "Nasdaq will send out this message only if Nasdaq Operations changes the status of a market participant firm in an issue"),

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
     * Indicates the auction collar thresholds within which a paused security can reopen following a LULD trading pause
     */
    LULD_AUCTION_COLLAR_MESSAGE('J', "Indicates the auction collar thresholds within which a paused security can reopen following a LULD trading pause"),

    /**
     * An Operational Halt means that there has been an interruption of service on the identified security impacting only the designated Market Center
     */
    OPERATIONAL_HALT_MESSAGE('h', "An Operational Halt means that there has been an interruption of service on the identified security impacting only the designated Market Center"),

    /**
     * This message will be generated for unattributed orders accepted by the Nasdaq system
     */
    ADD_ORDER_NO_MPID_ATTRIBUTION_MESSAGE('A', "This message will be generated for unattributed orders accepted by the Nasdaq system"),

    /**
     * This message will be generated for attributed orders and quotations accepted by the Nasdaq system
     */
    ADD_ORDER_WITH_MPID_ATTRIBUTION_MESSAGE('F', "This message will be generated for attributed orders and quotations accepted by the Nasdaq system"),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever an order on the book is executed in whole or in part"),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "This message is sent whenever an order on the book is executed in whole or in part at a price different from the initial display price"),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation"),

    /**
     * This message is sent whenever an order on the book is being cancelled
     */
    ORDER_DELETE_MESSAGE('D', "This message is sent whenever an order on the book is being cancelled"),

    /**
     * This message is sent whenever an order on the book has been cancel-replaced
     */
    ORDER_REPLACE_MESSAGE('U', "This message is sent whenever an order on the book has been cancel-replaced"),

    /**
     * Trade Messages should be included in NASDAQ time-and-sales displays as well as volume and other market statistics
     */
    NON_CROSS_TRADE_MESSAGE('P', "Trade Messages should be included in NASDAQ time-and-sales displays as well as volume and other market statistics"),

    /**
     * Cross Trade message indicates that Nasdaq has completed its cross process for a specific security
     */
    CROSS_TRADE_MESSAGE('Q', "Cross Trade message indicates that Nasdaq has completed its cross process for a specific security"),

    /**
     * The Broken Trade Message is sent whenever an execution on Nasdaq is broken
     */
    BROKEN_TRADE_MESSAGE('B', "The Broken Trade Message is sent whenever an execution on Nasdaq is broken"),

    /**
     * NASDAQ disseminates NOII data
     */
    NET_ORDER_IMBALANCE_INDICATOR_MESSAGE('I', "NASDAQ disseminates NOII data"),

    /**
     * Identifies a retail interest indication of the Bid, Ask or both the Bid and Ask for NASDAQ-listed securities.
     */
    RETAIL_PRICE_IMPROVEMENT_INDICATOR_MESSAGE('N', "Identifies a retail interest indication of the Bid, Ask or both the Bid and Ask for NASDAQ-listed securities."),

    /**
     * This message is disseminated only for Direct Listing with Capital Raise (DLCR) securities
     */
    DIRECT_LISTING_WITH_CAPITAL_RAISE_PRICE_DISCOVERY_MESSAGE('O', "This message is disseminated only for Direct Listing with Capital Raise (DLCR) securities");

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
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
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
            case 'N' -> Optional.of(RETAIL_PRICE_IMPROVEMENT_INDICATOR_MESSAGE);
            case 'O' -> Optional.of(DIRECT_LISTING_WITH_CAPITAL_RAISE_PRICE_DISCOVERY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
