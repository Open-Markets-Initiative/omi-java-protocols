package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * 1000 = Liquidity Rate 5-15%; 1001 = Liquidity Rate 5-30%; 1002 = Mach Two 10 - 200%; 1003 = Custom Liquidity Rate
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TargetStrategy {

    /**
     * Liquidity Rate 5-15%
     */
    LIQUIDITY_RATE_515(1000, "Liquidity Rate 5-15%"),

    /**
     * Liquidity Rate 5-30%
     */
    LIQUIDITY_RATE_530(1001, "Liquidity Rate 5-30%"),

    /**
     * Mach Two 10 - 200%
     */
    MACH_TWO_10200(1002, "Mach Two 10 - 200%"),

    /**
     * Custom Liquidity Rate
     */
    CUSTOM_LIQUIDITY_RATE(1003, "Custom Liquidity Rate");

    private final int wire;

    private final String description;

    TargetStrategy(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<TargetStrategy> fromWire(int wire) {
        return switch (wire) {
            case 1000 -> Optional.of(LIQUIDITY_RATE_515);
            case 1001 -> Optional.of(LIQUIDITY_RATE_530);
            case 1002 -> Optional.of(MACH_TWO_10200);
            case 1003 -> Optional.of(CUSTOM_LIQUIDITY_RATE);
            default -> Optional.empty();
        };
    }
}
