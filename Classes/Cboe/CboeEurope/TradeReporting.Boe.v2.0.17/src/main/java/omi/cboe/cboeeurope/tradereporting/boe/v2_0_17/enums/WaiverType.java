package omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.enums;

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
    PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT_4('4', "Pre-Trade Transparency Waiver for Illiquid Instrument (for SI only) (ILQD)"),

    /**
     * Pre-Trade Transparency Waiver for Above Standard Mar- ket Size (for SI only) (SIZE)
     */
    PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ABOVE_STANDARD_MAR('5', "Pre-Trade Transparency Waiver for Above Standard Mar- ket Size (for SI only) (SIZE)"),

    /**
     * Pre-Trade Transparency Waiver for Illiquid Instrument (for SI only) (ILQD) AND Pre-Trade Transparency Waiver for Above Standard Market Size (for SI only) (SIZE) Each Pre-Trade Transparency Waiver is represented by a dis- tinct value that can be requested individually. Waivers that can be applied together are represented by a value that indi- cates both waivers being set together. Based upon what is requested, the system calculates which of these are valid. The business confirmation contains the waiver(s) that have been appplied.
     */
    PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT_B('B', "Pre-Trade Transparency Waiver for Illiquid Instrument (for SI only) (ILQD) AND Pre-Trade Transparency Waiver for Above Standard Market Size (for SI only) (SIZE) Each Pre-Trade Transparency Waiver is represented by a dis- tinct value that can be requested individually. Waivers that can be applied together are represented by a value that indi- cates both waivers being set together. Based upon what is requested, the system calculates which of these are valid. The business confirmation contains the waiver(s) that have been appplied.");

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
            case '4' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT_4);
            case '5' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ABOVE_STANDARD_MAR);
            case 'B' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT_B);
            default -> Optional.empty();
        };
    }
}
