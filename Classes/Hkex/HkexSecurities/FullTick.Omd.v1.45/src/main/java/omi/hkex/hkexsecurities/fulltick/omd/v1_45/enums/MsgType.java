package omi.hkex.hkexsecurities.fulltick.omd.v1_45.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * The Add Order message is generated when a new order is inserted into the order book. The OrderId is unique per security but will not increment consecutively. Note for Securities instruments the OrderBookPosition is always set to zero.
     */
    ADD_ORDER_MESSAGE(30, "The Add Order message is generated when a new order is inserted into the order book. The OrderId is unique per security but will not increment consecutively. Note for Securities instruments the OrderBookPosition is always set to zero."),

    /**
     * The Sequence Reset message is sent on each multicast channel at start of day. It may also be sent when there is a need for the rectification of stock reference data before market open.
     */
    SEQUENCE_RESET_MESSAGE(100, "The Sequence Reset message is sent on each multicast channel at start of day. It may also be sent when there is a need for the rectification of stock reference data before market open."),

    /**
     * The Disaster Recovery (DR) Signal message is sent on a dedicated multicast channel whenever a site failover scenario is triggered.
     */
    DISASTER_RECOVERY_SIGNAL_MESSAGE(105, "The Disaster Recovery (DR) Signal message is sent on a dedicated multicast channel whenever a site failover scenario is triggered."),

    /**
     * The Delete Order message is generated when an existing order identified by the OrderId is deleted.
     */
    DELETE_ORDER_MESSAGE(32, "The Delete Order message is generated when an existing order identified by the OrderId is deleted."),

    /**
     * The Indicative Equilibrium Price (IEP) message is generated whenever there is change of the IEP or Indicative Equilibrium Volume (IEV) during Pre-Opening Session (POS) or Closing Auction Session (CAS). The IEP is 0 when IEP does not exist.
     */
    INDICATIVE_EQUILIBRIUM_PRICE_MESSAGE(41, "The Indicative Equilibrium Price (IEP) message is generated whenever there is change of the IEP or Indicative Equilibrium Volume (IEV) during Pre-Opening Session (POS) or Closing Auction Session (CAS). The IEP is 0 when IEP does not exist."),

    /**
     * The Modify Order message is generated when an existing order identified by the OrderId is modified. The only attribute that can be modified is the quantity. Note for Securities instruments the OrderBookPosition is always set to zero.
     */
    MODIFY_ORDER_MESSAGE(31, "The Modify Order message is generated when an existing order identified by the OrderId is modified. The only attribute that can be modified is the quantity. Note for Securities instruments the OrderBookPosition is always set to zero."),

    /**
     * The Order Imbalance message provides order imbalance information at the Indicative Equilibrium Price (IEP) during the Pre-Opening Session (POS) and Closing Auction Session (CAS).
     */
    ORDER_IMBALANCE_MESSAGE(56, "The Order Imbalance message provides order imbalance information at the Indicative Equilibrium Price (IEP) during the Pre-Opening Session (POS) and Closing Auction Session (CAS)."),

    /**
     * The Market Definition message is generated at the start of the business day for each market segment.
     */
    MARKET_DEFINITION_MESSAGE(10, "The Market Definition message is generated at the start of the business day for each market segment."),

    /**
     * The Security Definition message contains all the reference data for a security. Security Definition messages may be received intraday (for example the FreeText field may be updated during the day).
     */
    SECURITY_DEFINITION_MESSAGE(11, "The Security Definition message contains all the reference data for a security. Security Definition messages may be received intraday (for example the FreeText field may be updated during the day)."),

    /**
     * The Liquidity Provider message is generated at the start of the business day for securities that have at least one liquidity provider.
     */
    LIQUIDITY_PROVIDER_MESSAGE(13, "The Liquidity Provider message is generated at the start of the business day for securities that have at least one liquidity provider."),

    /**
     * The Currency Rate message provides the foreign exchange conversion rates between various foreign currencies and the Hong Kong dollar.
     */
    CURRENCY_RATE_MESSAGE(14, "The Currency Rate message provides the foreign exchange conversion rates between various foreign currencies and the Hong Kong dollar."),

    /**
     * Reference price, lower and upper price limits for order input during an applicable auction session (POS or CAS). Sent again when there is any change.
     */
    REFERENCE_PRICE_MESSAGE(43, "Reference price, lower and upper price limits for order input during an applicable auction session (POS or CAS). Sent again when there is any change."),

    /**
     * This message is published to mark the end of a refresh.
     */
    REFRESH_COMPLETE_MESSAGE(203, "This message is published to mark the end of a refresh."),

    /**
     * The Trading Session Status provides information on the status of a market segment. It is sent whenever there is change of trading session. This message may be sent on a separate multicast channel from order and trade data and therefore may not be synchronized.
     */
    TRADING_SESSION_STATUS_MESSAGE(20, "The Trading Session Status provides information on the status of a market segment. It is sent whenever there is change of trading session. This message may be sent on a separate multicast channel from order and trade data and therefore may not be synchronized."),

    /**
     * The Security Status message is generated at the start of the business day if the security is not available for trading, and whenever a security state changes.
     */
    SECURITY_STATUS_MESSAGE(21, "The Security Status message is generated at the start of the business day if the security is not available for trading, and whenever a security state changes."),

    /**
     * The Trade message is generated each time a trade has been performed.
     */
    TRADE_MESSAGE(50, "The Trade message is generated each time a trade has been performed."),

    /**
     * The Trade Cancel message is generated when a trade has been cancelled.
     */
    TRADE_CANCEL_MESSAGE(51, "The Trade Cancel message is generated when a trade has been cancelled."),

    /**
     * The VCM Trigger message is generated whenever a cooling off period is triggered by Volatility Control Mechanism (VCM).
     */
    VCM_TRIGGER_MESSAGE(23, "The VCM Trigger message is generated whenever a cooling off period is triggered by Volatility Control Mechanism (VCM).");

    private final int wire;

    private final String description;

    MsgType(int wire, String description) {
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
    public static Optional<MsgType> fromWire(int wire) {
        return switch (wire) {
            case 30 -> Optional.of(ADD_ORDER_MESSAGE);
            case 100 -> Optional.of(SEQUENCE_RESET_MESSAGE);
            case 105 -> Optional.of(DISASTER_RECOVERY_SIGNAL_MESSAGE);
            case 32 -> Optional.of(DELETE_ORDER_MESSAGE);
            case 41 -> Optional.of(INDICATIVE_EQUILIBRIUM_PRICE_MESSAGE);
            case 31 -> Optional.of(MODIFY_ORDER_MESSAGE);
            case 56 -> Optional.of(ORDER_IMBALANCE_MESSAGE);
            case 10 -> Optional.of(MARKET_DEFINITION_MESSAGE);
            case 11 -> Optional.of(SECURITY_DEFINITION_MESSAGE);
            case 13 -> Optional.of(LIQUIDITY_PROVIDER_MESSAGE);
            case 14 -> Optional.of(CURRENCY_RATE_MESSAGE);
            case 43 -> Optional.of(REFERENCE_PRICE_MESSAGE);
            case 203 -> Optional.of(REFRESH_COMPLETE_MESSAGE);
            case 20 -> Optional.of(TRADING_SESSION_STATUS_MESSAGE);
            case 21 -> Optional.of(SECURITY_STATUS_MESSAGE);
            case 50 -> Optional.of(TRADE_MESSAGE);
            case 51 -> Optional.of(TRADE_CANCEL_MESSAGE);
            case 23 -> Optional.of(VCM_TRIGGER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
