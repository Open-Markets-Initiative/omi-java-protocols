package omi.aquis.aquisequities.realtime.amd.v2_4_2.enums;

import java.util.Optional;

/**
 * Trading status of the security
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingStatus {

    /**
     * Active
     */
    ACTIVE((short) 1, "Active"),

    /**
     * Halted
     */
    HALTED((short) 2, "Halted"),

    /**
     * Suspended
     */
    SUSPENDED((short) 3, "Suspended"),

    /**
     * AoD Start
     */
    AOD_START((short) 8, "AoD Start"),

    /**
     * AoD End
     */
    AOD_END((short) 24, "AoD End");

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
            case 1 -> Optional.of(ACTIVE);
            case 2 -> Optional.of(HALTED);
            case 3 -> Optional.of(SUSPENDED);
            case 8 -> Optional.of(AOD_START);
            case 24 -> Optional.of(AOD_END);
            default -> Optional.empty();
        };
    }
}
