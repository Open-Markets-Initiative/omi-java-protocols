package omi.nyse.nyseequities.imbalancesfeed.xdp.v2_2_a.enums;

import java.util.Optional;

/**
 * For Auction Types=C or P in NYSE-listed symbols. Using historical closing data for each symbol,NYSE will set this indicator if the Continuous Book Clearing Price is more than a ‘significant’ range away from the Reference Price.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SignificantImbalance {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Yes
     */
    YES('Y', "Yes");

    private final char wire;

    private final String description;

    SignificantImbalance(char wire, String description) {
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
    public static Optional<SignificantImbalance> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'Y' -> Optional.of(YES);
            default -> Optional.empty();
        };
    }
}
