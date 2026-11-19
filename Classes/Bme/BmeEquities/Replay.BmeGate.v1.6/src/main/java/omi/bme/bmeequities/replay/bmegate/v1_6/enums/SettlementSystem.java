package omi.bme.bmeequities.replay.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Settlement System
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementSystem {

    /**
     * Iberclear
     */
    IBERCLEAR('F', "Iberclear"),

    /**
     * Iberclear Latibex
     */
    IBERCLEAR_LATIBEX('L', "Iberclear Latibex");

    private final char wire;

    private final String description;

    SettlementSystem(char wire, String description) {
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
    public static Optional<SettlementSystem> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(IBERCLEAR);
            case 'L' -> Optional.of(IBERCLEAR_LATIBEX);
            default -> Optional.empty();
        };
    }
}
