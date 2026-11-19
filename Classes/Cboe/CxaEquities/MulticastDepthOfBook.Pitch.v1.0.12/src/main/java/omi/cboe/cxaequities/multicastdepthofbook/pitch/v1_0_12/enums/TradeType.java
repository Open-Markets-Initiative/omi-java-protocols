package omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.enums;

import java.util.Optional;

/**
 * Trade type. Auction executions of Undisclosed orders will include one of O, C, or H.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeType {

    /**
     * Broker Preferred Trade
     */
    BROKER_PREFERRED_TRADE('B', "Broker Preferred Trade"),

    /**
     * Trade Resulting From Normal Matching Logic
     */
    TRADE_RESULTING_FROM_NORMAL_MATCHING_LOGIC('N', "Trade Resulting From Normal Matching Logic"),

    /**
     * Off Exchange Trade Report
     */
    OFF_EXCHANGE_TRADE_REPORT(' ', "Off Exchange Trade Report"),

    /**
     * Opening Intraday Auction Undisclosed
     */
    OPENING_INTRADAY_AUCTION_UNDISCLOSED('O', "Opening Intraday Auction Undisclosed"),

    /**
     * Closing Auction Undisclosed
     */
    CLOSING_AUCTION_UNDISCLOSED('C', "Closing Auction Undisclosed"),

    /**
     * Halt Auction Re Opening Undisclosed
     */
    HALT_AUCTION_RE_OPENING_UNDISCLOSED('H', "Halt Auction Re Opening Undisclosed");

    private final char wire;

    private final String description;

    TradeType(char wire, String description) {
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
    public static Optional<TradeType> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BROKER_PREFERRED_TRADE);
            case 'N' -> Optional.of(TRADE_RESULTING_FROM_NORMAL_MATCHING_LOGIC);
            case ' ' -> Optional.of(OFF_EXCHANGE_TRADE_REPORT);
            case 'O' -> Optional.of(OPENING_INTRADAY_AUCTION_UNDISCLOSED);
            case 'C' -> Optional.of(CLOSING_AUCTION_UNDISCLOSED);
            case 'H' -> Optional.of(HALT_AUCTION_RE_OPENING_UNDISCLOSED);
            default -> Optional.empty();
        };
    }
}
