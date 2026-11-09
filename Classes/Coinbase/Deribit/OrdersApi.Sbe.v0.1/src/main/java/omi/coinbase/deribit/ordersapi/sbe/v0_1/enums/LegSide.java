package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * legSide
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum LegSide {

    /**
     * BUY
     */
    BUY((byte) 1, "BUY"),

    /**
     * for use as mass cancel filter criteria
     */
    BOTH((byte) 0, "for use as mass cancel filter criteria"),

    /**
     * SELL
     */
    SELL((byte) -1, "SELL");

    private final byte wire;

    private final String description;

    LegSide(byte wire, String description) {
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
    public static Optional<LegSide> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(BUY);
            case 0 -> Optional.of(BOTH);
            case -1 -> Optional.of(SELL);
            default -> Optional.empty();
        };
    }
}
