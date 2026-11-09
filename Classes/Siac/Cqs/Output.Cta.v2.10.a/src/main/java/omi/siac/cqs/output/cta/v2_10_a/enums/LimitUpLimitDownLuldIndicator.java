package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Indicates the effect the Quote has on the Limit Up-Limit Down Price Band range
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LimitUpLimitDownLuldIndicator {

    /**
     * Limit Up Limit Down Not Applicable
     */
    LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE(' ', "Limit Up Limit Down Not Applicable"),

    /**
     * Bid is Non-Executable
     */
    BID_PRICE_ABOVE_UPPER_LIMIT_PRICE_BAND('A', "Bid is Non-Executable"),

    /**
     * Offer is Non-Executable
     */
    OFFER_PRICE_BELOW_LOWER_LIMIT_PRICE_BAND('B', "Offer is Non-Executable");

    private final char wire;

    private final String description;

    LimitUpLimitDownLuldIndicator(char wire, String description) {
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
    public static Optional<LimitUpLimitDownLuldIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE);
            case 'A' -> Optional.of(BID_PRICE_ABOVE_UPPER_LIMIT_PRICE_BAND);
            case 'B' -> Optional.of(OFFER_PRICE_BELOW_LOWER_LIMIT_PRICE_BAND);
            default -> Optional.empty();
        };
    }
}
