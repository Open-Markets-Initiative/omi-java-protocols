package omi.box.boxoptions.solamulticast.hsvf.v1_8.enums;

import java.util.Optional;

/**
 * Type Of Instrument
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TypeOfInstrument {

    /**
     * Options
     */
    OPTIONS('O', "Options"),

    /**
     * Long Term
     */
    LONG_TERM('L', "Long Term");

    private final char wire;

    private final String description;

    TypeOfInstrument(char wire, String description) {
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
    public static Optional<TypeOfInstrument> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPTIONS);
            case 'L' -> Optional.of(LONG_TERM);
            default -> Optional.empty();
        };
    }
}
