package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * 0 = SME
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortMarkingExempt {

    /**
     * SME
     */
    SME('0', "SME");

    private final char wire;

    private final String description;

    ShortMarkingExempt(char wire, String description) {
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
    public static Optional<ShortMarkingExempt> fromWire(char wire) {
        return wire == '0' ? Optional.of(SME) : Optional.empty();
    }
}
