package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * The instruction for permissioning to trade against mid-priced pegged orders.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum NewQuotePeggedExecInst {

    /**
     * Default
     */
    DEFAULT((short) 0, "Default"),

    /**
     * Permitted To Execute Against Mid Priced Pegged Orders
     */
    PERMITTED_TO_EXECUTE_AGAINST_MID_PRICED_PEGGED_ORDERS((short) 1, "Permitted To Execute Against Mid Priced Pegged Orders"),

    /**
     * Not Permitted To Execute Against Mid Priced Pegged Orders
     */
    NOT_PERMITTED_TO_EXECUTE_AGAINST_MID_PRICED_PEGGED_ORDERS((short) 2, "Not Permitted To Execute Against Mid Priced Pegged Orders");

    private final short wire;

    private final String description;

    NewQuotePeggedExecInst(short wire, String description) {
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
    public static Optional<NewQuotePeggedExecInst> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DEFAULT);
            case 1 -> Optional.of(PERMITTED_TO_EXECUTE_AGAINST_MID_PRICED_PEGGED_ORDERS);
            case 2 -> Optional.of(NOT_PERMITTED_TO_EXECUTE_AGAINST_MID_PRICED_PEGGED_ORDERS);
            default -> Optional.empty();
        };
    }
}
