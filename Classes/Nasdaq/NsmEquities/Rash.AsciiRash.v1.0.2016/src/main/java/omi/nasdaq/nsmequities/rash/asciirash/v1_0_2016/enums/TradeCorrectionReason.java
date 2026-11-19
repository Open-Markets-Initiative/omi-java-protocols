package omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.enums;

import java.util.Optional;

/**
 * Trade correction reason.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCorrectionReason {

    /**
     * Adjusted to NAV; the only value currently allowed
     */
    ADJUSTED_TO_NAV('N', "Adjusted to NAV; the only value currently allowed");

    private final char wire;

    private final String description;

    TradeCorrectionReason(char wire, String description) {
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
    public static Optional<TradeCorrectionReason> fromWire(char wire) {
        return wire == 'N' ? Optional.of(ADJUSTED_TO_NAV) : Optional.empty();
    }
}
