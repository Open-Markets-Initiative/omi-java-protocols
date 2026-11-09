package omi.siac.cts.output.cta.v2_10.enums;

import java.util.Optional;

/**
 * Trade message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeMessageType {

    /**
     * Auction Status Message
     */
    AUCTION_STATUS_MESSAGE('A', "Auction Status Message"),

    /**
     * Trade Correction Message
     */
    TRADE_CORRECTION_MESSAGE('C', "Trade Correction Message"),

    /**
     * Fractional Trade Correction Message
     */
    FRACTIONAL_TRADE_CORRECTION_MESSAGE('O', "Fractional Trade Correction Message"),

    /**
     * Long Trade Message
     */
    LONG_TRADE_MESSAGE('L', "Long Trade Message"),

    /**
     * Fractional Long Trade Message
     */
    FRACTIONAL_LONG_TRADE_MESSAGE('R', "Fractional Long Trade Message"),

    /**
     * Trading Status Message
     */
    TRADING_STATUS_MESSAGE('S', "Trading Status Message"),

    /**
     * Short Trade Message
     */
    SHORT_TRADE_MESSAGE('T', "Short Trade Message"),

    /**
     * Fractional Short Trade Message
     */
    FRACTIONAL_SHORT_TRADE_MESSAGE('H', "Fractional Short Trade Message"),

    /**
     * Trade Cancel Error Message
     */
    TRADE_CANCEL_ERROR_MESSAGE('X', "Trade Cancel Error Message"),

    /**
     * Fractional Trade Cancel Error Message
     */
    FRACTIONAL_TRADE_CANCEL_ERROR_MESSAGE('E', "Fractional Trade Cancel Error Message");

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
            case 'A' -> Optional.of(AUCTION_STATUS_MESSAGE);
            case 'C' -> Optional.of(TRADE_CORRECTION_MESSAGE);
            case 'O' -> Optional.of(FRACTIONAL_TRADE_CORRECTION_MESSAGE);
            case 'L' -> Optional.of(LONG_TRADE_MESSAGE);
            case 'R' -> Optional.of(FRACTIONAL_LONG_TRADE_MESSAGE);
            case 'S' -> Optional.of(TRADING_STATUS_MESSAGE);
            case 'T' -> Optional.of(SHORT_TRADE_MESSAGE);
            case 'H' -> Optional.of(FRACTIONAL_SHORT_TRADE_MESSAGE);
            case 'X' -> Optional.of(TRADE_CANCEL_ERROR_MESSAGE);
            case 'E' -> Optional.of(FRACTIONAL_TRADE_CANCEL_ERROR_MESSAGE);
            default -> Optional.empty();
        };
    }
}
