package omi.jpx.tseequities.indexstatistics.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates comparison type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ComparisonType {

    /**
     * Indicates the change from base price for the day.
     */
    CHANGE_FROM_BASE_PRICE_FOR_THE_DAY('1', "Indicates the change from base price for the day."),

    /**
     * Indicates the change from the last price from the previous day.
     */
    CHANGE_FROM_THE_LAST_PRICE_FROM_THE_PREVIOUS_DAY(' ', "Indicates the change from the last price from the previous day.");

    private final char wire;

    private final String description;

    ComparisonType(char wire, String description) {
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
    public static Optional<ComparisonType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CHANGE_FROM_BASE_PRICE_FOR_THE_DAY);
            case ' ' -> Optional.of(CHANGE_FROM_THE_LAST_PRICE_FROM_THE_PREVIOUS_DAY);
            default -> Optional.empty();
        };
    }
}
