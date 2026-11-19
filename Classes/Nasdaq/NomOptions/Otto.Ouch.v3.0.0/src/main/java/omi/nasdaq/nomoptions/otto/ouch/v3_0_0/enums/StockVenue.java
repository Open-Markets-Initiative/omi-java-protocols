package omi.nasdaq.nomoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * See Stock Execution Venues
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StockVenue {

    /**
     * Not Applicable (non-QCC stock leg execution)
     */
    NOT_APPLICABLE('X', "Not Applicable (non-QCC stock leg execution)");

    private final char wire;

    private final String description;

    StockVenue(char wire, String description) {
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
    public static Optional<StockVenue> fromWire(char wire) {
        return wire == 'X' ? Optional.of(NOT_APPLICABLE) : Optional.empty();
    }
}
