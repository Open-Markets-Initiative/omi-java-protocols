package omi.cboe.cfefutures.oofmulticastdepthofbook.spin.v1_0_8.enums;

import java.util.Optional;

/**
 * O = Leg is an Option instrument
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegSecurityType {

    /**
     * Leg Is An Option Instrument
     */
    LEG_IS_AN_OPTION_INSTRUMENT('O', "Leg Is An Option Instrument");

    private final char wire;

    private final String description;

    LegSecurityType(char wire, String description) {
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
    public static Optional<LegSecurityType> fromWire(char wire) {
        return wire == 'O' ? Optional.of(LEG_IS_AN_OPTION_INSTRUMENT) : Optional.empty();
    }
}
