package omi.euronext.optiq.dropcopygateway.sbe.v5_56.enums;

import java.util.Optional;

/**
 * executionPhase
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExecutionPhaseOptional {

    /**
     * Continuous_Trading_Phase
     */
    CONTINUOUS_TRADING_PHASE((short) 1, "Continuous_Trading_Phase"),

    /**
     * Uncrossing_Phase
     */
    UNCROSSING_PHASE((short) 2, "Uncrossing_Phase"),

    /**
     * Trading_At_Last_Phase
     */
    TRADING_AT_LAST_PHASE((short) 3, "Trading_At_Last_Phase"),

    /**
     * Continuous_Uncrossing_Phase
     */
    CONTINUOUS_UNCROSSING_PHASE((short) 4, "Continuous_Uncrossing_Phase"),

    /**
     * IPO
     */
    IPO((short) 5, "IPO"),

    /**
     * executionPhase
     */
    NO_VALUE((short) 255, "executionPhase");

    private final short wire;

    private final String description;

    ExecutionPhaseOptional(short wire, String description) {
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
    public static Optional<ExecutionPhaseOptional> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CONTINUOUS_TRADING_PHASE);
            case 2 -> Optional.of(UNCROSSING_PHASE);
            case 3 -> Optional.of(TRADING_AT_LAST_PHASE);
            case 4 -> Optional.of(CONTINUOUS_UNCROSSING_PHASE);
            case 5 -> Optional.of(IPO);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
