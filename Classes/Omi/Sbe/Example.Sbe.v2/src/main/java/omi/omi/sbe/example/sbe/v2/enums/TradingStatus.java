package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * tradingStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingStatus {

    /**
     * TradingHalt
     */
    TRADING_HALT((short) 2, "TradingHalt"),

    /**
     * Close
     */
    CLOSE((short) 4, "Close"),

    /**
     * NewPriceIndication
     */
    NEW_PRICE_INDICATION((short) 15, "NewPriceIndication"),

    /**
     * ReadyToTrade
     */
    READY_TO_TRADE((short) 17, "ReadyToTrade"),

    /**
     * NotAvailableForTrading
     */
    NOT_AVAILABLE_FOR_TRADING((short) 18, "NotAvailableForTrading"),

    /**
     * UnknownOrInvalid
     */
    UNKNOWN_OR_INVALID((short) 20, "UnknownOrInvalid"),

    /**
     * PreOpen
     */
    PRE_OPEN((short) 21, "PreOpen"),

    /**
     * PreCross
     */
    PRE_CROSS((short) 24, "PreCross"),

    /**
     * Cross
     */
    CROSS((short) 25, "Cross"),

    /**
     * PostClose
     */
    POST_CLOSE((short) 26, "PostClose"),

    /**
     * NoChange
     */
    NO_CHANGE((short) 103, "NoChange"),

    /**
     * AcceptingOrders
     */
    ACCEPTING_ORDERS((short) 65, "AcceptingOrders"),

    /**
     * TradingHalted
     */
    TRADING_HALTED((short) 72, "TradingHalted"),

    /**
     * OrderAcceptancePeriod
     */
    ORDER_ACCEPTANCE_PERIOD((short) 79, "OrderAcceptancePeriod"),

    /**
     * TradingPaused
     */
    TRADING_PAUSED((short) 80, "TradingPaused"),

    /**
     * QuoteOnly
     */
    QUOTE_ONLY((short) 81, "QuoteOnly"),

    /**
     * PreOpening
     */
    PRE_OPENING((short) 82, "PreOpening"),

    /**
     * ExchangeSpecificSuspension
     */
    EXCHANGE_SPECIFIC_SUSPENSION((short) 83, "ExchangeSpecificSuspension"),

    /**
     * Trading
     */
    TRADING((short) 84, "Trading"),

    /**
     * Closed
     */
    CLOSED((short) 88, "Closed");

    private final short wire;

    private final String description;

    TradingStatus(short wire, String description) {
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
    public static Optional<TradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(TRADING_HALT);
            case 4 -> Optional.of(CLOSE);
            case 15 -> Optional.of(NEW_PRICE_INDICATION);
            case 17 -> Optional.of(READY_TO_TRADE);
            case 18 -> Optional.of(NOT_AVAILABLE_FOR_TRADING);
            case 20 -> Optional.of(UNKNOWN_OR_INVALID);
            case 21 -> Optional.of(PRE_OPEN);
            case 24 -> Optional.of(PRE_CROSS);
            case 25 -> Optional.of(CROSS);
            case 26 -> Optional.of(POST_CLOSE);
            case 103 -> Optional.of(NO_CHANGE);
            case 65 -> Optional.of(ACCEPTING_ORDERS);
            case 72 -> Optional.of(TRADING_HALTED);
            case 79 -> Optional.of(ORDER_ACCEPTANCE_PERIOD);
            case 80 -> Optional.of(TRADING_PAUSED);
            case 81 -> Optional.of(QUOTE_ONLY);
            case 82 -> Optional.of(PRE_OPENING);
            case 83 -> Optional.of(EXCHANGE_SPECIFIC_SUSPENSION);
            case 84 -> Optional.of(TRADING);
            case 88 -> Optional.of(CLOSED);
            default -> Optional.empty();
        };
    }
}
