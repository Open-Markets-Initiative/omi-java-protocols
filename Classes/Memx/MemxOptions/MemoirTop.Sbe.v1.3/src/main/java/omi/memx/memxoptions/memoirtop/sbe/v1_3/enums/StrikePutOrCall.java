package omi.memx.memxoptions.memoirtop.sbe.v1_3.enums;

import java.util.Optional;

/**
 * StrikePutOrCall
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum StrikePutOrCall {

    /**
     * Put
     */
    PUT((short) 0, "Put"),

    /**
     * Call
     */
    CALL((short) 1, "Call");

    private final short wire;

    private final String description;

    StrikePutOrCall(short wire, String description) {
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
    public static Optional<StrikePutOrCall> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(PUT);
            case 1 -> Optional.of(CALL);
            default -> Optional.empty();
        };
    }
}
