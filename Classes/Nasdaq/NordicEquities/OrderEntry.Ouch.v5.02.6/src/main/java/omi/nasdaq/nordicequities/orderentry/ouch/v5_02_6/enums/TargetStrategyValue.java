package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.enums;

import java.util.Optional;

/**
 * The target strategy of the PureStream order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TargetStrategyValue {

    /**
     * Rate 5 To 15 Percent
     */
    RATE_5_TO_15_PERCENT('0', "Rate 5 To 15 Percent"),

    /**
     * Rate 5 To 30 Percent
     */
    RATE_5_TO_30_PERCENT('1', "Rate 5 To 30 Percent"),

    /**
     * Rate 10 To 200 Percent
     */
    RATE_10_TO_200_PERCENT('5', "Rate 10 To 200 Percent"),

    /**
     * Custom
     */
    CUSTOM('C', "Custom");

    private final char wire;

    private final String description;

    TargetStrategyValue(char wire, String description) {
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
    public static Optional<TargetStrategyValue> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(RATE_5_TO_15_PERCENT);
            case '1' -> Optional.of(RATE_5_TO_30_PERCENT);
            case '5' -> Optional.of(RATE_10_TO_200_PERCENT);
            case 'C' -> Optional.of(CUSTOM);
            default -> Optional.empty();
        };
    }
}
