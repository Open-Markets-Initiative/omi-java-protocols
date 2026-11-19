package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * userSessionType
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum UserSessionType {

    /**
     * BinaryOrderEntry
     */
    BINARY_ORDER_ENTRY((byte) 1, "BinaryOrderEntry"),

    /**
     * MMQuoting
     */
    MM_QUOTING((byte) 2, "MMQuoting"),

    /**
     * Purge
     */
    PURGE((byte) 3, "Purge");

    private final byte wire;

    private final String description;

    UserSessionType(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<UserSessionType> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(BINARY_ORDER_ENTRY);
            case 2 -> Optional.of(MM_QUOTING);
            case 3 -> Optional.of(PURGE);
            default -> Optional.empty();
        };
    }
}
