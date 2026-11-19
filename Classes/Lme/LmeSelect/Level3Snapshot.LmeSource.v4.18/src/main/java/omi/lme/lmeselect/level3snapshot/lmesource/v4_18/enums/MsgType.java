package omi.lme.lmeselect.level3snapshot.lmesource.v4_18.enums;

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
     * Generated when an order is placed in the order book. An incoming, aggressing order that matches against one or more resting orders is not published as an Order Add unless it has residual volume after matching. For orders submitted during Pre-Open and reloaded GTC and GTD orders the TimeOfEvent reflects the uncrossing event time at market open.
     */
    ORDER_ADD_MESSAGE(323, "Generated when an order is placed in the order book. An incoming, aggressing order that matches against one or more resting orders is not published as an Order Add unless it has residual volume after matching. For orders submitted during Pre-Open and reloaded GTC and GTD orders the TimeOfEvent reflects the uncrossing event time at market open."),

    /**
     * Published to mark the end of a refresh cycle.
     */
    REFRESH_COMPLETE_MESSAGE(203, "Published to mark the end of a refresh cycle.");

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
            case 323 -> Optional.of(ORDER_ADD_MESSAGE);
            case 203 -> Optional.of(REFRESH_COMPLETE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
