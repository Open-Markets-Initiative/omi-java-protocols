package omi.euronext.optiq.dropcopygateway.sbe.v6_69.enums;

import java.util.Optional;

/**
 * ackPhase
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AckPhase {

    /**
     * Continuous_Trading_Phase
     */
    CONTINUOUS_TRADING_PHASE((short) 1, "Continuous_Trading_Phase"),

    /**
     * Call_Phase
     */
    CALL_PHASE((short) 2, "Call_Phase"),

    /**
     * Halt_Phase
     */
    HALT_PHASE((short) 3, "Halt_Phase"),

    /**
     * Closed_Phase
     */
    CLOSED_PHASE((short) 4, "Closed_Phase"),

    /**
     * Trading_At_Last_Phase
     */
    TRADING_AT_LAST_PHASE((short) 5, "Trading_At_Last_Phase"),

    /**
     * Reserved
     */
    RESERVED((short) 6, "Reserved"),

    /**
     * Suspended
     */
    SUSPENDED((short) 7, "Suspended"),

    /**
     * Random_Uncrossing_Phase
     */
    RANDOM_UNCROSSING_PHASE((short) 8, "Random_Uncrossing_Phase"),

    /**
     * Uncrossing_Phase
     */
    UNCROSSING_PHASE((short) 9, "Uncrossing_Phase"),

    /**
     * ackPhase
     */
    NO_VALUE((short) 255, "ackPhase");

    private final short wire;

    private final String description;

    AckPhase(short wire, String description) {
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
    public static Optional<AckPhase> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CONTINUOUS_TRADING_PHASE);
            case 2 -> Optional.of(CALL_PHASE);
            case 3 -> Optional.of(HALT_PHASE);
            case 4 -> Optional.of(CLOSED_PHASE);
            case 5 -> Optional.of(TRADING_AT_LAST_PHASE);
            case 6 -> Optional.of(RESERVED);
            case 7 -> Optional.of(SUSPENDED);
            case 8 -> Optional.of(RANDOM_UNCROSSING_PHASE);
            case 9 -> Optional.of(UNCROSSING_PHASE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
