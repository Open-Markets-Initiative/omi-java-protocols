package omi.cboe.cboeeurope.multicasttradereporting.pitch.v6_68.enums;

import java.util.Optional;

/**
 * MMT Level 3.9
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AlgorithmicTrade {

    /**
     * Algorithmic Trade
     */
    ALGORITHMIC_TRADE('H', "Algorithmic Trade"),

    /**
     * Non Algorithmic Trade
     */
    NON_ALGORITHMIC_TRADE('-', "Non Algorithmic Trade");

    private final char wire;

    private final String description;

    AlgorithmicTrade(char wire, String description) {
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
    public static Optional<AlgorithmicTrade> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(ALGORITHMIC_TRADE);
            case '-' -> Optional.of(NON_ALGORITHMIC_TRADE);
            default -> Optional.empty();
        };
    }
}
