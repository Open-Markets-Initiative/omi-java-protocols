package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Coupon type for a bond
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BondCouponType {

    /**
     * NotApplicable
     */
    NOT_APPLICABLE((short) 1, "NotApplicable"),

    /**
     * Zero coupon
     */
    ZERO((short) 2, "Zero coupon"),

    /**
     * Fixed coupon
     */
    FIXED((short) 3, "Fixed coupon"),

    /**
     * Floating coupon
     */
    FLOATING((short) 4, "Floating coupon"),

    /**
     * Indexed coupon
     */
    INDEXED((short) 5, "Indexed coupon");

    private final short wire;

    private final String description;

    BondCouponType(short wire, String description) {
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
    public static Optional<BondCouponType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NOT_APPLICABLE);
            case 2 -> Optional.of(ZERO);
            case 3 -> Optional.of(FIXED);
            case 4 -> Optional.of(FLOATING);
            case 5 -> Optional.of(INDEXED);
            default -> Optional.empty();
        };
    }
}
