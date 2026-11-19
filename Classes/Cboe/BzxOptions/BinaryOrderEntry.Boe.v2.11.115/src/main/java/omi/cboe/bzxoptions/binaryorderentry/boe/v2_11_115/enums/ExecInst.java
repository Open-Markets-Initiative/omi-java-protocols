package omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the ExecInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecInst {

    /**
     * Not held. Must be routed to the floor. (C1 only)
     */
    NOT_HELD('1', "Not held. Must be routed to the floor. (C1 only)"),

    /**
     * Intermarket Sweep (Directed or Cboe)
     */
    INTERMARKET_SWEEP('f', "Intermarket Sweep (Directed or Cboe)"),

    /**
     * Settlement Liquidity1 (C1 only)
     */
    SETTLEMENT_LIQUIDITY_1('r', "Settlement Liquidity1 (C1 only)"),

    /**
     * All or None (AON)(C1 and EDGX only)
     */
    ALL_OR_NONE('G', "All or None (AON)(C1 and EDGX only)"),

    /**
     * Sweep2(C1 and EDGX only) ASCII NULL (0x00) = no special handling 1Requires TimeInForce = 2 and Price. 2Used for New Order Cross and New Order Cross Multileg messages only. Requires CrossType = 1 (AIM).
     */
    SWEEP_2('s', "Sweep2(C1 and EDGX only) ASCII NULL (0x00) = no special handling 1Requires TimeInForce = 2 and Price. 2Used for New Order Cross and New Order Cross Multileg messages only. Requires CrossType = 1 (AIM).");

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
            case '1' -> Optional.of(NOT_HELD);
            case 'f' -> Optional.of(INTERMARKET_SWEEP);
            case 'r' -> Optional.of(SETTLEMENT_LIQUIDITY_1);
            case 'G' -> Optional.of(ALL_OR_NONE);
            case 's' -> Optional.of(SWEEP_2);
            default -> Optional.empty();
        };
    }
}
