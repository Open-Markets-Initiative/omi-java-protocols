package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Indicates whether the entity is blocked due to a breach.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum BlockedByBreachIndicator {

    /**
     * Not Blocked by Breach
     */
    NOT_BLOCKED((short) 0, "Not Blocked by Breach"),

    /**
     * Blocked by Breach
     */
    BLOCKED_BY_BREACH((short) 1, "Blocked by Breach"),

    /**
     * Blocked by Arbitrage Check (Options Market Maker only)
     */
    BLOCKED_BY_ARB_CHECK((short) 2, "Blocked by Arbitrage Check (Options Market Maker only)"),

    /**
     * Blocked by Intrinsic Value Check (Options Market Maker only)
     */
    BLOCKED_BY_INTRINSIC((short) 3, "Blocked by Intrinsic Value Check (Options Market Maker only)");

    private final short wire;

    private final String description;

    BlockedByBreachIndicator(short wire, String description) {
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
    public static Optional<BlockedByBreachIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_BLOCKED);
            case 1 -> Optional.of(BLOCKED_BY_BREACH);
            case 2 -> Optional.of(BLOCKED_BY_ARB_CHECK);
            case 3 -> Optional.of(BLOCKED_BY_INTRINSIC);
            default -> Optional.empty();
        };
    }
}
