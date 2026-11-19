package omi.eurex.t7.xti.fbe.v15_0.enums;

import java.util.Optional;

/**
 * Defines the LastCouponDeviationIndicator values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LastCouponDeviationIndicator {

    /**
     * None
     */
    NONE((short) 0, "None"),

    /**
     * Short period
     */
    SHORTPERIOD((short) 1, "Short period"),

    /**
     * Long period
     */
    LONGPERIOD((short) 2, "Long period"),

    /**
     * Only one coupon
     */
    ONLYONECOUPON((short) 3, "Only one coupon"),

    /**
     * Short - two interest payments due
     */
    SHORTTWOINTERESTPAYMENTSDUE((short) 4, "Short - two interest payments due"),

    /**
     * Long - two interest payments due
     */
    LONGTWOINTERESTPAYMENTSDUE((short) 5, "Long - two interest payments due"),

    /**
     * Perpetual
     */
    PERPETUAL((short) 6, "Perpetual"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    LastCouponDeviationIndicator(short wire, String description) {
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
    public static Optional<LastCouponDeviationIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(SHORTPERIOD);
            case 2 -> Optional.of(LONGPERIOD);
            case 3 -> Optional.of(ONLYONECOUPON);
            case 4 -> Optional.of(SHORTTWOINTERESTPAYMENTSDUE);
            case 5 -> Optional.of(LONGTWOINTERESTPAYMENTSDUE);
            case 6 -> Optional.of(PERPETUAL);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
