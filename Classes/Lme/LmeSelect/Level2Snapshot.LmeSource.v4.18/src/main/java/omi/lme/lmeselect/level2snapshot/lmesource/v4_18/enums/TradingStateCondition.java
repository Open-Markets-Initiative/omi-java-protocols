package omi.lme.lmeselect.level2snapshot.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Current trading state condition.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStateCondition {

    /**
     * Pause
     */
    PAUSE('P', "Pause"),

    /**
     * Halt
     */
    HALT('H', "Halt"),

    /**
     * Active
     */
    ACTIVE(' ', "Active");

    private final char wire;

    private final String description;

    TradingStateCondition(char wire, String description) {
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
    public static Optional<TradingStateCondition> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PAUSE);
            case 'H' -> Optional.of(HALT);
            case ' ' -> Optional.of(ACTIVE);
            default -> Optional.empty();
        };
    }
}
