package omi.cboe.cxjequities.multicastdepthofbook.pitch.v1_0_6.enums;

import java.util.Optional;

/**
 * The tick direction of this trade.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TickDirection {

    /**
     * Lower Than Previous Last Sale
     */
    LOWER_THAN_PREVIOUS_LAST_SALE('-', "Lower Than Previous Last Sale"),

    /**
     * Higher Than Previous Last Sale
     */
    HIGHER_THAN_PREVIOUS_LAST_SALE('+', "Higher Than Previous Last Sale"),

    /**
     * No Change From Or Since Tse Previous Close Or First Tse Trade Of An Ipo
     */
    NO_CHANGE_FROM_OR_SINCE_TSE_PREVIOUS_CLOSE_OR_FIRST_TSE_TRADE_OF_AN_IPO('0', "No Change From Or Since Tse Previous Close Or First Tse Trade Of An Ipo"),

    /**
     * Same As Previous Last Sale And Most Recent Price Change Was Downward
     */
    SAME_AS_PREVIOUS_LAST_SALE_AND_MOST_RECENT_PRICE_CHANGE_WAS_DOWNWARD('D', "Same As Previous Last Sale And Most Recent Price Change Was Downward"),

    /**
     * Same As Previous Last Sale And Most Recent Price Change Was Upward
     */
    SAME_AS_PREVIOUS_LAST_SALE_AND_MOST_RECENT_PRICE_CHANGE_WAS_UPWARD('U', "Same As Previous Last Sale And Most Recent Price Change Was Upward");

    private final char wire;

    private final String description;

    TickDirection(char wire, String description) {
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
    public static Optional<TickDirection> fromWire(char wire) {
        return switch (wire) {
            case '-' -> Optional.of(LOWER_THAN_PREVIOUS_LAST_SALE);
            case '+' -> Optional.of(HIGHER_THAN_PREVIOUS_LAST_SALE);
            case '0' -> Optional.of(NO_CHANGE_FROM_OR_SINCE_TSE_PREVIOUS_CLOSE_OR_FIRST_TSE_TRADE_OF_AN_IPO);
            case 'D' -> Optional.of(SAME_AS_PREVIOUS_LAST_SALE_AND_MOST_RECENT_PRICE_CHANGE_WAS_DOWNWARD);
            case 'U' -> Optional.of(SAME_AS_PREVIOUS_LAST_SALE_AND_MOST_RECENT_PRICE_CHANGE_WAS_UPWARD);
            default -> Optional.empty();
        };
    }
}
