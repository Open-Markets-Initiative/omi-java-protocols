package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * trigger
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum Trigger {

    /**
     * QUANTITY
     */
    QUANTITY((byte) 0, "QUANTITY"),

    /**
     * DELTA
     */
    DELTA((byte) 1, "DELTA"),

    /**
     * VEGA
     */
    VEGA((byte) 2, "VEGA");

    private final byte wire;

    private final String description;

    Trigger(byte wire, String description) {
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
    public static Optional<Trigger> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(QUANTITY);
            case 1 -> Optional.of(DELTA);
            case 2 -> Optional.of(VEGA);
            default -> Optional.empty();
        };
    }
}
