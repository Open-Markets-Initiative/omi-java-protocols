package omi.bist.borsaistanbul.geniuminet.itch.v21_12.enums;

import java.util.Optional;

/**
 * Option type. A value of 0 indicates that Put or Call is undefined for the order book
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PutOrCall {

    /**
     * Undefined
     */
    UNDEFINED((short) 0, "Undefined"),

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
            case 0 -> Optional.of(UNDEFINED);
            case 1 -> Optional.of(CALL);
            case 2 -> Optional.of(PUT);
            default -> Optional.empty();
        };
    }
}
