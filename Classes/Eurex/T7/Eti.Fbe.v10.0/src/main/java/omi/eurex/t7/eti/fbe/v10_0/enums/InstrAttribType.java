package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the InstrAttribType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum InstrAttribType {

    /**
     * Variable rate
     */
    VARIABLE_RATE((short) 5, "Variable rate"),

    /**
     * Coupon rate
     */
    COUPON_RATE((short) 100, "Coupon rate"),

    /**
     * Offset to the variable coupon rate
     */
    OFFSETTOTHEVARIABLECOUPONRATE((short) 101, "Offset to the variable coupon rate"),

    /**
     * Swap Customer 1
     */
    SWAP_CUSTOMER_1((short) 102, "Swap Customer 1"),

    /**
     * Swap Customer 2
     */
    SWAP_CUSTOMER_2((short) 103, "Swap Customer 2"),

    /**
     * Cash Basket Reference
     */
    CASH_BASKET_REFERENCE((short) 104, "Cash Basket Reference"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    InstrAttribType(short wire, String description) {
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
    public static Optional<InstrAttribType> fromWire(short wire) {
        return switch (wire) {
            case 5 -> Optional.of(VARIABLE_RATE);
            case 100 -> Optional.of(COUPON_RATE);
            case 101 -> Optional.of(OFFSETTOTHEVARIABLECOUPONRATE);
            case 102 -> Optional.of(SWAP_CUSTOMER_1);
            case 103 -> Optional.of(SWAP_CUSTOMER_2);
            case 104 -> Optional.of(CASH_BASKET_REFERENCE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
