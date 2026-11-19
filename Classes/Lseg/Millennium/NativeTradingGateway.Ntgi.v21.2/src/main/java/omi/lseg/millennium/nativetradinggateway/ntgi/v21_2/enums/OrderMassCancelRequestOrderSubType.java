package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Whether cancellation should apply to orders or quotes.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderMassCancelRequestOrderSubType {

    /**
     * Order
     */
    ORDER((short) 0, "Order"),

    /**
     * Quote
     */
    QUOTE((short) 3, "Quote");

    private final short wire;

    private final String description;

    OrderMassCancelRequestOrderSubType(short wire, String description) {
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
    public static Optional<OrderMassCancelRequestOrderSubType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ORDER);
            case 3 -> Optional.of(QUOTE);
            default -> Optional.empty();
        };
    }
}
