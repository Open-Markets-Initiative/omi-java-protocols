package omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.enums;

import java.util.Optional;

/**
 * Warrant type of the warrant.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum WarrantType {

    /**
     * Normal Instrument
     */
    NORMAL_INSTRUMENT('N', "Normal Instrument"),

    /**
     * Exotic Instrument
     */
    EXOTIC_INSTRUMENT('X', "Exotic Instrument"),

    /**
     * Not Available
     */
    NOT_AVAILABLE('0', "Not Available");

    private final char wire;

    private final String description;

    WarrantType(char wire, String description) {
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
    public static Optional<WarrantType> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL_INSTRUMENT);
            case 'X' -> Optional.of(EXOTIC_INSTRUMENT);
            case '0' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
