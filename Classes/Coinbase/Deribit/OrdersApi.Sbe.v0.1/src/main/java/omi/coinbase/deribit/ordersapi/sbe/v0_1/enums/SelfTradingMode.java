package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * selfTradingMode
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum SelfTradingMode {

    /**
     * CANCEL_TAKER
     */
    CANCEL_TAKER((byte) 0, "CANCEL_TAKER"),

    /**
     * CANCEL_MAKER
     */
    CANCEL_MAKER((byte) 1, "CANCEL_MAKER");

    private final byte wire;

    private final String description;

    SelfTradingMode(byte wire, String description) {
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
    public static Optional<SelfTradingMode> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(CANCEL_TAKER);
            case 1 -> Optional.of(CANCEL_MAKER);
            default -> Optional.empty();
        };
    }
}
