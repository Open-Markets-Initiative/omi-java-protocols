package omi.eurex.t7.eobi.fbe.v13_0.enums;

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
     * Exchange For Physical
     */
    EFP(2, "Exchange For Physical"),

    /**
     * Exchange For Swap
     */
    EFS(12, "Exchange For Swap"),

    /**
     * Otc
     */
    OTC(54, "Otc"),

    /**
     * ExchangeBasisFacility
     */
    EXCHANGE_BASIS_FACILITY(55, "ExchangeBasisFacility"),

    /**
     * Vola Trade
     */
    VOLA_TRADE(1000, "Vola Trade"),

    /**
     * EFP-Fin Trade
     */
    EFP_FIN_TRADE(1001, "EFP-Fin Trade"),

    /**
     * EFP-Index-Futures Trade
     */
    EFP_INDEX_FUTURES_TRADE(1002, "EFP-Index-Futures Trade"),

    /**
     * Block Trade At Market
     */
    BLOCK_TRADE_AT_MARKET(1004, "Block Trade At Market"),

    /**
     * Xetra / Eurex Enlight Triggered Trade
     */
    XETRA_EUREX_ENLIGHT_TRIGGERED_TRADE(1006, "Xetra / Eurex Enlight Triggered Trade"),

    /**
     * Block QTPIP Trade
     */
    BLOCK_QTPIP_TRADE(1007, "Block QTPIP Trade"),

    /**
     * Delta Trade At Market
     */
    DELTA_TRADE_AT_MARKET(1017, "Delta Trade At Market"),

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
            case 2 -> Optional.of(EFP);
            case 12 -> Optional.of(EFS);
            case 54 -> Optional.of(OTC);
            case 55 -> Optional.of(EXCHANGE_BASIS_FACILITY);
            case 1000 -> Optional.of(VOLA_TRADE);
            case 1001 -> Optional.of(EFP_FIN_TRADE);
            case 1002 -> Optional.of(EFP_INDEX_FUTURES_TRADE);
            case 1004 -> Optional.of(BLOCK_TRADE_AT_MARKET);
            case 1006 -> Optional.of(XETRA_EUREX_ENLIGHT_TRIGGERED_TRADE);
            case 1007 -> Optional.of(BLOCK_QTPIP_TRADE);
            case 1017 -> Optional.of(DELTA_TRADE_AT_MARKET);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
