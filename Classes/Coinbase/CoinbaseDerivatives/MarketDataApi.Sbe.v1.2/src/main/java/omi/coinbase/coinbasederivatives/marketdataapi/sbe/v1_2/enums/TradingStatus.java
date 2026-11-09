package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.enums;

import java.util.Optional;

/**
 * tradingStatus
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum TradingStatus {

    /**
     * PRE_OPEN
     */
    PRE_OPEN((byte) 0, "PRE_OPEN"),

    /**
     * OPEN
     */
    OPEN((byte) 1, "OPEN"),

    /**
     * HALT
     */
    HALT((byte) 2, "HALT"),

    /**
     * PAUSE
     */
    PAUSE((byte) 3, "PAUSE"),

    /**
     * CLOSE
     */
    CLOSE((byte) 4, "CLOSE"),

    /**
     * PRE_OPEN_NO_CANCEL
     */
    PRE_OPEN_NO_CANCEL((byte) 5, "PRE_OPEN_NO_CANCEL"),

    /**
     * EXPIRED
     */
    EXPIRED((byte) 6, "EXPIRED");

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
            case 0 -> Optional.of(PRE_OPEN);
            case 1 -> Optional.of(OPEN);
            case 2 -> Optional.of(HALT);
            case 3 -> Optional.of(PAUSE);
            case 4 -> Optional.of(CLOSE);
            case 5 -> Optional.of(PRE_OPEN_NO_CANCEL);
            case 6 -> Optional.of(EXPIRED);
            default -> Optional.empty();
        };
    }
}
