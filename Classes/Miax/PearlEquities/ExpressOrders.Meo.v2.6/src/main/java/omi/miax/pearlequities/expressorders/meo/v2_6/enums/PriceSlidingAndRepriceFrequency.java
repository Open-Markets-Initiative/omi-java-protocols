package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Price Sliding and Reprice Frequency
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceSlidingAndRepriceFrequency {

    /**
     * Reprice Once
     */
    REPRICE_ONCE('D', "Reprice Once"),

    /**
     * Reprice Once But Cancel If Crossed At Entry
     */
    REPRICE_ONCE_BUT_CANCEL_IF_CROSSED_AT_ENTRY('C', "Reprice Once But Cancel If Crossed At Entry"),

    /**
     * Reprice Multiple Times
     */
    REPRICE_MULTIPLE_TIMES('M', "Reprice Multiple Times"),

    /**
     * No Price Sliding
     */
    NO_PRICE_SLIDING('N', "No Price Sliding"),

    /**
     * Not Applicable
     */
    NOT_APPLICABLE('Q', "Not Applicable");

    private final char wire;

    private final String description;

    PriceSlidingAndRepriceFrequency(char wire, String description) {
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
    public static Optional<PriceSlidingAndRepriceFrequency> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(REPRICE_ONCE);
            case 'C' -> Optional.of(REPRICE_ONCE_BUT_CANCEL_IF_CROSSED_AT_ENTRY);
            case 'M' -> Optional.of(REPRICE_MULTIPLE_TIMES);
            case 'N' -> Optional.of(NO_PRICE_SLIDING);
            case 'Q' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
