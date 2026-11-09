package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.enums;

import java.util.Optional;

/**
 * Trading Status
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingStatus {

    /**
     * Pre Open
     */
    PRE_OPEN((short) 1, "Pre Open"),

    /**
     * Opening Freeze
     */
    OPENING_FREEZE((short) 2, "Opening Freeze"),

    /**
     * Trading
     */
    TRADING((short) 3, "Trading"),

    /**
     * Halt
     */
    HALT((short) 4, "Halt"),

    /**
     * Operational Halt
     */
    OPERATIONAL_HALT((short) 5, "Operational Halt"),

    /**
     * Closed
     */
    CLOSED((short) 6, "Closed");

    private final short wire;

    private final String description;

    TradingStatus(short wire, String description) {
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
    public static Optional<TradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PRE_OPEN);
            case 2 -> Optional.of(OPENING_FREEZE);
            case 3 -> Optional.of(TRADING);
            case 4 -> Optional.of(HALT);
            case 5 -> Optional.of(OPERATIONAL_HALT);
            case 6 -> Optional.of(CLOSED);
            default -> Optional.empty();
        };
    }
}
