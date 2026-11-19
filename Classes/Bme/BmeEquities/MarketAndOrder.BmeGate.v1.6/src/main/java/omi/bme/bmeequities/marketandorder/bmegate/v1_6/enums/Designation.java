package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Trade situation
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Designation {

    /**
     * Trade During Open Market
     */
    TRADE_DURING_OPEN_MARKET('1', "Trade During Open Market"),

    /**
     * Trade During Opening Auction
     */
    TRADE_DURING_OPENING_AUCTION('2', "Trade During Opening Auction"),

    /**
     * Trade During Closing Auction
     */
    TRADE_DURING_CLOSING_AUCTION('3', "Trade During Closing Auction"),

    /**
     * Trade During Volatility Auction
     */
    TRADE_DURING_VOLATILITY_AUCTION('4', "Trade During Volatility Auction"),

    /**
     * Trade During Manual Auction
     */
    TRADE_DURING_MANUAL_AUCTION('5', "Trade During Manual Auction"),

    /**
     * Trade During Opening Auction Extension
     */
    TRADE_DURING_OPENING_AUCTION_EXTENSION('6', "Trade During Opening Auction Extension"),

    /**
     * Trade During Closing Auction Extension
     */
    TRADE_DURING_CLOSING_AUCTION_EXTENSION('7', "Trade During Closing Auction Extension"),

    /**
     * Trade During Tal Period
     */
    TRADE_DURING_TAL_PERIOD('8', "Trade During Tal Period"),

    /**
     * Trade In Spain At Mid Dark Book
     */
    TRADE_IN_SPAIN_AT_MID_DARK_BOOK('C', "Trade In Spain At Mid Dark Book");

    private final char wire;

    private final String description;

    Designation(char wire, String description) {
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
    public static Optional<Designation> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(TRADE_DURING_OPEN_MARKET);
            case '2' -> Optional.of(TRADE_DURING_OPENING_AUCTION);
            case '3' -> Optional.of(TRADE_DURING_CLOSING_AUCTION);
            case '4' -> Optional.of(TRADE_DURING_VOLATILITY_AUCTION);
            case '5' -> Optional.of(TRADE_DURING_MANUAL_AUCTION);
            case '6' -> Optional.of(TRADE_DURING_OPENING_AUCTION_EXTENSION);
            case '7' -> Optional.of(TRADE_DURING_CLOSING_AUCTION_EXTENSION);
            case '8' -> Optional.of(TRADE_DURING_TAL_PERIOD);
            case 'C' -> Optional.of(TRADE_IN_SPAIN_AT_MID_DARK_BOOK);
            default -> Optional.empty();
        };
    }
}
