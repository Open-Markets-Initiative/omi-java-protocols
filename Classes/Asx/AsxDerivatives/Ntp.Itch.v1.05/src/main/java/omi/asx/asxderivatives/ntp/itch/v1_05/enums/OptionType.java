package omi.asx.asxderivatives.ntp.itch.v1_05.enums;

import java.util.Optional;

/**
 * Indicates the type of option
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OptionType {

    /**
     * Put
     */
    PUT('P', "Put"),

    /**
     * Call
     */
    CALL('C', "Call");

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
            case 'P' -> Optional.of(PUT);
            case 'C' -> Optional.of(CALL);
            default -> Optional.empty();
        };
    }
}
