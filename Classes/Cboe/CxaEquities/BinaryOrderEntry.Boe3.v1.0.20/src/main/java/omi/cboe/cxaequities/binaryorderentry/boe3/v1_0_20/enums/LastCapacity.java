package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * Capacity of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LastCapacity {

    /**
     * Agent
     */
    AGENT('1', "Agent"),

    /**
     * Cross As Agent
     */
    CROSS_AS_AGENT('2', "Cross As Agent"),

    /**
     * Cross As Principal
     */
    CROSS_AS_PRINCIPAL('3', "Cross As Principal"),

    /**
     * Principal
     */
    PRINCIPAL('4', "Principal"),

    /**
     * Mixed
     */
    MIXED('5', "Mixed"),

    /**
     * Cross As Mixed
     */
    CROSS_AS_MIXED('6', "Cross As Mixed");

    private final char wire;

    private final String description;

    LastCapacity(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<LastCapacity> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(AGENT);
            case '2' -> Optional.of(CROSS_AS_AGENT);
            case '3' -> Optional.of(CROSS_AS_PRINCIPAL);
            case '4' -> Optional.of(PRINCIPAL);
            case '5' -> Optional.of(MIXED);
            case '6' -> Optional.of(CROSS_AS_MIXED);
            default -> Optional.empty();
        };
    }
}
