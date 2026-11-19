package omi.nyse.nyseequities.integratedfeed.pillar.v2_5_a.enums;

import java.util.Optional;

/**
 * TradeCond1 value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond3 {

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available"),

    /**
     * Extended Hours Trade
     */
    EXTENDED_HOURS_TRADE('T', "Extended Hours Trade"),

    /**
     * Extended Hours Sold
     */
    EXTENDED_HOURS_SOLD('U', "Extended Hours Sold"),

    /**
     * Sold
     */
    SOLD('Z', "Sold");

    private final char wire;

    private final String description;

    TradeCond3(char wire, String description) {
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
    public static Optional<TradeCond3> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_AVAILABLE);
            case 'T' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'U' -> Optional.of(EXTENDED_HOURS_SOLD);
            case 'Z' -> Optional.of(SOLD);
            default -> Optional.empty();
        };
    }
}
