package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * execRestatementReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExecRestatementReason {

    /**
     * MARKET_OPTION
     */
    MARKET_OPTION((short) 8, "MARKET_OPTION"),

    /**
     * CANCEL_ON_HARD_DISCONNECTION
     */
    CANCEL_ON_HARD_DISCONNECTION((short) 100, "CANCEL_ON_HARD_DISCONNECTION"),

    /**
     * CANCEL_ON_TERMINATE
     */
    CANCEL_ON_TERMINATE((short) 101, "CANCEL_ON_TERMINATE"),

    /**
     * CANCEL_ON_DISCONNECT_AND_TERMINATE
     */
    CANCEL_ON_DISCONNECT_AND_TERMINATE((short) 102, "CANCEL_ON_DISCONNECT_AND_TERMINATE"),

    /**
     * SELF_TRADING_PREVENTION
     */
    SELF_TRADING_PREVENTION((short) 103, "SELF_TRADING_PREVENTION"),

    /**
     * CANCEL_FROM_FIRMSOFT
     */
    CANCEL_FROM_FIRMSOFT((short) 105, "CANCEL_FROM_FIRMSOFT"),

    /**
     * CANCEL_RESTING_ORDER_ON_SELF_TRADE
     */
    CANCEL_RESTING_ORDER_ON_SELF_TRADE((short) 107, "CANCEL_RESTING_ORDER_ON_SELF_TRADE"),

    /**
     * MARKET_MAKER_PROTECTION
     */
    MARKET_MAKER_PROTECTION((short) 200, "MARKET_MAKER_PROTECTION"),

    /**
     * RISK_MANAGEMENT_CANCELLATION
     */
    RISK_MANAGEMENT_CANCELLATION((short) 201, "RISK_MANAGEMENT_CANCELLATION"),

    /**
     * ORDER_MASS_ACTION_FROM_CLIENT_REQUEST
     */
    ORDER_MASS_ACTION_FROM_CLIENT_REQUEST((short) 202, "ORDER_MASS_ACTION_FROM_CLIENT_REQUEST"),

    /**
     * CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR
     */
    CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR((short) 203, "CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR"),

    /**
     * ORDER_CANCELLED_DUE_TO_OPERATIONAL_ERROR
     */
    ORDER_CANCELLED_DUE_TO_OPERATIONAL_ERROR((short) 204, "ORDER_CANCELLED_DUE_TO_OPERATIONAL_ERROR"),

    /**
     * CANCEL_ORDER_FIRMSOFT_DUE_TO_OPERATIONAL_ERROR
     */
    CANCEL_ORDER_FIRMSOFT_DUE_TO_OPERATIONAL_ERROR((short) 205, "CANCEL_ORDER_FIRMSOFT_DUE_TO_OPERATIONAL_ERROR"),

    /**
     * ORDER_CANCELLED_FIRMSOFT_DUE_TO_OPERATIONAL_ERROR
     */
    ORDER_CANCELLED_FIRMSOFT_DUE_TO_OPERATIONAL_ERROR((short) 206, "ORDER_CANCELLED_FIRMSOFT_DUE_TO_OPERATIONAL_ERROR"),

    /**
     * MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_REQUEST
     */
    MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_REQUEST((short) 207, "MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_REQUEST"),

    /**
     * MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_EFFECTIVE
     */
    MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_EFFECTIVE((short) 208, "MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_EFFECTIVE"),

    /**
     * CANCEL_ON_MIDPOINT_BROKER_ONLY_REMOVAL
     */
    CANCEL_ON_MIDPOINT_BROKER_ONLY_REMOVAL((short) 209, "CANCEL_ON_MIDPOINT_BROKER_ONLY_REMOVAL"),

    /**
     * execRestatementReason
     */
    NO_VALUE((short) 0, "execRestatementReason");

    private final short wire;

    private final String description;

    ExecRestatementReason(short wire, String description) {
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
    public static Optional<ExecRestatementReason> fromWire(short wire) {
        return switch (wire) {
            case 8 -> Optional.of(MARKET_OPTION);
            case 100 -> Optional.of(CANCEL_ON_HARD_DISCONNECTION);
            case 101 -> Optional.of(CANCEL_ON_TERMINATE);
            case 102 -> Optional.of(CANCEL_ON_DISCONNECT_AND_TERMINATE);
            case 103 -> Optional.of(SELF_TRADING_PREVENTION);
            case 105 -> Optional.of(CANCEL_FROM_FIRMSOFT);
            case 107 -> Optional.of(CANCEL_RESTING_ORDER_ON_SELF_TRADE);
            case 200 -> Optional.of(MARKET_MAKER_PROTECTION);
            case 201 -> Optional.of(RISK_MANAGEMENT_CANCELLATION);
            case 202 -> Optional.of(ORDER_MASS_ACTION_FROM_CLIENT_REQUEST);
            case 203 -> Optional.of(CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR);
            case 204 -> Optional.of(ORDER_CANCELLED_DUE_TO_OPERATIONAL_ERROR);
            case 205 -> Optional.of(CANCEL_ORDER_FIRMSOFT_DUE_TO_OPERATIONAL_ERROR);
            case 206 -> Optional.of(ORDER_CANCELLED_FIRMSOFT_DUE_TO_OPERATIONAL_ERROR);
            case 207 -> Optional.of(MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_REQUEST);
            case 208 -> Optional.of(MASS_CANCEL_ORDER_DUE_TO_OPERATIONAL_ERROR_EFFECTIVE);
            case 209 -> Optional.of(CANCEL_ON_MIDPOINT_BROKER_ONLY_REMOVAL);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
