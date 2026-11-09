package omi.coinbase.deribit.marketdataapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * tradingStatus
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum TradingStatus {

    /**
     * OPEN
     */
    OPEN((byte) 0, "OPEN"),

    /**
     * INACTIVE
     */
    INACTIVE((byte) 1, "INACTIVE"),

    /**
     * SETTLEMENT
     */
    SETTLEMENT((byte) 2, "SETTLEMENT"),

    /**
     * DELIVERED
     */
    DELIVERED((byte) 3, "DELIVERED"),

    /**
     * LOCKED
     */
    LOCKED((byte) 4, "LOCKED"),

    /**
     * HALTED
     */
    HALTED((byte) 5, "HALTED");

    private final byte wire;

    private final String description;

    TradingStatus(byte wire, String description) {
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
    public static Optional<TradingStatus> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(OPEN);
            case 1 -> Optional.of(INACTIVE);
            case 2 -> Optional.of(SETTLEMENT);
            case 3 -> Optional.of(DELIVERED);
            case 4 -> Optional.of(LOCKED);
            case 5 -> Optional.of(HALTED);
            default -> Optional.empty();
        };
    }
}
