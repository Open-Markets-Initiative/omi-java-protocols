package omi.eurex.t7.xti.fbe.v14_1.enums;

import java.util.Optional;

/**
 * Defines the TradingSessionSubId values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionSubId {

    /**
     * Opening or opening auction
     */
    OPENINGAUCTION((short) 2, "Opening or opening auction"),

    /**
     * Closing or closing auction
     */
    CLOSINGAUCTION((short) 4, "Closing or closing auction"),

    /**
     * Intraday Auction
     */
    INTRADAY_AUCTION((short) 6, "Intraday Auction"),

    /**
     * Any auction
     */
    ANY_AUCTION((short) 8, "Any auction"),

    /**
     * Special auction
     */
    SPECIAL_AUCTION((short) 105, "Special auction"),

    /**
     * Main Trading Hours
     */
    MAIN_TRADING_HOURS((short) 106, "Main Trading Hours"),

    /**
     * Auction Volume Discovery Opening Auction
     */
    AVD_OPENING_AUCTION((short) 107, "Auction Volume Discovery Opening Auction"),

    /**
     * Auction Volume Discovery Intraday Auction
     */
    AVD_INTRADAY_AUCTION((short) 108, "Auction Volume Discovery Intraday Auction"),

    /**
     * Auction Volume Discovery Closing Auction
     */
    AVD_CLOSING_AUCTION((short) 109, "Auction Volume Discovery Closing Auction"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradingSessionSubId(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<TradingSessionSubId> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(OPENINGAUCTION);
            case 4 -> Optional.of(CLOSINGAUCTION);
            case 6 -> Optional.of(INTRADAY_AUCTION);
            case 8 -> Optional.of(ANY_AUCTION);
            case 105 -> Optional.of(SPECIAL_AUCTION);
            case 106 -> Optional.of(MAIN_TRADING_HOURS);
            case 107 -> Optional.of(AVD_OPENING_AUCTION);
            case 108 -> Optional.of(AVD_INTRADAY_AUCTION);
            case 109 -> Optional.of(AVD_CLOSING_AUCTION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
