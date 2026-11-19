package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * ExecInst
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecInst {

    /**
     * Not Held
     */
    NOT_HELD('1', "Not Held"),

    /**
     * Intermarket Sweep
     */
    INTERMARKET_SWEEP('f', "Intermarket Sweep"),

    /**
     * Settlement Liquidity
     */
    SETTLEMENT_LIQUIDITY('r', "Settlement Liquidity"),

    /**
     * All Or None
     */
    ALL_OR_NONE('G', "All Or None");

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
            case 'r' -> Optional.of(SETTLEMENT_LIQUIDITY);
            case 'G' -> Optional.of(ALL_OR_NONE);
            default -> Optional.empty();
        };
    }
}
