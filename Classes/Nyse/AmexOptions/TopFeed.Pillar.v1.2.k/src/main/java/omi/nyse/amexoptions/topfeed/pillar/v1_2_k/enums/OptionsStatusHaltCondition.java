package omi.nyse.amexoptions.topfeed.pillar.v1_2_k.enums;

import java.util.Optional;

/**
 * Halt condition for option series.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OptionsStatusHaltCondition {

    /**
     * Series Not Delayedhalted
     */
    SERIES_NOT_DELAYEDHALTED('~', "Series Not Delayedhalted"),

    /**
     * Option Series Is Halted
     */
    OPTION_SERIES_IS_HALTED('h', "Option Series Is Halted");

    private final char wire;

    private final String description;

    OptionsStatusHaltCondition(char wire, String description) {
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
    public static Optional<OptionsStatusHaltCondition> fromWire(char wire) {
        return switch (wire) {
            case '~' -> Optional.of(SERIES_NOT_DELAYEDHALTED);
            case 'h' -> Optional.of(OPTION_SERIES_IS_HALTED);
            default -> Optional.empty();
        };
    }
}
