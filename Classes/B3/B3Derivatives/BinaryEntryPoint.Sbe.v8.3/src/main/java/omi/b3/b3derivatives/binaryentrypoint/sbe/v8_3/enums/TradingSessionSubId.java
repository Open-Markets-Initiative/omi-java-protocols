package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * tradingSessionSubID
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionSubId {

    /**
     * PAUSE
     */
    PAUSE((short) 2, "PAUSE"),

    /**
     * CLOSE
     */
    CLOSE((short) 4, "CLOSE"),

    /**
     * OPEN
     */
    OPEN((short) 17, "OPEN"),

    /**
     * PRE_CLOSE
     */
    PRE_CLOSE((short) 18, "PRE_CLOSE"),

    /**
     * PRE_OPEN
     */
    PRE_OPEN((short) 21, "PRE_OPEN"),

    /**
     * FINAL_CLOSING_CALL
     */
    FINAL_CLOSING_CALL((short) 101, "FINAL_CLOSING_CALL"),

    /**
     * tradingSessionSubID
     */
    NO_VALUE((short) 0, "tradingSessionSubID");

    private final short wire;

    private final String description;

    TradingSessionSubId(short wire, String description) {
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
    public static Optional<TradingSessionSubId> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(PAUSE);
            case 4 -> Optional.of(CLOSE);
            case 17 -> Optional.of(OPEN);
            case 18 -> Optional.of(PRE_CLOSE);
            case 21 -> Optional.of(PRE_OPEN);
            case 101 -> Optional.of(FINAL_CLOSING_CALL);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
