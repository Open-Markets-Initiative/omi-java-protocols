package omi.txse.txseequities.feed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Higher-level protocol message type code identifying the payload that follows. Interpretation is protocol-specific.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Market-wide status representing the overall state of the trading session.
     */
    TRADING_SESSION_STATUS_MESSAGE((short) 105, "Market-wide status representing the overall state of the trading session."),

    /**
     * Symbol definition containing instrument details and trading parameters for a security. A DefineSymbol will be followed by a SymbolStatus message establishing the initial trading state for the symbol. Clients must treat a symbol as operationally HALTED while awaiting the accompanying SymbolStatus.
     */
    DEFINE_SYMBOL_MESSAGE((short) 115, "Symbol definition containing instrument details and trading parameters for a security. A DefineSymbol will be followed by a SymbolStatus message establishing the initial trading state for the symbol. Clients must treat a symbol as operationally HALTED while awaiting the accompanying SymbolStatus."),

    /**
     * Symbol-specific trading status representing the current state and restrictions for an individual security. A SymbolStatus is sent for every symbol, including those that open in the TRADING state. Clients must treat a symbol as operationally HALTED while awaiting the first SymbolStatus. Subsequent SymbolStatus messages are sent whenever the trading state or short-sale restriction changes.
     */
    SYMBOL_STATUS_MESSAGE((short) 121, "Symbol-specific trading status representing the current state and restrictions for an individual security. A SymbolStatus is sent for every symbol, including those that open in the TRADING state. Clients must treat a symbol as operationally HALTED while awaiting the first SymbolStatus. Subsequent SymbolStatus messages are sent whenever the trading state or short-sale restriction changes."),

    /**
     * Details for a newly added order for display to the TXSE book.
     */
    ADD_ORDER_MESSAGE((short) 97, "Details for a newly added order for display to the TXSE book."),

    /**
     * Details for an order deleted in its entirety from the TXSE book.
     */
    DELETE_ORDER_MESSAGE((short) 100, "Details for an order deleted in its entirety from the TXSE book."),

    /**
     * Indicates that an order displayed on the TXSE book has executed in part or in full at its previously displayed price.
     */
    EXECUTE_ORDER_MESSAGE((short) 101, "Indicates that an order displayed on the TXSE book has executed in part or in full at its previously displayed price."),

    /**
     * Indicates that an order displayed on the TXSE book has executed in part or in full at this specified price.
     */
    EXECUTE_ORDER_WITH_PRICE_MESSAGE((short) 112, "Indicates that an order displayed on the TXSE book has executed in part or in full at this specified price."),

    /**
     * Modify an order by reducing its size without losing priority on the TXSE book.
     */
    MODIFY_SIZE_DOWN_MESSAGE((short) 109, "Modify an order by reducing its size without losing priority on the TXSE book."),

    /**
     * Replace an order, possibly changing price level and size (which can increase), losing priority on the TXSE book.
     */
    REPLACE_ORDER_MESSAGE((short) 114, "Replace an order, possibly changing price level and size (which can increase), losing priority on the TXSE book."),

    /**
     * Execution of non-displayed liquidity.
     */
    TRADE_MESSAGE((short) 116, "Execution of non-displayed liquidity."),

    /**
     * Break a previous trade or execution by execution identifier.
     */
    BREAK_TRADE_MESSAGE((short) 98, "Break a previous trade or execution by execution identifier."),

    /**
     * Published every 5 seconds during the Accumulation Period to indicate projected auction size. Reports the matched volume and excess side that would result if the auction crossed at that moment, considering only Auction-Only orders; the Continuous Book is excluded. Emitted for OPENING and CLOSING auction types only. Not emitted for HALT or IPO auctions, which proceed directly to the Band Window phase at onset (see AuctionBandWindow).
     */
    AUCTION_PREAMBLE_MESSAGE((short) 117, "Published every 5 seconds during the Accumulation Period to indicate projected auction size. Reports the matched volume and excess side that would result if the auction crossed at that moment, considering only Auction-Only orders; the Continuous Book is excluded. Emitted for OPENING and CLOSING auction types only. Not emitted for HALT or IPO auctions, which proceed directly to the Band Window phase at onset (see AuctionBandWindow)."),

    /**
     * Published every 5 seconds during the Band Window to report Auction-Only volume positioned at each Participation Band boundary. The Participation Band is a volatility-based price range; its derivation methodology is described in the Participation Bands specification. Auction-Only orders entered during the Band Window that are priced outside the band have their price adjusted to the nearest boundary. The Continuous Book is excluded. Volume counting at boundaries: a limit order is counted at each boundary price at which it would be eligible to execute; a market order is counted at both boundaries. Example: a limit buy at $10.05 counts at the lower boundary if lower = $10.05, but not at the upper boundary if upper = $10.10.
     */
    AUCTION_BAND_WINDOW_MESSAGE((short) 118, "Published every 5 seconds during the Band Window to report Auction-Only volume positioned at each Participation Band boundary. The Participation Band is a volatility-based price range; its derivation methodology is described in the Participation Bands specification. Auction-Only orders entered during the Band Window that are priced outside the band have their price adjusted to the nearest boundary. The Continuous Book is excluded. Volume counting at boundaries: a limit order is counted at each boundary price at which it would be eligible to execute; a market order is counted at both boundaries. Example: a limit buy at $10.05 counts at the lower boundary if lower = $10.05, but not at the upper boundary if upper = $10.10."),

    /**
     * Summary of an auction cross. Emitted before any per-order auction execution messages for the same cross. Universal lifecycle terminator — emitted for every auction. Encoding: (a) matchedShares &gt; 0 with a valid auctionPrice indicates a normal cross; (b) matchedShares = 0 with a valid auctionPrice indicates a zero-share completion (e.g., halt-into-close default or demand failure); (c) matchedShares = 0 with auctionPrice = CANCELED_SENTINEL indicates a canceled auction. Where the feed publishes per-order auction executions, those executions share this message's execId.
     */
    AUCTION_PRINT_MESSAGE((short) 110, "Summary of an auction cross. Emitted before any per-order auction execution messages for the same cross. Universal lifecycle terminator \u2014 emitted for every auction. Encoding: (a) matchedShares > 0 with a valid auctionPrice indicates a normal cross; (b) matchedShares = 0 with a valid auctionPrice indicates a zero-share completion (e.g., halt-into-close default or demand failure); (c) matchedShares = 0 with auctionPrice = CANCELED_SENTINEL indicates a canceled auction. Where the feed publishes per-order auction executions, those executions share this message's execId.");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 105 -> Optional.of(TRADING_SESSION_STATUS_MESSAGE);
            case 115 -> Optional.of(DEFINE_SYMBOL_MESSAGE);
            case 121 -> Optional.of(SYMBOL_STATUS_MESSAGE);
            case 97 -> Optional.of(ADD_ORDER_MESSAGE);
            case 100 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 101 -> Optional.of(EXECUTE_ORDER_MESSAGE);
            case 112 -> Optional.of(EXECUTE_ORDER_WITH_PRICE_MESSAGE);
            case 109 -> Optional.of(MODIFY_SIZE_DOWN_MESSAGE);
            case 114 -> Optional.of(REPLACE_ORDER_MESSAGE);
            case 116 -> Optional.of(TRADE_MESSAGE);
            case 98 -> Optional.of(BREAK_TRADE_MESSAGE);
            case 117 -> Optional.of(AUCTION_PREAMBLE_MESSAGE);
            case 118 -> Optional.of(AUCTION_BAND_WINDOW_MESSAGE);
            case 110 -> Optional.of(AUCTION_PRINT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
