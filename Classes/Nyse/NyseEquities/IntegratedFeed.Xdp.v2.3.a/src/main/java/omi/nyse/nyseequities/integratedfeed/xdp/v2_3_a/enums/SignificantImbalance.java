package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.enums;

import java.util.Optional;

/**
 * Significant Imbalance Values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SignificantImbalance {

    /**
     * Default
     */
    DEFAULT(' ', "Default"),

    /**
     * the current Imbalance is significant
     */
    THE_CURRENT_IMBALANCE_IS_SIGNIFICANT('Y', "the current Imbalance is significant");

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
            case ' ' -> Optional.of(DEFAULT);
            case 'Y' -> Optional.of(THE_CURRENT_IMBALANCE_IS_SIGNIFICANT);
            default -> Optional.empty();
        };
    }
}
