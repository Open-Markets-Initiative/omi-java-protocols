package omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.enums;

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
     * Negotiated Trade in Liquid Instrument (for MTF only) (NLIQ)
     */
    NEGOTIATED_TRADE_IN_LIQUID_INSTRUMENT('0', "Negotiated Trade in Liquid Instrument (for MTF only) (NLIQ)"),

    /**
     * Negotiated Trade in Illiquid Instrument (for MTF only) (OILQ)
     */
    NEGOTIATED_TRADE_IN_ILLIQUID_INSTRUMENT('1', "Negotiated Trade in Illiquid Instrument (for MTF only) (OILQ)"),

    /**
     * Negotiated Trade Subject to Conditions Other Than the Current Market Price (for MTF only) (PRIC)
     */
    NEGOTIATED_TRADE_SUBJECT_TO_CONDITIONS_OTHER_THAN_THE('2', "Negotiated Trade Subject to Conditions Other Than the Current Market Price (for MTF only) (PRIC)"),

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
     * Pre-Trade Transparency Waiver for Illiquid Instrument (for SI only) (ILQD) AND Pre-Trade Transparency Waiver for Above Standard Market Size (for SI only) (SIZE) Negotiated Trade Indicators and Pre-Trade Transparency Waivers are MMT Level 3.2 values. Reference Price is a MMT Level 3.5 value. ALL values are mutually exclusive and so only one may be requested. The Negotiated Trade Indicators (NLIQ, OILQ and PRIC) and Reference Price Waiver (RFPT) are MTF Only. The Pre-Trade Transparency Waivers ILQD and SIZE are SI Only. If both ILQD and SIZE are required then the discrete value B must be used. The business confirmation contains the waiver(s) that have been appplied.
     */
    PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT_B('B', "Pre-Trade Transparency Waiver for Illiquid Instrument (for SI only) (ILQD) AND Pre-Trade Transparency Waiver for Above Standard Market Size (for SI only) (SIZE) Negotiated Trade Indicators and Pre-Trade Transparency Waivers are MMT Level 3.2 values. Reference Price is a MMT Level 3.5 value. ALL values are mutually exclusive and so only one may be requested. The Negotiated Trade Indicators (NLIQ, OILQ and PRIC) and Reference Price Waiver (RFPT) are MTF Only. The Pre-Trade Transparency Waivers ILQD and SIZE are SI Only. If both ILQD and SIZE are required then the discrete value B must be used. The business confirmation contains the waiver(s) that have been appplied.");

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
            case '0' -> Optional.of(NEGOTIATED_TRADE_IN_LIQUID_INSTRUMENT);
            case '1' -> Optional.of(NEGOTIATED_TRADE_IN_ILLIQUID_INSTRUMENT);
            case '2' -> Optional.of(NEGOTIATED_TRADE_SUBJECT_TO_CONDITIONS_OTHER_THAN_THE);
            case '3' -> Optional.of(REFERENCE_PRICE);
            case '4' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT_4);
            case '5' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ABOVE_STANDARD_MAR);
            case 'B' -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_FOR_ILLIQUID_INSTRUMENT_B);
            default -> Optional.empty();
        };
    }
}
