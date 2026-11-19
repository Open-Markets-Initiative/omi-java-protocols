package omi.lme.lmeselect.nonelectronicrefdata.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Identifies whether the prompt is a single or a rolling prompt. Not applicable for a strategy.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PromptType {

    /**
     * Single
     */
    SINGLE('S', "Single"),

    /**
     * Rolling
     */
    ROLLING('R', "Rolling");

    private final char wire;

    private final String description;

    PromptType(char wire, String description) {
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
    public static Optional<PromptType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SINGLE);
            case 'R' -> Optional.of(ROLLING);
            default -> Optional.empty();
        };
    }
}
