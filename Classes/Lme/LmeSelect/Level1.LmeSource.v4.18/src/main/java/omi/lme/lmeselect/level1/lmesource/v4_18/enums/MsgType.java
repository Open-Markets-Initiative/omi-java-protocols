package omi.lme.lmeselect.level1.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Type of message, selecting the payload that follows the message header
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * Sent on each multicast channel at start of day, and intraday in case of a disaster recovery. The client must ignore the sequence number of the Sequence Reset message itself and set the next expected sequence number to NewSeqNo, clear all cached data for all instruments and subscribe to the refresh channels to receive the current state of the market.
     */
    SEQUENCE_RESET_MESSAGE(100, "Sent on each multicast channel at start of day, and intraday in case of a disaster recovery. The client must ignore the sequence number of the Sequence Reset message itself and set the next expected sequence number to NewSeqNo, clear all cached data for all instruments and subscribe to the refresh channels to receive the current state of the market."),

    /**
     * Indicates the trading state of instruments at the contract level, for example Copper Futures or Aluminium Options. The ContractCode field is common across the Market State - Contract, Outright Definition and Strategy Definition messages and links the contract state to individual tradable instruments.
     */
    MARKET_STATE_CONTRACT_MESSAGE(311, "Indicates the trading state of instruments at the contract level, for example Copper Futures or Aluminium Options. The ContractCode field is common across the Market State - Contract, Outright Definition and Strategy Definition messages and links the contract state to individual tradable instruments."),

    /**
     * Indicates the trading state of an individual tradable instrument. Sent when the instrument state differs from that at contract level, for example when TOM goes into Post Trade before the contract.
     */
    MARKET_STATE_INSTRUMENT_MESSAGE(312, "Indicates the trading state of an individual tradable instrument. Sent when the instrument state differs from that at contract level, for example when TOM goes into Post Trade before the contract."),

    /**
     * Carries the price at which a tradable instrument would open, computed by the uncrossing algorithm during Pre-Open. If there are no crossed prices no IOP is calculated or disseminated; where the book is not crossed but has both a bid and an offer, a mid price is calculated and published instead. At the transition from Pre-Open to Open an IOP message is published for every tradable instrument with both prices null and the volume zero, to indicate the prices are no longer valid.
     */
    INDICATIVE_OPENING_PRICE_MESSAGE(320, "Carries the price at which a tradable instrument would open, computed by the uncrossing algorithm during Pre-Open. If there are no crossed prices no IOP is calculated or disseminated; where the book is not crossed but has both a bid and an offer, a mid price is calculated and published instead. At the transition from Pre-Open to Open an IOP message is published for every tradable instrument with both prices null and the volume zero, to indicate the prices are no longer valid."),

    /**
     * Generated when a request for quote is accepted by the Matching Engine.
     */
    QUOTE_REQUEST_MESSAGE(329, "Generated when a request for quote is accepted by the Matching Engine."),

    /**
     * Generated when the order book is required to be cleared, for example after the transition between certain market states, or when an instrument's Trading State Condition is Trade Halt. Following an Order Book Clear, if an instrument is subsequently open for trading any resting orders are sent as Top Of Book, Aggregate Order Book or Order Add messages to allow clients to rebuild the order book. It is not published when an instrument enters or leaves Trade Pause.
     */
    ORDER_BOOK_CLEAR_MESSAGE(327, "Generated when the order book is required to be cleared, for example after the transition between certain market states, or when an instrument's Trading State Condition is Trade Halt. Following an Order Book Clear, if an instrument is subsequently open for trading any resting orders are sent as Top Of Book, Aggregate Order Book or Order Add messages to allow clients to rebuild the order book. It is not published when an instrument enters or leaves Trade Pause."),

    /**
     * Generated when a cross request is created on LMEselect.
     */
    CROSS_REQUEST_MESSAGE(330, "Generated when a cross request is created on LMEselect."),

    /**
     * Generated when the top price level has been modified. There are no New, Change or Delete actions for Top Of Book: whenever the price, quantity or number of orders at the top of book changes a new message is sent. When an order book is emptied as a result of market activity, a Top Of Book message is sent with the price fields null and the aggregate quantity and number of orders zero. The TimeOfEvent is the latest incoming event timestamp regardless of the event that caused the update; for orders submitted during Pre-Open and reloaded GTC and GTD orders it reflects the uncrossing event time at market open.
     */
    TOP_OF_BOOK_MESSAGE(321, "Generated when the top price level has been modified. There are no New, Change or Delete actions for Top Of Book: whenever the price, quantity or number of orders at the top of book changes a new message is sent. When an order book is emptied as a result of market activity, a Top Of Book message is sent with the price fields null and the aggregate quantity and number of orders zero. The TimeOfEvent is the latest incoming event timestamp regardless of the event that caused the update; for orders submitted during Pre-Open and reloaded GTC and GTD orders it reflects the uncrossing event time at market open."),

    /**
     * Generated each time a trade has been performed in the Electronic, Inter Office or Ring venues. When an incoming order matches against multiple resting orders there is one Market Data Trade published for each matched trade.
     */
    MARKET_DATA_TRADE_MESSAGE(341, "Generated each time a trade has been performed in the Electronic, Inter Office or Ring venues. When an incoming order matches against multiple resting orders there is one Market Data Trade published for each matched trade.");

    private final int wire;

    private final String description;

    MsgType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<MsgType> fromWire(int wire) {
        return switch (wire) {
            case 100 -> Optional.of(SEQUENCE_RESET_MESSAGE);
            case 311 -> Optional.of(MARKET_STATE_CONTRACT_MESSAGE);
            case 312 -> Optional.of(MARKET_STATE_INSTRUMENT_MESSAGE);
            case 320 -> Optional.of(INDICATIVE_OPENING_PRICE_MESSAGE);
            case 329 -> Optional.of(QUOTE_REQUEST_MESSAGE);
            case 327 -> Optional.of(ORDER_BOOK_CLEAR_MESSAGE);
            case 330 -> Optional.of(CROSS_REQUEST_MESSAGE);
            case 321 -> Optional.of(TOP_OF_BOOK_MESSAGE);
            case 341 -> Optional.of(MARKET_DATA_TRADE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
