package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Defines the DisplayIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DisplayIndicator {

    /**
     * Determined By Port Level Setting
     */
    DETERMINED_BY_PORT_LEVEL_SETTING('V', "Determined By Port Level Setting"),

    /**
     * Display Price Sliding
     */
    DISPLAY_PRICE_SLIDING('S', "Display Price Sliding"),

    /**
     * Display Price Sliding But Reject If Order Crosses Nbbo On Entry
     */
    DISPLAY_PRICE_SLIDING_BUT_REJECT_IF_ORDER_CROSSES_NBBO_ON_ENTRY('L', "Display Price Sliding But Reject If Order Crosses Nbbo On Entry"),

    /**
     * Multiple Display Price Sliding
     */
    MULTIPLE_DISPLAY_PRICE_SLIDING('M', "Multiple Display Price Sliding"),

    /**
     * Price Adjust
     */
    PRICE_ADJUST('P', "Price Adjust"),

    /**
     * Multiple Price Adjust
     */
    MULTIPLE_PRICE_ADJUST('m', "Multiple Price Adjust"),

    /**
     * Reject The Order If It Cannot Be Booked And Displayed Without Adjustment
     */
    REJECT_THE_ORDER_IF_IT_CANNOT_BE_BOOKED_AND_DISPLAYED_WITHOUT_ADJUSTMENT('R', "Reject The Order If It Cannot Be Booked And Displayed Without Adjustment"),

    /**
     * No Rescrape At Limit
     */
    NO_RESCRAPE_AT_LIMIT('N', "No Rescrape At Limit");

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
            case 'V' -> Optional.of(DETERMINED_BY_PORT_LEVEL_SETTING);
            case 'S' -> Optional.of(DISPLAY_PRICE_SLIDING);
            case 'L' -> Optional.of(DISPLAY_PRICE_SLIDING_BUT_REJECT_IF_ORDER_CROSSES_NBBO_ON_ENTRY);
            case 'M' -> Optional.of(MULTIPLE_DISPLAY_PRICE_SLIDING);
            case 'P' -> Optional.of(PRICE_ADJUST);
            case 'm' -> Optional.of(MULTIPLE_PRICE_ADJUST);
            case 'R' -> Optional.of(REJECT_THE_ORDER_IF_IT_CANNOT_BE_BOOKED_AND_DISPLAYED_WITHOUT_ADJUSTMENT);
            case 'N' -> Optional.of(NO_RESCRAPE_AT_LIMIT);
            default -> Optional.empty();
        };
    }
}
