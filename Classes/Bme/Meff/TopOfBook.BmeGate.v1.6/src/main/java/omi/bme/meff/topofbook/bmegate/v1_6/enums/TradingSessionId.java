package omi.bme.meff.topofbook.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Trading mode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionId {

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING((short) 100, "Continuous Trading"),

    /**
     * Block Trades
     */
    BLOCK_TRADES((short) 102, "Block Trades"),

    /**
     * Normal Hours
     */
    NORMAL_HOURS((short) 105, "Normal Hours"),

    /**
     * Delta And Basis Trade
     */
    DELTA_AND_BASIS_TRADE((short) 106, "Delta And Basis Trade"),

    /**
     * Bono Hours
     */
    BONO_HOURS((short) 107, "Bono Hours"),

    /**
     * Cross Trades Normal Hours
     */
    CROSS_TRADES_NORMAL_HOURS((short) 108, "Cross Trades Normal Hours"),

    /**
     * Cross Trades Bono Hours
     */
    CROSS_TRADES_BONO_HOURS((short) 109, "Cross Trades Bono Hours"),

    /**
     * Rfq Ibex Futures Hours
     */
    RFQ_IBEX_FUTURES_HOURS((short) 115, "Rfq Ibex Futures Hours"),

    /**
     * Rfq Normal Hours
     */
    RFQ_NORMAL_HOURS((short) 116, "Rfq Normal Hours"),

    /**
     * Rfq Bono Hours
     */
    RFQ_BONO_HOURS((short) 117, "Rfq Bono Hours"),

    /**
     * X Rolling On Stocks
     */
    X_ROLLING_ON_STOCKS((short) 118, "X Rolling On Stocks");

    private final short wire;

    private final String description;

    TradingSessionId(short wire, String description) {
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
    public static Optional<TradingSessionId> fromWire(short wire) {
        return switch (wire) {
            case 100 -> Optional.of(CONTINUOUS_TRADING);
            case 102 -> Optional.of(BLOCK_TRADES);
            case 105 -> Optional.of(NORMAL_HOURS);
            case 106 -> Optional.of(DELTA_AND_BASIS_TRADE);
            case 107 -> Optional.of(BONO_HOURS);
            case 108 -> Optional.of(CROSS_TRADES_NORMAL_HOURS);
            case 109 -> Optional.of(CROSS_TRADES_BONO_HOURS);
            case 115 -> Optional.of(RFQ_IBEX_FUTURES_HOURS);
            case 116 -> Optional.of(RFQ_NORMAL_HOURS);
            case 117 -> Optional.of(RFQ_BONO_HOURS);
            case 118 -> Optional.of(X_ROLLING_ON_STOCKS);
            default -> Optional.empty();
        };
    }
}
