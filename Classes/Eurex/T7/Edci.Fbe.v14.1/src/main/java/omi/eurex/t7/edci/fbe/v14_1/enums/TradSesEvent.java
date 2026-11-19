package omi.eurex.t7.edci.fbe.v14_1.enums;

import java.util.Optional;

/**
 * Defines the TradSesEvent values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradSesEvent {

    /**
     * End of Restatement
     */
    ENDOF_RESTATEMENT((short) 103, "End of Restatement"),

    /**
     * End of Service
     */
    ENDOF_DAY_SERVICE((short) 104, "End of Service"),

    /**
     * End of Order book synchronization
     */
    ENDOF_ORDERBOOKSYNCH((short) 107, "End of Order book synchronization"),

    /**
     * Start of Order book synchronization
     */
    STARTOF_ORDERBOOKSYNCH((short) 108, "Start of Order book synchronization"),

    /**
     * Order book reset
     */
    ORDERBOOKRESET((short) 109, "Order book reset"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradSesEvent(short wire, String description) {
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
    public static Optional<TradSesEvent> fromWire(short wire) {
        return switch (wire) {
            case 103 -> Optional.of(ENDOF_RESTATEMENT);
            case 104 -> Optional.of(ENDOF_DAY_SERVICE);
            case 107 -> Optional.of(ENDOF_ORDERBOOKSYNCH);
            case 108 -> Optional.of(STARTOF_ORDERBOOKSYNCH);
            case 109 -> Optional.of(ORDERBOOKRESET);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
