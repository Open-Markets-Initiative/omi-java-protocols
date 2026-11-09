package omi.nyse.arcaequities.integratedfeed.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * Extended hours/sequencing related conditions.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond3 {

    /**
     * Na
     */
    NA(' ', "Na"),

    /**
     * Extended Hours Trade
     */
    EXTENDED_HOURS_TRADE('T', "Extended Hours Trade"),

    /**
     * Extended Hours Sold Out Of Sequence
     */
    EXTENDED_HOURS_SOLD_OUT_OF_SEQUENCE('U', "Extended Hours Sold Out Of Sequence"),

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
            case ' ' -> Optional.of(NA);
            case 'T' -> Optional.of(EXTENDED_HOURS_TRADE);
            case 'U' -> Optional.of(EXTENDED_HOURS_SOLD_OUT_OF_SEQUENCE);
            case 'Z' -> Optional.of(SOLD);
            default -> Optional.empty();
        };
    }
}
