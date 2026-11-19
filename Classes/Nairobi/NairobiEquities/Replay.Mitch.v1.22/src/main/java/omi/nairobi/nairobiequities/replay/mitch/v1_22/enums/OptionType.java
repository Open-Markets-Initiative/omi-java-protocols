package omi.nairobi.nairobiequities.replay.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Call or put. This field will contain a space if the instrument is not an option.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OptionType {

    /**
     * Call Option
     */
    CALL_OPTION('C', "Call Option"),

    /**
     * Put Option
     */
    PUT_OPTION('P', "Put Option"),

    /**
     * Not An Option
     */
    NOT_AN_OPTION(' ', "Not An Option");

    private final char wire;

    private final String description;

    OptionType(char wire, String description) {
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
    public static Optional<OptionType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CALL_OPTION);
            case 'P' -> Optional.of(PUT_OPTION);
            case ' ' -> Optional.of(NOT_AN_OPTION);
            default -> Optional.empty();
        };
    }
}
