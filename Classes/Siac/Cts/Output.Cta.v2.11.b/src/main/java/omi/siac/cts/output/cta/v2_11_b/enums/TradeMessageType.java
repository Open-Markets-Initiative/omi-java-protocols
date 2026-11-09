package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the type of Trade message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeMessageType {

    /**
     * Auction Status
     */
    AUCTION_STATUS('A', "Auction Status"),

    /**
     * Trade Correction
     */
    TRADE_CORRECTION('C', "Trade Correction"),

    /**
     * Fractional Trade Correction
     */
    FRACTIONAL_TRADE_CORRECTION('O', "Fractional Trade Correction"),

    /**
     * Long Trade
     */
    LONG_TRADE('L', "Long Trade"),

    /**
     * Fractional Long Trade
     */
    FRACTIONAL_LONG_TRADE('R', "Fractional Long Trade"),

    /**
     * Trading Status
     */
    TRADING_STATUS('S', "Trading Status"),

    /**
     * Short Trade
     */
    SHORT_TRADE('T', "Short Trade"),

    /**
     * Fractional Short Trade
     */
    FRACTIONAL_SHORT_TRADE('H', "Fractional Short Trade"),

    /**
     * Trade Cancel Error
     */
    TRADE_CANCEL_ERROR('X', "Trade Cancel Error"),

    /**
     * Fractional Trade Cancel Error
     */
    FRACTIONAL_TRADE_CANCEL_ERROR('E', "Fractional Trade Cancel Error");

    private final char wire;

    private final String description;

    TradeMessageType(char wire, String description) {
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
    public static Optional<TradeMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUCTION_STATUS);
            case 'C' -> Optional.of(TRADE_CORRECTION);
            case 'O' -> Optional.of(FRACTIONAL_TRADE_CORRECTION);
            case 'L' -> Optional.of(LONG_TRADE);
            case 'R' -> Optional.of(FRACTIONAL_LONG_TRADE);
            case 'S' -> Optional.of(TRADING_STATUS);
            case 'T' -> Optional.of(SHORT_TRADE);
            case 'H' -> Optional.of(FRACTIONAL_SHORT_TRADE);
            case 'X' -> Optional.of(TRADE_CANCEL_ERROR);
            case 'E' -> Optional.of(FRACTIONAL_TRADE_CANCEL_ERROR);
            default -> Optional.empty();
        };
    }
}
