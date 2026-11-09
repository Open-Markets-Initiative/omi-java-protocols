package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Identifies whether the order should be treated as passive (will not match when entered) or aggressive (could match when entered); default behavior when absent is aggressive
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecutionMode {

    /**
     * Aggressive
     */
    AGGRESSIVE('A', "Aggressive"),

    /**
     * Passive
     */
    PASSIVE('P', "Passive");

    private final char wire;

    private final String description;

    ExecutionMode(char wire, String description) {
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
    public static Optional<ExecutionMode> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AGGRESSIVE);
            case 'P' -> Optional.of(PASSIVE);
            default -> Optional.empty();
        };
    }
}
