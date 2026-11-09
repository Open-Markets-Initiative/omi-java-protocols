package omi.siac.cts.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Identifies the Limit Up-Limit Down action related to a security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LimitUpLimitDownIndicator {

    /**
     * Limit Up Limit Down Not Applicable
     */
    LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE(' ', "Limit Up Limit Down Not Applicable"),

    /**
     * Limit Up-Limit Down Price Band
     */
    LIMIT_UP_LIMIT_DOWN_PRICE_BAND('A', "Limit Up-Limit Down Price Band"),

    /**
     * Republished Limit Up-Limit Down Price Band
     */
    REPUBLISHED_LIMIT_UP_LIMIT_DOWN_PRICE_BAND('B', "Republished Limit Up-Limit Down Price Band"),

    /**
     * National Best Bid Limit State Entered
     */
    NATIONAL_BEST_BID_LIMIT_STATE_ENTERED('C', "National Best Bid Limit State Entered"),

    /**
     * National Best Bid Limit State Exited
     */
    NATIONAL_BEST_BID_LIMIT_STATE_EXITED('D', "National Best Bid Limit State Exited"),

    /**
     * National Best Offer Limit State Entered
     */
    NATIONAL_BEST_OFFER_LIMIT_STATE_ENTERED('E', "National Best Offer Limit State Entered"),

    /**
     * National Best Offer Limit State Exited
     */
    NATIONAL_BEST_OFFER_LIMIT_STATE_EXITED('F', "National Best Offer Limit State Exited"),

    /**
     * National Best Bid and National Best Offer Limit State Entered
     */
    NATIONAL_BEST_BID_AND_NATIONAL_BEST_OFFER_LIMIT_STATE_ENTERED('G', "National Best Bid and National Best Offer Limit State Entered"),

    /**
     * National Best Bid and National Best Offer Limit State Exited
     */
    NATIONAL_BEST_BID_AND_NATIONAL_BEST_OFFER_LIMIT_STATE_EXITED('H', "National Best Bid and National Best Offer Limit State Exited"),

    /**
     * National Best Bid Limit State Entered and National Best Offer Limit State Exited
     */
    NATIONAL_BEST_BID_LIMIT_STATE_ENTERED_AND_NATIONAL_BEST_OFFER_LIMIT_STATE_EXITED('I', "National Best Bid Limit State Entered and National Best Offer Limit State Exited"),

    /**
     * National Best Bid Limit State Exited and National Best Offer Limit State Entered
     */
    NATIONAL_BEST_BID_LIMIT_STATE_EXITED_AND_NATIONAL_BEST_OFFER_LIMIT_STATE_ENTERED('J', "National Best Bid Limit State Exited and National Best Offer Limit State Entered");

    private final char wire;

    private final String description;

    LimitUpLimitDownIndicator(char wire, String description) {
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
    public static Optional<LimitUpLimitDownIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE);
            case 'A' -> Optional.of(LIMIT_UP_LIMIT_DOWN_PRICE_BAND);
            case 'B' -> Optional.of(REPUBLISHED_LIMIT_UP_LIMIT_DOWN_PRICE_BAND);
            case 'C' -> Optional.of(NATIONAL_BEST_BID_LIMIT_STATE_ENTERED);
            case 'D' -> Optional.of(NATIONAL_BEST_BID_LIMIT_STATE_EXITED);
            case 'E' -> Optional.of(NATIONAL_BEST_OFFER_LIMIT_STATE_ENTERED);
            case 'F' -> Optional.of(NATIONAL_BEST_OFFER_LIMIT_STATE_EXITED);
            case 'G' -> Optional.of(NATIONAL_BEST_BID_AND_NATIONAL_BEST_OFFER_LIMIT_STATE_ENTERED);
            case 'H' -> Optional.of(NATIONAL_BEST_BID_AND_NATIONAL_BEST_OFFER_LIMIT_STATE_EXITED);
            case 'I' -> Optional.of(NATIONAL_BEST_BID_LIMIT_STATE_ENTERED_AND_NATIONAL_BEST_OFFER_LIMIT_STATE_EXITED);
            case 'J' -> Optional.of(NATIONAL_BEST_BID_LIMIT_STATE_EXITED_AND_NATIONAL_BEST_OFFER_LIMIT_STATE_ENTERED);
            default -> Optional.empty();
        };
    }
}
