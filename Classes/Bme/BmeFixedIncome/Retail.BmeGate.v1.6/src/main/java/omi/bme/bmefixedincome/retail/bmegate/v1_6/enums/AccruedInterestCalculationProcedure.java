package omi.bme.bmefixedincome.retail.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Accrued Interest Calculation Procedure
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AccruedInterestCalculationProcedure {

    /**
     * Real Base
     */
    REAL_BASE('1', "Real Base");

    private final char wire;

    private final String description;

    AccruedInterestCalculationProcedure(char wire, String description) {
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
    public static Optional<AccruedInterestCalculationProcedure> fromWire(char wire) {
        return wire == '1' ? Optional.of(REAL_BASE) : Optional.empty();
    }
}
