package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_49.enums;

import java.util.Optional;

/**
 * Defines the TradeReportTransType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeReportTransType {

    /**
     * New
     */
    NEW((short) 0, "New"),

    /**
     * Cancel
     */
    CANCEL((short) 1, "Cancel"),

    /**
     * Replace
     */
    REPLACE((short) 2, "Replace"),

    /**
     * Release
     */
    RELEASE((short) 3, "Release");

    private final short wire;

    private final String description;

    TradeReportTransType(short wire, String description) {
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
    public static Optional<TradeReportTransType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW);
            case 1 -> Optional.of(CANCEL);
            case 2 -> Optional.of(REPLACE);
            case 3 -> Optional.of(RELEASE);
            default -> Optional.empty();
        };
    }
}
