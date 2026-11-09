package omi.nyse.nationalequities.trades.pillar.v2_6.enums;

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
     * Official Closing Price
     */
    OFFICIAL_CLOSING_PRICE('M', "Official Closing Price"),

    /**
     * Official Open Price
     */
    OFFICIAL_OPEN_PRICE('Q', "Official Open Price"),

    /**
     * Contingent Trade Trf Or Texas Only
     */
    CONTINGENT_TRADE_TRF_OR_TEXAS_ONLY('V', "Contingent Trade Trf Or Texas Only"),

    /**
     * Prior Reference Price Trf Only
     */
    PRIOR_REFERENCE_PRICE_TRF_ONLY('P', "Prior Reference Price Trf Only"),

    /**
     * Weighted Average Price Trf Only
     */
    WEIGHTED_AVERAGE_PRICE_TRF_ONLY('W', "Weighted Average Price Trf Only");

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
            case 'M' -> Optional.of(OFFICIAL_CLOSING_PRICE);
            case 'Q' -> Optional.of(OFFICIAL_OPEN_PRICE);
            case 'V' -> Optional.of(CONTINGENT_TRADE_TRF_OR_TEXAS_ONLY);
            case 'P' -> Optional.of(PRIOR_REFERENCE_PRICE_TRF_ONLY);
            case 'W' -> Optional.of(WEIGHTED_AVERAGE_PRICE_TRF_ONLY);
            default -> Optional.empty();
        };
    }
}
