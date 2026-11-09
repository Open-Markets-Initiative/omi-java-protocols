package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies whether the transaction constituted a stopped order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StopStockIndicator {

    /**
     * Stop Stock Not Applicable
     */
    STOP_STOCK_NOT_APPLICABLE('0', "Stop Stock Not Applicable"),

    /**
     * Stop Stock
     */
    STOP_STOCK('1', "Stop Stock");

    private final char wire;

    private final String description;

    StopStockIndicator(char wire, String description) {
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
    public static Optional<StopStockIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(STOP_STOCK_NOT_APPLICABLE);
            case '1' -> Optional.of(STOP_STOCK);
            default -> Optional.empty();
        };
    }
}
