package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Risk action to perform, including query, kill switch actions, reinstatement, and symbol-level entity management.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RiskActionType {

    /**
     * Not applicable
     */
    NOT_APPLICABLE((short) 0, "Not applicable"),

    /**
     * Query risk entity for current risk control configurations, calculations, and status
     */
    QUERY_RISK_ENTITY((short) 1, "Query risk entity for current risk control configurations, calculations, and status"),

    /**
     * Kill switch – block
     */
    KILL_SWITCH_BLOCK((short) 2, "Kill switch \u2013 block"),

    /**
     * Kill switch – unblock
     */
    KILL_SWITCH_UNBLOCK((short) 3, "Kill switch \u2013 unblock"),

    /**
     * Kill switch – cancel auction orders
     */
    KILL_SWITCH_CANCEL_AUCTION_ORDERS((short) 4, "Kill switch \u2013 cancel auction orders"),

    /**
     * Kill switch – cancel non-auction orders
     */
    KILL_SWITCH_CANCEL_NON_AUCTION_ORDERS((short) 5, "Kill switch \u2013 cancel non-auction orders"),

    /**
     * Kill switch – cancel GTC orders
     */
    KILL_SWITCH_CANCEL_GTC_ORDERS((short) 6, "Kill switch \u2013 cancel GTC orders"),

    /**
     * Approve reinstatement
     */
    APPROVE_REINSTATEMENT((short) 7, "Approve reinstatement"),

    /**
     * Risk entity reinstated after all required approvals are received and processed
     */
    RISK_ENTITY_REINSTATED((short) 8, "Risk entity reinstated after all required approvals are received and processed"),

    /**
     * Add symbol-level risk entity
     */
    ADD_SYMBOL_LEVEL_RISK_ENTITY((short) 9, "Add symbol-level risk entity"),

    /**
     * Remove symbol-level risk entity
     */
    REMOVE_SYMBOL_LEVEL_RISK_ENTITY((short) 10, "Remove symbol-level risk entity");

    private final short wire;

    private final String description;

    RiskActionType(short wire, String description) {
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
    public static Optional<RiskActionType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(QUERY_RISK_ENTITY);
            case 2 -> Optional.of(KILL_SWITCH_BLOCK);
            case 3 -> Optional.of(KILL_SWITCH_UNBLOCK);
            case 4 -> Optional.of(KILL_SWITCH_CANCEL_AUCTION_ORDERS);
            case 5 -> Optional.of(KILL_SWITCH_CANCEL_NON_AUCTION_ORDERS);
            case 6 -> Optional.of(KILL_SWITCH_CANCEL_GTC_ORDERS);
            case 7 -> Optional.of(APPROVE_REINSTATEMENT);
            case 8 -> Optional.of(RISK_ENTITY_REINSTATED);
            case 9 -> Optional.of(ADD_SYMBOL_LEVEL_RISK_ENTITY);
            case 10 -> Optional.of(REMOVE_SYMBOL_LEVEL_RISK_ENTITY);
            default -> Optional.empty();
        };
    }
}
