package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.enums;

import java.util.Optional;

/**
 * 1 buy, -1 sell
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum Side {

    /**
     * BUY
     */
    BUY((byte) 1, "BUY"),

    /**
     * SELL
     */
    SELL((byte) -1, "SELL");

    private final byte wire;

    private final String description;

    Side(byte wire, String description) {
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
    public static Optional<Side> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(BUY);
            case -1 -> Optional.of(SELL);
            default -> Optional.empty();
        };
    }
}
