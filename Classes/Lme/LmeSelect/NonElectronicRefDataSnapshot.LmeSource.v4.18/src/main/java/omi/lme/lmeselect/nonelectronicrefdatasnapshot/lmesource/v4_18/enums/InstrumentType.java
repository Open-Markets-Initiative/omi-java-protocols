package omi.lme.lmeselect.nonelectronicrefdatasnapshot.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Instrument Type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentType {

    /**
     * Outright
     */
    OUTRIGHT('O', "Outright"),

    /**
     * Strategy
     */
    STRATEGY('S', "Strategy");

    private final char wire;

    private final String description;

    InstrumentType(char wire, String description) {
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
    public static Optional<InstrumentType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OUTRIGHT);
            case 'S' -> Optional.of(STRATEGY);
            default -> Optional.empty();
        };
    }
}
