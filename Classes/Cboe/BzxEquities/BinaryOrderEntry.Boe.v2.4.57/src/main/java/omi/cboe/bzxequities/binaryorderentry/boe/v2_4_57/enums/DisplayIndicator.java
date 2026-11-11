package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Defines the DisplayIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DisplayIndicator {

    /**
     * Default. As determined by port level setting (defaults to S)
     */
    DEFAULT('V', "Default. As determined by port level setting (defaults to S)"),

    /**
     * Price Adjust
     */
    PRICE_ADJUST('P', "Price Adjust"),

    /**
     * Multiple Price Adjust
     */
    MULTIPLE_PRICE_ADJUST('m', "Multiple Price Adjust"),

    /**
     * Cancel back the order if it cannot be booked and displayed without adjustment
     */
    CANCEL_BACK_THE_ORDER_IF_IT_CANNOT_BE_BOOKED_AND_DISPLAYED('R', "Cancel back the order if it cannot be booked and displayed without adjustment"),

    /**
     * Hidden; cancel back the order if it cannot be booked without adjustment
     */
    HIDDEN('r', "Hidden; cancel back the order if it cannot be booked without adjustment"),

    /**
     * Display Price Sliding (this is to override an opt-out of Display Price Siding at the port level)
     */
    DISPLAY_PRICE_SLIDING('S', "Display Price Sliding (this is to override an opt-out of Display Price Siding at the port level)"),

    /**
     * Display Price Sliding, but cancel back if order crosses the NBBO on entry
     */
    DISPLAY_PRICE_SLIDING_BUT_CANCEL_BACK_IF_ORDER_CROSSES_THE('L', "Display Price Sliding, but cancel back if order crosses the NBBO on entry"),

    /**
     * Multiple Display Price Sliding
     */
    MULTIPLE_DISPLAY_PRICE_SLIDING('M', "Multiple Display Price Sliding"),

    /**
     * Hidden Multiple Price Slide Other Options:
     */
    HIDDEN_MULTIPLE_PRICE_SLIDE('h', "Hidden Multiple Price Slide Other Options:"),

    /**
     * Visible (for visible peg orders only; others will be rejected)
     */
    VISIBLE('v', "Visible (for visible peg orders only; others will be rejected)"),

    /**
     * Invisible (implied for Midpoint Peg orders)
     */
    INVISIBLE('I', "Invisible (implied for Midpoint Peg orders)"),

    /**
     * No Rescrape at Limit. Applicable only to fully routable, IOC orders (RoutingInst = R and TimeInForce = 3). After walking the price to the limit, there will be no final scrape at Cboe and the cancel reason code will state X (Expired) rather than N (No Liquidity).
     */
    NO_RESCRAPE_AT_LIMIT('N', "No Rescrape at Limit. Applicable only to fully routable, IOC orders (RoutingInst = R and TimeInForce = 3). After walking the price to the limit, there will be no final scrape at Cboe and the cancel reason code will state X (Expired) rather than N (No Liquidity).");

    private final char wire;

    private final String description;

    DisplayIndicator(char wire, String description) {
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
    public static Optional<DisplayIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'V' -> Optional.of(DEFAULT);
            case 'P' -> Optional.of(PRICE_ADJUST);
            case 'm' -> Optional.of(MULTIPLE_PRICE_ADJUST);
            case 'R' -> Optional.of(CANCEL_BACK_THE_ORDER_IF_IT_CANNOT_BE_BOOKED_AND_DISPLAYED);
            case 'r' -> Optional.of(HIDDEN);
            case 'S' -> Optional.of(DISPLAY_PRICE_SLIDING);
            case 'L' -> Optional.of(DISPLAY_PRICE_SLIDING_BUT_CANCEL_BACK_IF_ORDER_CROSSES_THE);
            case 'M' -> Optional.of(MULTIPLE_DISPLAY_PRICE_SLIDING);
            case 'h' -> Optional.of(HIDDEN_MULTIPLE_PRICE_SLIDE);
            case 'v' -> Optional.of(VISIBLE);
            case 'I' -> Optional.of(INVISIBLE);
            case 'N' -> Optional.of(NO_RESCRAPE_AT_LIMIT);
            default -> Optional.empty();
        };
    }
}
