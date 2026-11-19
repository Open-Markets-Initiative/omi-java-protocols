package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * userStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum UserStatus {

    /**
     * Trader_Algo_Suspended
     */
    TRADER_ALGO_SUSPENDED((short) 1, "Trader_Algo_Suspended"),

    /**
     * Trader_Algo_Suspension_Cleared
     */
    TRADER_ALGO_SUSPENSION_CLEARED((short) 2, "Trader_Algo_Suspension_Cleared"),

    /**
     * Trader_Algo_Killed
     */
    TRADER_ALGO_KILLED((short) 3, "Trader_Algo_Killed"),

    /**
     * Trader_Algo_Kill_Cleared
     */
    TRADER_ALGO_KILL_CLEARED((short) 4, "Trader_Algo_Kill_Cleared"),

    /**
     * Firm_Suspended
     */
    FIRM_SUSPENDED((short) 5, "Firm_Suspended"),

    /**
     * Firm_Suspension_Cleared
     */
    FIRM_SUSPENSION_CLEARED((short) 6, "Firm_Suspension_Cleared"),

    /**
     * Firm_Killed
     */
    FIRM_KILLED((short) 7, "Firm_Killed"),

    /**
     * Firm_Kill_Cleared
     */
    FIRM_KILL_CLEARED((short) 8, "Firm_Kill_Cleared"),

    /**
     * DEA_Suspended
     */
    DEA_SUSPENDED((short) 9, "DEA_Suspended"),

    /**
     * DEA_Suspension_Cleared
     */
    DEA_SUSPENSION_CLEARED((short) 10, "DEA_Suspension_Cleared"),

    /**
     * DEA_Killed
     */
    DEA_KILLED((short) 11, "DEA_Killed"),

    /**
     * DEA_Kill_Cleared
     */
    DEA_KILL_CLEARED((short) 12, "DEA_Kill_Cleared");

    private final short wire;

    private final String description;

    UserStatus(short wire, String description) {
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
    public static Optional<UserStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(TRADER_ALGO_SUSPENDED);
            case 2 -> Optional.of(TRADER_ALGO_SUSPENSION_CLEARED);
            case 3 -> Optional.of(TRADER_ALGO_KILLED);
            case 4 -> Optional.of(TRADER_ALGO_KILL_CLEARED);
            case 5 -> Optional.of(FIRM_SUSPENDED);
            case 6 -> Optional.of(FIRM_SUSPENSION_CLEARED);
            case 7 -> Optional.of(FIRM_KILLED);
            case 8 -> Optional.of(FIRM_KILL_CLEARED);
            case 9 -> Optional.of(DEA_SUSPENDED);
            case 10 -> Optional.of(DEA_SUSPENSION_CLEARED);
            case 11 -> Optional.of(DEA_KILLED);
            case 12 -> Optional.of(DEA_KILL_CLEARED);
            default -> Optional.empty();
        };
    }
}
