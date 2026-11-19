package omi.jpx.osederivatives.geniuminet.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Time in force
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TimeInForce {

    /**
     * Order is valid for the trading day.
     */
    DAY((short) 0, "Order is valid for the trading day."),

    /**
     * Immediate or Cancel (Fill and Kill).
     */
    IMMEDIATE_OR_CANCEL((short) 3, "Immediate or Cancel (Fill and Kill)."),

    /**
     * Fill or Kill.
     */
    FILL_OR_KILL((short) 4, "Fill or Kill.");

    private final short wire;

    private final String description;

    TimeInForce(short wire, String description) {
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
    public static Optional<TimeInForce> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAY);
            case 3 -> Optional.of(IMMEDIATE_OR_CANCEL);
            case 4 -> Optional.of(FILL_OR_KILL);
            default -> Optional.empty();
        };
    }
}
