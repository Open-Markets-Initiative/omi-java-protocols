package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.enums;

import java.util.Optional;

/**
 * Actual or Theoretical Settlement Price Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementPriceTypeCalcMethod {

    /**
     * Actual
     */
    ACTUAL('A', "Actual"),

    /**
     * Theoretical
     */
    THEORETICAL('T', "Theoretical");

    private final char wire;

    private final String description;

    SettlementPriceTypeCalcMethod(char wire, String description) {
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
    public static Optional<SettlementPriceTypeCalcMethod> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACTUAL);
            case 'T' -> Optional.of(THEORETICAL);
            default -> Optional.empty();
        };
    }
}
