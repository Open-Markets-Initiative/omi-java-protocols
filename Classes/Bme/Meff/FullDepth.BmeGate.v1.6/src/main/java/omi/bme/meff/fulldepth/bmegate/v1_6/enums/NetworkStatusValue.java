package omi.bme.meff.fulldepth.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Connection status
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum NetworkStatusValue {

    /**
     * Connected
     */
    CONNECTED((short) 1, "Connected"),

    /**
     * Not Connected Down Expected Up
     */
    NOT_CONNECTED_DOWN_EXPECTED_UP((short) 2, "Not Connected Down Expected Up"),

    /**
     * Not Connected Down Expected Down
     */
    NOT_CONNECTED_DOWN_EXPECTED_DOWN((short) 3, "Not Connected Down Expected Down"),

    /**
     * In Process
     */
    IN_PROCESS((short) 4, "In Process");

    private final short wire;

    private final String description;

    NetworkStatusValue(short wire, String description) {
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
    public static Optional<NetworkStatusValue> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CONNECTED);
            case 2 -> Optional.of(NOT_CONNECTED_DOWN_EXPECTED_UP);
            case 3 -> Optional.of(NOT_CONNECTED_DOWN_EXPECTED_DOWN);
            case 4 -> Optional.of(IN_PROCESS);
            default -> Optional.empty();
        };
    }
}
