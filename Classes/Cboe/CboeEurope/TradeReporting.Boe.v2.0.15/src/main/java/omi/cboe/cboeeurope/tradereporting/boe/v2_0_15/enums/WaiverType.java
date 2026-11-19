package omi.cboe.cboeeurope.tradereporting.boe.v2_0_15.enums;

import java.util.Optional;

/**
 * Defines the WaiverType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum WaiverType {

    /**
     * No Waiver Type
     */
    NO_WAIVER_TYPE('-', "No Waiver Type"),

    /**
     * Reference Price (Dark Book) (for MTF only) (RFPT)
     */
    REFERENCE_PRICE('3', "Reference Price (Dark Book) (for MTF only) (RFPT)"),

    /**
     * Pre-Trade Transparency Waiver for Illiquid Instrument (for SI only) (ILQD)
     */
    PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT('4', "Pre-Trade Transparency Waiver for Illiquid Instrument (for SI only) (ILQD)"),

    /**
     * Pre-Trade Transparency Waiver for Above Standard Mar- ket Size (for SI only) (SIZE)
     */
    PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ABOVE_STANDARD_MAR('5', "Pre-Trade Transparency Waiver for Above Standard Mar- ket Size (for SI only) (SIZE)");

    private final char wire;

    private final String description;

    WaiverType(char wire, String description) {
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
    public static Optional<WaiverType> fromWire(char wire) {
        return switch (wire) {
            case '-' -> Optional.of(NO_WAIVER_TYPE);
            case '3' -> Optional.of(REFERENCE_PRICE);
            case '4' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT);
            case '5' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ABOVE_STANDARD_MAR);
            default -> Optional.empty();
        };
    }
}
