package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.enums;

import java.util.Optional;

/**
 * Underlying Asset Type of this instrument
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnderlyingAssetType {

    /**
     * Equity Index
     */
    EQUITY_INDEX('E', "Equity Index"),

    /**
     * Commodity Agriculture
     */
    COMMODITY_AGRICULTURE('A', "Commodity Agriculture");

    private final char wire;

    private final String description;

    UnderlyingAssetType(char wire, String description) {
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
    public static Optional<UnderlyingAssetType> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(EQUITY_INDEX);
            case 'A' -> Optional.of(COMMODITY_AGRICULTURE);
            default -> Optional.empty();
        };
    }
}
