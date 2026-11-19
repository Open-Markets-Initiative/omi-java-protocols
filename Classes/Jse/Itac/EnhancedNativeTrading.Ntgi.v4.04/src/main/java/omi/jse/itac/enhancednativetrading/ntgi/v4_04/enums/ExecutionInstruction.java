package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Whether hidden limit orders are excluded
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ExecutionInstruction {

    /**
     * Do Not Exclude Hidden Limit Orders
     */
    DO_NOT_EXCLUDE_HIDDEN_LIMIT_ORDERS((byte) 0, "Do Not Exclude Hidden Limit Orders"),

    /**
     * Exclude Hidden Limit Orders
     */
    EXCLUDE_HIDDEN_LIMIT_ORDERS((byte) 1, "Exclude Hidden Limit Orders");

    private final byte wire;

    private final String description;

    ExecutionInstruction(byte wire, String description) {
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
    public static Optional<ExecutionInstruction> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(DO_NOT_EXCLUDE_HIDDEN_LIMIT_ORDERS);
            case 1 -> Optional.of(EXCLUDE_HIDDEN_LIMIT_ORDERS);
            default -> Optional.empty();
        };
    }
}
