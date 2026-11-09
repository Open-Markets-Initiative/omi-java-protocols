package omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * TradeCond1 value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond1 {

    /**
     * regular trade
     */
    REGULAR_TRADE(' ', "regular trade"),

    /**
     * Late report
     */
    LATE_REPORT('I', "Late report"),

    /**
     * Floor trade
     */
    FLOOR_TRADE('R', "Floor trade"),

    /**
     * SO sweep trade
     */
    SO_SWEEP_TRADE('S', "SO sweep trade");

    private final char wire;

    private final String description;

    TradeCond1(char wire, String description) {
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
    public static Optional<TradeCond1> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR_TRADE);
            case 'I' -> Optional.of(LATE_REPORT);
            case 'R' -> Optional.of(FLOOR_TRADE);
            case 'S' -> Optional.of(SO_SWEEP_TRADE);
            default -> Optional.empty();
        };
    }
}
