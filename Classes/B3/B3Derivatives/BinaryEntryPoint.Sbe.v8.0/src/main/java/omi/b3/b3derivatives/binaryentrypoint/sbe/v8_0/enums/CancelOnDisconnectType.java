package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * cancelOnDisconnectType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CancelOnDisconnectType {

    /**
     * DO_NOT_CANCEL_ON_DISCONNECT_OR_TERMINATE
     */
    DO_NOT_CANCEL_ON_DISCONNECT_OR_TERMINATE((short) 0, "DO_NOT_CANCEL_ON_DISCONNECT_OR_TERMINATE"),

    /**
     * CANCEL_ON_DISCONNECT_ONLY
     */
    CANCEL_ON_DISCONNECT_ONLY((short) 1, "CANCEL_ON_DISCONNECT_ONLY"),

    /**
     * CANCEL_ON_TERMINATE_ONLY
     */
    CANCEL_ON_TERMINATE_ONLY((short) 2, "CANCEL_ON_TERMINATE_ONLY"),

    /**
     * CANCEL_ON_DISCONNECT_OR_TERMINATE
     */
    CANCEL_ON_DISCONNECT_OR_TERMINATE((short) 3, "CANCEL_ON_DISCONNECT_OR_TERMINATE");

    private final short wire;

    private final String description;

    CancelOnDisconnectType(short wire, String description) {
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
    public static Optional<CancelOnDisconnectType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DO_NOT_CANCEL_ON_DISCONNECT_OR_TERMINATE);
            case 1 -> Optional.of(CANCEL_ON_DISCONNECT_ONLY);
            case 2 -> Optional.of(CANCEL_ON_TERMINATE_ONLY);
            case 3 -> Optional.of(CANCEL_ON_DISCONNECT_OR_TERMINATE);
            default -> Optional.empty();
        };
    }
}
