package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the TrdType values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TrdType {

    /**
     * Block Trade
     */
    BLOCK_TRADE(1, "Block Trade"),

    /**
     * Exchange for Swap
     */
    EXCHANGEFOR_SWAP(12, "Exchange for Swap"),

    /**
     * Compression
     */
    COMPRESSION(50, "Compression"),

    /**
     * Vola Trade
     */
    VOLA_TRADE(1000, "Vola Trade"),

    /**
     * EFP-Fin Trade
     */
    EFP_FIN_TRADE(1001, "EFP-Fin Trade"),

    /**
     * EFP-Index Futures Trade
     */
    EFP_INDEX_FUTURES_TRADE(1002, "EFP-Index Futures Trade"),

    /**
     * Trade at Market
     */
    TRADEAT_MARKET(1004, "Trade at Market"),

    /**
     * Eurex/Xetra Enlight triggered trade
     */
    ENLIGHT(1006, "Eurex/Xetra Enlight triggered trade"),

    /**
     * QTPIP BLOCK TRADE
     */
    BLOCKQTPIP(1007, "QTPIP BLOCK TRADE"),

    /**
     * Basket of Equity Total Return Futures
     */
    BTRF(1010, "Basket of Equity Total Return Futures"),

    /**
     * Equity Bespoke Baskets
     */
    EBB(1011, "Equity Bespoke Baskets"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    TrdType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<TrdType> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(BLOCK_TRADE);
            case 12 -> Optional.of(EXCHANGEFOR_SWAP);
            case 50 -> Optional.of(COMPRESSION);
            case 1000 -> Optional.of(VOLA_TRADE);
            case 1001 -> Optional.of(EFP_FIN_TRADE);
            case 1002 -> Optional.of(EFP_INDEX_FUTURES_TRADE);
            case 1004 -> Optional.of(TRADEAT_MARKET);
            case 1006 -> Optional.of(ENLIGHT);
            case 1007 -> Optional.of(BLOCKQTPIP);
            case 1010 -> Optional.of(BTRF);
            case 1011 -> Optional.of(EBB);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
