package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * putOrCall
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PutOrCall {

    /**
     * Put Option.
     */
    PUT((short) 0, "Put Option."),

    /**
     * Call Option.
     */
    CALL((short) 1, "Call Option."),

    /**
     * putOrCall
     */
    NO_VALUE((short) 255, "putOrCall");

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
            case 0 -> Optional.of(PUT);
            case 1 -> Optional.of(CALL);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
