package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.enums;

import java.util.Optional;

/**
 * productGroup
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ProductGroup {

    /**
     * CURRENCY
     */
    CURRENCY((byte) 0, "CURRENCY"),

    /**
     * EQUITY
     */
    EQUITY((byte) 1, "EQUITY"),

    /**
     * ENERGY
     */
    ENERGY((byte) 2, "ENERGY"),

    /**
     * METALS
     */
    METALS((byte) 3, "METALS"),

    /**
     * INTEREST_RATE
     */
    INTEREST_RATE((byte) 4, "INTEREST_RATE"),

    /**
     * AGRICULTURE
     */
    AGRICULTURE((byte) 5, "AGRICULTURE");

    private final byte wire;

    private final String description;

    ProductGroup(byte wire, String description) {
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
    public static Optional<ProductGroup> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(CURRENCY);
            case 1 -> Optional.of(EQUITY);
            case 2 -> Optional.of(ENERGY);
            case 3 -> Optional.of(METALS);
            case 4 -> Optional.of(INTEREST_RATE);
            case 5 -> Optional.of(AGRICULTURE);
            default -> Optional.empty();
        };
    }
}
