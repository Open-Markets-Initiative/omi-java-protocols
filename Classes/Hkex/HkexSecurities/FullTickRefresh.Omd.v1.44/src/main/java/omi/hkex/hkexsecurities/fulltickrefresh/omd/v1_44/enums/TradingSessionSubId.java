package omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.enums;

import java.util.Optional;

/**
 * Trading session sub-identifier.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionSubId {

    /**
     * Not Yet Open No
     */
    NOT_YET_OPEN_NO((short) 100, "Not Yet Open No"),

    /**
     * Pos Order Input Oi
     */
    POS_ORDER_INPUT_OI((short) 1, "Pos Order Input Oi"),

    /**
     * Pos No Cancellation Nw
     */
    POS_NO_CANCELLATION_NW((short) 101, "Pos No Cancellation Nw"),

    /**
     * Pos Random Matching Rm
     */
    POS_RANDOM_MATCHING_RM((short) 108, "Pos Random Matching Rm"),

    /**
     * Pos Order Matching Ma
     */
    POS_ORDER_MATCHING_MA((short) 2, "Pos Order Matching Ma"),

    /**
     * Blocking Bl
     */
    BLOCKING_BL((short) 7, "Blocking Bl"),

    /**
     * Continuous Trading Ct
     */
    CONTINUOUS_TRADING_CT((short) 3, "Continuous Trading Ct"),

    /**
     * Cas Reference Price Fixing Rp
     */
    CAS_REFERENCE_PRICE_FIXING_RP((short) 105, "Cas Reference Price Fixing Rp"),

    /**
     * Cas Order Input Oi
     */
    CAS_ORDER_INPUT_OI((short) 5, "Cas Order Input Oi"),

    /**
     * Cas No Cancellation Nw
     */
    CAS_NO_CANCELLATION_NW((short) 106, "Cas No Cancellation Nw"),

    /**
     * Cas Random Close Rc
     */
    CAS_RANDOM_CLOSE_RC((short) 107, "Cas Random Close Rc"),

    /**
     * Cas Order Matching Ma
     */
    CAS_ORDER_MATCHING_MA((short) 4, "Cas Order Matching Ma"),

    /**
     * Exchange Intervention Ei
     */
    EXCHANGE_INTERVENTION_EI((short) 102, "Exchange Intervention Ei"),

    /**
     * Close Cl
     */
    CLOSE_CL((short) 103, "Close Cl"),

    /**
     * Order Cancel Oc
     */
    ORDER_CANCEL_OC((short) 104, "Order Cancel Oc"),

    /**
     * Day Close Dc
     */
    DAY_CLOSE_DC((short) 0, "Day Close Dc");

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
            case 100 -> Optional.of(NOT_YET_OPEN_NO);
            case 1 -> Optional.of(POS_ORDER_INPUT_OI);
            case 101 -> Optional.of(POS_NO_CANCELLATION_NW);
            case 108 -> Optional.of(POS_RANDOM_MATCHING_RM);
            case 2 -> Optional.of(POS_ORDER_MATCHING_MA);
            case 7 -> Optional.of(BLOCKING_BL);
            case 3 -> Optional.of(CONTINUOUS_TRADING_CT);
            case 105 -> Optional.of(CAS_REFERENCE_PRICE_FIXING_RP);
            case 5 -> Optional.of(CAS_ORDER_INPUT_OI);
            case 106 -> Optional.of(CAS_NO_CANCELLATION_NW);
            case 107 -> Optional.of(CAS_RANDOM_CLOSE_RC);
            case 4 -> Optional.of(CAS_ORDER_MATCHING_MA);
            case 102 -> Optional.of(EXCHANGE_INTERVENTION_EI);
            case 103 -> Optional.of(CLOSE_CL);
            case 104 -> Optional.of(ORDER_CANCEL_OC);
            case 0 -> Optional.of(DAY_CLOSE_DC);
            default -> Optional.empty();
        };
    }
}
