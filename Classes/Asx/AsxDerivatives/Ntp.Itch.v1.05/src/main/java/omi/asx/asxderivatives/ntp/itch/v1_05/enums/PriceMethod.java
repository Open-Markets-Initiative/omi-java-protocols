package omi.asx.asxderivatives.ntp.itch.v1_05.enums;

import java.util.Optional;

/**
 * Pricing method
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceMethod {

    /**
     * Leg ratios are used to calculate the net price
     */
    NET_PRICE((short) 0, "Leg ratios are used to calculate the net price"),

    /**
     * leg ratios greater than 1 do not affect the net price calculation
     */
    YIELD_DIFFERENCE((short) 2, "leg ratios greater than 1 do not affect the net price calculation"),

    /**
     * first leg is fixed price, remaining legs are net price
     */
    INDIVIDUAL((short) 3, "first leg is fixed price, remaining legs are net price"),

    /**
     * legs are same side, i.e. bid buys all legs or ask sells all legs
     */
    AVERAGE_PRICE((short) 4, "legs are same side, i.e. bid buys all legs or ask sells all legs");

    private final short wire;

    private final String description;

    PriceMethod(short wire, String description) {
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
    public static Optional<PriceMethod> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NET_PRICE);
            case 2 -> Optional.of(YIELD_DIFFERENCE);
            case 3 -> Optional.of(INDIVIDUAL);
            case 4 -> Optional.of(AVERAGE_PRICE);
            default -> Optional.empty();
        };
    }
}
