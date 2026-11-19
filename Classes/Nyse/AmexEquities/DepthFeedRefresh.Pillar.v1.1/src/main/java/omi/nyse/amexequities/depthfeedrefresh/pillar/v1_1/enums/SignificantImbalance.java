package omi.nyse.amexequities.depthfeedrefresh.pillar.v1_1.enums;

import java.util.Optional;

/**
 * Indicates whether the current Imbalance is significant.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SignificantImbalance {

    /**
     * The Current Imbalance Is Significant
     */
    THE_CURRENT_IMBALANCE_IS_SIGNIFICANT('Y', "The Current Imbalance Is Significant"),

    /**
     * Default Value Till A Future Implementation Date
     */
    DEFAULT_VALUE_TILL_A_FUTURE_IMPLEMENTATION_DATE(' ', "Default Value Till A Future Implementation Date");

    private final char wire;

    private final String description;

    SignificantImbalance(char wire, String description) {
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
    public static Optional<SignificantImbalance> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(THE_CURRENT_IMBALANCE_IS_SIGNIFICANT);
            case ' ' -> Optional.of(DEFAULT_VALUE_TILL_A_FUTURE_IMPLEMENTATION_DATE);
            default -> Optional.empty();
        };
    }
}
