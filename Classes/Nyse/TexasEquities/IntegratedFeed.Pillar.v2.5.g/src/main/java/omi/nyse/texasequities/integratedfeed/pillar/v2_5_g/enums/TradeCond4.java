package omi.nyse.texasequities.integratedfeed.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * SRO Required Detail.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCond4 {

    /**
     * Na
     */
    NA(' ', "Na"),

    /**
     * Odd Lot Trade
     */
    ODD_LOT_TRADE('I', "Odd Lot Trade"),

    /**
     * Contingent Trade Texas Only
     */
    CONTINGENT_TRADE_TEXAS_ONLY('V', "Contingent Trade Texas Only");

    private final char wire;

    private final String description;

    TradeCond4(char wire, String description) {
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
    public static Optional<TradeCond4> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NA);
            case 'I' -> Optional.of(ODD_LOT_TRADE);
            case 'V' -> Optional.of(CONTINGENT_TRADE_TEXAS_ONLY);
            default -> Optional.empty();
        };
    }
}
