package omi.nasdaq.nsmequities.totalview.itch.v4_1.enums;

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
    TIMESTAMP_MESSAGE('T', "Reflects the number of seconds past midnight that the Timestamp message was generated."),

    /**
     * The system event message type is used to signal a market or data feed handler event. The format is as follows:
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event. The format is as follows:"),

    /**
     * Market data redistributors should process this message to populate the Financial Status Indicator (required display field) and the Market Category (recommended display field) for NASDAQ-listed issues.
     */
    STOCK_DIRECTORY_MESSAGE('R', "Market data redistributors should process this message to populate the Financial Status Indicator (required display field) and the Market Category (recommended display field) for NASDAQ-listed issues."),

    /**
     * NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * For NASDAQ-listed issues, NASDAQ will support a full pre-opening spin of Reg SHO Short Sale Price Test Restricted Indicator messages indicating the Rule 201 status for all active issues.
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "For NASDAQ-listed issues, NASDAQ will support a full pre-opening spin of Reg SHO Short Sale Price Test Restricted Indicator messages indicating the Rule 201 status for all active issues."),

    /**
     * NASDAQ will send out this message only if NASDAQ Operations changes the status of a market participant firm in an issue.
     */
    MARKET_PARTICIPANT_POSITION_MESSAGE('L', "NASDAQ will send out this message only if NASDAQ Operations changes the status of a market participant firm in an issue."),

    /**
     * This message will be generated for unattributed orders accepted by the NASDAQ system.
     */
    ADD_ORDER_MESSAGE('A', "This message will be generated for unattributed orders accepted by the NASDAQ system."),

    /**
     * This message will be generated for attributed orders and quotations accepted by the NASDAQ system.
     */
    ADD_ORDER_WITH_MPID_MESSAGE('F', "This message will be generated for attributed orders and quotations accepted by the NASDAQ system."),

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
     * This message is sent whenever an order on the book is being canceled.
     */
    ORDER_DELETE_MESSAGE('D', "This message is sent whenever an order on the book is being canceled."),

    /**
     * This message is sent whenever an order on the book has been cancel-replaced.
     */
    ORDER_REPLACE_MESSAGE('U', "This message is sent whenever an order on the book has been cancel-replaced."),

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
     * NASDAQ disseminates NOII data at 5-second intervals in the minutes leading up to the NASDAQ Opening Cross and NASDAQ Closing Cross
     */
    NET_ORDER_IMBALANCE_INDICATOR_MESSAGE('I', "NASDAQ disseminates NOII data at 5-second intervals in the minutes leading up to the NASDAQ Opening Cross and NASDAQ Closing Cross"),

    /**
     * Identifies a retail interest indication of the Bid, Ask or both the Bid and Ask for NASDAQ-listed securities.
     */
    RETAIL_PRICE_IMPROVEMENT_INDICATOR_MESSAGE('N', "Identifies a retail interest indication of the Bid, Ask or both the Bid and Ask for NASDAQ-listed securities.");

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
            case 'T' -> Optional.of(TIMESTAMP_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE);
            case 'L' -> Optional.of(MARKET_PARTICIPANT_POSITION_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'F' -> Optional.of(ADD_ORDER_WITH_MPID_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'Q' -> Optional.of(CROSS_TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'I' -> Optional.of(NET_ORDER_IMBALANCE_INDICATOR_MESSAGE);
            case 'N' -> Optional.of(RETAIL_PRICE_IMPROVEMENT_INDICATOR_MESSAGE);
            default -> Optional.empty();
        };
    }
}
