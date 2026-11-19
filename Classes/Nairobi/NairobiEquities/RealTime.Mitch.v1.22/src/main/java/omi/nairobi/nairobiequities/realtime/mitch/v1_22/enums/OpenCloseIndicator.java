package omi.nairobi.nairobiequities.realtime.mitch.v1_22.enums;

import java.util.Optional;

/**
 * How the price was determined.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpenCloseIndicator {

    /**
     * Auction Trade
     */
    AUCTION_TRADE('A', "Auction Trade"),

    /**
     * Regular Trade
     */
    REGULAR_TRADE('B', "Regular Trade"),

    /**
     * Mid Point
     */
    MID_POINT('C', "Mid Point"),

    /**
     * Last Regular Trade
     */
    LAST_REGULAR_TRADE('D', "Last Regular Trade"),

    /**
     * Last Auction
     */
    LAST_AUCTION('E', "Last Auction"),

    /**
     * Manual
     */
    MANUAL('F', "Manual"),

    /**
     * Vwap
     */
    VWAP('H', "Vwap"),

    /**
     * Previous Close
     */
    PREVIOUS_CLOSE('I', "Previous Close"),

    /**
     * Theoretical Price
     */
    THEORETICAL_PRICE('T', "Theoretical Price"),

    /**
     * Best Bid
     */
    BEST_BID('U', "Best Bid"),

    /**
     * Best Offer
     */
    BEST_OFFER('V', "Best Offer"),

    /**
     * None
     */
    NONE('W', "None"),

    /**
     * Vwap Of Last N Trades
     */
    VWAP_OF_LAST_N_TRADES('X', "Vwap Of Last N Trades"),

    /**
     * Reference Price
     */
    REFERENCE_PRICE('Y', "Reference Price"),

    /**
     * Price Unavailable
     */
    PRICE_UNAVAILABLE('Z', "Price Unavailable");

    private final char wire;

    private final String description;

    OpenCloseIndicator(char wire, String description) {
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
    public static Optional<OpenCloseIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUCTION_TRADE);
            case 'B' -> Optional.of(REGULAR_TRADE);
            case 'C' -> Optional.of(MID_POINT);
            case 'D' -> Optional.of(LAST_REGULAR_TRADE);
            case 'E' -> Optional.of(LAST_AUCTION);
            case 'F' -> Optional.of(MANUAL);
            case 'H' -> Optional.of(VWAP);
            case 'I' -> Optional.of(PREVIOUS_CLOSE);
            case 'T' -> Optional.of(THEORETICAL_PRICE);
            case 'U' -> Optional.of(BEST_BID);
            case 'V' -> Optional.of(BEST_OFFER);
            case 'W' -> Optional.of(NONE);
            case 'X' -> Optional.of(VWAP_OF_LAST_N_TRADES);
            case 'Y' -> Optional.of(REFERENCE_PRICE);
            case 'Z' -> Optional.of(PRICE_UNAVAILABLE);
            default -> Optional.empty();
        };
    }
}
