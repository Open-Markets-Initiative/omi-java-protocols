package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.enums;

import java.util.Optional;

/**
 * The allocation model used by the MIAX Futures Onyx Trading Platform for the Product
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MatchAlgorithm {

    /**
     * Price Then Time
     */
    PRICE_THEN_TIME('P', "Price Then Time");

    private final char wire;

    private final String description;

    MatchAlgorithm(char wire, String description) {
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
    public static Optional<MatchAlgorithm> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRICE_THEN_TIME);
            default -> Optional.empty();
        };
    }
}
