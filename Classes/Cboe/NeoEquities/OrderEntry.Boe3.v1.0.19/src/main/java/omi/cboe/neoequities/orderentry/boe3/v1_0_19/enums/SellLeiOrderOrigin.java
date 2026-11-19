package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * LEIOrderOrigin for Sell side
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SellLeiOrderOrigin {

    /**
     * Direct Access Client
     */
    DIRECT_ACCESS_CLIENT((short) 5, "Direct Access Client"),

    /**
     * Foreign Dealer Equivalent
     */
    FOREIGN_DEALER_EQUIVALENT((short) 6, "Foreign Dealer Equivalent"),

    /**
     * Order Execution Only Service
     */
    ORDER_EXECUTION_ONLY_SERVICE((short) 7, "Order Execution Only Service");

    private final short wire;

    private final String description;

    SellLeiOrderOrigin(short wire, String description) {
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
    public static Optional<SellLeiOrderOrigin> fromWire(short wire) {
        return switch (wire) {
            case 5 -> Optional.of(DIRECT_ACCESS_CLIENT);
            case 6 -> Optional.of(FOREIGN_DEALER_EQUIVALENT);
            case 7 -> Optional.of(ORDER_EXECUTION_ONLY_SERVICE);
            default -> Optional.empty();
        };
    }
}
