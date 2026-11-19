package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_52.enums;

import java.util.Optional;

/**
 * Defines the ExecInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecInst {

    /**
     * Market Peg (peg buy to PBBO offer, peg sell to PBBO bid)
     */
    MARKET_PEG('P', "Market Peg (peg buy to PBBO offer, peg sell to PBBO bid)"),

    /**
     * Primary Peg (peg buy to PBBO bid, peg sell to PBBO offer)
     */
    PRIMARY_PEG('R', "Primary Peg (peg buy to PBBO bid, peg sell to PBBO offer)"),

    /**
     * Alternate Midpoint (less aggressive of midpoint and 1 tick inside PBBO) for Periodic Auction Orders:5
     */
    ALTERNATE_MIDPOINT('L', "Alternate Midpoint (less aggressive of midpoint and 1 tick inside PBBO) for Periodic Auction Orders:5"),

    /**
     * Midpoint (peg to PBBO midpoint)
     */
    MIDPOINT('M', "Midpoint (peg to PBBO midpoint)"),

    /**
     * Guarded Midpoint (peg to Cboe EBBO midpoint but suspend order if primary market quote becomes one-sided or disappears) ASCII NUL (0x00) = no special handling Default = ASCII NUL (0x00)
     */
    GUARDED_MIDPOINT('G', "Guarded Midpoint (peg to Cboe EBBO midpoint but suspend order if primary market quote becomes one-sided or disappears) ASCII NUL (0x00) = no special handling Default = ASCII NUL (0x00)");

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
            case 'P' -> Optional.of(MARKET_PEG);
            case 'R' -> Optional.of(PRIMARY_PEG);
            case 'L' -> Optional.of(ALTERNATE_MIDPOINT);
            case 'M' -> Optional.of(MIDPOINT);
            case 'G' -> Optional.of(GUARDED_MIDPOINT);
            default -> Optional.empty();
        };
    }
}
