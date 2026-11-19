package omi.bme.meff.topofbook5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Commodity Derivative Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CommodityDerivativeIndicator {

    /**
     * Commodity Derivative
     */
    COMMODITY_DERIVATIVE('S', "Commodity Derivative"),

    /**
     * Non Derivative
     */
    NON_DERIVATIVE('N', "Non Derivative"),

    /**
     * Derivative
     */
    DERIVATIVE('D', "Derivative");

    private final char wire;

    private final String description;

    CommodityDerivativeIndicator(char wire, String description) {
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
    public static Optional<CommodityDerivativeIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(COMMODITY_DERIVATIVE);
            case 'N' -> Optional.of(NON_DERIVATIVE);
            case 'D' -> Optional.of(DERIVATIVE);
            default -> Optional.empty();
        };
    }
}
