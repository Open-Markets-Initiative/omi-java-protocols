package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Execution Instruction for the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecInst {

    /**
     * Trade At The Pnbbo Midpoint Only
     */
    TRADE_AT_THE_PNBBO_MIDPOINT_ONLY('M', "Trade At The Pnbbo Midpoint Only"),

    /**
     * Trade At The Near Side Pnbbo
     */
    TRADE_AT_THE_NEAR_SIDE_PNBBO('R', "Trade At The Near Side Pnbbo"),

    /**
     * Trade At The Less Aggressive Of Pnbbo Midpoint Or Minimum Improvement From The Pnbbo
     */
    TRADE_AT_THE_LESS_AGGRESSIVE_OF_PNBBO_MIDPOINT_OR_MINIMUM_IMPROVEMENT_FROM_THE_PNBBO('p', "Trade At The Less Aggressive Of Pnbbo Midpoint Or Minimum Improvement From The Pnbbo"),

    /**
     * Late Used With Time In Force 7 To Enter A Late Limit On Close Lloc
     */
    LATE_USED_WITH_TIME_IN_FORCE_7_TO_ENTER_A_LATE_LIMIT_ON_CLOSE_LLOC('r', "Late Used With Time In Force 7 To Enter A Late Limit On Close Lloc"),

    /**
     * NULL (0x00), No ExecInst
     */
    NO_EXECINST('0', "NULL (0x00), No ExecInst");

    private final char wire;

    private final String description;

    ExecInst(char wire, String description) {
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
    public static Optional<ExecInst> fromWire(char wire) {
        return switch (wire) {
            case 'M' -> Optional.of(TRADE_AT_THE_PNBBO_MIDPOINT_ONLY);
            case 'R' -> Optional.of(TRADE_AT_THE_NEAR_SIDE_PNBBO);
            case 'p' -> Optional.of(TRADE_AT_THE_LESS_AGGRESSIVE_OF_PNBBO_MIDPOINT_OR_MINIMUM_IMPROVEMENT_FROM_THE_PNBBO);
            case 'r' -> Optional.of(LATE_USED_WITH_TIME_IN_FORCE_7_TO_ENTER_A_LATE_LIMIT_ON_CLOSE_LLOC);
            case '0' -> Optional.of(NO_EXECINST);
            default -> Optional.empty();
        };
    }
}
