package omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Trading volume calculation type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CalculationType {

    /**
     * Daily
     */
    DAILY('D', "Daily"),

    /**
     * Intraday
     */
    INTRADAY('I', "Intraday");

    private final char wire;

    private final String description;

    CalculationType(char wire, String description) {
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
    public static Optional<CalculationType> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(DAILY);
            case 'I' -> Optional.of(INTRADAY);
            default -> Optional.empty();
        };
    }
}
