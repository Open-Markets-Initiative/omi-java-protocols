package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * securityTradingStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingStatus {

    /**
     * TradingHalt_Suspended
     */
    TRADING_HALT_SUSPENDED((short) 2, "TradingHalt_Suspended"),

    /**
     * NoOpen_NoResume_PreClose
     */
    NO_OPEN_NO_RESUME_PRE_CLOSE((short) 4, "NoOpen_NoResume_PreClose"),

    /**
     * ReadyToTrade_Open
     */
    READY_TO_TRADE_OPEN((short) 17, "ReadyToTrade_Open"),

    /**
     * NotAvailableForTrading_Close
     */
    NOT_AVAILABLE_FOR_TRADING_CLOSE((short) 18, "NotAvailableForTrading_Close"),

    /**
     * NotTraded
     */
    NOT_TRADED((short) 19, "NotTraded"),

    /**
     * UnknownOrInvalid_Expired
     */
    UNKNOWN_OR_INVALID_EXPIRED((short) 20, "UnknownOrInvalid_Expired"),

    /**
     * PreOpen
     */
    PRE_OPEN((short) 21, "PreOpen"),

    /**
     * TradingAsStrategyLegOnly_Open
     */
    TRADING_AS_STRATEGY_LEG_ONLY_OPEN((short) 100, "TradingAsStrategyLegOnly_Open");

    private final short wire;

    private final String description;

    SecurityTradingStatus(short wire, String description) {
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
    public static Optional<SecurityTradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(TRADING_HALT_SUSPENDED);
            case 4 -> Optional.of(NO_OPEN_NO_RESUME_PRE_CLOSE);
            case 17 -> Optional.of(READY_TO_TRADE_OPEN);
            case 18 -> Optional.of(NOT_AVAILABLE_FOR_TRADING_CLOSE);
            case 19 -> Optional.of(NOT_TRADED);
            case 20 -> Optional.of(UNKNOWN_OR_INVALID_EXPIRED);
            case 21 -> Optional.of(PRE_OPEN);
            case 100 -> Optional.of(TRADING_AS_STRATEGY_LEG_ONLY_OPEN);
            default -> Optional.empty();
        };
    }
}
