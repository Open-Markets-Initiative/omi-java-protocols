package omi.nasdaq.ntxoptions.cti.itch.v2_1.enums;

import java.util.Optional;

/**
 * A = automatic, M = manual. A trade is automatic when it is assigned by the electronic matching engine.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecutionType {

    /**
     * Automatic
     */
    AUTOMATIC('A', "Automatic"),

    /**
     * Manual
     */
    MANUAL('M', "Manual");

    private final char wire;

    private final String description;

    ExecutionType(char wire, String description) {
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
    public static Optional<ExecutionType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUTOMATIC);
            case 'M' -> Optional.of(MANUAL);
            default -> Optional.empty();
        };
    }
}
