package omi.cme.brokertec.ustreasury.sbe.v10_1.enums;

import java.util.Optional;

/**
 * Indicates the type of Market Data entry
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryType {

    /**
     * Bid
     */
    BID('0', "Bid"),

    /**
     * Offer
     */
    OFFER('1', "Offer"),

    /**
     * Trade
     */
    TRADE('2', "Trade"),

    /**
     * Open Price
     */
    OPEN_PRICE('4', "Open Price"),

    /**
     * Close Price
     */
    CLOSE_PRICE('5', "Close Price"),

    /**
     * Trading Session High Price
     */
    HIGH_TRADE_PRICE('7', "Trading Session High Price"),

    /**
     * Trading Session Low Price
     */
    LOW_TRADE_PRICE('8', "Trading Session Low Price"),

    /**
     * VWAP or VWAY
     */
    VWAP('9', "VWAP or VWAY"),

    /**
     * Implied Bid
     */
    IMPLIED_BID('E', "Implied Bid"),

    /**
     * Implied Offer
     */
    IMPLIED_OFFER('F', "Implied Offer"),

    /**
     * Book Reset
     */
    BOOK_RESET('J', "Book Reset");

    private final char wire;

    private final String description;

    MdEntryType(char wire, String description) {
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
    public static Optional<MdEntryType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(BID);
            case '1' -> Optional.of(OFFER);
            case '2' -> Optional.of(TRADE);
            case '4' -> Optional.of(OPEN_PRICE);
            case '5' -> Optional.of(CLOSE_PRICE);
            case '7' -> Optional.of(HIGH_TRADE_PRICE);
            case '8' -> Optional.of(LOW_TRADE_PRICE);
            case '9' -> Optional.of(VWAP);
            case 'E' -> Optional.of(IMPLIED_BID);
            case 'F' -> Optional.of(IMPLIED_OFFER);
            case 'J' -> Optional.of(BOOK_RESET);
            default -> Optional.empty();
        };
    }
}
