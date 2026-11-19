package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderExecutedOptionalField {

    /**
     * Order Executed Optional UserRefIdx Enum
     */
    USERREFIDX((short) 37, "Order Executed Optional UserRefIdx Enum"),

    /**
     * Order Executed Optional ExecuteMatch Enum
     */
    EXECUTEMATCH((short) 38, "Order Executed Optional ExecuteMatch Enum"),

    /**
     * Order Executed Optional SecondaryOrderID Enum
     */
    SECONDARYORDERID((short) 40, "Order Executed Optional SecondaryOrderID Enum"),

    /**
     * Order Executed Optional BrokerPref Enum
     */
    BROKERPREF((short) 42, "Order Executed Optional BrokerPref Enum"),

    /**
     * Order Executed Optional PrincipalTrade Enum
     */
    PRINCIPALTRADE((short) 13, "Order Executed Optional PrincipalTrade Enum"),

    /**
     * Order Executed Optional WashTrade Enum
     */
    WASHTRADE((short) 41, "Order Executed Optional WashTrade Enum"),

    /**
     * Order Executed Optional CumRate Enum
     */
    CUMRATE((short) 36, "Order Executed Optional CumRate Enum");

    private final short wire;

    private final String description;

    OrderExecutedOptionalField(short wire, String description) {
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
    public static Optional<OrderExecutedOptionalField> fromWire(short wire) {
        return switch (wire) {
            case 37 -> Optional.of(USERREFIDX);
            case 38 -> Optional.of(EXECUTEMATCH);
            case 40 -> Optional.of(SECONDARYORDERID);
            case 42 -> Optional.of(BROKERPREF);
            case 13 -> Optional.of(PRINCIPALTRADE);
            case 41 -> Optional.of(WASHTRADE);
            case 36 -> Optional.of(CUMRATE);
            default -> Optional.empty();
        };
    }
}
