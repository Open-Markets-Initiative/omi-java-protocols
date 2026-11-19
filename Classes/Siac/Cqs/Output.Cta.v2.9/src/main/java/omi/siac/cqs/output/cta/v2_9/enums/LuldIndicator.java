package omi.siac.cqs.output.cta.v2_9.enums;

import java.util.Optional;

/**
 * Indicates the affect the Quote has on the Limit Up-Limit Down Price Band range.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LuldIndicator {

    /**
     * Limit Up Limit Down Not Applicable
     */
    LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE(' ', "Limit Up Limit Down Not Applicable"),

    /**
     * Bid Price above Upper Limit Price Band – Bid is Non-Executable
     */
    BID_IS_NON_EXECUTABLE('A', "Bid Price above Upper Limit Price Band \u2013 Bid is Non-Executable"),

    /**
     * Offer Price below Lower Limit Price Band - Offer is Non-Executable
     */
    OFFER_IS_NON_EXECUTABLE('B', "Offer Price below Lower Limit Price Band - Offer is Non-Executable");

    private final char wire;

    private final String description;

    LuldIndicator(char wire, String description) {
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
    public static Optional<LuldIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE);
            case 'A' -> Optional.of(BID_IS_NON_EXECUTABLE);
            case 'B' -> Optional.of(OFFER_IS_NON_EXECUTABLE);
            default -> Optional.empty();
        };
    }
}
