package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * Used to identify the type of quantity.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PosType {

    /**
     * TRANSACTION_QUANTITY
     */
    TRANSACTION_QUANTITY('T', "TRANSACTION_QUANTITY"),

    /**
     * START_OF_DAY_QTY
     */
    START_OF_DAY_QTY('S', "START_OF_DAY_QTY"),

    /**
     * OPTION_EXERCISE_QTY
     */
    OPTION_EXERCISE_QTY('E', "OPTION_EXERCISE_QTY"),

    /**
     * BLOCKED_QTY
     */
    BLOCKED_QTY('B', "BLOCKED_QTY"),

    /**
     * UNCOVERED_QTY
     */
    UNCOVERED_QTY('U', "UNCOVERED_QTY"),

    /**
     * COVERED_QTY
     */
    COVERED_QTY('C', "COVERED_QTY");

    private final char wire;

    private final String description;

    PosType(char wire, String description) {
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
    public static Optional<PosType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TRANSACTION_QUANTITY);
            case 'S' -> Optional.of(START_OF_DAY_QTY);
            case 'E' -> Optional.of(OPTION_EXERCISE_QTY);
            case 'B' -> Optional.of(BLOCKED_QTY);
            case 'U' -> Optional.of(UNCOVERED_QTY);
            case 'C' -> Optional.of(COVERED_QTY);
            default -> Optional.empty();
        };
    }
}
