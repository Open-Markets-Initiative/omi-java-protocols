package omi.eurex.t7.eobi.fbe.v13_0.enums;

import java.util.Optional;

/**
 * Defines the SecurityMassTradingStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityMassTradingStatus {

    /**
     * Trading Halt
     */
    TRADING_HALT((short) 2, "Trading Halt"),

    /**
     * Market Imbalance Buy
     */
    MARKET_IMBALANCE_BUY((short) 7, "Market Imbalance Buy"),

    /**
     * Market Imbalance Sell
     */
    MARKET_IMBALANCE_SELL((short) 8, "Market Imbalance Sell"),

    /**
     * Closed
     */
    CLOSED((short) 200, "Closed"),

    /**
     * Restricted
     */
    RESTRICTED((short) 201, "Restricted"),

    /**
     * Book
     */
    BOOK((short) 202, "Book"),

    /**
     * Continuous
     */
    CONTINUOUS((short) 203, "Continuous"),

    /**
     * Opening Auction
     */
    OPENING_AUCTION((short) 204, "Opening Auction"),

    /**
     * Opening Auction Freeze
     */
    OPENING_AUCTION_FREEZE((short) 205, "Opening Auction Freeze"),

    /**
     * Intraday Auction
     */
    INTRADAY_AUCTION((short) 206, "Intraday Auction"),

    /**
     * Intraday Auction Freeze
     */
    INTRADAY_AUCTION_FREEZE((short) 207, "Intraday Auction Freeze"),

    /**
     * Circuit Breaker Auction
     */
    CIRCUIT_BREAKER_AUCTION((short) 208, "Circuit Breaker Auction"),

    /**
     * Circuit Breaker Auction Freeze
     */
    CIRCUIT_BREAKER_AUCTION_FREEZE((short) 209, "Circuit Breaker Auction Freeze"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION((short) 210, "Closing Auction"),

    /**
     * Closing Auction Freeze
     */
    CLOSING_AUCTION_FREEZE((short) 211, "Closing Auction Freeze"),

    /**
     * Ipo Auction
     */
    IPO_AUCTION((short) 212, "Ipo Auction"),

    /**
     * Ipo Auction Freeze
     */
    IPO_AUCTION_FREEZE((short) 213, "Ipo Auction Freeze"),

    /**
     * Pre Call
     */
    PRE_CALL((short) 214, "Pre Call"),

    /**
     * Call
     */
    CALL((short) 215, "Call"),

    /**
     * Freeze
     */
    FREEZE((short) 216, "Freeze"),

    /**
     * Trade At Close
     */
    TRADE_AT_CLOSE((short) 217, "Trade At Close"),

    /**
     * Circuit Breaker Auction Triggered By Static Limit Breach
     */
    CIRCUIT_BREAKER_AUCTION_TRIGGERED_BY_STATIC_LIMIT_BREACH((short) 220, "Circuit Breaker Auction Triggered By Static Limit Breach"),

    /**
     * Circuit Breaker Auction Triggered By Static Limit Breach Freeze
     */
    CIRCUIT_BREAKER_AUCTION_TRIGGERED_BY_STATIC_LIMIT_BREACH_FREEZE((short) 221, "Circuit Breaker Auction Triggered By Static Limit Breach Freeze"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    SecurityMassTradingStatus(short wire, String description) {
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
    public static Optional<SecurityMassTradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(TRADING_HALT);
            case 7 -> Optional.of(MARKET_IMBALANCE_BUY);
            case 8 -> Optional.of(MARKET_IMBALANCE_SELL);
            case 200 -> Optional.of(CLOSED);
            case 201 -> Optional.of(RESTRICTED);
            case 202 -> Optional.of(BOOK);
            case 203 -> Optional.of(CONTINUOUS);
            case 204 -> Optional.of(OPENING_AUCTION);
            case 205 -> Optional.of(OPENING_AUCTION_FREEZE);
            case 206 -> Optional.of(INTRADAY_AUCTION);
            case 207 -> Optional.of(INTRADAY_AUCTION_FREEZE);
            case 208 -> Optional.of(CIRCUIT_BREAKER_AUCTION);
            case 209 -> Optional.of(CIRCUIT_BREAKER_AUCTION_FREEZE);
            case 210 -> Optional.of(CLOSING_AUCTION);
            case 211 -> Optional.of(CLOSING_AUCTION_FREEZE);
            case 212 -> Optional.of(IPO_AUCTION);
            case 213 -> Optional.of(IPO_AUCTION_FREEZE);
            case 214 -> Optional.of(PRE_CALL);
            case 215 -> Optional.of(CALL);
            case 216 -> Optional.of(FREEZE);
            case 217 -> Optional.of(TRADE_AT_CLOSE);
            case 220 -> Optional.of(CIRCUIT_BREAKER_AUCTION_TRIGGERED_BY_STATIC_LIMIT_BREACH);
            case 221 -> Optional.of(CIRCUIT_BREAKER_AUCTION_TRIGGERED_BY_STATIC_LIMIT_BREACH_FREEZE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
