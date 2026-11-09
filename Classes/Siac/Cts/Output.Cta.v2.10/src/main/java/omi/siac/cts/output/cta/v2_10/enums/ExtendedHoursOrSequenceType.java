package omi.siac.cts.output.cta.v2_10.enums;

import java.util.Optional;

/**
 * Category 3: Extended Hours Or Sequence Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExtendedHoursOrSequenceType {

    /**
     * Not Extended Hours Or Sold Out Of Sequence
     */
    NOT_EXTENDED_HOURS_OR_SOLD_OUT_OF_SEQUENCE(' ', "Not Extended Hours Or Sold Out Of Sequence"),

    /**
     * Sold Last
     */
    SOLD_LAST('L', "Sold Last"),

    /**
     * Extended Hours Trade
     */
    EXTENDED_HOURS_TRADE('T', "Extended Hours Trade"),

    /**
     * Extended Hours Sold
     */
    EXTENDED_HOURS_SOLD('U', "Extended Hours Sold"),

    /**
     * Sold Out Of Sequence
     */
    SOLD_OUT_OF_SEQUENCE('Z', "Sold Out Of Sequence");

    private final char wire;

    private final String description;

    ExtendedHoursOrSequenceType(char wire, String description) {
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
    public static Optional<ExtendedHoursOrSequenceType> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_EXTENDED_HOURS_OR_SOLD_OUT_OF_SEQUENCE);
            case 'L' -> Optional.of(SOLD_LAST);
            case 'T' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'U' -> Optional.of(EXTENDED_HOURS_SOLD);
            case 'Z' -> Optional.of(SOLD_OUT_OF_SEQUENCE);
            default -> Optional.empty();
        };
    }
}
