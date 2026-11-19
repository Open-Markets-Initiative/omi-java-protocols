package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * The instruction for permissioning to trade against mid-priced pegged orders.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExecutionReportPeggedExecInst {

    /**
     * Permissioned For Execution Against Mid Priced Pegged Orders
     */
    PERMISSIONED_FOR_EXECUTION_AGAINST_MID_PRICED_PEGGED_ORDERS((short) 1, "Permissioned For Execution Against Mid Priced Pegged Orders"),

    /**
     * Not Permissioned For Execution Against Mid Priced Pegged Orders
     */
    NOT_PERMISSIONED_FOR_EXECUTION_AGAINST_MID_PRICED_PEGGED_ORDERS((short) 2, "Not Permissioned For Execution Against Mid Priced Pegged Orders");

    private final short wire;

    private final String description;

    ExecutionReportPeggedExecInst(short wire, String description) {
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
    public static Optional<ExecutionReportPeggedExecInst> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PERMISSIONED_FOR_EXECUTION_AGAINST_MID_PRICED_PEGGED_ORDERS);
            case 2 -> Optional.of(NOT_PERMISSIONED_FOR_EXECUTION_AGAINST_MID_PRICED_PEGGED_ORDERS);
            default -> Optional.empty();
        };
    }
}
