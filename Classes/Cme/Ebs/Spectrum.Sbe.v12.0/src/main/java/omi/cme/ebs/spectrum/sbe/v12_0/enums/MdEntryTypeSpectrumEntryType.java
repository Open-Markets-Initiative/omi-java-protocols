package omi.cme.ebs.spectrum.sbe.v12_0.enums;

import java.util.Optional;

/**
 * Market Data entry type, identifies the element
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryTypeSpectrumEntryType {

    /**
     * Volume weighted average traded price
     */
    VWAP('9', "Volume weighted average traded price"),

    /**
     * Average traded price
     */
    TWAP('t', "Average traded price");

    private final char wire;

    private final String description;

    MdEntryTypeSpectrumEntryType(char wire, String description) {
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
    public static Optional<MdEntryTypeSpectrumEntryType> fromWire(char wire) {
        return switch (wire) {
            case '9' -> Optional.of(VWAP);
            case 't' -> Optional.of(TWAP);
            default -> Optional.empty();
        };
    }
}
