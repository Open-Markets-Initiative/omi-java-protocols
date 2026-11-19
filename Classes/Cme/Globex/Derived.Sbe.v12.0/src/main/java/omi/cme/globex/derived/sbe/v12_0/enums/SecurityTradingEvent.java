package omi.cme.globex.derived.sbe.v12_0.enums;

import java.util.Optional;

/**
 * Signals the start of the next Global day or a Global day roll
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingEvent {

    /**
     * Global Day has been rolled and daily elements were reset
     */
    GLOBAL_DAY_ROLL((short) 4, "Global Day has been rolled and daily elements were reset");

    private final short wire;

    private final String description;

    SecurityTradingEvent(short wire, String description) {
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
    public static Optional<SecurityTradingEvent> fromWire(short wire) {
        return wire == 4 ? Optional.of(GLOBAL_DAY_ROLL) : Optional.empty();
    }
}
