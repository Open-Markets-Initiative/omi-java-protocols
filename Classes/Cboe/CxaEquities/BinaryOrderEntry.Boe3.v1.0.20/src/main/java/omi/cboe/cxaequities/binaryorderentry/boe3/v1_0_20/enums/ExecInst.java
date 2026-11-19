package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * All values not defined below are rejected. Ignored if blank (0x00)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecInst {

    /**
     * peg Buy [Sell] to NBBO Offer [Bid], one tick within NBBO
     */
    MARKET_PEG('P', "peg Buy [Sell] to NBBO Offer [Bid], one tick within NBBO"),

    /**
     * peg Buy [Sell] to NBBO Bid [Offer], one tick within NBBO
     */
    PRIMARY_PEG('R', "peg Buy [Sell] to NBBO Bid [Offer], one tick within NBBO"),

    /**
     * peg to NBBO Midpoint
     */
    MIDPOINT('M', "peg to NBBO Midpoint"),

    /**
     * insert the limit order at the best visible price on same side. Not applicable to IOC or FOK.
     */
    BEST_X_ORDER('j', "insert the limit order at the best visible price on same side. Not applicable to IOC or FOK."),

    /**
     * insert the limit order against the best visible price on opposite side
     */
    MARKET_X_ORDER('k', "insert the limit order against the best visible price on opposite side");

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
            case 'M' -> Optional.of(MIDPOINT);
            case 'j' -> Optional.of(BEST_X_ORDER);
            case 'k' -> Optional.of(MARKET_X_ORDER);
            default -> Optional.empty();
        };
    }
}
