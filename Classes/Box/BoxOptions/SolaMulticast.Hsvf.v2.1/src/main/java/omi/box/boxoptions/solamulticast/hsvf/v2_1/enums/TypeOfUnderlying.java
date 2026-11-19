package omi.box.boxoptions.solamulticast.hsvf.v2_1.enums;

import java.util.Optional;

/**
 * Type Of Underlying
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TypeOfUnderlying {

    /**
     * Equities Or Etf
     */
    EQUITIES_OR_ETF('E', "Equities Or Etf");

    private final char wire;

    private final String description;

    TypeOfUnderlying(char wire, String description) {
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
    public static Optional<TypeOfUnderlying> fromWire(char wire) {
        return wire == 'E' ? Optional.of(EQUITIES_OR_ETF) : Optional.empty();
    }
}
