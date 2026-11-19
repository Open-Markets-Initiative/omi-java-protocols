package omi.txse.txseequities.bale.rake.v1_0.enums;

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
     * An execution report for a single fill event in the order book. Quantity is the number of shares in this execution. An aggressive order that sweeps multiple resting orders produces one Trade per resting order filled.
     */
    TRADE_MESSAGE((short) 120, "An execution report for a single fill event in the order book. Quantity is the number of shares in this execution. An aggressive order that sweeps multiple resting orders produces one Trade per resting order filled."),

    /**
     * Current best bid and offer for a symbol. The BBO is the most aggressive price at which cumulative displayed liquidity reaches a round lot. Quantity is the total displayed shares at the BBO price combined with any displayed shares at more aggressive prices on that side. Price and quantity are zero when cumulative displayed liquidity does not reach a round lot. A TopOfBook is published whenever a depth change occurs at or inside the current BBO on the affected side. A TopOfBook may be published with values identical to the previous one if the net result for the BBO happens to be unchanged after a relevant quantity change. When an execution causes both Trade and TopOfBook messages, all Trade messages from that execution event are delivered before the TopOfBook that reflects the resulting depth change.
     */
    TOP_OF_BOOK_MESSAGE((short) 113, "Current best bid and offer for a symbol. The BBO is the most aggressive price at which cumulative displayed liquidity reaches a round lot. Quantity is the total displayed shares at the BBO price combined with any displayed shares at more aggressive prices on that side. Price and quantity are zero when cumulative displayed liquidity does not reach a round lot. A TopOfBook is published whenever a depth change occurs at or inside the current BBO on the affected side. A TopOfBook may be published with values identical to the previous one if the net result for the BBO happens to be unchanged after a relevant quantity change. When an execution causes both Trade and TopOfBook messages, all Trade messages from that execution event are delivered before the TopOfBook that reflects the resulting depth change."),

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
            case 120 -> Optional.of(TRADE_MESSAGE);
            case 113 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            case 117 -> Optional.of(AUCTION_PREAMBLE_MESSAGE);
            case 118 -> Optional.of(AUCTION_BAND_WINDOW_MESSAGE);
            case 110 -> Optional.of(AUCTION_PRINT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
