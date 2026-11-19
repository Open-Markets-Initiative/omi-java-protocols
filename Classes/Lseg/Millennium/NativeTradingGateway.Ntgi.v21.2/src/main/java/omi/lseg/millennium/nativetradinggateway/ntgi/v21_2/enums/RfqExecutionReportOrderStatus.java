package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Defines the RfqExecutionReportOrderStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RfqExecutionReportOrderStatus {

    /**
     * P Fill
     */
    P_FILL((short) 1, "P Fill"),

    /**
     * Fill
     */
    FILL((short) 2, "Fill"),

    /**
     * Cancelled
     */
    CANCELLED((short) 4, "Cancelled"),

    /**
     * Expired
     */
    EXPIRED((short) 6, "Expired");

    private final short wire;

    private final String description;

    RfqExecutionReportOrderStatus(short wire, String description) {
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
    public static Optional<RfqExecutionReportOrderStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(P_FILL);
            case 2 -> Optional.of(FILL);
            case 4 -> Optional.of(CANCELLED);
            case 6 -> Optional.of(EXPIRED);
            default -> Optional.empty();
        };
    }
}
