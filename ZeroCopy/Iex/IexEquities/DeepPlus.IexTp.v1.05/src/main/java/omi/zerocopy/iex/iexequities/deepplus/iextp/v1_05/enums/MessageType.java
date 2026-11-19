package omi.zerocopy.iex.iexequities.deepplus.iextp.v1_05.enums;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The System Event Message is used to indicate events that apply to the market or the data feed.
     */
    SYSTEM_EVENT_MESSAGE('S'),

    /**
     * The System Event Message is used to indicate events that apply to the market or the data feed.
     */
    SECURITY_DIRECTORY_MESSAGE('D'),

    /**
     * The Trading Status Message is used to indicate the current trading status of a security.
     */
    TRADING_STATUS_MESSAGE('H'),

    /**
     * broadcasts a real-time Retail Liquidity Indicator Message each time there is an update to IEX's eligible retail liquidity interest during the trading day
     */
    RETAIL_LIQUIDITY_INDICATOR_MESSAGE('I'),

    /**
     * The Exchange may suspend trading of one or more securities on IEX for operational reasons and indicates such operational halt using the Operational Halt Status Message.
     */
    OPERATIONAL_HALT_STATUS_MESSAGE('O'),

    /**
     * The Short Sale Price Test Message is used to indicate when a short sale price test restriction is in effect for a security.
     */
    SHORT_SALE_PRICE_TEST_STATUS_MESSAGE('P'),

    /**
     * The Security Event Message is used to indicate events that apply to a security
     */
    SECURITY_EVENT_MESSAGE('E'),

    /**
     * A displayed order that has been added to the IEX Book
     */
    ADD_ORDER_MESSAGE('a'),

    /**
     * A displayed order that had its Price, Size, or Priority component changed as a result of user or system action
     */
    ORDER_MODIFY_MESSAGE('M'),

    /**
     * A displayed order that was removed from the IEX Book
     */
    ORDER_DELETE_MESSAGE('R'),

    /**
     * A displayed order that was executed against
     */
    ORDER_EXECUTED_MESSAGE('L'),

    /**
     * A non-displayed order on the book that executed against another non-displayed order on the book
     */
    TRADE_MESSAGE('T'),

    /**
     * Trade Break Messages are sent when an execution on IEX is broken on that same trading day
     */
    TRADE_BREAK_MESSAGE('B'),

    /**
     * This message is used to indicate that the IEX Book for a symbol has been cleared of all orders
     */
    CLEAR_BOOK_MESSAGE('C');

    private static final MessageType[] BY_WIRE = new MessageType[256];

    static {
        for (MessageType value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    MessageType(char wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static MessageType get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
