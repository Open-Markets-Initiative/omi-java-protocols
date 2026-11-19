package omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.enums;

import java.util.Optional;

/**
 * Whether the order resulted from algorithmic trading
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AlgoIndicator {

    /**
     * No Algo
     */
    NO_ALGO('-', "No Algo"),

    /**
     * Algo
     */
    ALGO('H', "Algo");

    private final char wire;

    private final String description;

    AlgoIndicator(char wire, String description) {
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
    public static Optional<AlgoIndicator> fromWire(char wire) {
        return switch (wire) {
            case '-' -> Optional.of(NO_ALGO);
            case 'H' -> Optional.of(ALGO);
            default -> Optional.empty();
        };
    }
}
