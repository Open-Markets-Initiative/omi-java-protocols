package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * productType
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ProductType {

    /**
     * ALL
     */
    ALL((byte) 0, "ALL"),

    /**
     * OPTIONS
     */
    OPTIONS((byte) 1, "OPTIONS"),

    /**
     * FUTURES
     */
    FUTURES((byte) 2, "FUTURES"),

    /**
     * COMBO_FUTURES
     */
    COMBO_FUTURES((byte) 3, "COMBO_FUTURES"),

    /**
     * COMBO_OPTIONS
     */
    COMBO_OPTIONS((byte) 4, "COMBO_OPTIONS"),

    /**
     * SPOT
     */
    SPOT((byte) 5, "SPOT");

    private final byte wire;

    private final String description;

    ProductType(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<ProductType> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(ALL);
            case 1 -> Optional.of(OPTIONS);
            case 2 -> Optional.of(FUTURES);
            case 3 -> Optional.of(COMBO_FUTURES);
            case 4 -> Optional.of(COMBO_OPTIONS);
            case 5 -> Optional.of(SPOT);
            default -> Optional.empty();
        };
    }
}
