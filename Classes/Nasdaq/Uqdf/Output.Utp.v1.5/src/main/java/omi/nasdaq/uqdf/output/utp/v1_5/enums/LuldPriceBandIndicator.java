package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * LULD Price Band Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LuldPriceBandIndicator {

    /**
     * Opening Update
     */
    OPENING_UPDATE('A', "Opening Update"),

    /**
     * Intra Day Update
     */
    INTRA_DAY_UPDATE('B', "Intra Day Update"),

    /**
     * Restated Value
     */
    RESTATED_VALUE('C', "Restated Value"),

    /**
     * Suspended during trading halt or trading pause
     */
    SUSPENDED_DURING_TRADING_HALT_OR_TRADING_PAUSE('D', "Suspended during trading halt or trading pause"),

    /**
     * Re-Opening Update
     */
    RE_OPENING_UPDATE('E', "Re-Opening Update"),

    /**
     * Outside price band rule hours
     */
    OUTSIDE_PRICE_BAND_RULE_HOURS('F', "Outside price band rule hours"),

    /**
     * None provided
     */
    NONE_PROVIDED(' ', "None provided");

    private final char wire;

    private final String description;

    LuldPriceBandIndicator(char wire, String description) {
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
    public static Optional<LuldPriceBandIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(OPENING_UPDATE);
            case 'B' -> Optional.of(INTRA_DAY_UPDATE);
            case 'C' -> Optional.of(RESTATED_VALUE);
            case 'D' -> Optional.of(SUSPENDED_DURING_TRADING_HALT_OR_TRADING_PAUSE);
            case 'E' -> Optional.of(RE_OPENING_UPDATE);
            case 'F' -> Optional.of(OUTSIDE_PRICE_BAND_RULE_HOURS);
            case ' ' -> Optional.of(NONE_PROVIDED);
            default -> Optional.empty();
        };
    }
}
