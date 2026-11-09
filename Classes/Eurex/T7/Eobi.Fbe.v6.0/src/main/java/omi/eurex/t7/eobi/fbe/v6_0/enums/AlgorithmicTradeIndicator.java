package omi.eurex.t7.eobi.fbe.v6_0.enums;

import java.util.Optional;

/**
 * Defines the AlgorithmicTradeIndicator values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AlgorithmicTradeIndicator {

    /**
     * Algorithmic Trade
     */
    ALGORITHMIC_TRADE((short) 1, "Algorithmic Trade"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    AlgorithmicTradeIndicator(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<AlgorithmicTradeIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ALGORITHMIC_TRADE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
