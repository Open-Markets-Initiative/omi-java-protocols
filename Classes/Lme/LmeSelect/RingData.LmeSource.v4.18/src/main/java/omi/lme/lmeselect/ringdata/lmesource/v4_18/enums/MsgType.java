package omi.lme.lmeselect.ringdata.lmesource.v4_18.enums;

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
     * Indicates the trading state of the product on the Ring and includes the ring session.
     */
    MARKET_STATE_PRODUCT_MESSAGE(310, "Indicates the trading state of the product on the Ring and includes the ring session."),

    /**
     * Generated each time there is a new order price and when Ring prices are withdrawn or deleted. Prices can be withdrawn if they are no longer being quoted by traders in the Ring, and deleted if incorrectly entered.
     */
    MARKET_DATA_ORDER_MESSAGE(328, "Generated each time there is a new order price and when Ring prices are withdrawn or deleted. Prices can be withdrawn if they are no longer being quoted by traders in the Ring, and deleted if incorrectly entered."),

    /**
     * Generated each time there is a trade price and when a price has been deleted.
     */
    INDICATIVE_TRADE_PRICE_MESSAGE(340, "Generated each time there is a trade price and when a price has been deleted."),

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
            case 310 -> Optional.of(MARKET_STATE_PRODUCT_MESSAGE);
            case 328 -> Optional.of(MARKET_DATA_ORDER_MESSAGE);
            case 340 -> Optional.of(INDICATIVE_TRADE_PRICE_MESSAGE);
            case 341 -> Optional.of(MARKET_DATA_TRADE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
