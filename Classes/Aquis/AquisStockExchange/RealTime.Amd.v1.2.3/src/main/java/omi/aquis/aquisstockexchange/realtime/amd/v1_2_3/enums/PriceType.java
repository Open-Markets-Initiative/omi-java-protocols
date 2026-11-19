package omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.enums;

import java.util.Optional;

/**
 * Whether the price is the opening or the closing price
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceType {

    /**
     * Opening Price
     */
    OPENING_PRICE((short) 2, "Opening Price"),

    /**
     * Closing Price
     */
    CLOSING_PRICE((short) 5, "Closing Price");

    private final short wire;

    private final String description;

    PriceType(short wire, String description) {
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
    public static Optional<PriceType> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(OPENING_PRICE);
            case 5 -> Optional.of(CLOSING_PRICE);
            default -> Optional.empty();
        };
    }
}
