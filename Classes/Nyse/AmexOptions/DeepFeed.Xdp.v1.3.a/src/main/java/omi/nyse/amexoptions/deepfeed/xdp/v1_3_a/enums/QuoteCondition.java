package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * QuoteCondition values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Regular Trading
     */
    REGULAR_TRADING('1', "Regular Trading"),

    /**
     * Rotation
     */
    ROTATION('2', "Rotation"),

    /**
     * Trading Halted
     */
    TRADING_HALTED('3', "Trading Halted"),

    /**
     * Pre-open
     */
    PRE_OPEN('4', "Pre-open"),

    /**
     * Rotation, legal width quote pending
     */
    ROTATION_LEGAL_WIDTH_QUOTE_PENDING('5', "Rotation, legal width quote pending");

    private final char wire;

    private final String description;

    QuoteCondition(char wire, String description) {
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
    public static Optional<QuoteCondition> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(REGULAR_TRADING);
            case '2' -> Optional.of(ROTATION);
            case '3' -> Optional.of(TRADING_HALTED);
            case '4' -> Optional.of(PRE_OPEN);
            case '5' -> Optional.of(ROTATION_LEGAL_WIDTH_QUOTE_PENDING);
            default -> Optional.empty();
        };
    }
}
