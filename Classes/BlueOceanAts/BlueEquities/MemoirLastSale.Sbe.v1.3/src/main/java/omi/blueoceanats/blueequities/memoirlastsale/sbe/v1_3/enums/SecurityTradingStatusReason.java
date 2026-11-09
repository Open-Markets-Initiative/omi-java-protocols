package omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.enums;

import java.util.Optional;

/**
 * The source of the trading status change
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityTradingStatusReason {

    /**
     * None
     */
    NONE('X', "None"),

    /**
     * Regulatory
     */
    REGULATORY('R', "Regulatory"),

    /**
     * Administrative
     */
    ADMINISTRATIVE('A', "Administrative");

    private final char wire;

    private final String description;

    SecurityTradingStatusReason(char wire, String description) {
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
    public static Optional<SecurityTradingStatusReason> fromWire(char wire) {
        return switch (wire) {
            case 'X' -> Optional.of(NONE);
            case 'R' -> Optional.of(REGULATORY);
            case 'A' -> Optional.of(ADMINISTRATIVE);
            default -> Optional.empty();
        };
    }
}
