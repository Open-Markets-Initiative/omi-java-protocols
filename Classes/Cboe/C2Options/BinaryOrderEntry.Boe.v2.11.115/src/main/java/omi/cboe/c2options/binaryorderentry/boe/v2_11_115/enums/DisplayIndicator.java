package omi.cboe.c2options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the DisplayIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DisplayIndicator {

    /**
     * Default. As determined by port level setting (default to S)
     */
    DEFAULT('V', "Default. As determined by port level setting (default to S)"),

    /**
     * Price Adjust
     */
    PRICE_ADJUST('P', "Price Adjust"),

    /**
     * Multiple Price Adjust
     */
    MULTIPLE_PRICE_ADJUST('m', "Multiple Price Adjust"),

    /**
     * Reject the order if it cannot be booked and displayed without adjustment. See Display Indicator Features for details on sliding options.
     */
    REJECT_THE_ORDER_IF_IT_CANNOT_BE_BOOKED_AND_DISPLAYED('R', "Reject the order if it cannot be booked and displayed without adjustment. See Display Indicator Features for details on sliding options.");

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
            case 'R' -> Optional.of(REJECT_THE_ORDER_IF_IT_CANNOT_BE_BOOKED_AND_DISPLAYED);
            default -> Optional.empty();
        };
    }
}
