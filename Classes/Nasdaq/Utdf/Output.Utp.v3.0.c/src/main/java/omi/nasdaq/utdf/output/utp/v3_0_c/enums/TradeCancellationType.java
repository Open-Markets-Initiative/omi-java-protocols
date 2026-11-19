package omi.nasdaq.utdf.output.utp.v3_0_c.enums;

import java.util.Optional;

/**
 * Trade Cancellation Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCancellationType {

    /**
     * Cancel
     */
    CANCEL('C', "Cancel"),

    /**
     * Error
     */
    ERROR('E', "Error");

    private final char wire;

    private final String description;

    TradeCancellationType(char wire, String description) {
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
    public static Optional<TradeCancellationType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CANCEL);
            case 'E' -> Optional.of(ERROR);
            default -> Optional.empty();
        };
    }
}
