package omi.cme.globex.derived.sbe.v12_0.enums;

import java.util.Optional;

/**
 * Market Data entry type, identifies the element
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryTypeTickerEntryType {

    /**
     * Touch High
     */
    TOUCH_HIGH('k', "Touch High"),

    /**
     * Touch Low
     */
    TOUCH_LOW('l', "Touch Low"),

    /**
     * Open Best Bid
     */
    OPEN_BEST_BID('m', "Open Best Bid"),

    /**
     * Open Best Offer
     */
    OPEN_BEST_OFFER('n', "Open Best Offer"),

    /**
     * Close Best Bid
     */
    CLOSE_BEST_BID('o', "Close Best Bid"),

    /**
     * Close Best Offer
     */
    CLOSE_BEST_OFFER('p', "Close Best Offer"),

    /**
     * Market High
     */
    MARKET_HIGH('q', "Market High"),

    /**
     * Market Low
     */
    MARKET_LOW('r', "Market Low"),

    /**
     * Market Best Offer
     */
    MARKET_BEST_OFFER('w', "Market Best Offer"),

    /**
     * Market Best Bid
     */
    MARKET_BEST_BID('x', "Market Best Bid"),

    /**
     * Paid
     */
    PAID('y', "Paid"),

    /**
     * Given
     */
    GIVEN('z', "Given");

    private final char wire;

    private final String description;

    MdEntryTypeTickerEntryType(char wire, String description) {
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
    public static Optional<MdEntryTypeTickerEntryType> fromWire(char wire) {
        return switch (wire) {
            case 'k' -> Optional.of(TOUCH_HIGH);
            case 'l' -> Optional.of(TOUCH_LOW);
            case 'm' -> Optional.of(OPEN_BEST_BID);
            case 'n' -> Optional.of(OPEN_BEST_OFFER);
            case 'o' -> Optional.of(CLOSE_BEST_BID);
            case 'p' -> Optional.of(CLOSE_BEST_OFFER);
            case 'q' -> Optional.of(MARKET_HIGH);
            case 'r' -> Optional.of(MARKET_LOW);
            case 'w' -> Optional.of(MARKET_BEST_OFFER);
            case 'x' -> Optional.of(MARKET_BEST_BID);
            case 'y' -> Optional.of(PAID);
            case 'z' -> Optional.of(GIVEN);
            default -> Optional.empty();
        };
    }
}
