package omi.cboe.edgaequities.top.asciipitch.v1_3_10.enums;

import java.util.Optional;

/**
 * Effective 11/02/26. Always 0 for BYX/EDGA.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LastTradeDayIndicator {

    /**
     * Last Trade Time Follows Time Reference Milliseconds Since Todays Midnight
     */
    LAST_TRADE_TIME_FOLLOWS_TIME_REFERENCE_MILLISECONDS_SINCE_TODAYS_MIDNIGHT('0', "Last Trade Time Follows Time Reference Milliseconds Since Todays Midnight"),

    /**
     * Last Trade Time Is Milliseconds Since Yesterdays Midnight
     */
    LAST_TRADE_TIME_IS_MILLISECONDS_SINCE_YESTERDAYS_MIDNIGHT('1', "Last Trade Time Is Milliseconds Since Yesterdays Midnight");

    private final char wire;

    private final String description;

    LastTradeDayIndicator(char wire, String description) {
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
    public static Optional<LastTradeDayIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(LAST_TRADE_TIME_FOLLOWS_TIME_REFERENCE_MILLISECONDS_SINCE_TODAYS_MIDNIGHT);
            case '1' -> Optional.of(LAST_TRADE_TIME_IS_MILLISECONDS_SINCE_YESTERDAYS_MIDNIGHT);
            default -> Optional.empty();
        };
    }
}
