package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * 0=no decimals; interpret as integer. 2=two decimals; interpret with two decimals (e.g., USDLimit=25 with PriceScale=2 represents $0.25). Must be specified for Limit Order Price Protection - Custom Limits and applied to USDLimit; otherwise set to 0.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceScale {

    /**
     * No decimals
     */
    NO_DECIMALS((short) 0, "No decimals"),

    /**
     * Two decimals
     */
    TWO_DECIMALS((short) 2, "Two decimals");

    private final short wire;

    private final String description;

    PriceScale(short wire, String description) {
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
    public static Optional<PriceScale> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_DECIMALS);
            case 2 -> Optional.of(TWO_DECIMALS);
            default -> Optional.empty();
        };
    }
}
