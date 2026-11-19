package omi.nyse.nysebonds.quote.pdp.v1_2_a.enums;

import java.util.Optional;

/**
 * The security type for this message.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityType {

    /**
     * Fixed Income Bonds
     */
    FIXED_INCOME_BONDS('F', "Fixed Income Bonds");

    private final char wire;

    private final String description;

    SecurityType(char wire, String description) {
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
    public static Optional<SecurityType> fromWire(char wire) {
        return wire == 'F' ? Optional.of(FIXED_INCOME_BONDS) : Optional.empty();
    }
}
