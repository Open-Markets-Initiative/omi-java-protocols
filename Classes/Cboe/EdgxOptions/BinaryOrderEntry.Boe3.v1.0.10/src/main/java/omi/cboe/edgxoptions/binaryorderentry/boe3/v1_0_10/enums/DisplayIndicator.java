package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.enums;

import java.util.Optional;

/**
 * DisplayIndicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DisplayIndicator {

    /**
     * As determined by port level setting (default to S)
     */
    DEFAULT('V', "As determined by port level setting (default to S)"),

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
    REJECT_THE_ORDER_IF_IT_CANNOT_BE_BOOKED_AND_DISPLAYED_WITHOUT_ADJUSTMENT('R', "Reject The Order If It Cannot Be Booked And Displayed Without Adjustment");

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
            case 'R' -> Optional.of(REJECT_THE_ORDER_IF_IT_CANNOT_BE_BOOKED_AND_DISPLAYED_WITHOUT_ADJUSTMENT);
            default -> Optional.empty();
        };
    }
}
