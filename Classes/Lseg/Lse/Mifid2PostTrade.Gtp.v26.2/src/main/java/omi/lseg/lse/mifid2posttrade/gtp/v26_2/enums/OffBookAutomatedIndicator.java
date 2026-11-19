package omi.lseg.lse.mifid2posttrade.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Indicates whether the off book trade was automated.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OffBookAutomatedIndicator {

    /**
     * Unspecified Or Does Not Apply
     */
    UNSPECIFIED_OR_DOES_NOT_APPLY('-', "Unspecified Or Does Not Apply");

    private final char wire;

    private final String description;

    OffBookAutomatedIndicator(char wire, String description) {
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
    public static Optional<OffBookAutomatedIndicator> fromWire(char wire) {
        return wire == '-' ? Optional.of(UNSPECIFIED_OR_DOES_NOT_APPLY) : Optional.empty();
    }
}
