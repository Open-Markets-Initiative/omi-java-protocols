package omi.bruceats.bruceequities.depthofbook.itch.v3_3.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The System Event message is used to communicate key market or data feed handler events.
     */
    SYSTEM_EVENT_MESSAGE('S', "The System Event message is used to communicate key market or data feed handler events."),

    /**
     * At the start of each trading session, Bruce ATS disseminates stock directory messages for all active symbols in its trading system.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading session, Bruce ATS disseminates stock directory messages for all active symbols in its trading system."),

    /**
     * Bruce ATS uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Bruce ATS uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * For all issues, Bruce ATS relays the Reg SHO Short Sale Price Test Restricted Indicator message when it receives an update from the primary listing exchange.
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "For all issues, Bruce ATS relays the Reg SHO Short Sale Price Test Restricted Indicator message when it receives an update from the primary listing exchange."),

    /**
     * This message will be generated for orders accepted by the Bruce ATS system and added to the book.
     */
    ADD_ORDER_MESSAGE('A', "This message will be generated for orders accepted by the Bruce ATS system and added to the book."),

    /**
     * This message is sent whenever an order on the book is executed in whole or in part.
     */
    ORDER_EXECUTED_MESSAGE('E', "This message is sent whenever an order on the book is executed in whole or in part."),

    /**
     * This message is sent whenever an order on the book is modified as a result of a partial cancellation.
     */
    ORDER_CANCEL_MESSAGE('X', "This message is sent whenever an order on the book is modified as a result of a partial cancellation."),

    /**
     * This message is sent whenever an order on the book is being cancelled.
     */
    ORDER_DELETE_MESSAGE('D', "This message is sent whenever an order on the book is being cancelled."),

    /**
     * This message is sent whenever an order on the book has been cancel-replaced.
     */
    ORDER_REPLACE_MESSAGE('U', "This message is sent whenever an order on the book has been cancel-replaced."),

    /**
     * In the rare case that an adjustment to previously communicated trade / order execution, the Trade Correction Message will be used to communicate the required updates.
     */
    TRADE_CORRECTION_MESSAGE('C', "In the rare case that an adjustment to previously communicated trade / order execution, the Trade Correction Message will be used to communicate the required updates."),

    /**
     * The Broken Trade Message is sent whenever an execution on Bruce ATS is broken.
     */
    TRADE_BREAK_MESSAGE('B', "The Broken Trade Message is sent whenever an execution on Bruce ATS is broken.");

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
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACE_MESSAGE);
            case 'C' -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 'B' -> Optional.of(TRADE_BREAK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
