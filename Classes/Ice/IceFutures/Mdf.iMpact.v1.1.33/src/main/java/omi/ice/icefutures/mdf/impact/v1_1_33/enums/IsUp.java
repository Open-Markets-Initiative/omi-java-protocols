package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * ‘Y’ – IPL Upper bound violation (Bidding too high), ‘N’ – IPL Lower bound violation (Asking too low), N/A when IPLHoldType = ‘E’
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IsUp {

    /**
     * Ipl Upper Bound Violation Bidding Too High
     */
    IPL_UPPER_BOUND_VIOLATION('Y', "Ipl Upper Bound Violation Bidding Too High"),

    /**
     * Ipl Lower Bound Violation Asking Too Low
     */
    IPL_LOWER_BOUND_VIOLATION('N', "Ipl Lower Bound Violation Asking Too Low"),

    /**
     * Final
     */
    FINAL('F', "Final"),

    /**
     * Non Endex Spot Market
     */
    NON_ENDEX_SPOT_MARKET(' ', "Non Endex Spot Market");

    private final char wire;

    private final String description;

    IsUp(char wire, String description) {
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
    public static Optional<IsUp> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(IPL_UPPER_BOUND_VIOLATION);
            case 'N' -> Optional.of(IPL_LOWER_BOUND_VIOLATION);
            case 'F' -> Optional.of(FINAL);
            case ' ' -> Optional.of(NON_ENDEX_SPOT_MARKET);
            default -> Optional.empty();
        };
    }
}
