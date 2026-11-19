package omi.jpx.osederivatives.geniuminet.glimpse.v2_2.enums;

import java.util.Optional;

/**
 * Distinction of Put or Call is set; if the case is futures or combination series, 0 is set
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PutOrCall {

    /**
     * Futures Or Combination Series
     */
    FUTURES_OR_COMBINATION_SERIES((short) 0, "Futures Or Combination Series"),

    /**
     * Call
     */
    CALL((short) 1, "Call"),

    /**
     * Put
     */
    PUT((short) 2, "Put");

    private final short wire;

    private final String description;

    PutOrCall(short wire, String description) {
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
    public static Optional<PutOrCall> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(FUTURES_OR_COMBINATION_SERIES);
            case 1 -> Optional.of(CALL);
            case 2 -> Optional.of(PUT);
            default -> Optional.empty();
        };
    }
}
