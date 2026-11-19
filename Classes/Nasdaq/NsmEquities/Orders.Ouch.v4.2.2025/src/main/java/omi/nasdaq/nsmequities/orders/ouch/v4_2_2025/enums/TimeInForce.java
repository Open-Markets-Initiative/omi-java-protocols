package omi.nasdaq.nsmequities.orders.ouch.v4_2_2025.enums;

import java.util.Optional;

/**
 * The number of seconds that this order should live before being automatically canceled. Special values for Time in Force are listed in Data Types above.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum TimeInForce {

    /**
     * Immediate or cancel — If no match for the order is available at the moment the order is accepted, any unexecuted shares in the order are immediately canceled.
     */
    IMMEDIATE_OR_CANCEL(0x0L, "Immediate or cancel \u2014 If no match for the order is available at the moment the order is accepted, any unexecuted shares in the order are immediately canceled."),

    /**
     * Market Hours — Indicates that the order should live until the market close on the primary market for the security
     */
    MARKET_HOURS(0x1869EL, "Market Hours \u2014 Indicates that the order should live until the market close on the primary market for the security"),

    /**
     * System Hours — Indicates that the order should live until the end of the NASDAQ trading day
     */
    SYSTEM_HOURS(0x1869FL, "System Hours \u2014 Indicates that the order should live until the end of the NASDAQ trading day"),

    /**
     * Extended Trading Close – Indicates that the order should live until the conclusion of the Extended Trading Close for the security
     */
    EXTENDED_TRADING_CLOSE(0x1869CL, "Extended Trading Close \u2013 Indicates that the order should live until the conclusion of the Extended Trading Close for the security");

    private final long wire;

    private final String description;

    TimeInForce(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<TimeInForce> fromWire(long wire) {
        if (wire == 0L) {
            return Optional.of(IMMEDIATE_OR_CANCEL);
        }
        if (wire == 99998L) {
            return Optional.of(MARKET_HOURS);
        }
        if (wire == 99999L) {
            return Optional.of(SYSTEM_HOURS);
        }
        if (wire == 99996L) {
            return Optional.of(EXTENDED_TRADING_CLOSE);
        }
        return Optional.empty();
    }
}
