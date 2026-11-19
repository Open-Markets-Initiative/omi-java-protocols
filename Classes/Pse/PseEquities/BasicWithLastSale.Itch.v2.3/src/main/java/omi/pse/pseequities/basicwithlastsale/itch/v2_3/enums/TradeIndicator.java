package omi.pse.pseequities.basicwithlastsale.itch.v2_3.enums;

import java.util.Optional;

/**
 * Indicates the type of trade.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeIndicator {

    /**
     * regular trade
     */
    REGULAR_TRADE(' ', "regular trade"),

    /**
     * intentional cross trade (the same user simultaneously entered both sides of the trade)
     */
    INTENTIONAL_CROSS_TRADE('C', "intentional cross trade (the same user simultaneously entered both sides of the trade)"),

    /**
     * block sale
     */
    BLOCK_SALE('B', "block sale"),

    /**
     * manual trade (market control)
     */
    MANUAL_TRADE('M', "manual trade (market control)");

    private final char wire;

    private final String description;

    TradeIndicator(char wire, String description) {
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
    public static Optional<TradeIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR_TRADE);
            case 'C' -> Optional.of(INTENTIONAL_CROSS_TRADE);
            case 'B' -> Optional.of(BLOCK_SALE);
            case 'M' -> Optional.of(MANUAL_TRADE);
            default -> Optional.empty();
        };
    }
}
