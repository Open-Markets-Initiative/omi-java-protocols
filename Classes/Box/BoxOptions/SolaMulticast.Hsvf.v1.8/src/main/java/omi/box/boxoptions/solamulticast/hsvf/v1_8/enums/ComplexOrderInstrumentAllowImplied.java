package omi.box.boxoptions.solamulticast.hsvf.v1_8.enums;

import java.util.Optional;

/**
 * Complex Order Instrument support of Implied Price
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ComplexOrderInstrumentAllowImplied {

    /**
     * No
     */
    NO('N', "No"),

    /**
     * Continuous Implied
     */
    CONTINUOUS_IMPLIED('C', "Continuous Implied"),

    /**
     * Snapshot Implied
     */
    SNAPSHOT_IMPLIED('S', "Snapshot Implied");

    private final char wire;

    private final String description;

    ComplexOrderInstrumentAllowImplied(char wire, String description) {
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
    public static Optional<ComplexOrderInstrumentAllowImplied> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NO);
            case 'C' -> Optional.of(CONTINUOUS_IMPLIED);
            case 'S' -> Optional.of(SNAPSHOT_IMPLIED);
            default -> Optional.empty();
        };
    }
}
