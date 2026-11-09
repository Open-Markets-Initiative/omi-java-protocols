package omi.cme.globex.mdp3.sbe.v1_5.enums;

import java.util.Optional;

/**
 * Market Data entry type
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
     * Opening Price
     */
    OPENING_PRICE('4', "Opening Price"),

    /**
     * Settlement Price
     */
    SETTLEMENT_PRICE('6', "Settlement Price"),

    /**
     * Trading Session High Price
     */
    TRADING_SESSION_HIGH_PRICE('7', "Trading Session High Price"),

    /**
     * Trading Session Low Price
     */
    TRADING_SESSION_LOW_PRICE('8', "Trading Session Low Price"),

    /**
     * Trade Volume
     */
    TRADE_VOLUME('B', "Trade Volume"),

    /**
     * Open Interest
     */
    OPEN_INTEREST('C', "Open Interest"),

    /**
     * Implied Bid
     */
    IMPLIED_BID('E', "Implied Bid"),

    /**
     * Implied Offer
     */
    IMPLIED_OFFER('F', "Implied Offer"),

    /**
     * Empty Book
     */
    EMPTY_BOOK('J', "Empty Book"),

    /**
     * Session High Bid
     */
    SESSION_HIGH_BID('N', "Session High Bid"),

    /**
     * Session Low Offer
     */
    SESSION_LOW_OFFER('O', "Session Low Offer"),

    /**
     * Fixing Price
     */
    FIXING_PRICE('W', "Fixing Price"),

    /**
     * Electronic Volume
     */
    ELECTRONIC_VOLUME('e', "Electronic Volume"),

    /**
     * Threshold Limits and Price Band Variation
     */
    THRESHOLD_LIMITSAND_PRICE_BAND_VARIATION('g', "Threshold Limits and Price Band Variation");

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
            case '4' -> Optional.of(OPENING_PRICE);
            case '6' -> Optional.of(SETTLEMENT_PRICE);
            case '7' -> Optional.of(TRADING_SESSION_HIGH_PRICE);
            case '8' -> Optional.of(TRADING_SESSION_LOW_PRICE);
            case 'B' -> Optional.of(TRADE_VOLUME);
            case 'C' -> Optional.of(OPEN_INTEREST);
            case 'E' -> Optional.of(IMPLIED_BID);
            case 'F' -> Optional.of(IMPLIED_OFFER);
            case 'J' -> Optional.of(EMPTY_BOOK);
            case 'N' -> Optional.of(SESSION_HIGH_BID);
            case 'O' -> Optional.of(SESSION_LOW_OFFER);
            case 'W' -> Optional.of(FIXING_PRICE);
            case 'e' -> Optional.of(ELECTRONIC_VOLUME);
            case 'g' -> Optional.of(THRESHOLD_LIMITSAND_PRICE_BAND_VARIATION);
            default -> Optional.empty();
        };
    }
}
