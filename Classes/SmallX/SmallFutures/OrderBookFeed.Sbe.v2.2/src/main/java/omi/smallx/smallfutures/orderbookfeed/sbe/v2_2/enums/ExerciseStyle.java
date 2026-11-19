package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.enums;

import java.util.Optional;

/**
 * Option exercise style
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExerciseStyle {

    /**
     * EUROPEAN
     */
    EUROPEAN('E', "EUROPEAN"),

    /**
     * AMERICAN
     */
    AMERICAN('A', "AMERICAN"),

    /**
     * Not option (for futures)
     */
    NOT_OPTION('N', "Not option (for futures)");

    private final char wire;

    private final String description;

    ExerciseStyle(char wire, String description) {
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
    public static Optional<ExerciseStyle> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(EUROPEAN);
            case 'A' -> Optional.of(AMERICAN);
            case 'N' -> Optional.of(NOT_OPTION);
            default -> Optional.empty();
        };
    }
}
