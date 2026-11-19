package omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Defines the EquityExDestination values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EquityExDestination {

    /**
     * Cowen
     */
    COWEN('C', "Cowen");

    private final char wire;

    private final String description;

    EquityExDestination(char wire, String description) {
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
    public static Optional<EquityExDestination> fromWire(char wire) {
        return wire == 'C' ? Optional.of(COWEN) : Optional.empty();
    }
}
