package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Broker/Dealer needs to report, as specified by the customer
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderOrigination {

    /**
     * Order received from direct access customer (DEA)
     */
    DIRECT_ACCESS_CUSTOMER('5', "Order received from direct access customer (DEA)"),

    /**
     * Order received from foreign dealer equivalent (FDE)
     */
    FOREIGN_DEALER_EQUIVALENT('6', "Order received from foreign dealer equivalent (FDE)"),

    /**
     * Order received from an execution-only service (OEO)
     */
    EXECUTION_ONLY_SERVICE('7', "Order received from an execution-only service (OEO)");

    private final char wire;

    private final String description;

    OrderOrigination(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<OrderOrigination> fromWire(char wire) {
        return switch (wire) {
            case '5' -> Optional.of(DIRECT_ACCESS_CUSTOMER);
            case '6' -> Optional.of(FOREIGN_DEALER_EQUIVALENT);
            case '7' -> Optional.of(EXECUTION_ONLY_SERVICE);
            default -> Optional.empty();
        };
    }
}
