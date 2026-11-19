package omi.flyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S'),

    /**
     * Whenever a complex order is added in the system for an underlying, the order is normalized and results in either the creation of a new complex strategy or is added to an existing strategy. A Complex Strategy Message containing the strategy definition will be sent.
     */
    COMPLEX_STRATEGY_DIRECTORY_MESSAGE('R'),

    /**
     * ISE uses this administrative message to indicate the current trading status of a strategy within the ISE Options Market.
     */
    STRATEGY_TRADING_ACTION_MESSAGE('H'),

    /**
     * The options system uses this administrative message to indicate when an strategy has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution.
     */
    STRATEGY_OPEN_CLOSED_MESSAGE('O'),

    /**
     * An Order on Book message is generated for all the following situations whenever an order free from any display restrictions is reported by the matching engine. In all such cases the order size to be displayed is as reported by the matching engine
     */
    COMPLEX_STRATEGY_ORDER_ON_BOOK_MESSAGE('L'),

    /**
     * This message is used to announce strategy auctions. The start of auction is announced, followed by possible updates on the auction, and announcing the end of the auction.
     */
    COMPLEX_STRATEGY_AUCTION_MESSAGE('J');

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
