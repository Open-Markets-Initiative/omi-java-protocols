package omi.iex.iexequities.deep.iextp.v1_06.enums;

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
     * Deep broadcasts a real-time Price Level Update Message each time a displayed price level on IEX is updated during the trading day
     */
    PRICE_LEVEL_BUY_UPDATE_MESSAGE('8', "Deep broadcasts a real-time Price Level Update Message each time a displayed price level on IEX is updated during the trading day"),

    /**
     * Deep broadcasts a real-time Price Level Update Message each time a displayed price level on IEX is updated during the trading day
     */
    PRICE_LEVEL_SELL_UPDATE_MESSAGE('5', "Deep broadcasts a real-time Price Level Update Message each time a displayed price level on IEX is updated during the trading day"),

    /**
     * Trade Report Messages are sent when an order on the IEX Order Book is executed in whole or in part
     */
    TRADE_REPORT_MESSAGE('T', "Trade Report Messages are sent when an order on the IEX Order Book is executed in whole or in part"),

    /**
     * Official Price Messages are sent for each IEX-listed security to indicate the IEX Official Opening Price and IEX Official Closing Price.
     */
    OFFICIAL_PRICE_MESSAGE('X', "Official Price Messages are sent for each IEX-listed security to indicate the IEX Official Opening Price and IEX Official Closing Price."),

    /**
     * Trade Break Messages are sent when an execution on IEX is broken on that same trading day
     */
    TRADE_BREAK_MESSAGE('B', "Trade Break Messages are sent when an execution on IEX is broken on that same trading day"),

    /**
     * Broadcasts an Auction Information Message every one second between the Lock-in Time and the auction match for Opening and Closing Auctions, and during the Display Only Period for IPO, Halt, and Volatility Auctions.
     */
    AUCTION_INFORMATION_MESSAGE('A', "Broadcasts an Auction Information Message every one second between the Lock-in Time and the auction match for Opening and Closing Auctions, and during the Display Only Period for IPO, Halt, and Volatility Auctions.");

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
            case 'O' -> Optional.of(OPERATIONAL_HALT_STATUS_MESSAGE);
            case 'P' -> Optional.of(SHORT_SALE_PRICE_TEST_STATUS_MESSAGE);
            case 'E' -> Optional.of(SECURITY_EVENT_MESSAGE);
            case '8' -> Optional.of(PRICE_LEVEL_BUY_UPDATE_MESSAGE);
            case '5' -> Optional.of(PRICE_LEVEL_SELL_UPDATE_MESSAGE);
            case 'T' -> Optional.of(TRADE_REPORT_MESSAGE);
            case 'X' -> Optional.of(OFFICIAL_PRICE_MESSAGE);
            case 'B' -> Optional.of(TRADE_BREAK_MESSAGE);
            case 'A' -> Optional.of(AUCTION_INFORMATION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
