package omi.iex.iexequities.deepplus.iextp.v1_01.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The System Event Message is used to indicate events that apply to the market or the data feed.
     */
    SYSTEM_EVENT_MESSAGE('S', "The System Event Message is used to indicate events that apply to the market or the data feed."),

    /**
     * The System Event Message is used to indicate events that apply to the market or the data feed.
     */
    SECURITY_DIRECTORY_MESSAGE('D', "The System Event Message is used to indicate events that apply to the market or the data feed."),

    /**
     * The Trading Status Message is used to indicate the current trading status of a security.
     */
    TRADING_STATUS_MESSAGE('H', "The Trading Status Message is used to indicate the current trading status of a security."),

    /**
     * broadcasts a real-time Retail Liquidity Indicator Message each time there is an update to IEX's eligible retail liquidity interest during the trading day
     */
    RETAIL_LIQUIDITY_INDICATOR_MESSAGE('I', "broadcasts a real-time Retail Liquidity Indicator Message each time there is an update to IEX's eligible retail liquidity interest during the trading day"),

    /**
     * The Exchange may suspend trading of one or more securities on IEX for operational reasons and indicates such operational halt using the Operational Halt Status Message.
     */
    OPERATIONAL_HALT_STATUS_MESSAGE('O', "The Exchange may suspend trading of one or more securities on IEX for operational reasons and indicates such operational halt using the Operational Halt Status Message."),

    /**
     * The Short Sale Price Test Message is used to indicate when a short sale price test restriction is in effect for a security.
     */
    SHORT_SALE_PRICE_TEST_STATUS_MESSAGE('P', "The Short Sale Price Test Message is used to indicate when a short sale price test restriction is in effect for a security."),

    /**
     * The Security Event Message is used to indicate events that apply to a security
     */
    SECURITY_EVENT_MESSAGE('E', "The Security Event Message is used to indicate events that apply to a security"),

    /**
     * A displayed order that has been added to the IEX Book
     */
    ADD_ORDER_MESSAGE('a', "A displayed order that has been added to the IEX Book"),

    /**
     * A displayed order that had its Price, Size, or Priority component changed as a result of user or system action
     */
    ORDER_MODIFY_MESSAGE('M', "A displayed order that had its Price, Size, or Priority component changed as a result of user or system action"),

    /**
     * A displayed order that was removed from the IEX Book
     */
    ORDER_DELETE_MESSAGE('R', "A displayed order that was removed from the IEX Book"),

    /**
     * A displayed order that was executed against
     */
    ORDER_EXECUTED_MESSAGE('L', "A displayed order that was executed against"),

    /**
     * A non-displayed order on the book that executed against another non-displayed order on the book
     */
    TRADE_MESSAGE('T', "A non-displayed order on the book that executed against another non-displayed order on the book"),

    /**
     * Trade Break Messages are sent when an execution on IEX is broken on that same trading day
     */
    TRADE_BREAK_MESSAGE('B', "Trade Break Messages are sent when an execution on IEX is broken on that same trading day"),

    /**
     * This message is used to indicate that the IEX Book for a symbol has been cleared of all orders
     */
    CLEAR_BOOK_MESSAGE('C', "This message is used to indicate that the IEX Book for a symbol has been cleared of all orders");

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
            case 'D' -> Optional.of(SECURITY_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_STATUS_MESSAGE);
            case 'I' -> Optional.of(RETAIL_LIQUIDITY_INDICATOR_MESSAGE);
            case 'O' -> Optional.of(OPERATIONAL_HALT_STATUS_MESSAGE);
            case 'P' -> Optional.of(SHORT_SALE_PRICE_TEST_STATUS_MESSAGE);
            case 'E' -> Optional.of(SECURITY_EVENT_MESSAGE);
            case 'a' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'M' -> Optional.of(ORDER_MODIFY_MESSAGE);
            case 'R' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'L' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'T' -> Optional.of(TRADE_MESSAGE);
            case 'B' -> Optional.of(TRADE_BREAK_MESSAGE);
            case 'C' -> Optional.of(CLEAR_BOOK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
