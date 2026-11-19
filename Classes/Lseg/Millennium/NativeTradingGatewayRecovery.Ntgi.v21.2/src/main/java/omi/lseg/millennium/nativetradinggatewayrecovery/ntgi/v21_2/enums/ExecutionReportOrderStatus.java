package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * The status of the order.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExecutionReportOrderStatus {

    /**
     * New
     */
    NEW((short) 0, "New"),

    /**
     * Partially Filled
     */
    PARTIALLY_FILLED((short) 1, "Partially Filled"),

    /**
     * Filled
     */
    FILLED((short) 2, "Filled"),

    /**
     * Cancelled
     */
    CANCELLED((short) 4, "Cancelled"),

    /**
     * Expired
     */
    EXPIRED((short) 6, "Expired"),

    /**
     * Rejected
     */
    REJECTED((short) 8, "Rejected"),

    /**
     * Suspended
     */
    SUSPENDED((short) 9, "Suspended");

    private final short wire;

    private final String description;

    ExecutionReportOrderStatus(short wire, String description) {
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
    public static Optional<ExecutionReportOrderStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW);
            case 1 -> Optional.of(PARTIALLY_FILLED);
            case 2 -> Optional.of(FILLED);
            case 4 -> Optional.of(CANCELLED);
            case 6 -> Optional.of(EXPIRED);
            case 8 -> Optional.of(REJECTED);
            case 9 -> Optional.of(SUSPENDED);
            default -> Optional.empty();
        };
    }
}
